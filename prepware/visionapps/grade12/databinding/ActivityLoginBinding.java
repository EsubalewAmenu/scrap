package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityLoginBinding implements ViewBinding {
    public final EditText Nameid;
    public final Button btnRegister;
    public final Button btnverifynumber;
    public final Button btnverifyotp;
    public final EditText editPassword;
    public final EditText editotp;
    public final EditText enterEmail;
    public final EditText enterphone;
    public final ImageView imageView;
    public final TextView msg;
    public final TextView msg1;
    public final ProgressBar progressBar;
    private final ScrollView rootView;
    public final TextView signin;
    public final Spinner spinner1;
    public final EditText textView2;
    public final View topView;
    public final View wave;

    private ActivityLoginBinding(ScrollView scrollView, EditText editText, Button button, Button button2, Button button3, EditText editText2, EditText editText3, EditText editText4, EditText editText5, ImageView imageView2, TextView textView, TextView textView3, ProgressBar progressBar2, TextView textView4, Spinner spinner, EditText editText6, View view, View view2) {
        this.rootView = scrollView;
        this.Nameid = editText;
        this.btnRegister = button;
        this.btnverifynumber = button2;
        this.btnverifyotp = button3;
        this.editPassword = editText2;
        this.editotp = editText3;
        this.enterEmail = editText4;
        this.enterphone = editText5;
        this.imageView = imageView2;
        this.msg = textView;
        this.msg1 = textView3;
        this.progressBar = progressBar2;
        this.signin = textView4;
        this.spinner1 = spinner;
        this.textView2 = editText6;
        this.topView = view;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityLoginBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.Nameid;
        EditText editText = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.Nameid);
        if (editText != null) {
            i = C2719R.C2722id.btnRegister;
            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.btnRegister);
            if (button != null) {
                i = C2719R.C2722id.btnverifynumber;
                Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.btnverifynumber);
                if (button2 != null) {
                    i = C2719R.C2722id.btnverifyotp;
                    Button button3 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.btnverifyotp);
                    if (button3 != null) {
                        i = C2719R.C2722id.editPassword;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.editPassword);
                        if (editText2 != null) {
                            i = C2719R.C2722id.editotp;
                            EditText editText3 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.editotp);
                            if (editText3 != null) {
                                i = C2719R.C2722id.enterEmail;
                                EditText editText4 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.enterEmail);
                                if (editText4 != null) {
                                    i = C2719R.C2722id.enterphone;
                                    EditText editText5 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.enterphone);
                                    if (editText5 != null) {
                                        i = C2719R.C2722id.imageView;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.imageView);
                                        if (imageView2 != null) {
                                            i = C2719R.C2722id.msg;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.msg);
                                            if (textView != null) {
                                                i = C2719R.C2722id.msg1;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.msg1);
                                                if (textView3 != null) {
                                                    i = C2719R.C2722id.progressBar;
                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressBar);
                                                    if (progressBar2 != null) {
                                                        i = C2719R.C2722id.signin;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.signin);
                                                        if (textView4 != null) {
                                                            i = C2719R.C2722id.spinner1;
                                                            Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.spinner1);
                                                            if (spinner != null) {
                                                                i = C2719R.C2722id.textView2;
                                                                EditText editText6 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView2);
                                                                if (editText6 != null) {
                                                                    i = C2719R.C2722id.topView;
                                                                    View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                    if (findChildViewById != null) {
                                                                        i = C2719R.C2722id.wave;
                                                                        View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                                        if (findChildViewById2 != null) {
                                                                            return new ActivityLoginBinding((ScrollView) view2, editText, button, button2, button3, editText2, editText3, editText4, editText5, imageView2, textView, textView3, progressBar2, textView4, spinner, editText6, findChildViewById, findChildViewById2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
