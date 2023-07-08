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

public final class ActivitySat2010Binding implements ViewBinding {
    public final TextView PassTwo;
    public final TextView PassTwo1;
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final CardView card0;

    /* renamed from: en */
    public final TextView f533en;
    public final TextView ene;
    public final TextView ene1;
    public final TextView ene2;
    public final TextView ene3;
    public final TextView ent;
    public final TextView ente;
    public final TextView enteerrr;
    public final TextView enteerrr1;
    public final TextView enteerrr12;
    public final TextView enter;
    public final TextView entteerrr;
    public final ProgressBar highScoreSat2010;
    public final ImageView img;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView ourAnswer;
    public final RecyclerView questions;
    public final RecyclerView questions1;
    public final RecyclerView questions10;
    public final RecyclerView questions11;
    public final RecyclerView questions12;
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
    public final TextView sec3;
    public final Button telegramReport;
    public final TextView text1;
    public final TextView texttt;
    public final TextView ttit;
    public final TextView ttit1;
    public final TextView ttit2;
    public final TextView ttit3;

    private ActivitySat2010Binding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ToolbarBinding toolbarBinding, Button button, CardView cardView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, ProgressBar progressBar, ImageView imageView, TextView textView15, ImageView imageView2, TextView textView16, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, RecyclerView recyclerView9, RecyclerView recyclerView10, RecyclerView recyclerView11, RecyclerView recyclerView12, ScrollView scrollView, CardView cardView2, TextView textView17, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView18, Button button2, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24) {
        this.rootView = relativeLayout;
        this.PassTwo = textView;
        this.PassTwo1 = textView2;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.card0 = cardView;
        this.f533en = textView3;
        this.ene = textView4;
        this.ene1 = textView5;
        this.ene2 = textView6;
        this.ene3 = textView7;
        this.ent = textView8;
        this.ente = textView9;
        this.enteerrr = textView10;
        this.enteerrr1 = textView11;
        this.enteerrr12 = textView12;
        this.enter = textView13;
        this.entteerrr = textView14;
        this.highScoreSat2010 = progressBar;
        this.img = imageView;
        this.instruction = textView15;
        this.instructionImg = imageView2;
        this.ourAnswer = textView16;
        this.questions = recyclerView;
        this.questions1 = recyclerView2;
        this.questions10 = recyclerView3;
        this.questions11 = recyclerView4;
        this.questions12 = recyclerView5;
        this.questions2 = recyclerView6;
        this.questions4 = recyclerView7;
        this.questions5 = recyclerView8;
        this.questions6 = recyclerView9;
        this.questions7 = recyclerView10;
        this.questions8 = recyclerView11;
        this.questions9 = recyclerView12;
        this.reportLayout = scrollView;
        this.result = cardView2;
        this.resultText = textView17;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.sec3 = textView18;
        this.telegramReport = button2;
        this.text1 = textView19;
        this.texttt = textView20;
        this.ttit = textView21;
        this.ttit1 = textView22;
        this.ttit2 = textView23;
        this.ttit3 = textView24;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySat2010Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivitySat2010Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_sat2010, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySat2010Binding bind(View view) {
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
                            i = C2719R.C2722id.f445en;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f445en);
                            if (textView3 != null) {
                                i = C2719R.C2722id.ene;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene);
                                if (textView4 != null) {
                                    i = C2719R.C2722id.ene1;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene1);
                                    if (textView5 != null) {
                                        i = C2719R.C2722id.ene2;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene2);
                                        if (textView6 != null) {
                                            i = C2719R.C2722id.ene3;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene3);
                                            if (textView7 != null) {
                                                i = C2719R.C2722id.ent;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ent);
                                                if (textView8 != null) {
                                                    i = C2719R.C2722id.ente;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ente);
                                                    if (textView9 != null) {
                                                        i = C2719R.C2722id.enteerrr;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr);
                                                        if (textView10 != null) {
                                                            i = C2719R.C2722id.enteerrr1;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr1);
                                                            if (textView11 != null) {
                                                                i = C2719R.C2722id.enteerrr12;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr12);
                                                                if (textView12 != null) {
                                                                    i = C2719R.C2722id.enter;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enter);
                                                                    if (textView13 != null) {
                                                                        i = C2719R.C2722id.entteerrr;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr);
                                                                        if (textView14 != null) {
                                                                            i = C2719R.C2722id.highScore_sat2010;
                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_sat2010);
                                                                            if (progressBar != null) {
                                                                                i = C2719R.C2722id.img;
                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.img);
                                                                                if (imageView != null) {
                                                                                    i = C2719R.C2722id.instruction;
                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                                                                                    if (textView15 != null) {
                                                                                        i = C2719R.C2722id.instruction_img;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                                                                        if (imageView2 != null) {
                                                                                            i = C2719R.C2722id.ourAnswer;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                                                                            if (textView16 != null) {
                                                                                                i = C2719R.C2722id.questions;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions);
                                                                                                if (recyclerView != null) {
                                                                                                    i = C2719R.C2722id.questions1;
                                                                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions1);
                                                                                                    if (recyclerView2 != null) {
                                                                                                        i = C2719R.C2722id.questions10;
                                                                                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions10);
                                                                                                        if (recyclerView3 != null) {
                                                                                                            i = C2719R.C2722id.questions11;
                                                                                                            RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions11);
                                                                                                            if (recyclerView4 != null) {
                                                                                                                i = C2719R.C2722id.questions12;
                                                                                                                RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions12);
                                                                                                                if (recyclerView5 != null) {
                                                                                                                    i = C2719R.C2722id.questions2;
                                                                                                                    RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions2);
                                                                                                                    if (recyclerView6 != null) {
                                                                                                                        i = C2719R.C2722id.questions4;
                                                                                                                        RecyclerView recyclerView7 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions4);
                                                                                                                        if (recyclerView7 != null) {
                                                                                                                            i = C2719R.C2722id.questions5;
                                                                                                                            RecyclerView recyclerView8 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions5);
                                                                                                                            if (recyclerView8 != null) {
                                                                                                                                i = C2719R.C2722id.questions6;
                                                                                                                                RecyclerView recyclerView9 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions6);
                                                                                                                                if (recyclerView9 != null) {
                                                                                                                                    i = C2719R.C2722id.questions7;
                                                                                                                                    RecyclerView recyclerView10 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions7);
                                                                                                                                    if (recyclerView10 != null) {
                                                                                                                                        i = C2719R.C2722id.questions8;
                                                                                                                                        RecyclerView recyclerView11 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions8);
                                                                                                                                        if (recyclerView11 != null) {
                                                                                                                                            i = C2719R.C2722id.questions9;
                                                                                                                                            RecyclerView recyclerView12 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions9);
                                                                                                                                            if (recyclerView12 != null) {
                                                                                                                                                i = C2719R.C2722id.report_layout;
                                                                                                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                                                                                                                                if (scrollView != null) {
                                                                                                                                                    i = C2719R.C2722id.result;
                                                                                                                                                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                                                                                                                    if (cardView2 != null) {
                                                                                                                                                        i = C2719R.C2722id.resultText;
                                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText);
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
                                                                                                                                                                                    i = C2719R.C2722id.ttit1;
                                                                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit1);
                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                        i = C2719R.C2722id.ttit2;
                                                                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit2);
                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                            i = C2719R.C2722id.ttit3;
                                                                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit3);
                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                return new ActivitySat2010Binding(relativeLayout, textView, textView2, bind, button, cardView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, progressBar, imageView, textView15, imageView2, textView16, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, scrollView, cardView2, textView17, scrollView2, relativeLayout, textView18, button2, textView19, textView20, textView21, textView22, textView23, textView24);
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
