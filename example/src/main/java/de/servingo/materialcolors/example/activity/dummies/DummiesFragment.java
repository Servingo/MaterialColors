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

import android.content.res.TypedArray;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.LinearLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import de.servingo.materialcolors.example.R;
import de.servingo.materialcolors.example.util.base.BaseFragment;
import de.servingo.materialcolors.example.util.view.DividerItemDecoration;

/**
 * @author Daniel Holderbaum
 */
@EFragment(R.layout.fragment_dummies)
public class DummiesFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    @ViewById(R.id.swipe_container)
    protected SwipeRefreshLayout swipeContainer;

    @ViewById(R.id.dummies_list)
    protected RecyclerView curvesList;

    @AfterViews
    protected void setup() {
        DummyAdapter dummyAdapter = DummyAdapter_.getInstance_(getContext());
        curvesList.setAdapter(dummyAdapter);
        curvesList.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext());
        curvesList.addItemDecoration(itemDecoration);
        List<Dummy> dummies = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dummies.add(new Dummy());
        }
        dummyAdapter.addItems(dummies);

        swipeContainer.setOnRefreshListener(this);
        swipeContainer.setColorSchemeColors(resolveColor(R.attr.colorPrimary), resolveColor(R.attr.colorAccent));
    }

    private int resolveColor(int attribute) {
        TypedValue typedValue = new TypedValue();
        TypedArray a = getContext().obtainStyledAttributes(typedValue.data, new int[]{attribute});
        int color = a.getColor(0, 0);
        a.recycle();
        return color;
    }

    @Override
    public void onRefresh() {
        sleep();
    }

    @Background
    protected void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        stopRefresh();
    }

    @UiThread
    protected void stopRefresh() {
        swipeContainer.setRefreshing(false);
    }

}
