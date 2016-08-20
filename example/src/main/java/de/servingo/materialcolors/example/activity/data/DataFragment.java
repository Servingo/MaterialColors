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
package de.servingo.materialcolors.example.activity.data;

import android.support.design.widget.CoordinatorLayout;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.afollestad.materialdialogs.MaterialDialog;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import de.servingo.materialcolors.example.R;
import de.servingo.materialcolors.example.util.base.BaseFragment;


/**
 * @author Daniel Holderbaum
 */
@EFragment(R.layout.fragment_data)
public class DataFragment extends BaseFragment {

    @ViewById(R.id.main_content)
    protected CoordinatorLayout rootLayout;

    @ViewById(R.id.edittext)
    protected EditText editText;

    @ViewById(R.id.spinner)
    protected Spinner spinner;

    @AfterViews
    protected void setupSpinners() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.alphabet, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Click(R.id.button)
    protected void onClick() {
        editText.setError("This is incorrect");
    }

    @Click(R.id.button_special)
    protected void onClickSpecial() {
        new MaterialDialog.Builder(getContext()).title("Something happened").content("Okay. That was weird. Do you agree?").positiveText("Yes").negativeText("No").show();
    }

    @Click(R.id.button_toggle)
    protected void onClickToggle() {
//        Snackbar.make(rootLayout, "All colors scrambled!", Snackbar.LENGTH_SHORT).show();
    }

}
