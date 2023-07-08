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

public final class ActivityEnglish2013Binding implements ViewBinding {
    public final TextView PassTwo;
    public final TextView PassTwo11;
    public final TextView Passone;
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final CardView card0;
    public final CardView card1;
    public final CardView card101;

    /* renamed from: e */
    public final TextView f528e;

    /* renamed from: en */
    public final TextView f529en;
    public final TextView ena;
    public final TextView ena11;
    public final TextView ena111;
    public final TextView enas;
    public final TextView ene;
    public final TextView ene112;
    public final TextView ent;
    public final TextView ente;
    public final TextView entee;
    public final TextView enteerr;
    public final TextView enteerrr;
    public final TextView enter;
    public final TextView entt;
    public final TextView entt11;
    public final TextView entt12;
    public final TextView entt13;
    public final TextView entt2;
    public final TextView entteerrr;
    public final ProgressBar highScoreEnglish2013;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView ourAnswer;
    public final RecyclerView questions;
    public final RecyclerView questions1;
    public final RecyclerView questions10;
    public final RecyclerView questions11;
    public final RecyclerView questions12;
    public final RecyclerView questions13;
    public final RecyclerView questions2;
    public final RecyclerView questions3;
    public final RecyclerView questions4;
    public final RecyclerView questions5;
    public final RecyclerView questions6;
    public final RecyclerView questions7;
    public final RecyclerView questions8;
    public final RecyclerView questions9;
    public final ScrollView reportLayout;
    public final CardView result;
    public final TextView resultTextEnglish2013;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final Button telegramReport;
    public final TextView texttt;
    public final TextView ttit;
    public final TextView ttit1;
    public final TextView ttit101;
    public final TextView ttit22;

