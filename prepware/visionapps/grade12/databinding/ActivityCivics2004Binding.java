package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import com.visionapps.grade12.C2719R;
import java.util.Objects;

public final class ActivityCivics2004Binding implements ViewBinding {
    private final ScrollView rootView;

    private ActivityCivics2004Binding(ScrollView scrollView) {
        this.rootView = scrollView;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityCivics2004Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityCivics2004Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_civics2004, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCivics2004Binding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivityCivics2004Binding((ScrollView) view);
    }
}
