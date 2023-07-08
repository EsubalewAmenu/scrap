package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityEnglish2009Binding implements ViewBinding {
    public final TextView PassTwo;
    public final TextView Passone;
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final CardView card0;
    public final CardView card1;
    public final CardView card2;

    /* renamed from: e */
    public final TextView f520e;

    /* renamed from: en */
    public final TextView f521en;
    public final TextView ena;
    public final TextView ene;
    public final TextView ent;
    public final TextView ente;
    public final TextView entee;
    public final TextView enteerr;
    public final TextView enteerrr;
    public final TextView enter;
    public final TextView entt;
    public final TextView entteerrr;
    public final ProgressBar highScoreEnglish2009;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView ourAnswer;
    public final RecyclerView questions;
    public final RecyclerView questions1;
    public final RecyclerView questions2;
    public final RecyclerView questions4;
    public final RecyclerView questions5;
    public final RecyclerView questions6;
    public final RecyclerView questions7;
    public final RecyclerView questions8;
    public final RecyclerView questions9;
    public final ScrollView reportLayout;
    public final CardView result;
    public final TextView resultTextEnglish2009;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final TextView sec3;
    public final Button telegramReport;
    public final TextView text1;
    public final TextView texttt;
    public final TextView ttit;

    private ActivityEnglish2009Binding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ToolbarBinding toolbarBinding, Button button, CardView cardView, CardView cardView2, CardView cardView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, ProgressBar progressBar, TextView textView15, ImageView imageView, TextView textView16, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, RecyclerView recyclerView9, ScrollView scrollView, CardView cardView4, TextView textView17, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView18, Button button2, TextView textView19, TextView textView20, TextView textView21) {
        this.rootView = relativeLayout;
        this.PassTwo = textView;
        this.Passone = textView2;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.card0 = cardView;
        this.card1 = cardView2;
        this.card2 = cardView3;
        this.f520e = textView3;
        this.f521en = textView4;
        this.ena = textView5;
        this.ene = textView6;
        this.ent = textView7;
        this.ente = textView8;
        this.entee = textView9;
        this.enteerr = textView10;
        this.enteerrr = textView11;
        this.enter = textView12;
        this.entt = textView13;
        this.entteerrr = textView14;
        this.highScoreEnglish2009 = progressBar;
        this.instruction = textView15;
        this.instructionImg = imageView;
        this.ourAnswer = textView16;
        this.questions = recyclerView;
        this.questions1 = recyclerView2;
        this.questions2 = recyclerView3;
        this.questions4 = recyclerView4;
        this.questions5 = recyclerView5;
        this.questions6 = recyclerView6;
        this.questions7 = recyclerView7;
        this.questions8 = recyclerView8;
        this.questions9 = recyclerView9;
        this.reportLayout = scrollView;
        this.result = cardView4;
        this.resultTextEnglish2009 = textView17;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.sec3 = textView18;
        this.telegramReport = button2;
        this.text1 = textView19;
        this.texttt = textView20;
        this.ttit = textView21;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEnglish2009Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEnglish2009Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_english2009, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEnglish2009Binding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.PassTwo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.PassTwo);
        if (textView != null) {
            i = C2719R.C2722id.Passone;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Passone);
            if (textView2 != null) {
                i = C2719R.C2722id.app;
                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.app);
                if (findChildViewById != null) {
                    ToolbarBinding bind = ToolbarBinding.bind(findChildViewById);
                    i = C2719R.C2722id.cancel_report;
                    Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.cancel_report);
                    if (button != null) {
                        i = C2719R.C2722id.card0;
                        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card0);
                        if (cardView != null) {
                            i = C2719R.C2722id.card1;
                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card1);
                            if (cardView2 != null) {
                                i = C2719R.C2722id.card2;
                                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card2);
                                if (cardView3 != null) {
                                    i = C2719R.C2722id.f443e;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f443e);
                                    if (textView3 != null) {
                                        i = C2719R.C2722id.f445en;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f445en);
                                        if (textView4 != null) {
                                            i = C2719R.C2722id.ena;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ena);
                                            if (textView5 != null) {
                                                i = C2719R.C2722id.ene;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene);
                                                if (textView6 != null) {
                                                    i = C2719R.C2722id.ent;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ent);
                                                    if (textView7 != null) {
                                                        i = C2719R.C2722id.ente;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ente);
                                                        if (textView8 != null) {
                                                            i = C2719R.C2722id.entee;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entee);
                                                            if (textView9 != null) {
                                                                i = C2719R.C2722id.enteerr;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerr);
                                                                if (textView10 != null) {
                                                                    i = C2719R.C2722id.enteerrr;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr);
                                                                    if (textView11 != null) {
                                                                        i = C2719R.C2722id.enter;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enter);
                                                                        if (textView12 != null) {
                                                                            i = C2719R.C2722id.entt;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt);
                                                                            if (textView13 != null) {
                                                                                i = C2719R.C2722id.entteerrr;
                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr);
                                                                                if (textView14 != null) {
                                                                                    i = C2719R.C2722id.highScore_english2009;
                                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_english2009);
                                                                                    if (progressBar != null) {
                                                                                        i = C2719R.C2722id.instruction;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                                                                                        if (textView15 != null) {
                                                                                            i = C2719R.C2722id.instruction_img;
                                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                                                                            if (imageView != null) {
                                                                                                i = C2719R.C2722id.ourAnswer;
                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                                                                                if (textView16 != null) {
                                                                                                    i = C2719R.C2722id.questions;
                                                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions);
                                                                                                    if (recyclerView != null) {
                                                                                                        i = C2719R.C2722id.questions1;
                                                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions1);
                                                                                                        if (recyclerView2 != null) {
                                                                                                            i = C2719R.C2722id.questions2;
                                                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions2);
                                                                                                            if (recyclerView3 != null) {
                                                                                                                i = C2719R.C2722id.questions4;
                                                                                                                RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions4);
                                                                                                                if (recyclerView4 != null) {
                                                                                                                    i = C2719R.C2722id.questions5;
                                                                                                                    RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions5);
                                                                                                                    if (recyclerView5 != null) {
                                                                                                                        i = C2719R.C2722id.questions6;
                                                                                                                        RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions6);
                                                                                                                        if (recyclerView6 != null) {
                                                                                                                            i = C2719R.C2722id.questions7;
                                                                                                                            RecyclerView recyclerView7 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions7);
                                                                                                                            if (recyclerView7 != null) {
                                                                                                                                i = C2719R.C2722id.questions8;
                                                                                                                                RecyclerView recyclerView8 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions8);
                                                                                                                                if (recyclerView8 != null) {
                                                                                                                                    i = C2719R.C2722id.questions9;
                                                                                                                                    RecyclerView recyclerView9 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions9);
                                                                                                                                    if (recyclerView9 != null) {
                                                                                                                                        i = C2719R.C2722id.report_layout;
                                                                                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                                                                                                                        if (scrollView != null) {
                                                                                                                                            i = C2719R.C2722id.result;
                                                                                                                                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                                                                                                            if (cardView4 != null) {
                                                                                                                                                i = C2719R.C2722id.resultTextEnglish2009;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultTextEnglish2009);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i = C2719R.C2722id.scr;
                                                                                                                                                    ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                                                                                                                    if (scrollView2 != null) {
                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                                                                                                                        i = C2719R.C2722id.sec3;
                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sec3);
                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                            i = C2719R.C2722id.telegram_report;
                                                                                                                                                            Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                                                                                                                            if (button2 != null) {
                                                                                                                                                                i = C2719R.C2722id.text1;
                                                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.text1);
                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                    i = C2719R.C2722id.texttt;
                                                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.texttt);
                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                        i = C2719R.C2722id.ttit;
                                                                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                            return new ActivityEnglish2009Binding(relativeLayout, textView, textView2, bind, button, cardView, cardView2, cardView3, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, progressBar, textView15, imageView, textView16, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, scrollView, cardView4, textView17, scrollView2, relativeLayout, textView18, button2, textView19, textView20, textView21);
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
