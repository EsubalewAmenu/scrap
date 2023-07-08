package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class CheckInternetDialogBinding implements ViewBinding {
    public final AppCompatButton btnRetry;
    public final ImageView noInternetImage;
    public final TextView noInternetTxt;
    public final TextView noInternetTxt2;
    private final RelativeLayout rootView;

    private CheckInternetDialogBinding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btnRetry = appCompatButton;
        this.noInternetImage = imageView;
        this.noInternetTxt = textView;
        this.noInternetTxt2 = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static CheckInternetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static CheckInternetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.check_internet_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CheckInternetDialogBinding bind(View view) {
        int i = C2719R.C2722id.btnRetry;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, C2719R.C2722id.btnRetry);
        if (appCompatButton != null) {
            i = C2719R.C2722id.no_internet_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.no_internet_image);
            if (imageView != null) {
                i = C2719R.C2722id.no_internet_txt;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.no_internet_txt);
                if (textView != null) {
                    i = C2719R.C2722id.no_internet_txt_2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.no_internet_txt_2);
                    if (textView2 != null) {
                        return new CheckInternetDialogBinding((RelativeLayout) view, appCompatButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
