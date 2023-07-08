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

public final class ActivityPhysics2013Binding implements ViewBinding {
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final TextView directions;
    public final Button formulaReference;
    public final ProgressBar highScorePhysics2013;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView ourAnswer;
    public final RecyclerView questionsMaths;
    public final ScrollView reportLayout;
    public final CardView result;
    public final TextView resultTextPhysics2013;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final Button telegramReport;
    public final TextView tit;
    public final TextView ttit;

    private ActivityPhysics2013Binding(RelativeLayout relativeLayout, ToolbarBinding toolbarBinding, Button button, TextView textView, Button button2, ProgressBar progressBar, TextView textView2, ImageView imageView, TextView textView3, RecyclerView recyclerView, ScrollView scrollView, CardView cardView, TextView textView4, ScrollView scrollView2, RelativeLayout relativeLayout2, Button button3, TextView textView5, TextView textView6) {
        this.rootView = relativeLayout;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.directions = textView;
        this.formulaReference = button2;
        this.highScorePhysics2013 = progressBar;
        this.instruction = textView2;
        this.instructionImg = imageView;
        this.ourAnswer = textView3;
        this.questionsMaths = recyclerView;
        this.reportLayout = scrollView;
        this.result = cardView;
        this.resultTextPhysics2013 = textView4;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.telegramReport = button3;
        this.tit = textView5;
        this.ttit = textView6;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPhysics2013Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityPhysics2013Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_physics2013, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPhysics2013Binding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.app;
        View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.app);
        if (findChildViewById != null) {
            ToolbarBinding bind = ToolbarBinding.bind(findChildViewById);
            i = C2719R.C2722id.cancel_report;
            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.cancel_report);
            if (button != null) {
                i = C2719R.C2722id.directions;
                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.directions);
                if (textView != null) {
                    i = C2719R.C2722id.formulaReference;
                    Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.formulaReference);
                    if (button2 != null) {
                        i = C2719R.C2722id.highScore_physics2013;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_physics2013);
                        if (progressBar != null) {
                            i = C2719R.C2722id.instruction;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                            if (textView2 != null) {
                                i = C2719R.C2722id.instruction_img;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                if (imageView != null) {
                                    i = C2719R.C2722id.ourAnswer;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                    if (textView3 != null) {
                                        i = C2719R.C2722id.questionsMaths;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questionsMaths);
                                        if (recyclerView != null) {
                                            i = C2719R.C2722id.report_layout;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                            if (scrollView != null) {
                                                i = C2719R.C2722id.result;
                                                CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                if (cardView != null) {
                                                    i = C2719R.C2722id.resultTextPhysics2013;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultTextPhysics2013);
                                                    if (textView4 != null) {
                                                        i = C2719R.C2722id.scr;
                                                        ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                        if (scrollView2 != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                            i = C2719R.C2722id.telegram_report;
                                                            Button button3 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                            if (button3 != null) {
                                                                i = C2719R.C2722id.tit;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.tit);
                                                                if (textView5 != null) {
                                                                    i = C2719R.C2722id.ttit;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                    if (textView6 != null) {
                                                                        return new ActivityPhysics2013Binding(relativeLayout, bind, button, textView, button2, progressBar, textView2, imageView, textView3, recyclerView, scrollView, cardView, textView4, scrollView2, relativeLayout, button3, textView5, textView6);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
