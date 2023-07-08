package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityBiologyBinding implements ViewBinding {
    public final CardView card;
    public final Button examBio;
    public final TextView modeenglish;
    public final Button practiceBio;
    private final RelativeLayout rootView;

    private ActivityBiologyBinding(RelativeLayout relativeLayout, CardView cardView, Button button, TextView textView, Button button2) {
        this.rootView = relativeLayout;
        this.card = cardView;
        this.examBio = button;
        this.modeenglish = textView;
        this.practiceBio = button2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBiologyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityBiologyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_biology, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBiologyBinding bind(View view) {
        int i = C2719R.C2722id.card;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, C2719R.C2722id.card);
        if (cardView != null) {
            i = C2719R.C2722id.examBio;
            Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.examBio);
            if (button != null) {
                i = C2719R.C2722id.modeenglish;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.modeenglish);
                if (textView != null) {
                    i = C2719R.C2722id.practiceBio;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.practiceBio);
                    if (button2 != null) {
                        return new ActivityBiologyBinding((RelativeLayout) view, cardView, button, textView, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
