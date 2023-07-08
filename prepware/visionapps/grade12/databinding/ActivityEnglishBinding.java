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

public final class ActivityEnglishBinding implements ViewBinding {
    public final Button examenglish;
    public final TextView modeenglish;
    public final Button practiceenglish;
    private final ScrollView rootView;

    private ActivityEnglishBinding(ScrollView scrollView, Button button, TextView textView, Button button2) {
        this.rootView = scrollView;
        this.examenglish = button;
        this.modeenglish = textView;
        this.practiceenglish = button2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEnglishBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEnglishBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_english, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEnglishBinding bind(View view) {
        int i = C2719R.C2722id.examenglish;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.examenglish);
        if (button != null) {
            i = C2719R.C2722id.modeenglish;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.modeenglish);
            if (textView != null) {
                i = C2719R.C2722id.practiceenglish;
                Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.practiceenglish);
                if (button2 != null) {
                    return new ActivityEnglishBinding((ScrollView) view, button, textView, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
