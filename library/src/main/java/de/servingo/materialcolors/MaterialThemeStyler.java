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
package de.servingo.materialcolors;

import android.content.Context;
import android.content.res.Resources;

/**
 * @author Daniel Holderbaum
 */
public abstract class MaterialThemeStyler {

    public static void applyPrimaryColor(Context context, MaterialColor materialColor) {
        applyStyle(context, styleName("PrimaryColor", materialColor));
    }

    public static void applyPrimaryDarkColor(Context context, MaterialColor materialColor) {
        applyStyle(context, styleName("PrimaryDarkColor", materialColor));
    }

    public static void applyAccentColor(Context context, MaterialColor materialColor) {
        applyStyle(context, styleName("AccentColor", materialColor));
    }

    private static void applyStyle(Context context, String styleName) {
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        int resId = resources.getIdentifier(styleName, "style", packageName);
        theme.applyStyle(resId, true);
    }

    static String styleName(String base, MaterialColor materialColor) {
        String hueSuffix = "_" + materialColor.getHue();
        String shadeSuffix = materialColor.getShade() != null ? "_" + materialColor.getShade() : "";
        return base + hueSuffix + shadeSuffix;
    }

}
