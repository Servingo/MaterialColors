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

import java.io.Serializable;
import java.util.Map;

/**
 * @author Daniel Holderbaum
 */
public class MaterialColor implements Serializable {

    private static final long serialVersionUID = 1L;

    private final MaterialColorHue hue;

    private final MaterialColorShade shade;

    private final RGB rgb;

    private MaterialColor(MaterialColorHue hue, MaterialColorShade shade, RGB rgb) {
        this.hue = hue;
        this.shade = shade;
        this.rgb = rgb;
    }

    public static MaterialColor from(MaterialColorHue hue, MaterialColorShade shade) {
        return new MaterialColor(hue, shade, MaterialColorStorage.getRGB(hue, shade));
    }

    public static MaterialColor from(RGB rgb) {
        MaterialColorHue closestHue = null;
        MaterialColorShade closestShade = null;
        RGB closestRGB = null;
        int closestDifference = Integer.MAX_VALUE;
        for (Map.Entry<MaterialColorHue, Map<MaterialColorShade, RGB>> hueEntry : MaterialColorStorage.COLORS.entrySet()) {
            for (Map.Entry<MaterialColorShade, RGB> shadeEntry : hueEntry.getValue().entrySet()) {
                int difference = rgb.difference(shadeEntry.getValue());
                if (difference < closestDifference) {
                    closestHue = hueEntry.getKey();
                    closestShade = shadeEntry.getKey();
                    closestRGB = shadeEntry.getValue();
                    closestDifference = difference;
                }
            }
        }
        return new MaterialColor(closestHue, closestShade, closestRGB);
    }

    // #################
    // Getters / Setters
    // #################

    public MaterialColorHue getHue() {
        return hue;
    }

    public MaterialColorShade getShade() {
        return shade;
    }

    public RGB getRgb() {
        return rgb;
    }

}
