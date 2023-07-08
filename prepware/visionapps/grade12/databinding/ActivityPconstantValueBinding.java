package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import com.visionapps.grade12.C2719R;

public final class ActivityPconstantValueBinding implements ViewBinding {
    public final PhotoView formulaReference1;
    public final PhotoView formulaReference2;
    private final ScrollView rootView;

    private ActivityPconstantValueBinding(ScrollView scrollView, PhotoView photoView, PhotoView photoView2) {
        this.rootView = scrollView;
        this.formulaReference1 = photoView;
        this.formulaReference2 = photoView2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityPconstantValueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityPconstantValueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_pconstant_value, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPconstantValueBinding bind(View view) {
        int i = C2719R.C2722id.formula_reference1;
        PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, C2719R.C2722id.formula_reference1);
        if (photoView != null) {
            i = C2719R.C2722id.formula_reference2;
            PhotoView photoView2 = (PhotoView) ViewBindings.findChildViewById(view, C2719R.C2722id.formula_reference2);
            if (photoView2 != null) {
                return new ActivityPconstantValueBinding((ScrollView) view, photoView, photoView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
