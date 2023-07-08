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

public final class FragmentPredictionsBinding implements ViewBinding {
    public final TextView great300;
    public final TextView great400;
    public final TextView great500;
    public final TextView great600;
    public final TextView less300;
    public final Button pmeaning12;
    public final CardView pmeaningcard;
    private final RelativeLayout rootView;
    public final TextView textDashboard;

    private FragmentPredictionsBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Button button, CardView cardView, TextView textView6) {
        this.rootView = relativeLayout;
        this.great300 = textView;
        this.great400 = textView2;
        this.great500 = textView3;
        this.great600 = textView4;
        this.less300 = textView5;
        this.pmeaning12 = button;
        this.pmeaningcard = cardView;
        this.textDashboard = textView6;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPredictionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPredictionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_predictions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPredictionsBinding bind(View view) {
        int i = C2719R.C2722id.great300;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.great300);
        if (textView != null) {
            i = C2719R.C2722id.great400;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.great400);
            if (textView2 != null) {
                i = C2719R.C2722id.great500;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.great500);
                if (textView3 != null) {
                    i = C2719R.C2722id.great600;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.great600);
                    if (textView4 != null) {
                        i = C2719R.C2722id.less300;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.less300);
                        if (textView5 != null) {
                            i = C2719R.C2722id.pmeaning12;
                            Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.pmeaning12);
                            if (button != null) {
                                i = C2719R.C2722id.pmeaningcard;
                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, C2719R.C2722id.pmeaningcard);
                                if (cardView != null) {
                                    i = C2719R.C2722id.text_dashboard;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.text_dashboard);
                                    if (textView6 != null) {
                                        return new FragmentPredictionsBinding((RelativeLayout) view, textView, textView2, textView3, textView4, textView5, button, cardView, textView6);
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
