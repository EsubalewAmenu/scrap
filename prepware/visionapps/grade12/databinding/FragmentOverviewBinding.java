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

public final class FragmentOverviewBinding implements ViewBinding {
    public final CardView Biocard;
    public final CardView Chemcard;
    public final CardView Civcard;
    public final CardView Econcard;
    public final CardView Engcard;
    public final CardView Geocard;
    public final CardView Histcard;
    public final CardView Mathcard;
    public final CardView Phycard;
    public final CardView Satcard;
    public final TextView bioaverage;
    public final TextView biohighscore;
    public final TextView bioiScore;
    public final TextView biopercent;
    public final TextView chemaverage;
    public final TextView chemhighscore;
    public final TextView chemiScore;
    public final TextView chempercent;
    public final TextView civaverage;
    public final TextView civhighscore;
    public final TextView civiScore;
    public final TextView civpercent;
    public final TextView econaverage;
    public final TextView econhighscore;
    public final TextView econiScore;
    public final TextView econpercent;
    public final TextView engaverage;
    public final TextView enghighscore;
    public final TextView engiScore;
    public final TextView engpercent;
    public final TextView geoaverage;
    public final TextView geohighscore;
    public final TextView geoiScore;
    public final TextView geopercent;
    public final TextView histaverage;
    public final TextView histhighscore;
    public final TextView histiScore;
    public final TextView histpercent;
    public final TextView mathaverage;
    public final TextView mathhighscore;
    public final TextView mathiScore;
    public final TextView mathpercent;
    public final Button meaning12;
    public final CardView meaningcard;
    public final TextView phyaverage;
    public final TextView phyhighscore;
    public final TextView phyiScore;
    public final TextView phypercent;
    private final RelativeLayout rootView;
    public final TextView sataverage;
    public final TextView sathighscore;
    public final TextView satiScore;
    public final TextView satpercent;
    public final TextView textDashboard;

