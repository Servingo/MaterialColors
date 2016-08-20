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

/**
 * @author Daniel Holderbaum
 */
public enum MaterialColorHue {

    RED,

    PINK,

    PURPLE,

    DEEP_PURPLE,

    INDIGO,

    BLUE,

    LIGHT_BLUE,

    CYAN,

    TEAL,

    GREEN,

    LIGHT_GREEN,

    LIME,

    YELLOW,

    AMBER,

    ORANGE,

    DEEP_ORANGE,

    BROWN,

    GREY,

    BLUE_GREY,

    BLACK,

    WHITE;

    public static MaterialColorHue[] primaries() {
        return new MaterialColorHue[]{RED, PINK, PURPLE, DEEP_PURPLE, INDIGO, BLUE, LIGHT_BLUE, CYAN, TEAL, GREEN, LIGHT_GREEN, LIME, YELLOW, AMBER, ORANGE, DEEP_ORANGE, BROWN, GREY, BLUE_GREY};
    }

    public static MaterialColorHue[] accents() {
        return new MaterialColorHue[]{RED, PINK, PURPLE, DEEP_PURPLE, INDIGO, BLUE, LIGHT_BLUE, CYAN, TEAL, GREEN, LIGHT_GREEN, LIME, YELLOW, AMBER, ORANGE, DEEP_ORANGE};
    }

}
