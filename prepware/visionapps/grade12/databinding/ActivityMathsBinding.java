package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityMathsBinding implements ViewBinding {
    public final Button examenglish;
    public final TextView modeenglish;
    public final Button practiceMaths;
    private final ScrollView rootView;

    private ActivityMathsBinding(ScrollView scrollView, Button button, TextView textView, Button button2) {
        this.rootView = scrollView;
        this.examenglish = button;
        this.modeenglish = textView;
        this.practiceMaths = button2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityMathsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMathsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_maths, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMathsBinding bind(View view) {
        int i = C2719R.C2722id.examenglish;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.examenglish);
        if (button != null) {
            i = C2719R.C2722id.modeenglish;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.modeenglish);
            if (textView != null) {
                i = C2719R.C2722id.practiceMaths;
                Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.practiceMaths);
                if (button2 != null) {
                    return new ActivityMathsBinding((ScrollView) view, button, textView, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
