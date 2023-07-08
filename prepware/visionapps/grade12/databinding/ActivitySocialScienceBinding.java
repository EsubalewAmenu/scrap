package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivitySocialScienceBinding implements ViewBinding {
    public final CardView cardAptitude;
    public final CardView cardCivics;
    public final CardView cardEconomics;
    public final CardView cardEnglish;
    public final CardView cardGeography;
    public final CardView cardHistory;
    public final CardView cardMath;
    public final CardView naturalNoInternetCard;
    public final Button noInternetButton;
    public final ImageView noInternetImg;
    public final TextView noInternetText;
    public final TextView noInternetText2;
    private final RelativeLayout rootView;
    public final RelativeLayout socialLayout;
    public final TextView textView;
    public final View topView;
    public final View topView3;

    private ActivitySocialScienceBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, CardView cardView8, Button button, ImageView imageView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, TextView textView4, View view, View view2) {
        this.rootView = relativeLayout;
        this.cardAptitude = cardView;
        this.cardCivics = cardView2;
        this.cardEconomics = cardView3;
        this.cardEnglish = cardView4;
        this.cardGeography = cardView5;
        this.cardHistory = cardView6;
        this.cardMath = cardView7;
        this.naturalNoInternetCard = cardView8;
        this.noInternetButton = button;
        this.noInternetImg = imageView;
        this.noInternetText = textView2;
        this.noInternetText2 = textView3;
        this.socialLayout = relativeLayout2;
        this.textView = textView4;
        this.topView = view;
        this.topView3 = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySocialScienceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivitySocialScienceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_social_science, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySocialScienceBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.cardAptitude;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardAptitude);
        if (cardView != null) {
            i = C2719R.C2722id.cardCivics;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardCivics);
            if (cardView2 != null) {
                i = C2719R.C2722id.cardEconomics;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardEconomics);
                if (cardView3 != null) {
                    i = C2719R.C2722id.cardEnglish;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardEnglish);
                    if (cardView4 != null) {
                        i = C2719R.C2722id.cardGeography;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardGeography);
                        if (cardView5 != null) {
                            i = C2719R.C2722id.cardHistory;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardHistory);
                            if (cardView6 != null) {
                                i = C2719R.C2722id.cardMath;
                                CardView cardView7 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardMath);
                                if (cardView7 != null) {
                                    i = C2719R.C2722id.natural_no_internet_card;
                                    CardView cardView8 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.natural_no_internet_card);
                                    if (cardView8 != null) {
                                        i = C2719R.C2722id.no_internet_button;
                                        Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.no_internet_button);
                                        if (button != null) {
                                            i = C2719R.C2722id.no_internet_img;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.no_internet_img);
                                            if (imageView != null) {
                                                i = C2719R.C2722id.no_internet_text;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.no_internet_text);
                                                if (textView2 != null) {
                                                    i = C2719R.C2722id.no_internet_text2;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.no_internet_text2);
                                                    if (textView3 != null) {
                                                        i = C2719R.C2722id.social_layout;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.social_layout);
                                                        if (relativeLayout != null) {
                                                            i = C2719R.C2722id.textView;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView);
                                                            if (textView4 != null) {
                                                                i = C2719R.C2722id.topView;
                                                                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                if (findChildViewById != null) {
                                                                    i = C2719R.C2722id.topView3;
                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView3);
                                                                    if (findChildViewById2 != null) {
                                                                        return new ActivitySocialScienceBinding((RelativeLayout) view2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, button, imageView, textView2, textView3, relativeLayout, textView4, findChildViewById, findChildViewById2);
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