    private FragmentOverviewBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, CardView cardView8, CardView cardView9, CardView cardView10, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, Button button, CardView cardView11, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41) {
        this.rootView = relativeLayout;
        this.Biocard = cardView;
        this.Chemcard = cardView2;
        this.Civcard = cardView3;
        this.Econcard = cardView4;
        this.Engcard = cardView5;
        this.Geocard = cardView6;
        this.Histcard = cardView7;
        this.Mathcard = cardView8;
        this.Phycard = cardView9;
        this.Satcard = cardView10;
        this.bioaverage = textView;
        this.biohighscore = textView2;
        this.bioiScore = textView3;
        this.biopercent = textView4;
        this.chemaverage = textView5;
        this.chemhighscore = textView6;
        this.chemiScore = textView7;
        this.chempercent = textView8;
        this.civaverage = textView9;
        this.civhighscore = textView10;
        this.civiScore = textView11;
        this.civpercent = textView12;
        this.econaverage = textView13;
        this.econhighscore = textView14;
        this.econiScore = textView15;
        this.econpercent = textView16;
        this.engaverage = textView17;
        this.enghighscore = textView18;
        this.engiScore = textView19;
        this.engpercent = textView20;
        this.geoaverage = textView21;
        this.geohighscore = textView22;
        this.geoiScore = textView23;
        this.geopercent = textView24;
        this.histaverage = textView25;
        this.histhighscore = textView26;
        this.histiScore = textView27;
        this.histpercent = textView28;
        this.mathaverage = textView29;
        this.mathhighscore = textView30;
        this.mathiScore = textView31;
        this.mathpercent = textView32;
        this.meaning12 = button;
        this.meaningcard = cardView11;
        this.phyaverage = textView33;
        this.phyhighscore = textView34;
        this.phyiScore = textView35;
        this.phypercent = textView36;
        this.sataverage = textView37;
        this.sathighscore = textView38;
        this.satiScore = textView39;
        this.satpercent = textView40;
        this.textDashboard = textView41;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOverviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentOverviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOverviewBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.Biocard;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Biocard);
        if (cardView != null) {
            i = C2719R.C2722id.Chemcard;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Chemcard);
            if (cardView2 != null) {
                i = C2719R.C2722id.Civcard;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Civcard);
                if (cardView3 != null) {
                    i = C2719R.C2722id.Econcard;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Econcard);
                    if (cardView4 != null) {
                        i = C2719R.C2722id.Engcard;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Engcard);
                        if (cardView5 != null) {
                            i = C2719R.C2722id.Geocard;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Geocard);
                            if (cardView6 != null) {
                                i = C2719R.C2722id.Histcard;
                                CardView cardView7 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Histcard);
                                if (cardView7 != null) {
                                    i = C2719R.C2722id.Mathcard;
                                    CardView cardView8 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Mathcard);
                                    if (cardView8 != null) {
                                        i = C2719R.C2722id.Phycard;
                                        CardView cardView9 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Phycard);
                                        if (cardView9 != null) {
                                            i = C2719R.C2722id.Satcard;
                                            CardView cardView10 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Satcard);
                                            if (cardView10 != null) {
                                                i = C2719R.C2722id.bioaverage;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bioaverage);
                                                if (textView != null) {
                                                    i = C2719R.C2722id.biohighscore;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.biohighscore);
                                                    if (textView2 != null) {
                                                        i = C2719R.C2722id.bioiScore;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.bioiScore);
                                                        if (textView3 != null) {
                                                            i = C2719R.C2722id.biopercent;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.biopercent);
                                                            if (textView4 != null) {
                                                                i = C2719R.C2722id.chemaverage;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chemaverage);
                                                                if (textView5 != null) {
                                                                    i = C2719R.C2722id.chemhighscore;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chemhighscore);
                                                                    if (textView6 != null) {
                                                                        i = C2719R.C2722id.chemiScore;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chemiScore);
                                                                        if (textView7 != null) {
                                                                            i = C2719R.C2722id.chempercent;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.chempercent);
                                                                            if (textView8 != null) {
                                                                                i = C2719R.C2722id.civaverage;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civaverage);
                                                                                if (textView9 != null) {
                                                                                    i = C2719R.C2722id.civhighscore;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civhighscore);
                                                                                    if (textView10 != null) {
                                                                                        i = C2719R.C2722id.civiScore;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civiScore);
                                                                                        if (textView11 != null) {
                                                                                            i = C2719R.C2722id.civpercent;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.civpercent);
                                                                                            if (textView12 != null) {
                                                                                                i = C2719R.C2722id.econaverage;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econaverage);
                                                                                                if (textView13 != null) {
                                                                                                    i = C2719R.C2722id.econhighscore;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econhighscore);
                                                                                                    if (textView14 != null) {
                                                                                                        i = C2719R.C2722id.econiScore;
                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econiScore);
                                                                                                        if (textView15 != null) {
                                                                                                            i = C2719R.C2722id.econpercent;
                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econpercent);
                                                                                                            if (textView16 != null) {
                                                                                                                i = C2719R.C2722id.engaverage;
                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.engaverage);
                                                                                                                if (textView17 != null) {
                                                                                                                    i = C2719R.C2722id.enghighscore;
                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enghighscore);
                                                                                                                    if (textView18 != null) {
                                                                                                                        i = C2719R.C2722id.engiScore;
                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.engiScore);
                                                                                                                        if (textView19 != null) {
                                                                                                                            i = C2719R.C2722id.engpercent;
                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.engpercent);
                                                                                                                            if (textView20 != null) {
                                                                                                                                i = C2719R.C2722id.geoaverage;
                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geoaverage);
                                                                                                                                if (textView21 != null) {
                                                                                                                                    i = C2719R.C2722id.geohighscore;
                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geohighscore);
                                                                                                                                    if (textView22 != null) {
                                                                                                                                        i = C2719R.C2722id.geoiScore;
                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geoiScore);
                                                                                                                                        if (textView23 != null) {
                                                                                                                                            i = C2719R.C2722id.geopercent;
                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.geopercent);
                                                                                                                                            if (textView24 != null) {
                                                                                                                                                i = C2719R.C2722id.histaverage;
                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.histaverage);
                                                                                                                                                if (textView25 != null) {
                                                                                                                                                    i = C2719R.C2722id.histhighscore;
                                                                                                                                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.histhighscore);
                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                        i = C2719R.C2722id.histiScore;
                                                                                                                                                        TextView textView27 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.histiScore);
                                                                                                                                                        if (textView27 != null) {
                                                                                                                                                            i = C2719R.C2722id.histpercent;
                                                                                                                                                            TextView textView28 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.histpercent);
                                                                                                                                                            if (textView28 != null) {
                                                                                                                                                                i = C2719R.C2722id.mathaverage;
                                                                                                                                                                TextView textView29 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mathaverage);
                                                                                                                                                                if (textView29 != null) {
                                                                                                                                                                    i = C2719R.C2722id.mathhighscore;
                                                                                                                                                                    TextView textView30 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mathhighscore);
                                                                                                                                                                    if (textView30 != null) {
                                                                                                                                                                        i = C2719R.C2722id.mathiScore;
                                                                                                                                                                        TextView textView31 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mathiScore);
                                                                                                                                                                        if (textView31 != null) {
                                                                                                                                                                            i = C2719R.C2722id.mathpercent;
                                                                                                                                                                            TextView textView32 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mathpercent);
                                                                                                                                                                            if (textView32 != null) {
                                                                                                                                                                                i = C2719R.C2722id.meaning12;
                                                                                                                                                                                Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.meaning12);
                                                                                                                                                                                if (button != null) {
                                                                                                                                                                                    i = C2719R.C2722id.meaningcard;
                                                                                                                                                                                    CardView cardView11 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.meaningcard);
                                                                                                                                                                                    if (cardView11 != null) {
                                                                                                                                                                                        i = C2719R.C2722id.phyaverage;
                                                                                                                                                                                        TextView textView33 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phyaverage);
                                                                                                                                                                                        if (textView33 != null) {
                                                                                                                                                                                            i = C2719R.C2722id.phyhighscore;
                                                                                                                                                                                            TextView textView34 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phyhighscore);
                                                                                                                                                                                            if (textView34 != null) {
                                                                                                                                                                                                i = C2719R.C2722id.phyiScore;
                                                                                                                                                                                                TextView textView35 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phyiScore);
                                                                                                                                                                                                if (textView35 != null) {
                                                                                                                                                                                                    i = C2719R.C2722id.phypercent;
                                                                                                                                                                                                    TextView textView36 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phypercent);
                                                                                                                                                                                                    if (textView36 != null) {
                                                                                                                                                                                                        i = C2719R.C2722id.sataverage;
                                                                                                                                                                                                        TextView textView37 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sataverage);
                                                                                                                                                                                                        if (textView37 != null) {
                                                                                                                                                                                                            i = C2719R.C2722id.sathighscore;
                                                                                                                                                                                                            TextView textView38 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sathighscore);
                                                                                                                                                                                                            if (textView38 != null) {
                                                                                                                                                                                                                i = C2719R.C2722id.satiScore;
                                                                                                                                                                                                                TextView textView39 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.satiScore);
                                                                                                                                                                                                                if (textView39 != null) {
                                                                                                                                                                                                                    i = C2719R.C2722id.satpercent;
                                                                                                                                                                                                                    TextView textView40 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.satpercent);
                                                                                                                                                                                                                    if (textView40 != null) {
                                                                                                                                                                                                                        i = C2719R.C2722id.text_dashboard;
                                                                                                                                                                                                                        TextView textView41 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.text_dashboard);
                                                                                                                                                                                                                        if (textView41 != null) {
                                                                                                                                                                                                                            return new FragmentOverviewBinding((RelativeLayout) view2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, button, cardView11, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41);
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
