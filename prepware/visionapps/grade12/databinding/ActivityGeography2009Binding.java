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
import com.github.chrisbanes.photoview.PhotoView;
import com.visionapps.grade12.C2719R;

public final class ActivityGeography2009Binding implements ViewBinding {
    public final ToolbarBinding app;
    public final Button cancelReport;
    public final TextView directions;
    public final PhotoView econmap;
    public final ProgressBar highScoreGeography2009;
    public final TextView instruction;
    public final ImageView instructionImg;
    public final TextView item;
    public final TextView ourAnswer;
    public final RecyclerView questions;
    public final RecyclerView questions1;
    public final ScrollView reportLayout;
    public final CardView result;
    public final TextView resultTextGeography2009;
    private final RelativeLayout rootView;
    public final ScrollView scr;
    public final RelativeLayout scroll;
    public final Button telegramReport;
    public final TextView tit;
    public final TextView ttit;

    private ActivityGeography2009Binding(RelativeLayout relativeLayout, ToolbarBinding toolbarBinding, Button button, TextView textView, PhotoView photoView, ProgressBar progressBar, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, RecyclerView recyclerView, RecyclerView recyclerView2, ScrollView scrollView, CardView cardView, TextView textView5, ScrollView scrollView2, RelativeLayout relativeLayout2, Button button2, TextView textView6, TextView textView7) {
        this.rootView = relativeLayout;
        this.app = toolbarBinding;
        this.cancelReport = button;
        this.directions = textView;
        this.econmap = photoView;
        this.highScoreGeography2009 = progressBar;
        this.instruction = textView2;
        this.instructionImg = imageView;
        this.item = textView3;
        this.ourAnswer = textView4;
        this.questions = recyclerView;
        this.questions1 = recyclerView2;
        this.reportLayout = scrollView;
        this.result = cardView;
        this.resultTextGeography2009 = textView5;
        this.scr = scrollView2;
        this.scroll = relativeLayout2;
        this.telegramReport = button2;
        this.tit = textView6;
        this.ttit = textView7;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGeography2009Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityGeography2009Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_geography2009, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGeography2009Binding bind(View view) {
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
                    i = C2719R.C2722id.econmap;
                    PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.econmap);
                    if (photoView != null) {
                        i = C2719R.C2722id.highScore_geography2009;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.highScore_geography2009);
                        if (progressBar != null) {
                            i = C2719R.C2722id.instruction;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction);
                            if (textView2 != null) {
                                i = C2719R.C2722id.instruction_img;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instruction_img);
                                if (imageView != null) {
                                    i = C2719R.C2722id.item;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.item);
                                    if (textView3 != null) {
                                        i = C2719R.C2722id.ourAnswer;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ourAnswer);
                                        if (textView4 != null) {
                                            i = C2719R.C2722id.questions;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions);
                                            if (recyclerView != null) {
                                                i = C2719R.C2722id.questions1;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questions1);
                                                if (recyclerView2 != null) {
                                                    i = C2719R.C2722id.report_layout;
                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.report_layout);
                                                    if (scrollView != null) {
                                                        i = C2719R.C2722id.result;
                                                        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.result);
                                                        if (cardView != null) {
                                                            i = C2719R.C2722id.resultTextGeography2009;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.resultTextGeography2009);
                                                            if (textView5 != null) {
                                                                i = C2719R.C2722id.scr;
                                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view2, C2719R.C2722id.scr);
                                                                if (scrollView2 != null) {
                                                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                                    i = C2719R.C2722id.telegram_report;
                                                                    Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_report);
                                                                    if (button2 != null) {
                                                                        i = C2719R.C2722id.tit;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.tit);
                                                                        if (textView6 != null) {
                                                                            i = C2719R.C2722id.ttit;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.ttit);
                                                                            if (textView7 != null) {
                                                                                return new ActivityGeography2009Binding(relativeLayout, bind, button, textView, photoView, progressBar, textView2, imageView, textView3, textView4, recyclerView, recyclerView2, scrollView, cardView, textView5, scrollView2, relativeLayout, button2, textView6, textView7);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
