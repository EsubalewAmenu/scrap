package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityNameactBinding implements ViewBinding {
    public final TextView clock;
    public final TextView clock2;
    public final TextView please;
    private final ScrollView rootView;
    public final Spinner spinner3;
    public final TextView textView2;
    public final View topView;
    public final View wave;
    public final TextView welcome;

    private ActivityNameactBinding(ScrollView scrollView, TextView textView, TextView textView3, TextView textView4, Spinner spinner, TextView textView5, View view, View view2, TextView textView6) {
        this.rootView = scrollView;
        this.clock = textView;
        this.clock2 = textView3;
        this.please = textView4;
        this.spinner3 = spinner;
        this.textView2 = textView5;
        this.topView = view;
        this.wave = view2;
        this.welcome = textView6;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityNameactBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityNameactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_nameact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityNameactBinding bind(View view) {
        int i = C2719R.C2722id.clock;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.clock);
        if (textView != null) {
            i = C2719R.C2722id.clock2;
            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.clock2);
            if (textView3 != null) {
                i = C2719R.C2722id.please;
                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.please);
                if (textView4 != null) {
                    i = C2719R.C2722id.spinner3;
                    Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, C2719R.C2722id.spinner3);
                    if (spinner != null) {
                        i = C2719R.C2722id.textView2;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.textView2);
                        if (textView5 != null) {
                            i = C2719R.C2722id.topView;
                            View findChildViewById = ViewBindings.findChildViewById(view, C2719R.C2722id.topView);
                            if (findChildViewById != null) {
                                i = C2719R.C2722id.wave;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, C2719R.C2722id.wave);
                                if (findChildViewById2 != null) {
                                    i = C2719R.C2722id.welcome;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.welcome);
                                    if (textView6 != null) {
                                        return new ActivityNameactBinding((ScrollView) view, textView, textView3, textView4, spinner, textView5, findChildViewById, findChildViewById2, textView6);
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