    private ActivityEnglish2013Binding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, ToolbarBinding toolbarBinding, Button button, CardView cardView, CardView cardView2, CardView cardView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, ProgressBar progressBar, TextView textView24, ImageView imageView, TextView textView25, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, RecyclerView recyclerView9, RecyclerView recyclerView10, RecyclerView recyclerView11, RecyclerView recyclerView12, RecyclerView recyclerView13, RecyclerView recyclerView14, ScrollView scrollView, CardView cardView4, TextView textView26, ScrollView scrollView2, RelativeLayout relativeLayout2, Button button2, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31) {
        this.rootView = relativeLayout;
        this.PassTwo = textView;
        this.PassTwo11 = textView2;
        this.Passone = textView3;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.card0 = cardView;
        this.card1 = cardView2;
        this.card101 = cardView3;
        this.f528e = textView4;
        this.f529en = textView5;
        this.ena = textView6;
        this.ena11 = textView7;
        this.ena111 = textView8;
        this.enas = textView9;
        this.ene = textView10;
        this.ene112 = textView11;
        this.ent = textView12;
        this.ente = textView13;
        this.entee = textView14;
        this.enteerr = textView15;
        this.enteerrr = textView16;
        this.enter = textView17;
        this.entt = textView18;
        this.entt11 = textView19;
        this.entt12 = textView20;
        this.entt13 = textView21;
        this.entt2 = textView22;
        this.entteerrr = textView23;
        this.highScoreEnglish2013 = progressBar;
        this.instruction = textView24;
        this.instructionImg = imageView;
        this.ourAnswer = textView25;
        this.questions = recyclerView;
        this.questions1 = recyclerView2;
        this.questions10 = recyclerView3;
        this.questions11 = recyclerView4;
        this.questions12 = recyclerView5;
        this.questions13 = recyclerView6;
        this.questions2 = recyclerView7;
        this.questions3 = recyclerView8;
        this.questions4 = recyclerView9;
        this.questions5 = recyclerView10;
        this.questions6 = recyclerView11;
        this.questions7 = recyclerView12;
        this.questions8 = recyclerView13;
        this.questions9 = recyclerView14;
        this.reportLayout = scrollView;
        this.result = cardView4;
        this.resultTextEnglish2013 = textView26;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.telegramReport = button2;
        this.texttt = textView27;
        this.ttit = textView28;
        this.ttit1 = textView29;
        this.ttit101 = textView30;
        this.ttit22 = textView31;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEnglish2013Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityEnglish2013Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_english2013, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEnglish2013Binding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.PassTwo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.PassTwo);
        if (textView != null) {
            i = C2719R.C2722id.PassTwo11;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.PassTwo11);
            if (textView2 != null) {
                i = C2719R.C2722id.Passone;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.Passone);
                if (textView3 != null) {
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
                                    i = C2719R.C2722id.card101;
                                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.card101);
                                    if (cardView3 != null) {
                                        i = C2719R.C2722id.f443e;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f443e);
                                        if (textView4 != null) {
                                            i = C2719R.C2722id.f445en;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f445en);
                                            if (textView5 != null) {
                                                i = C2719R.C2722id.ena;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ena);
                                                if (textView6 != null) {
                                                    i = C2719R.C2722id.ena11;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ena11);
                                                    if (textView7 != null) {
                                                        i = C2719R.C2722id.ena111;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ena111);
                                                        if (textView8 != null) {
                                                            i = C2719R.C2722id.enas;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enas);
                                                            if (textView9 != null) {
                                                                i = C2719R.C2722id.ene;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene);
                                                                if (textView10 != null) {
                                                                    i = C2719R.C2722id.ene112;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene112);
                                                                    if (textView11 != null) {
                                                                        i = C2719R.C2722id.ent;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ent);
                                                                        if (textView12 != null) {
                                                                            i = C2719R.C2722id.ente;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ente);
                                                                            if (textView13 != null) {
                                                                                i = C2719R.C2722id.entee;
                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entee);
                                                                                if (textView14 != null) {
                                                                                    i = C2719R.C2722id.enteerr;
                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerr);
                                                                                    if (textView15 != null) {
                                                                                        i = C2719R.C2722id.enteerrr;
                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr);
                                                                                        if (textView16 != null) {
                                                                                            i = C2719R.C2722id.enter;
                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enter);
                                                                                            if (textView17 != null) {
                                                                                                i = C2719R.C2722id.entt;
                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt);
                                                                                                if (textView18 != null) {
                                                                                                    i = C2719R.C2722id.entt11;
                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt11);
                                                                                                    if (textView19 != null) {
                                                                                                        i = C2719R.C2722id.entt12;
                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt12);
                                                                                                        if (textView20 != null) {
                                                                                                            i = C2719R.C2722id.entt13;
                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt13);
                                                                                                            if (textView21 != null) {
                                                                                                                i = C2719R.C2722id.entt2;
                                                                                                                TextView textView22 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt2);
                                                                                                                if (textView22 != null) {
                                                                                                                    i = C2719R.C2722id.entteerrr;
                                                                                                                    TextView textView23 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr);
                                                                                                                    if (textView23 != null) {
                                                                                                                        i = C2719R.C2722id.highScore_english2013;
                                                                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_english2013);
                                                                                                                        if (progressBar != null) {
                                                                                                                            i = C2719R.C2722id.instruction;
                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                                                                                                                            if (textView24 != null) {
                                                                                                                                i = C2719R.C2722id.instruction_img;
                                                                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                                                                                                                if (imageView != null) {
                                                                                                                                    i = C2719R.C2722id.ourAnswer;
                                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                                                                                                                    if (textView25 != null) {
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
                                                                                                                                                            i = C2719R.C2722id.questions13;
                                                                                                                                                            RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions13);
                                                                                                                                                            if (recyclerView6 != null) {
                                                                                                                                                                i = C2719R.C2722id.questions2;
                                                                                                                                                                RecyclerView recyclerView7 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions2);
                                                                                                                                                                if (recyclerView7 != null) {
                                                                                                                                                                    i = C2719R.C2722id.questions3;
                                                                                                                                                                    RecyclerView recyclerView8 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions3);
                                                                                                                                                                    if (recyclerView8 != null) {
                                                                                                                                                                        i = C2719R.C2722id.questions4;
                                                                                                                                                                        RecyclerView recyclerView9 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions4);
                                                                                                                                                                        if (recyclerView9 != null) {
                                                                                                                                                                            i = C2719R.C2722id.questions5;
                                                                                                                                                                            RecyclerView recyclerView10 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions5);
                                                                                                                                                                            if (recyclerView10 != null) {
                                                                                                                                                                                i = C2719R.C2722id.questions6;
                                                                                                                                                                                RecyclerView recyclerView11 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions6);
                                                                                                                                                                                if (recyclerView11 != null) {
                                                                                                                                                                                    i = C2719R.C2722id.questions7;
                                                                                                                                                                                    RecyclerView recyclerView12 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions7);
                                                                                                                                                                                    if (recyclerView12 != null) {
                                                                                                                                                                                        i = C2719R.C2722id.questions8;
                                                                                                                                                                                        RecyclerView recyclerView13 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions8);
                                                                                                                                                                                        if (recyclerView13 != null) {
                                                                                                                                                                                            i = C2719R.C2722id.questions9;
                                                                                                                                                                                            RecyclerView recyclerView14 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions9);
                                                                                                                                                                                            if (recyclerView14 != null) {
                                                                                                                                                                                                i = C2719R.C2722id.report_layout;
                                                                                                                                                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                                                                                                                                                                                if (scrollView != null) {
                                                                                                                                                                                                    i = C2719R.C2722id.result;
                                                                                                                                                                                                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                                                                                                                                                                    if (cardView4 != null) {
                                                                                                                                                                                                        i = C2719R.C2722id.resultTextEnglish2013;
                                                                                                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultTextEnglish2013);
                                                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                                                            i = C2719R.C2722id.scr;
                                                                                                                                                                                                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                                                                                                                                                                            if (scrollView2 != null) {
                                                                                                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                                                                                                                                                                                i = C2719R.C2722id.telegram_report;
                                                                                                                                                                                                                Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                                                                                                                                                                                if (button2 != null) {
                                                                                                                                                                                                                    i = C2719R.C2722id.texttt;
                                                                                                                                                                                                                    TextView textView27 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.texttt);
                                                                                                                                                                                                                    if (textView27 != null) {
                                                                                                                                                                                                                        i = C2719R.C2722id.ttit;
                                                                                                                                                                                                                        TextView textView28 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                                                                                                                                                                        if (textView28 != null) {
                                                                                                                                                                                                                            i = C2719R.C2722id.ttit1;
                                                                                                                                                                                                                            TextView textView29 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit1);
                                                                                                                                                                                                                            if (textView29 != null) {
                                                                                                                                                                                                                                i = C2719R.C2722id.ttit101;
                                                                                                                                                                                                                                TextView textView30 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit101);
                                                                                                                                                                                                                                if (textView30 != null) {
                                                                                                                                                                                                                                    i = C2719R.C2722id.ttit22;
                                                                                                                                                                                                                                    TextView textView31 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit22);
                                                                                                                                                                                                                                    if (textView31 != null) {
                                                                                                                                                                                                                                        return new ActivityEnglish2013Binding(relativeLayout, textView, textView2, textView3, bind, button, cardView, cardView2, cardView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, progressBar, textView24, imageView, textView25, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, recyclerView14, scrollView, cardView4, textView26, scrollView2, relativeLayout, button2, textView27, textView28, textView29, textView30, textView31);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
