package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityAlreadyBinding implements ViewBinding {
    public final Button button5;
    public final TextView forgot;
    public final ImageView imageView;
    public final EditText inputEmail;
    public final EditText inputPassword;
    public final ProgressBar progressBar2;
    private final ScrollView rootView;
    public final TextView textview19;
    public final View topView;
    public final View wave;

    private ActivityAlreadyBinding(ScrollView scrollView, Button button, TextView textView, ImageView imageView2, EditText editText, EditText editText2, ProgressBar progressBar, TextView textView2, View view, View view2) {
        this.rootView = scrollView;
        this.button5 = button;
        this.forgot = textView;
        this.imageView = imageView2;
        this.inputEmail = editText;
        this.inputPassword = editText2;
        this.progressBar2 = progressBar;
        this.textview19 = textView2;
        this.topView = view;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityAlreadyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityAlreadyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_already, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAlreadyBinding bind(View view) {
        int i = C2719R.C2722id.button5;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.button5);
        if (button != null) {
            i = C2719R.C2722id.forgot;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.forgot);
            if (textView != null) {
                i = C2719R.C2722id.imageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.imageView);
                if (imageView2 != null) {
                    i = C2719R.C2722id.inputEmail;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, C2719R.C2722id.inputEmail);
                    if (editText != null) {
                        i = C2719R.C2722id.inputPassword;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view, C2719R.C2722id.inputPassword);
                        if (editText2 != null) {
                            i = C2719R.C2722id.progressBar2;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, C2719R.C2722id.progressBar2);
                            if (progressBar != null) {
                                i = C2719R.C2722id.textview19;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.textview19);
                                if (textView2 != null) {
                                    i = C2719R.C2722id.topView;
                                    View findChildViewById = ViewBindings.findChildViewById(view, C2719R.C2722id.topView);
                                    if (findChildViewById != null) {
                                        i = C2719R.C2722id.wave;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, C2719R.C2722id.wave);
                                        if (findChildViewById2 != null) {
                                            return new ActivityAlreadyBinding((ScrollView) view, button, textView, imageView2, editText, editText2, progressBar, textView2, findChildViewById, findChildViewById2);
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
