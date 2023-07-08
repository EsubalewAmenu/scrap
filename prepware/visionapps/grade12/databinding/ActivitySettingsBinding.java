package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivitySettingsBinding implements ViewBinding {
    public final Button ResetNo;
    public final RelativeLayout areyousurereset;
    public final Button button2;
    public final CardView cardChoose;
    public final CardView cardReset;
    public final TextView delete;
    public final Button deleteButton;

    /* renamed from: nb */
    public final TextView f536nb;
    public final TextView reset;
    public final Button resetButton;
    public final Button resetYes;
    private final RelativeLayout rootView;
    public final Spinner spinner2;
    public final TextView textt;
    public final TextView textt23;
    public final View topView;
    public final View wave;

    private ActivitySettingsBinding(RelativeLayout relativeLayout, Button button, RelativeLayout relativeLayout2, Button button3, CardView cardView, CardView cardView2, TextView textView, Button button4, TextView textView2, TextView textView3, Button button5, Button button6, Spinner spinner, TextView textView4, TextView textView5, View view, View view2) {
        this.rootView = relativeLayout;
        this.ResetNo = button;
        this.areyousurereset = relativeLayout2;
        this.button2 = button3;
        this.cardChoose = cardView;
        this.cardReset = cardView2;
        this.delete = textView;
        this.deleteButton = button4;
        this.f536nb = textView2;
        this.reset = textView3;
        this.resetButton = button5;
        this.resetYes = button6;
        this.spinner2 = spinner;
        this.textt = textView4;
        this.textt23 = textView5;
        this.topView = view;
        this.wave = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivitySettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySettingsBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.ResetNo;
        Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.ResetNo);
        if (button != null) {
            i = C2719R.C2722id.areyousurereset;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.areyousurereset);
            if (relativeLayout != null) {
                i = C2719R.C2722id.button2;
                Button button3 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.button2);
                if (button3 != null) {
                    i = C2719R.C2722id.cardChoose;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardChoose);
                    if (cardView != null) {
                        i = C2719R.C2722id.cardReset;
                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardReset);
                        if (cardView2 != null) {
                            i = C2719R.C2722id.delete;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.delete);
                            if (textView != null) {
                                i = C2719R.C2722id.deleteButton;
                                Button button4 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.deleteButton);
                                if (button4 != null) {
                                    i = C2719R.C2722id.f446nb;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f446nb);
                                    if (textView2 != null) {
                                        i = C2719R.C2722id.reset;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.reset);
                                        if (textView3 != null) {
                                            i = C2719R.C2722id.resetButton;
                                            Button button5 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.resetButton);
                                            if (button5 != null) {
                                                i = C2719R.C2722id.resetYes;
                                                Button button6 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.resetYes);
                                                if (button6 != null) {
                                                    i = C2719R.C2722id.spinner2;
                                                    Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.spinner2);
                                                    if (spinner != null) {
                                                        i = C2719R.C2722id.textt;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textt);
                                                        if (textView4 != null) {
                                                            i = C2719R.C2722id.textt23;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textt23);
                                                            if (textView5 != null) {
                                                                i = C2719R.C2722id.topView;
                                                                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                if (findChildViewById != null) {
                                                                    i = C2719R.C2722id.wave;
                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                                    if (findChildViewById2 != null) {
                                                                        return new ActivitySettingsBinding((RelativeLayout) view2, button, relativeLayout, button3, cardView, cardView2, textView, button4, textView2, textView3, button5, button6, spinner, textView4, textView5, findChildViewById, findChildViewById2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
