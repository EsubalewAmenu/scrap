package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.visionapps.grade12.C2719R;

public final class ActivityStatsBinding implements ViewBinding {
    public final BottomNavigationView bottomnav;
    public final FrameLayout container;
    private final RelativeLayout rootView;

    private ActivityStatsBinding(RelativeLayout relativeLayout, BottomNavigationView bottomNavigationView, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.bottomnav = bottomNavigationView;
        this.container = frameLayout;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityStatsBinding bind(View view) {
        int i = C2719R.C2722id.bottomnav;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(view, C2719R.C2722id.bottomnav);
        if (bottomNavigationView != null) {
            i = C2719R.C2722id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C2719R.C2722id.container);
            if (frameLayout != null) {
                return new ActivityStatsBinding((RelativeLayout) view, bottomNavigationView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
