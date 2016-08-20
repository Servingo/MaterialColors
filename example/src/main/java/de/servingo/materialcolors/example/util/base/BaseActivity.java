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

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import de.servingo.materialcolors.MaterialColor;
import de.servingo.materialcolors.MaterialThemeStyler;
import de.servingo.materialcolors.RGB;

/**
 * @author Daniel Holderbaum
 */
public class BaseActivity extends AppCompatActivity {

    protected static MaterialColor primary = MaterialColor.from(RGB.from(33, 33, 33));

    protected static MaterialColor primaryDark = MaterialColor.from(RGB.from(0, 0, 0));

    protected static MaterialColor accent = MaterialColor.from(RGB.from(177, 33, 33));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MaterialThemeStyler.applyPrimaryColor(this, primary);
        MaterialThemeStyler.applyPrimaryDarkColor(this, primaryDark);
        MaterialThemeStyler.applyAccentColor(this, accent);

        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Activate the back-button in the action bar by default.
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            //            getSupportActionBar().setDisplayShowHomeEnabled(true);
            //            getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        }
    }

}
