package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityHomePageBinding implements ViewBinding {
    public final LinearLayout areyousure;
    public final TextView bahh;
    public final CardView cardAbout;
    public final CardView cardHome;
    public final CardView cardLogout;
    public final CardView cardProfile;
    public final CardView cardReport;
    public final CardView cardSetting;
    public final GridLayout homeGrid;
    public final ProgressBar homeProgressbar;
    public final Button logoutno;
    public final Button logoutyes;
    public final RelativeLayout naturalLayout;
    public final TextView owned;
    public final Button premium;
    private final RelativeLayout rootView;
    public final TextView textView1;
    public final Button updatecheck;

    private ActivityHomePageBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, GridLayout gridLayout, ProgressBar progressBar, Button button, Button button2, RelativeLayout relativeLayout2, TextView textView2, Button button3, TextView textView3, Button button4) {
        this.rootView = relativeLayout;
        this.areyousure = linearLayout;
        this.bahh = textView;
        this.cardAbout = cardView;
        this.cardHome = cardView2;
        this.cardLogout = cardView3;
        this.cardProfile = cardView4;
        this.cardReport = cardView5;
        this.cardSetting = cardView6;
        this.homeGrid = gridLayout;
        this.homeProgressbar = progressBar;
        this.logoutno = button;
        this.logoutyes = button2;
        this.naturalLayout = relativeLayout2;
        this.owned = textView2;
        this.premium = button3;
        this.textView1 = textView3;
        this.updatecheck = button4;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHomePageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityHomePageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_home_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHomePageBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.areyousure;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.areyousure);
        if (linearLayout != null) {
            i = C2719R.C2722id.bahh;
            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bahh);
            if (textView != null) {
                i = C2719R.C2722id.cardAbout;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardAbout);
                if (cardView != null) {
                    i = C2719R.C2722id.cardHome;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardHome);
                    if (cardView2 != null) {
                        i = C2719R.C2722id.cardLogout;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardLogout);
                        if (cardView3 != null) {
                            i = C2719R.C2722id.cardProfile;
                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardProfile);
                            if (cardView4 != null) {
                                i = C2719R.C2722id.cardReport;
                                CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardReport);
                                if (cardView5 != null) {
                                    i = C2719R.C2722id.cardSetting;
                                    CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardSetting);
                                    if (cardView6 != null) {
                                        i = C2719R.C2722id.homeGrid;
                                        GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.homeGrid);
                                        if (gridLayout != null) {
                                            i = C2719R.C2722id.home_progressbar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.home_progressbar);
                                            if (progressBar != null) {
                                                i = C2719R.C2722id.logoutno;
                                                Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.logoutno);
                                                if (button != null) {
                                                    i = C2719R.C2722id.logoutyes;
                                                    Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.logoutyes);
                                                    if (button2 != null) {
                                                        i = C2719R.C2722id.natural_layout;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.natural_layout);
                                                        if (relativeLayout != null) {
                                                            i = C2719R.C2722id.owned;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.owned);
                                                            if (textView2 != null) {
                                                                i = C2719R.C2722id.premium;
                                                                Button button3 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.premium);
                                                                if (button3 != null) {
                                                                    i = C2719R.C2722id.textView1;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView1);
                                                                    if (textView3 != null) {
                                                                        i = C2719R.C2722id.updatecheck;
                                                                        Button button4 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.updatecheck);
                                                                        if (button4 != null) {
                                                                            return new ActivityHomePageBinding((RelativeLayout) view2, linearLayout, textView, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, gridLayout, progressBar, button, button2, relativeLayout, textView2, button3, textView3, button4);
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
