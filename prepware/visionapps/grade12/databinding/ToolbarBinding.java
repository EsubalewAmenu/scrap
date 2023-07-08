package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ToolbarBinding implements ViewBinding {
    public final Toolbar bar;
    public final Chronometer chron;
    public final Button finish;
    public final Button report;
    private final Toolbar rootView;
    public final TextView timer;

    private ToolbarBinding(Toolbar toolbar, Toolbar toolbar2, Chronometer chronometer, Button button, Button button2, TextView textView) {
        this.rootView = toolbar;
        this.bar = toolbar2;
        this.chron = chronometer;
        this.finish = button;
        this.report = button2;
        this.timer = textView;
    }

    public Toolbar getRoot() {
        return this.rootView;
    }

    public static ToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ToolbarBinding bind(View view) {
        Toolbar toolbar = (Toolbar) view;
        int i = C2719R.C2722id.chron;
        Chronometer chronometer = (Chronometer) ViewBindings.findChildViewById(view, C2719R.C2722id.chron);
        if (chronometer != null) {
            i = C2719R.C2722id.finish;
            Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.finish);
            if (button != null) {
                i = C2719R.C2722id.report;
                Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.report);
                if (button2 != null) {
                    i = C2719R.C2722id.timer;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.timer);
                    if (textView != null) {
                        return new ToolbarBinding(toolbar, toolbar, chronometer, button, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
