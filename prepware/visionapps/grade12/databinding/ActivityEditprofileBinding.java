package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityEditprofileBinding implements ViewBinding {
    public final ImageView ImgView;
    public final Button button2;
    private final RelativeLayout rootView;
    public final TextView textView22;
    public final TextView textView23;
    public final TextView textView24;
    public final TextView textView25;
    public final TextView textView26;
    public final TextView textView27;
    public final TextView textView28;
    public final TextView textView29;
    public final TextView textView30;
    public final TextView textView31;
    public final View topView;
    public final View wave;

    private ActivityEditprofileBinding(RelativeLayout relativeLayout, ImageView imageView, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view, View view2) {
        this.rootView = relativeLayout;
        this.ImgView = imageView;
        this.button2 = button;
        this.textView22 = textView;
        this.textView23 = textView2;
        this.textView24 = textView3;
        this.textView25 = textView4;
        this.textView26 = textView5;
        this.textView27 = textView6;
        this.textView28 = textView7;
        this.textView29 = textView8;
        this.textView30 = textView9;
        this.textView31 = textView10;
        this.topView = view;
        this.wave = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEditprofileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEditprofileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_editprofile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEditprofileBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.ImgView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ImgView);
        if (imageView != null) {
            i = C2719R.C2722id.button2;
            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.button2);
            if (button != null) {
                i = C2719R.C2722id.textView22;
                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView22);
                if (textView != null) {
                    i = C2719R.C2722id.textView23;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView23);
                    if (textView2 != null) {
                        i = C2719R.C2722id.textView24;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView24);
                        if (textView3 != null) {
                            i = C2719R.C2722id.textView25;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView25);
                            if (textView4 != null) {
                                i = C2719R.C2722id.textView26;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView26);
                                if (textView5 != null) {
                                    i = C2719R.C2722id.textView27;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView27);
                                    if (textView6 != null) {
                                        i = C2719R.C2722id.textView28;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView28);
                                        if (textView7 != null) {
                                            i = C2719R.C2722id.textView29;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView29);
                                            if (textView8 != null) {
                                                i = C2719R.C2722id.textView30;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView30);
                                                if (textView9 != null) {
                                                    i = C2719R.C2722id.textView31;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView31);
                                                    if (textView10 != null) {
                                                        i = C2719R.C2722id.topView;
                                                        View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                        if (findChildViewById != null) {
                                                            i = C2719R.C2722id.wave;
                                                            View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                            if (findChildViewById2 != null) {
                                                                return new ActivityEditprofileBinding((RelativeLayout) view2, imageView, button, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, findChildViewById, findChildViewById2);
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
