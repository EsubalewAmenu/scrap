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

public final class ActivitySat2011Binding implements ViewBinding {
    public final TextView PassTwo;
    public final TextView PassTwo1;
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final CardView card0;
    public final CardView card11;

    /* renamed from: en */
    public final TextView f534en;
    public final TextView ene;
    public final TextView ene11;
    public final TextView ene2;
    public final TextView ene21;
    public final TextView ene3;
    public final TextView ene31;
    public final TextView ent;
    public final TextView ente;
    public final TextView enteerr;
    public final TextView enteerrr;
    public final TextView enteerrr1;
    public final TextView enter;
    public final TextView entt;
    public final TextView entt1;
    public final TextView entteerrr;
    public final ProgressBar highScoreSat2011;
    public final ImageView img;
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
    public final TextView ttit;
    public final TextView ttit1;
    public final TextView ttit2;
    public final TextView ttit3;

    private ActivitySat2011Binding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ToolbarBinding toolbarBinding, Button button, CardView cardView, CardView cardView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, ProgressBar progressBar, ImageView imageView, TextView textView19, ImageView imageView2, TextView textView20, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, RecyclerView recyclerView9, RecyclerView recyclerView10, RecyclerView recyclerView11, RecyclerView recyclerView12, RecyclerView recyclerView13, ScrollView scrollView, CardView cardView3, TextView textView21, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView22, Button button2, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27) {
        this.rootView = relativeLayout;
        this.PassTwo = textView;
        this.PassTwo1 = textView2;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.card0 = cardView;
        this.card11 = cardView2;
        this.f534en = textView3;
        this.ene = textView4;
        this.ene11 = textView5;
        this.ene2 = textView6;
        this.ene21 = textView7;
        this.ene3 = textView8;
        this.ene31 = textView9;
        this.ent = textView10;
        this.ente = textView11;
        this.enteerr = textView12;
        this.enteerrr = textView13;
        this.enteerrr1 = textView14;
        this.enter = textView15;
        this.entt = textView16;
        this.entt1 = textView17;
        this.entteerrr = textView18;
        this.highScoreSat2011 = progressBar;
        this.img = imageView;
        this.instruction = textView19;
        this.instructionImg = imageView2;
        this.ourAnswer = textView20;
        this.questions = recyclerView;
        this.questions1 = recyclerView2;
        this.questions10 = recyclerView3;
        this.questions11 = recyclerView4;
        this.questions12 = recyclerView5;
        this.questions13 = recyclerView6;
        this.questions2 = recyclerView7;
        this.questions4 = recyclerView8;
        this.questions5 = recyclerView9;
        this.questions6 = recyclerView10;
        this.questions7 = recyclerView11;
        this.questions8 = recyclerView12;
        this.questions9 = recyclerView13;
        this.reportLayout = scrollView;
        this.result = cardView3;
        this.resultText = textView21;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.sec3 = textView22;
        this.telegramReport = button2;
        this.text1 = textView23;
        this.ttit = textView24;
        this.ttit1 = textView25;
        this.ttit2 = textView26;
        this.ttit3 = textView27;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySat2011Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivitySat2011Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_sat2011, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySat2011Binding bind(View view) {
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
                                i = C2719R.C2722id.f445en;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f445en);
                                if (textView3 != null) {
                                    i = C2719R.C2722id.ene;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene);
                                    if (textView4 != null) {
                                        i = C2719R.C2722id.ene11;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene11);
                                        if (textView5 != null) {
                                            i = C2719R.C2722id.ene2;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene2);
                                            if (textView6 != null) {
                                                i = C2719R.C2722id.ene21;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene21);
                                                if (textView7 != null) {
                                                    i = C2719R.C2722id.ene3;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene3);
                                                    if (textView8 != null) {
                                                        i = C2719R.C2722id.ene31;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ene31);
                                                        if (textView9 != null) {
                                                            i = C2719R.C2722id.ent;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ent);
                                                            if (textView10 != null) {
                                                                i = C2719R.C2722id.ente;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ente);
                                                                if (textView11 != null) {
                                                                    i = C2719R.C2722id.enteerr;
                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerr);
                                                                    if (textView12 != null) {
                                                                        i = C2719R.C2722id.enteerrr;
                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr);
                                                                        if (textView13 != null) {
                                                                            i = C2719R.C2722id.enteerrr1;
                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enteerrr1);
                                                                            if (textView14 != null) {
                                                                                i = C2719R.C2722id.enter;
                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.enter);
                                                                                if (textView15 != null) {
                                                                                    i = C2719R.C2722id.entt;
                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt);
                                                                                    if (textView16 != null) {
                                                                                        i = C2719R.C2722id.entt1;
                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entt1);
                                                                                        if (textView17 != null) {
                                                                                            i = C2719R.C2722id.entteerrr;
                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.entteerrr);
                                                                                            if (textView18 != null) {
                                                                                                i = C2719R.C2722id.highScore_sat2011;
                                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_sat2011);
                                                                                                if (progressBar != null) {
                                                                                                    i = C2719R.C2722id.img;
                                                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.img);
                                                                                                    if (imageView != null) {
                                                                                                        i = C2719R.C2722id.instruction;
                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                                                                                                        if (textView19 != null) {
                                                                                                            i = C2719R.C2722id.instruction_img;
                                                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                                                                                            if (imageView2 != null) {
                                                                                                                i = C2719R.C2722id.ourAnswer;
                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                                                                                                if (textView20 != null) {
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
                                                                                                                                                i = C2719R.C2722id.questions4;
                                                                                                                                                RecyclerView recyclerView8 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions4);
                                                                                                                                                if (recyclerView8 != null) {
                                                                                                                                                    i = C2719R.C2722id.questions5;
                                                                                                                                                    RecyclerView recyclerView9 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions5);
                                                                                                                                                    if (recyclerView9 != null) {
                                                                                                                                                        i = C2719R.C2722id.questions6;
                                                                                                                                                        RecyclerView recyclerView10 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions6);
                                                                                                                                                        if (recyclerView10 != null) {
                                                                                                                                                            i = C2719R.C2722id.questions7;
                                                                                                                                                            RecyclerView recyclerView11 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions7);
                                                                                                                                                            if (recyclerView11 != null) {
                                                                                                                                                                i = C2719R.C2722id.questions8;
                                                                                                                                                                RecyclerView recyclerView12 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions8);
                                                                                                                                                                if (recyclerView12 != null) {
                                                                                                                                                                    i = C2719R.C2722id.questions9;
                                                                                                                                                                    RecyclerView recyclerView13 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions9);
                                                                                                                                                                    if (recyclerView13 != null) {
                                                                                                                                                                        i = C2719R.C2722id.report_layout;
                                                                                                                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                                                                                                                                                        if (scrollView != null) {
                                                                                                                                                                            i = C2719R.C2722id.result;
                                                                                                                                                                            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                                                                                                                                            if (cardView3 != null) {
                                                                                                                                                                                i = C2719R.C2722id.resultText;
                                                                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultText);
                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                    i = C2719R.C2722id.scr;
                                                                                                                                                                                    ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                                                                                                                                                    if (scrollView2 != null) {
                                                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                                                                                                                                                        i = C2719R.C2722id.sec3;
                                                                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.sec3);
                                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                                            i = C2719R.C2722id.telegram_report;
                                                                                                                                                                                            Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                                                                                                                                                            if (button2 != null) {
                                                                                                                                                                                                i = C2719R.C2722id.text1;
                                                                                                                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.text1);
                                                                                                                                                                                                if (textView23 != null) {
                                                                                                                                                                                                    i = C2719R.C2722id.ttit;
                                                                                                                                                                                                    TextView textView24 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                                                                                                                                                    if (textView24 != null) {
                                                                                                                                                                                                        i = C2719R.C2722id.ttit1;
                                                                                                                                                                                                        TextView textView25 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit1);
                                                                                                                                                                                                        if (textView25 != null) {
                                                                                                                                                                                                            i = C2719R.C2722id.ttit2;
                                                                                                                                                                                                            TextView textView26 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit2);
                                                                                                                                                                                                            if (textView26 != null) {
                                                                                                                                                                                                                i = C2719R.C2722id.ttit3;
                                                                                                                                                                                                                TextView textView27 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit3);
                                                                                                                                                                                                                if (textView27 != null) {
                                                                                                                                                                                                                    return new ActivitySat2011Binding(relativeLayout, textView, textView2, bind, button, cardView, cardView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, progressBar, imageView, textView19, imageView2, textView20, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, scrollView, cardView3, textView21, scrollView2, relativeLayout, textView22, button2, textView23, textView24, textView25, textView26, textView27);
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
