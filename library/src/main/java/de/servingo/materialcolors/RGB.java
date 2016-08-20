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

/**
 * @author Daniel Holderbaum
 */
public class RGB implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int r;

	private final int g;

	private final int b;

	private RGB(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public static RGB from(int r, int g, int b) {
		return new RGB(r, g, b);
	}

	public static RGB from(String hex) {
		String rHex = hex.substring(0, 2);
		String gHex = hex.substring(2, 4);
		String bHex = hex.substring(4, 6);

		return new RGB(toDec(rHex), toDec(gHex), toDec(bHex));
	}

	public String toHex() {
		String rHex = toHex(r);
		String gHex = toHex(g);
		String bHex = toHex(b);

		String colorHex = rHex + gHex + bHex;
		colorHex = colorHex.toUpperCase();
		return colorHex;
	}

	int difference(RGB other) {
		int rDiff = Math.abs(r - other.getR());
		int gDiff = Math.abs(g - other.getG());
		int bDiff = Math.abs(b - other.getB());
		return rDiff + gDiff + bDiff;
	}

	private static int toDec(String hex) {
		return Integer.parseInt(hex, 16);
	}

	private static String toHex(int dec) {
		String cHex = Integer.toHexString(dec);
		cHex = cHex.length() == 2 ? cHex : "0" + cHex;
		// cHex = cHex.toUpperCase();
		return cHex;
	}

	// #################
	// Getters / Setters
	// #################

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

}
