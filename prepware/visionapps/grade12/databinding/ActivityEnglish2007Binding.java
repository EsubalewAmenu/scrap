package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityEnglish2007Binding implements ViewBinding {
    private final ScrollView rootView;
    public final TextView textView;

    private ActivityEnglish2007Binding(ScrollView scrollView, TextView textView2) {
        this.rootView = scrollView;
        this.textView = textView2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEnglish2007Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEnglish2007Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_english2007, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEnglish2007Binding bind(View view) {
        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.textView);
        if (textView2 != null) {
            return new ActivityEnglish2007Binding((ScrollView) view, textView2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C2719R.C2722id.textView)));
    }
}
