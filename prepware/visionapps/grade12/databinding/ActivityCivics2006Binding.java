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

public final class ActivityCivics2006Binding implements ViewBinding {
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final ProgressBar highScoreCivics2006;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView ourAnswer;
    public final RecyclerView questions;
    public final ScrollView reportLayout;
    public final CardView result;
    public final TextView resultTextCivics2006;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final Button telegramReport;
    public final TextView tit;
    public final TextView ttit;

    private ActivityCivics2006Binding(RelativeLayout relativeLayout, ToolbarBinding toolbarBinding, Button button, ProgressBar progressBar, TextView textView, ImageView imageView, TextView textView2, RecyclerView recyclerView, ScrollView scrollView, CardView cardView, TextView textView3, ScrollView scrollView2, RelativeLayout relativeLayout2, Button button2, TextView textView4, TextView textView5) {
        this.rootView = relativeLayout;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.highScoreCivics2006 = progressBar;
        this.instruction = textView;
        this.instructionImg = imageView;
        this.ourAnswer = textView2;
        this.questions = recyclerView;
        this.reportLayout = scrollView;
        this.result = cardView;
        this.resultTextCivics2006 = textView3;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.telegramReport = button2;
        this.tit = textView4;
        this.ttit = textView5;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCivics2006Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityCivics2006Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_civics2006, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCivics2006Binding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.app;
        View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.app);
        if (findChildViewById != null) {
            ToolbarBinding bind = ToolbarBinding.bind(findChildViewById);
            i = C2719R.C2722id.cancel_report;
            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.cancel_report);
            if (button != null) {
                i = C2719R.C2722id.highScore_Civics2006;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_Civics2006);
                if (progressBar != null) {
                    i = C2719R.C2722id.instruction;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                    if (textView != null) {
                        i = C2719R.C2722id.instruction_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                        if (imageView != null) {
                            i = C2719R.C2722id.ourAnswer;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                            if (textView2 != null) {
                                i = C2719R.C2722id.questions;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions);
                                if (recyclerView != null) {
                                    i = C2719R.C2722id.report_layout;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                    if (scrollView != null) {
                                        i = C2719R.C2722id.result;
                                        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                        if (cardView != null) {
                                            i = C2719R.C2722id.resultTextCivics2006;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultTextCivics2006);
                                            if (textView3 != null) {
                                                i = C2719R.C2722id.scr;
                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                if (scrollView2 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                    i = C2719R.C2722id.telegram_report;
                                                    Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                    if (button2 != null) {
                                                        i = C2719R.C2722id.tit;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.tit);
                                                        if (textView4 != null) {
                                                            i = C2719R.C2722id.ttit;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                            if (textView5 != null) {
                                                                return new ActivityCivics2006Binding(relativeLayout, bind, button, progressBar, textView, imageView, textView2, recyclerView, scrollView, cardView, textView3, scrollView2, relativeLayout, button2, textView4, textView5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
