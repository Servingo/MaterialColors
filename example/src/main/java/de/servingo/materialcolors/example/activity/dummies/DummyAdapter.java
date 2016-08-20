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

import android.content.Context;
import android.view.ViewGroup;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import de.servingo.materialcolors.example.util.view.recycler.BaseRecyclerViewAdapter;

/**
 * @author Daniel Holderbaum
 */
@EBean
public class DummyAdapter extends BaseRecyclerViewAdapter<Dummy, DummyItemView> {

    @RootContext
    protected Context context;

    @Override
    protected DummyItemView onCreateItemView(ViewGroup parent, int viewType) {
        return DummyItemView_.build(context);
    }

}