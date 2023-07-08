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

public final class FragmentRecommendationsBinding implements ViewBinding {
    public final CardView bio1;
    public final CardView bio2;
    public final CardView bio3;
    public final CardView chem1;
    public final CardView chem2;
    public final CardView chem3;
    public final CardView civ1;
    public final CardView civ2;
    public final CardView civ3;
    public final CardView econ1;
    public final CardView econ2;
    public final CardView econ3;
    public final CardView eng1;
    public final CardView eng2;
    public final CardView eng3;
    public final CardView geo1;
    public final CardView geo2;
    public final CardView geo3;
    public final CardView hist1;
    public final CardView hist2;
    public final CardView hist3;
    public final CardView math1;
    public final CardView math2;
    public final CardView math3;
    public final CardView phy1;
    public final CardView phy2;
    public final CardView phy3;
    public final Button rmeaning12;
    public final CardView rmeaningcard;
    private final RelativeLayout rootView;
    public final CardView sat1;
    public final CardView sat2;
    public final CardView sat3;
    public final TextView textDashboard;

    private FragmentRecommendationsBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, CardView cardView8, CardView cardView9, CardView cardView10, CardView cardView11, CardView cardView12, CardView cardView13, CardView cardView14, CardView cardView15, CardView cardView16, CardView cardView17, CardView cardView18, CardView cardView19, CardView cardView20, CardView cardView21, CardView cardView22, CardView cardView23, CardView cardView24, CardView cardView25, CardView cardView26, CardView cardView27, Button button, CardView cardView28, CardView cardView29, CardView cardView30, CardView cardView31, TextView textView) {
        this.rootView = relativeLayout;
        this.bio1 = cardView;
        this.bio2 = cardView2;
        this.bio3 = cardView3;
        this.chem1 = cardView4;
        this.chem2 = cardView5;
        this.chem3 = cardView6;
        this.civ1 = cardView7;
        this.civ2 = cardView8;
        this.civ3 = cardView9;
        this.econ1 = cardView10;
        this.econ2 = cardView11;
        this.econ3 = cardView12;
        this.eng1 = cardView13;
        this.eng2 = cardView14;
        this.eng3 = cardView15;
        this.geo1 = cardView16;
        this.geo2 = cardView17;
        this.geo3 = cardView18;
        this.hist1 = cardView19;
        this.hist2 = cardView20;
        this.hist3 = cardView21;
        this.math1 = cardView22;
        this.math2 = cardView23;
        this.math3 = cardView24;
        this.phy1 = cardView25;
        this.phy2 = cardView26;
        this.phy3 = cardView27;
        this.rmeaning12 = button;
        this.rmeaningcard = cardView28;
        this.sat1 = cardView29;
        this.sat2 = cardView30;
        this.sat3 = cardView31;
        this.textDashboard = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentRecommendationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_recommendations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRecommendationsBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.bio1;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bio1);
        if (cardView != null) {
            i = C2719R.C2722id.bio2;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bio2);
            if (cardView2 != null) {
                i = C2719R.C2722id.bio3;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bio3);
                if (cardView3 != null) {
                    i = C2719R.C2722id.chem1;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chem1);
                    if (cardView4 != null) {
                        i = C2719R.C2722id.chem2;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chem2);
                        if (cardView5 != null) {
                            i = C2719R.C2722id.chem3;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chem3);
                            if (cardView6 != null) {
                                i = C2719R.C2722id.civ1;
                                CardView cardView7 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civ1);
                                if (cardView7 != null) {
                                    i = C2719R.C2722id.civ2;
                                    CardView cardView8 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civ2);
                                    if (cardView8 != null) {
                                        i = C2719R.C2722id.civ3;
                                        CardView cardView9 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civ3);
                                        if (cardView9 != null) {
                                            i = C2719R.C2722id.econ1;
                                            CardView cardView10 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econ1);
                                            if (cardView10 != null) {
                                                i = C2719R.C2722id.econ2;
                                                CardView cardView11 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econ2);
                                                if (cardView11 != null) {
                                                    i = C2719R.C2722id.econ3;
                                                    CardView cardView12 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econ3);
                                                    if (cardView12 != null) {
                                                        i = C2719R.C2722id.eng1;
                                                        CardView cardView13 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.eng1);
                                                        if (cardView13 != null) {
                                                            i = C2719R.C2722id.eng2;
                                                            CardView cardView14 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.eng2);
                                                            if (cardView14 != null) {
                                                                i = C2719R.C2722id.eng3;
                                                                CardView cardView15 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.eng3);
                                                                if (cardView15 != null) {
                                                                    i = C2719R.C2722id.geo1;
                                                                    CardView cardView16 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geo1);
                                                                    if (cardView16 != null) {
                                                                        i = C2719R.C2722id.geo2;
                                                                        CardView cardView17 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geo2);
                                                                        if (cardView17 != null) {
                                                                            i = C2719R.C2722id.geo3;
                                                                            CardView cardView18 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geo3);
                                                                            if (cardView18 != null) {
                                                                                i = C2719R.C2722id.hist1;
                                                                                CardView cardView19 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.hist1);
                                                                                if (cardView19 != null) {
                                                                                    i = C2719R.C2722id.hist2;
                                                                                    CardView cardView20 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.hist2);
                                                                                    if (cardView20 != null) {
                                                                                        i = C2719R.C2722id.hist3;
                                                                                        CardView cardView21 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.hist3);
                                                                                        if (cardView21 != null) {
                                                                                            i = C2719R.C2722id.math1;
                                                                                            CardView cardView22 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.math1);
                                                                                            if (cardView22 != null) {
                                                                                                i = C2719R.C2722id.math2;
                                                                                                CardView cardView23 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.math2);
                                                                                                if (cardView23 != null) {
                                                                                                    i = C2719R.C2722id.math3;
                                                                                                    CardView cardView24 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.math3);
                                                                                                    if (cardView24 != null) {
                                                                                                        i = C2719R.C2722id.phy1;
                                                                                                        CardView cardView25 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phy1);
                                                                                                        if (cardView25 != null) {
                                                                                                            i = C2719R.C2722id.phy2;
                                                                                                            CardView cardView26 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phy2);
                                                                                                            if (cardView26 != null) {
                                                                                                                i = C2719R.C2722id.phy3;
                                                                                                                CardView cardView27 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phy3);
                                                                                                                if (cardView27 != null) {
                                                                                                                    i = C2719R.C2722id.rmeaning12;
                                                                                                                    Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.rmeaning12);
                                                                                                                    if (button != null) {
                                                                                                                        i = C2719R.C2722id.rmeaningcard;
                                                                                                                        CardView cardView28 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.rmeaningcard);
                                                                                                                        if (cardView28 != null) {
                                                                                                                            i = C2719R.C2722id.sat1;
                                                                                                                            CardView cardView29 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sat1);
                                                                                                                            if (cardView29 != null) {
                                                                                                                                i = C2719R.C2722id.sat2;
                                                                                                                                CardView cardView30 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sat2);
                                                                                                                                if (cardView30 != null) {
                                                                                                                                    i = C2719R.C2722id.sat3;
                                                                                                                                    CardView cardView31 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sat3);
                                                                                                                                    if (cardView31 != null) {
                                                                                                                                        i = C2719R.C2722id.text_dashboard;
                                                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.text_dashboard);
                                                                                                                                        if (textView != null) {
                                                                                                                                            return new FragmentRecommendationsBinding((RelativeLayout) view2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, cardView11, cardView12, cardView13, cardView14, cardView15, cardView16, cardView17, cardView18, cardView19, cardView20, cardView21, cardView22, cardView23, cardView24, cardView25, cardView26, cardView27, button, cardView28, cardView29, cardView30, cardView31, textView);
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
