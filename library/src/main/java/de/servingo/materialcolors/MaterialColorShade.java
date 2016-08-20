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
public enum MaterialColorShade {

    P50,

    P100,

    P200,

    P300,

    P400,

    P500,

    P600,

    P700,

    P800,

    P900,

    A100,

    A200,

    A400,

    A700;

    public static MaterialColorShade[] primaries() {
        return new MaterialColorShade[]{P50, P100, P200, P300, P400, P500, P600, P700, P800, P900};
    }

    public static MaterialColorShade[] accents() {
        return new MaterialColorShade[]{A100, A200, A400, A700};
    }

}
