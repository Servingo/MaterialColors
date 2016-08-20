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
package de.servingo.materialcolors.example.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.Random;

import de.servingo.materialcolors.MaterialColor;
import de.servingo.materialcolors.MaterialColorHue;
import de.servingo.materialcolors.MaterialColorShade;
import de.servingo.materialcolors.example.R;
import de.servingo.materialcolors.example.activity.data.DataFragment_;
import de.servingo.materialcolors.example.activity.dummies.DummiesFragment_;
import de.servingo.materialcolors.example.util.base.BaseActivity;
import de.servingo.materialcolors.example.util.view.ViewPagerAdapter;

/**
 * @author Daniel Holderbaum
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewById(R.id.pages)
    protected ViewPager viewPager;

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @ViewById(R.id.tabs)
    protected TabLayout tabLayout;

    @AfterViews
    protected void setupViews() {
        setSupportActionBar(toolbar);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(DummiesFragment_.builder().build(), getString(R.string.title_tab_dummies));
        viewPagerAdapter.addFragment(DataFragment_.builder().build(), getString(R.string.title_tab_data));

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

//        new FullBottomSheetDialogFragment().show(getSupportFragmentManager(), "dialog");
    }

    @Click(R.id.fab)
    public void onFabClick() {
        //        BaseActivity.primary = MaterialColor.from(RGB.from(new Random()));
        //        BaseActivity.primaryDark = MaterialColor.from(RGB.from(new Random()));
        //        BaseActivity.accent = MaterialColor.from(RGB.from(new Random()));

        Random random = new Random();

        MaterialColorHue primaryHue = MaterialColorHue.primaries()[random.nextInt(MaterialColorHue.primaries().length)];
        BaseActivity.primary = MaterialColor.from(primaryHue, MaterialColorShade.P500);
        BaseActivity.primaryDark = MaterialColor.from(primaryHue, MaterialColorShade.P700);

        MaterialColorHue accentHue = MaterialColorHue.accents()[random.nextInt(MaterialColorHue.accents().length)];
        MaterialColorShade accentShade = MaterialColorShade.accents()[random.nextInt(MaterialColorShade.accents().length)];
        BaseActivity.accent = MaterialColor.from(accentHue, accentShade);

        recreate();
    }

}
