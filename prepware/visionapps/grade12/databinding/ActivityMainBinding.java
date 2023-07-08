package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.visionapps.grade12.C2719R;

public final class ActivityMainBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final ImageView splashImage;
    public final LottieAnimationView splashLottie;

    private ActivityMainBinding(RelativeLayout relativeLayout, ImageView imageView, LottieAnimationView lottieAnimationView) {
        this.rootView = relativeLayout;
        this.splashImage = imageView;
        this.splashLottie = lottieAnimationView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = C2719R.C2722id.splashImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.splashImage);
        if (imageView != null) {
            i = C2719R.C2722id.splash_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, C2719R.C2722id.splash_lottie);
            if (lottieAnimationView != null) {
                return new ActivityMainBinding((RelativeLayout) view, imageView, lottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
