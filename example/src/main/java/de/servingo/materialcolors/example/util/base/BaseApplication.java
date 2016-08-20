/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.servingo.materialcolors.example.util.base;

import android.app.Application;
import android.content.Context;

import de.servingo.materialcolors.MaterialColor;
import de.servingo.materialcolors.MaterialThemeStyler;
import de.servingo.materialcolors.RGB;

/**
 * @author Daniel Holderbaum
 */
public class BaseApplication extends Application {

    public static final String TAG = "MaterialColors";

    private static BaseApplication instance;

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;

        MaterialColor primary = MaterialColor.from(RGB.from(33, 33, 33));
        MaterialThemeStyler.applyPrimaryColor(this, primary);

        MaterialColor primaryDark = MaterialColor.from(RGB.from(0, 0, 0));
        MaterialThemeStyler.applyPrimaryDarkColor(this, primaryDark);

        MaterialColor accent = MaterialColor.from(RGB.from(177, 33, 33));
        MaterialThemeStyler.applyAccentColor(this, accent);

        super.onCreate();
    }

}
