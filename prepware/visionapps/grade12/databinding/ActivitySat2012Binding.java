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

public final class ActivitySat2012Binding implements ViewBinding {
    public final TextView PassTwo;
    public final TextView PassTwo1;
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final CardView card0;
    public final CardView card11;
    public final CardView card112;

    /* renamed from: en */
    public final TextView f535en;
    public final TextView ent;
    public final TextView ente;
    public final TextView enteerrr;
    public final TextView enteerrr1;
    public final TextView enteerrr12;
    public final TextView enteerrr123;
    public final TextView enter;
    public final TextView entteerrr;
    public final TextView entteerrr1;
    public final ProgressBar highScoreSat2012;
    public final ImageView img;
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
    public final TextView resultText;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final Button telegramReport;
    public final TextView text1;
    public final TextView texttt;
    public final TextView ttit;
    public final TextView ttit1;
    public final TextView ttit2;
    public final TextView ttit3;

    private ActivitySat2012Binding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ToolbarBinding toolbarBinding, Button button, CardView cardView, CardView cardView2, CardView cardView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, ProgressBar progressBar, ImageView imageView, TextView textView13, ImageView imageView2, TextView textView14, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, RecyclerView recyclerView9, ScrollView scrollView, CardView cardView4, TextView textView15, ScrollView scrollView2, RelativeLayout relativeLayout2, Button button2, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21) {
        this.rootView = relativeLayout;
        this.PassTwo = textView;
        this.PassTwo1 = textView2;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.card0 = cardView;
        this.card11 = cardView2;
        this.card112 = cardView3;
        this.f535en = textView3;
        this.ent = textView4;
        this.ente = textView5;
        this.enteerrr = textView6;
        this.enteerrr1 = textView7;
        this.enteerrr12 = textView8;
        this.enteerrr123 = textView9;
        this.enter = textView10;
        this.entteerrr = textView11;
        this.entteerrr1 = textView12;
        this.highScoreSat2012 = progressBar;
        this.img = imageView;
        this.instruction = textView13;
        this.instructionImg = imageView2;
        this.ourAnswer = textView14;
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
        this.resultText = textView15;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.telegramReport = button2;
        this.text1 = textView16;
        this.texttt = textView17;
        this.ttit = textView18;
        this.ttit1 = textView19;
        this.ttit2 = textView20;
        this.ttit3 = textView21;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySat2012Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivitySat2012Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_sat2012, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySat2012Binding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.PassTwo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.PassTwo);
        if (textView != null) {
            i = C2719R.C2722id.PassTwo1;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.PassTwo1);
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
                            i = C2719R.C2722id.card11;
                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card11);
                            if (cardView2 != null) {
                                i = C2719R.C2722id.card112;
                                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card112);
                                if (cardView3 != null) {
                                    i = C2719R.C2722id.f445en;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f445en);
                                    if (textView3 != null) {
                                        i = C2719R.C2722id.ent;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ent);
                                        if (textView4 != null) {
                                            i = C2719R.C2722id.ente;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ente);
                                            if (textView5 != null) {
                                                i = C2719R.C2722id.enteerrr;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr);
                                                if (textView6 != null) {
                                                    i = C2719R.C2722id.enteerrr1;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr1);
                                                    if (textView7 != null) {
                                                        i = C2719R.C2722id.enteerrr12;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr12);
                                                        if (textView8 != null) {
                                                            i = C2719R.C2722id.enteerrr123;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr123);
                                                            if (textView9 != null) {
                                                                i = C2719R.C2722id.enter;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enter);
                                                                if (textView10 != null) {
                                                                    i = C2719R.C2722id.entteerrr;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr);
                                                                    if (textView11 != null) {
                                                                        i = C2719R.C2722id.entteerrr1;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr1);
                                                                        if (textView12 != null) {
                                                                            i = C2719R.C2722id.highScore_sat2012;
                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_sat2012);
                                                                            if (progressBar != null) {
                                                                                i = C2719R.C2722id.img;
                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.img);
                                                                                if (imageView != null) {
                                                                                    i = C2719R.C2722id.instruction;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                                                                                    if (textView13 != null) {
                                                                                        i = C2719R.C2722id.instruction_img;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                                                                        if (imageView2 != null) {
                                                                                            i = C2719R.C2722id.ourAnswer;
                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                                                                            if (textView14 != null) {
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
                                                                                                                                            i = C2719R.C2722id.resultText;
                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText);
                                                                                                                                            if (textView15 != null) {
                                                                                                                                                i = C2719R.C2722id.scr;
                                                                                                                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                                                                                                                if (scrollView2 != null) {
                                                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                                                                                                                    i = C2719R.C2722id.telegram_report;
                                                                                                                                                    Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                                                                                                                    if (button2 != null) {
                                                                                                                                                        i = C2719R.C2722id.text1;
                                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.text1);
                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                            i = C2719R.C2722id.texttt;
                                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.texttt);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                i = C2719R.C2722id.ttit;
                                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                    i = C2719R.C2722id.ttit1;
                                                                                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit1);
                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                        i = C2719R.C2722id.ttit2;
                                                                                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit2);
                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                            i = C2719R.C2722id.ttit3;
                                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit3);
                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                return new ActivitySat2012Binding(relativeLayout, textView, textView2, bind, button, cardView, cardView2, cardView3, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, progressBar, imageView, textView13, imageView2, textView14, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, scrollView, cardView4, textView15, scrollView2, relativeLayout, button2, textView16, textView17, textView18, textView19, textView20, textView21);
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
