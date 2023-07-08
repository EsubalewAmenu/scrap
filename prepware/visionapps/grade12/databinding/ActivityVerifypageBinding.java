package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityVerifypageBinding implements ViewBinding {
    public final Button resend;
    private final RelativeLayout rootView;
    public final TextView text;
    public final TextView text1;

    private ActivityVerifypageBinding(RelativeLayout relativeLayout, Button button, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.resend = button;
        this.text = textView;
        this.text1 = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVerifypageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityVerifypageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_verifypage, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityVerifypageBinding bind(View view) {
        int i = C2719R.C2722id.resend;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.resend);
        if (button != null) {
            i = C2719R.C2722id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.text);
            if (textView != null) {
                i = C2719R.C2722id.text1;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.text1);
                if (textView2 != null) {
                    return new ActivityVerifypageBinding((RelativeLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
