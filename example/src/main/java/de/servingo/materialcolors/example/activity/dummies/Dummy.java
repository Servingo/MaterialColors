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
package de.servingo.materialcolors.example.activity.dummies;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Daniel Holderbaum
 */
public class Dummy implements Serializable {

    protected String summary;

    protected String detail;

    public Dummy() {
        summary = UUID.randomUUID().toString().substring(0, 8);
        detail= UUID.randomUUID().toString().substring(0, 23);
    }

    // #################
    // Getters / Setters
    // #################


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
