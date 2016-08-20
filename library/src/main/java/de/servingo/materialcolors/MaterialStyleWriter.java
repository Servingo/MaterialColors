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

import android.annotation.TargetApi;
import android.os.Build;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author Daniel Holderbaum
 */
public class MaterialStyleWriter {

    public static void main(String[] args) throws IOException {
        writeColors();
        writeStyles();
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static void writeColors() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("D:\\colors.xml"))) {
            pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            pw.println("<resources>");

            for (Map.Entry<MaterialColorHue, Map<MaterialColorShade, RGB>> hueEntry : MaterialColorStorage.COLORS.entrySet()) {
                for (Map.Entry<MaterialColorShade, RGB> shadeEntry : hueEntry.getValue().entrySet()) {
                    MaterialColor materialColor = MaterialColor.from(hueEntry.getKey(), shadeEntry.getKey());
                    writeColor(pw, materialColor);
                }
            }

            pw.println("</resources>");
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static void writeStyles() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("D:\\styles.xml"))) {
            pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            pw.println("<resources>");

            for (Map.Entry<MaterialColorHue, Map<MaterialColorShade, RGB>> hueEntry : MaterialColorStorage.COLORS.entrySet()) {
                for (Map.Entry<MaterialColorShade, RGB> shadeEntry : hueEntry.getValue().entrySet()) {
                    MaterialColor materialColor = MaterialColor.from(hueEntry.getKey(), shadeEntry.getKey());
//                    writeStyle(pw, "PrimaryColor", "primaryColor", materialColor);
//                    writeStyle(pw, "PrimaryDarkColor", "primaryDarkColor", materialColor);
//                    writeStyle(pw, "AccentColor", "accentColor", materialColor);
                    writeStyleDirect(pw, "PrimaryColor", "colorPrimary", materialColor);
                    writeStyleDirect(pw, "PrimaryDarkColor", "colorPrimaryDark", materialColor);
                    writeStyleDirect(pw, "AccentColor", "colorAccent", materialColor);
                }
            }

            pw.println("</resources>");
        }
    }

    private static void writeStyleDirect(PrintWriter pw, String stylePrefix, String itemName, MaterialColor materialColor) {
        String styleName = MaterialThemeStyler.styleName(stylePrefix, materialColor);

        pw.println("<style name=\"" + styleName + "\">");
        pw.println("<item name=\"" + itemName + "\">#" + materialColor.getRgb().toHex() + "</item>");
        pw.println("</style>");
    }

    private static void writeStyle(PrintWriter pw, String stylePrefix, String itemName, MaterialColor materialColor) {
        String styleName = MaterialThemeStyler.styleName(stylePrefix, materialColor);
        String colorName = MaterialThemeStyler.styleName("MaterialColor", materialColor);

        pw.println("<style name=\"" + styleName + "\">");
        pw.println("<item name=\"" + itemName + "\">@color/" + colorName + "</item>");
        pw.println("</style>");
    }

    private static void writeColor(PrintWriter pw, MaterialColor materialColor) {
        String colorName = MaterialThemeStyler.styleName("MaterialColor", materialColor);
        pw.println("<color name=\"" + colorName + "\">#" + materialColor.getRgb().toHex() + "</color>");
    }

}
