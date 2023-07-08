package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityChooseyearBinding implements ViewBinding {
    public final CardView cardView2009;
    public final CardView cardView2010;
    public final CardView cardView2011;
    public final CardView cardView2012;
    public final CardView cardView2013;
    public final CardView pay;
    public final RelativeLayout progressDialogLayout;
    public final ProgressBar progressbar09;
    public final ProgressBar progressbar10;
    public final ProgressBar progressbar11;
    public final ProgressBar progressbar12;
    public final ProgressBar progressbar13;
    public final TextView resultText09;
    public final TextView resultText10;
    public final TextView resultText11;
    public final TextView resultText12;
    public final TextView resultText13;
    private final RelativeLayout rootView;
    public final TextView textView;
    public final TextView timeAllowed09;
    public final TextView timeAllowed10;
    public final TextView timeAllowed11;
    public final TextView timeAllowed12;
    public final TextView timeAllowed13;

    private ActivityChooseyearBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, RelativeLayout relativeLayout2, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = relativeLayout;
        this.cardView2009 = cardView;
        this.cardView2010 = cardView2;
        this.cardView2011 = cardView3;
        this.cardView2012 = cardView4;
        this.cardView2013 = cardView5;
        this.pay = cardView6;
        this.progressDialogLayout = relativeLayout2;
        this.progressbar09 = progressBar;
        this.progressbar10 = progressBar2;
        this.progressbar11 = progressBar3;
        this.progressbar12 = progressBar4;
        this.progressbar13 = progressBar5;
        this.resultText09 = textView2;
        this.resultText10 = textView3;
        this.resultText11 = textView4;
        this.resultText12 = textView5;
        this.resultText13 = textView6;
        this.textView = textView7;
        this.timeAllowed09 = textView8;
        this.timeAllowed10 = textView9;
        this.timeAllowed11 = textView10;
        this.timeAllowed12 = textView11;
        this.timeAllowed13 = textView12;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChooseyearBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityChooseyearBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_chooseyear, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityChooseyearBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.cardView2009;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardView2009);
        if (cardView != null) {
            i = C2719R.C2722id.cardView2010;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardView2010);
            if (cardView2 != null) {
                i = C2719R.C2722id.cardView2011;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardView2011);
                if (cardView3 != null) {
                    i = C2719R.C2722id.cardView2012;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardView2012);
                    if (cardView4 != null) {
                        i = C2719R.C2722id.cardView2013;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardView2013);
                        if (cardView5 != null) {
                            i = C2719R.C2722id.pay;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.pay);
                            if (cardView6 != null) {
                                i = C2719R.C2722id.progressDialog_layout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressDialog_layout);
                                if (relativeLayout != null) {
                                    i = C2719R.C2722id.progressbar09;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressbar09);
                                    if (progressBar != null) {
                                        i = C2719R.C2722id.progressbar10;
                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressbar10);
                                        if (progressBar2 != null) {
                                            i = C2719R.C2722id.progressbar11;
                                            ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressbar11);
                                            if (progressBar3 != null) {
                                                i = C2719R.C2722id.progressbar12;
                                                ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressbar12);
                                                if (progressBar4 != null) {
                                                    i = C2719R.C2722id.progressbar13;
                                                    ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressbar13);
                                                    if (progressBar5 != null) {
                                                        i = C2719R.C2722id.resultText09;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText09);
                                                        if (textView2 != null) {
                                                            i = C2719R.C2722id.resultText10;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText10);
                                                            if (textView3 != null) {
                                                                i = C2719R.C2722id.resultText11;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText11);
                                                                if (textView4 != null) {
                                                                    i = C2719R.C2722id.resultText12;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText12);
                                                                    if (textView5 != null) {
                                                                        i = C2719R.C2722id.resultText13;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText13);
                                                                        if (textView6 != null) {
                                                                            i = C2719R.C2722id.textView;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView);
                                                                            if (textView7 != null) {
                                                                                i = C2719R.C2722id.timeAllowed09;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.timeAllowed09);
                                                                                if (textView8 != null) {
                                                                                    i = C2719R.C2722id.timeAllowed10;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.timeAllowed10);
                                                                                    if (textView9 != null) {
                                                                                        i = C2719R.C2722id.timeAllowed11;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.timeAllowed11);
                                                                                        if (textView10 != null) {
                                                                                            i = C2719R.C2722id.timeAllowed12;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.timeAllowed12);
                                                                                            if (textView11 != null) {
                                                                                                i = C2719R.C2722id.timeAllowed13;
                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.timeAllowed13);
                                                                                                if (textView12 != null) {
                                                                                                    return new ActivityChooseyearBinding((RelativeLayout) view2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, relativeLayout, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
