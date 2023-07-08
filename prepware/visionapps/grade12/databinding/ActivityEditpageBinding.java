package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityEditpageBinding implements ViewBinding {
    public final ImageView ImgView;
    public final Button button2;
    private final ScrollView rootView;
    public final Spinner spinner2;
    public final Spinner spinner8;
    public final TextView textView22;
    public final EditText textView23;
    public final TextView textView24;
    public final EditText textView25;
    public final TextView textView26;
    public final TextView textView30;
    public final View topView;
    public final View wave;

    private ActivityEditpageBinding(ScrollView scrollView, ImageView imageView, Button button, Spinner spinner, Spinner spinner3, TextView textView, EditText editText, TextView textView2, EditText editText2, TextView textView3, TextView textView4, View view, View view2) {
        this.rootView = scrollView;
        this.ImgView = imageView;
        this.button2 = button;
        this.spinner2 = spinner;
        this.spinner8 = spinner3;
        this.textView22 = textView;
        this.textView23 = editText;
        this.textView24 = textView2;
        this.textView25 = editText2;
        this.textView26 = textView3;
        this.textView30 = textView4;
        this.topView = view;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEditpageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEditpageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_editpage, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEditpageBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.ImgView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ImgView);
        if (imageView != null) {
            i = C2719R.C2722id.button2;
            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.button2);
            if (button != null) {
                i = C2719R.C2722id.spinner2;
                Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.spinner2);
                if (spinner != null) {
                    i = C2719R.C2722id.spinner8;
                    Spinner spinner3 = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.spinner8);
                    if (spinner3 != null) {
                        i = C2719R.C2722id.textView22;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView22);
                        if (textView != null) {
                            i = C2719R.C2722id.textView23;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView23);
                            if (editText != null) {
                                i = C2719R.C2722id.textView24;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView24);
                                if (textView2 != null) {
                                    i = C2719R.C2722id.textView25;
                                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView25);
                                    if (editText2 != null) {
                                        i = C2719R.C2722id.textView26;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView26);
                                        if (textView3 != null) {
                                            i = C2719R.C2722id.textView30;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView30);
                                            if (textView4 != null) {
                                                i = C2719R.C2722id.topView;
                                                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                if (findChildViewById != null) {
                                                    i = C2719R.C2722id.wave;
                                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                    if (findChildViewById2 != null) {
                                                        return new ActivityEditpageBinding((ScrollView) view2, imageView, button, spinner, spinner3, textView, editText, textView2, editText2, textView3, textView4, findChildViewById, findChildViewById2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
