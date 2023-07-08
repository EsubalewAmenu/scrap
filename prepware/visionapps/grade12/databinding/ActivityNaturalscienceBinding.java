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

public final class ActivityNaturalscienceBinding implements ViewBinding {
    public final CardView cardAptitude;
    public final CardView cardBiology;
    public final CardView cardChemistry;
    public final CardView cardCivics;
    public final CardView cardEnglish;
    public final CardView cardMath;
    public final CardView cardPhysics;
    public final RelativeLayout naturalLayout;
    public final CardView naturalNoInternetCard;
    public final Button noInternetButton;
    public final ImageView noInternetImg;
    public final TextView noInternetText;
    public final TextView noInternetText2;
    private final RelativeLayout rootView;
    public final TextView textView;
    public final View topView;
    public final View topView3;

    private ActivityNaturalscienceBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, RelativeLayout relativeLayout2, CardView cardView8, Button button, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, View view, View view2) {
        this.rootView = relativeLayout;
        this.cardAptitude = cardView;
        this.cardBiology = cardView2;
        this.cardChemistry = cardView3;
        this.cardCivics = cardView4;
        this.cardEnglish = cardView5;
        this.cardMath = cardView6;
        this.cardPhysics = cardView7;
        this.naturalLayout = relativeLayout2;
        this.naturalNoInternetCard = cardView8;
        this.noInternetButton = button;
        this.noInternetImg = imageView;
        this.noInternetText = textView2;
        this.noInternetText2 = textView3;
        this.textView = textView4;
        this.topView = view;
        this.topView3 = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNaturalscienceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityNaturalscienceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_naturalscience, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityNaturalscienceBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.cardAptitude;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardAptitude);
        if (cardView != null) {
            i = C2719R.C2722id.cardBiology;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardBiology);
            if (cardView2 != null) {
                i = C2719R.C2722id.cardChemistry;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardChemistry);
                if (cardView3 != null) {
                    i = C2719R.C2722id.cardCivics;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardCivics);
                    if (cardView4 != null) {
                        i = C2719R.C2722id.cardEnglish;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardEnglish);
                        if (cardView5 != null) {
                            i = C2719R.C2722id.cardMath;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardMath);
                            if (cardView6 != null) {
                                i = C2719R.C2722id.cardPhysics;
                                CardView cardView7 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardPhysics);
                                if (cardView7 != null) {
                                    i = C2719R.C2722id.natural_layout;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.natural_layout);
                                    if (relativeLayout != null) {
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
                                                            i = C2719R.C2722id.textView;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.textView);
                                                            if (textView4 != null) {
                                                                i = C2719R.C2722id.topView;
                                                                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                if (findChildViewById != null) {
                                                                    i = C2719R.C2722id.topView3;
                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView3);
                                                                    if (findChildViewById2 != null) {
                                                                        return new ActivityNaturalscienceBinding((RelativeLayout) view2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, relativeLayout, cardView8, button, imageView, textView2, textView3, textView4, findChildViewById, findChildViewById2);
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
