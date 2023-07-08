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

public final class ActivityForgotpasswordBinding implements ViewBinding {
    public final Button button31;
    public final EditText editTextTextEmailAddress1;
    public final ProgressBar progressBar3;
    private final ScrollView rootView;
    public final TextView sorry;
    public final ImageView textView11;
    public final TextView textView171;
    public final View topView;
    public final View wave;

    private ActivityForgotpasswordBinding(ScrollView scrollView, Button button, EditText editText, ProgressBar progressBar, TextView textView, ImageView imageView, TextView textView2, View view, View view2) {
        this.rootView = scrollView;
        this.button31 = button;
        this.editTextTextEmailAddress1 = editText;
        this.progressBar3 = progressBar;
        this.sorry = textView;
        this.textView11 = imageView;
        this.textView171 = textView2;
        this.topView = view;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityForgotpasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityForgotpasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_forgotpassword, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityForgotpasswordBinding bind(View view) {
        int i = C2719R.C2722id.button31;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.button31);
        if (button != null) {
            i = C2719R.C2722id.editTextTextEmailAddress1;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, C2719R.C2722id.editTextTextEmailAddress1);
            if (editText != null) {
                i = C2719R.C2722id.progressBar3;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, C2719R.C2722id.progressBar3);
                if (progressBar != null) {
                    i = C2719R.C2722id.sorry;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.sorry);
                    if (textView != null) {
                        i = C2719R.C2722id.textView11;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.textView11);
                        if (imageView != null) {
                            i = C2719R.C2722id.textView171;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.textView171);
                            if (textView2 != null) {
                                i = C2719R.C2722id.topView;
                                View findChildViewById = ViewBindings.findChildViewById(view, C2719R.C2722id.topView);
                                if (findChildViewById != null) {
                                    i = C2719R.C2722id.wave;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, C2719R.C2722id.wave);
                                    if (findChildViewById2 != null) {
                                        return new ActivityForgotpasswordBinding((ScrollView) view, button, editText, progressBar, textView, imageView, textView2, findChildViewById, findChildViewById2);
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
