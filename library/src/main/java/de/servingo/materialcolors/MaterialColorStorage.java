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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel Holderbaum
 */
public abstract class MaterialColorStorage {

	static final Map<MaterialColorHue, Map<MaterialColorShade, RGB>> COLORS = new HashMap<>();

	static RGB getRGB(MaterialColorHue hue, MaterialColorShade shade) {
		return COLORS.get(hue).get(shade);
	}

	static {
		for (MaterialColorHue hue : MaterialColorHue.values()) {
			COLORS.put(hue, new HashMap<MaterialColorShade, RGB>());
		}

		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P50, RGB.from("ffebee"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P100, RGB.from("ffcdd2"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P200, RGB.from("ef9a9a"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P300, RGB.from("e57373"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P400, RGB.from("ef5350"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P500, RGB.from("f44336"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P600, RGB.from("e53935"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P700, RGB.from("d32f2f"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P800, RGB.from("c62828"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.P900, RGB.from("b71c1c"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.A100, RGB.from("ff8a80"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.A200, RGB.from("ff5252"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.A400, RGB.from("ff1744"));
		COLORS.get(MaterialColorHue.RED).put(MaterialColorShade.A700, RGB.from("d50000"));

		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P50, RGB.from("fce4ec"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P100, RGB.from("f8bbd0"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P200, RGB.from("f48fb1"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P300, RGB.from("f06292"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P400, RGB.from("ec407a"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P500, RGB.from("e91e63"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P600, RGB.from("d81b60"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P700, RGB.from("c2185b"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P800, RGB.from("ad1457"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.P900, RGB.from("880e4f"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.A100, RGB.from("ff80ab"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.A200, RGB.from("ff4081"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.A400, RGB.from("f50057"));
		COLORS.get(MaterialColorHue.PINK).put(MaterialColorShade.A700, RGB.from("c51162"));

		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P50, RGB.from("f3e5f5"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P100, RGB.from("e1bee7"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P200, RGB.from("ce93d8"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P300, RGB.from("ba68c8"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P400, RGB.from("ab47bc"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P500, RGB.from("9c27b0"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P600, RGB.from("8e24aa"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P700, RGB.from("7b1fa2"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P800, RGB.from("6a1b9a"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.P900, RGB.from("4a148c"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.A100, RGB.from("ea80fc"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.A200, RGB.from("e040fb"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.A400, RGB.from("d500f9"));
		COLORS.get(MaterialColorHue.PURPLE).put(MaterialColorShade.A700, RGB.from("aa00ff"));

		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P50, RGB.from("ede7f6"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P100, RGB.from("d1c4e9"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P200, RGB.from("b39ddb"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P300, RGB.from("9575cd"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P400, RGB.from("7e57c2"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P500, RGB.from("673ab7"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P600, RGB.from("5e35b1"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P700, RGB.from("512da8"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P800, RGB.from("4527a0"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.P900, RGB.from("311b92"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.A100, RGB.from("b388ff"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.A200, RGB.from("7c4dff"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.A400, RGB.from("651fff"));
		COLORS.get(MaterialColorHue.DEEP_PURPLE).put(MaterialColorShade.A700, RGB.from("6200ea"));

		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P50, RGB.from("e8eaf6"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P100, RGB.from("c5cae9"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P200, RGB.from("9fa8da"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P300, RGB.from("7986cb"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P400, RGB.from("5c6bc0"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P500, RGB.from("3f51b5"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P600, RGB.from("3949ab"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P700, RGB.from("303f9f"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P800, RGB.from("283593"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.P900, RGB.from("1a237e"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.A100, RGB.from("8c9eff"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.A200, RGB.from("536dfe"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.A400, RGB.from("3d5afe"));
		COLORS.get(MaterialColorHue.INDIGO).put(MaterialColorShade.A700, RGB.from("304ffe"));

		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P50, RGB.from("e3f2fd"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P100, RGB.from("bbdefb"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P200, RGB.from("90caf9"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P300, RGB.from("64b5f6"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P400, RGB.from("42a5f5"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P500, RGB.from("2196f3"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P600, RGB.from("1e88e5"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P700, RGB.from("1976d2"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P800, RGB.from("1565c0"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.P900, RGB.from("0d47a1"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.A100, RGB.from("82b1ff"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.A200, RGB.from("448aff"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.A400, RGB.from("2979ff"));
		COLORS.get(MaterialColorHue.BLUE).put(MaterialColorShade.A700, RGB.from("2962ff"));

		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P50, RGB.from("e1f5fe"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P100, RGB.from("b3e5fc"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P200, RGB.from("81d4fa"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P300, RGB.from("4fc3f7"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P400, RGB.from("29b6f6"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P500, RGB.from("03a9f4"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P600, RGB.from("039be5"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P700, RGB.from("0288d1"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P800, RGB.from("0277bd"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.P900, RGB.from("01579b"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.A100, RGB.from("80d8ff"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.A200, RGB.from("40c4ff"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.A400, RGB.from("00b0ff"));
		COLORS.get(MaterialColorHue.LIGHT_BLUE).put(MaterialColorShade.A700, RGB.from("0091ea"));

		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P50, RGB.from("e0f7fa"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P100, RGB.from("b2ebf2"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P200, RGB.from("80deea"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P300, RGB.from("4dd0e1"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P400, RGB.from("26c6da"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P500, RGB.from("00bcd4"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P600, RGB.from("00acc1"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P700, RGB.from("0097a7"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P800, RGB.from("00838f"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.P900, RGB.from("006064"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.A100, RGB.from("84ffff"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.A200, RGB.from("18ffff"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.A400, RGB.from("00e5ff"));
		COLORS.get(MaterialColorHue.CYAN).put(MaterialColorShade.A700, RGB.from("00b8d4"));

		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P50, RGB.from("e0f2f1"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P100, RGB.from("b2dfdb"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P200, RGB.from("80cbc4"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P300, RGB.from("4db6ac"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P400, RGB.from("26a69a"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P500, RGB.from("009688"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P600, RGB.from("00897b"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P700, RGB.from("00796b"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P800, RGB.from("00695c"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.P900, RGB.from("004d40"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.A100, RGB.from("a7ffeb"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.A200, RGB.from("64ffda"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.A400, RGB.from("1de9b6"));
		COLORS.get(MaterialColorHue.TEAL).put(MaterialColorShade.A700, RGB.from("00bfa5"));

		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P50, RGB.from("e8f5e9"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P100, RGB.from("c8e6c9"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P200, RGB.from("a5d6a7"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P300, RGB.from("81c784"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P400, RGB.from("66bb6a"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P500, RGB.from("4caf50"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P600, RGB.from("43a047"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P700, RGB.from("388e3c"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P800, RGB.from("2e7d32"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.P900, RGB.from("1b5e20"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.A100, RGB.from("b9f6ca"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.A200, RGB.from("69f0ae"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.A400, RGB.from("00e676"));
		COLORS.get(MaterialColorHue.GREEN).put(MaterialColorShade.A700, RGB.from("00c853"));

		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P50, RGB.from("f1f8e9"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P100, RGB.from("dcedc8"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P200, RGB.from("c5e1a5"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P300, RGB.from("aed581"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P400, RGB.from("9ccc65"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P500, RGB.from("8bc34a"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P600, RGB.from("7cb342"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P700, RGB.from("689f38"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P800, RGB.from("558b2f"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.P900, RGB.from("33691e"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.A100, RGB.from("ccff90"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.A200, RGB.from("b2ff59"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.A400, RGB.from("76ff03"));
		COLORS.get(MaterialColorHue.LIGHT_GREEN).put(MaterialColorShade.A700, RGB.from("64dd17"));

		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P50, RGB.from("f9fbe7"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P100, RGB.from("f0f4c3"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P200, RGB.from("e6ee9c"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P300, RGB.from("dce775"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P400, RGB.from("d4e157"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P500, RGB.from("cddc39"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P600, RGB.from("c0ca33"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P700, RGB.from("afb42b"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P800, RGB.from("9e9d24"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.P900, RGB.from("827717"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.A100, RGB.from("f4ff81"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.A200, RGB.from("eeff41"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.A400, RGB.from("c6ff00"));
		COLORS.get(MaterialColorHue.LIME).put(MaterialColorShade.A700, RGB.from("aeea00"));

		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P50, RGB.from("fffde7"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P100, RGB.from("fff9c4"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P200, RGB.from("fff59d"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P300, RGB.from("fff176"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P400, RGB.from("ffee58"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P500, RGB.from("ffeb3b"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P600, RGB.from("fdd835"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P700, RGB.from("fbc02d"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P800, RGB.from("f9a825"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.P900, RGB.from("f57f17"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.A100, RGB.from("ffff8d"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.A200, RGB.from("ffff00"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.A400, RGB.from("ffea00"));
		COLORS.get(MaterialColorHue.YELLOW).put(MaterialColorShade.A700, RGB.from("ffd600"));

		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P50, RGB.from("fff8e1"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P100, RGB.from("ffecb3"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P200, RGB.from("ffe082"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P300, RGB.from("ffd54f"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P400, RGB.from("ffca28"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P500, RGB.from("ffc107"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P600, RGB.from("ffb300"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P700, RGB.from("ffa000"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P800, RGB.from("ff8f00"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.P900, RGB.from("ff6f00"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.A100, RGB.from("ffe57f"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.A200, RGB.from("ffd740"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.A400, RGB.from("ffc400"));
		COLORS.get(MaterialColorHue.AMBER).put(MaterialColorShade.A700, RGB.from("ffab00"));

		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P50, RGB.from("fff3e0"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P100, RGB.from("ffe0b2"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P200, RGB.from("ffcc80"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P300, RGB.from("ffb74d"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P400, RGB.from("ffa726"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P500, RGB.from("ff9800"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P600, RGB.from("fb8c00"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P700, RGB.from("f57c00"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P800, RGB.from("ef6c00"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.P900, RGB.from("e65100"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.A100, RGB.from("ffd180"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.A200, RGB.from("ffab40"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.A400, RGB.from("ff9100"));
		COLORS.get(MaterialColorHue.ORANGE).put(MaterialColorShade.A700, RGB.from("ff6d00"));

		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P50, RGB.from("fbe9e7"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P100, RGB.from("ffccbc"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P200, RGB.from("ffab91"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P300, RGB.from("ff8a65"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P400, RGB.from("ff7043"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P500, RGB.from("ff5722"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P600, RGB.from("f4511e"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P700, RGB.from("e64a19"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P800, RGB.from("d84315"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.P900, RGB.from("bf360c"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.A100, RGB.from("ff9e80"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.A200, RGB.from("ff6e40"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.A400, RGB.from("ff3d00"));
		COLORS.get(MaterialColorHue.DEEP_ORANGE).put(MaterialColorShade.A700, RGB.from("dd2c00"));

		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P50, RGB.from("efebe9"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P100, RGB.from("d7ccc8"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P200, RGB.from("bcaaa4"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P300, RGB.from("a1887f"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P400, RGB.from("8d6e63"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P500, RGB.from("795548"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P600, RGB.from("6d4c41"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P700, RGB.from("5d4037"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P800, RGB.from("4e342e"));
		COLORS.get(MaterialColorHue.BROWN).put(MaterialColorShade.P900, RGB.from("3e2723"));

		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P50, RGB.from("fafafa"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P100, RGB.from("f5f5f5"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P200, RGB.from("eeeeee"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P300, RGB.from("e0e0e0"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P400, RGB.from("bdbdbd"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P500, RGB.from("9e9e9e"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P600, RGB.from("757575"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P700, RGB.from("616161"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P800, RGB.from("424242"));
		COLORS.get(MaterialColorHue.GREY).put(MaterialColorShade.P900, RGB.from("212121"));

		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P50, RGB.from("eceff1"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P100, RGB.from("cfd8dc"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P200, RGB.from("b0bec5"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P300, RGB.from("90a4ae"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P400, RGB.from("78909c"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P500, RGB.from("607d8b"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P600, RGB.from("546e7a"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P700, RGB.from("455a64"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P800, RGB.from("37474f"));
		COLORS.get(MaterialColorHue.BLUE_GREY).put(MaterialColorShade.P900, RGB.from("263238"));

		COLORS.get(MaterialColorHue.BLACK).put(null, RGB.from("000000"));

		COLORS.get(MaterialColorHue.WHITE).put(null, RGB.from("ffffff"));
	}

}
