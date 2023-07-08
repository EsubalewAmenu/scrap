package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityCivics2005QuestionsBinding implements ViewBinding {
    public final RecyclerView questions;
    private final ScrollView rootView;
    public final ScrollView scroll;
    public final TextView tit;
    public final TextView ttit;

    private ActivityCivics2005QuestionsBinding(ScrollView scrollView, RecyclerView recyclerView, ScrollView scrollView2, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.questions = recyclerView;
        this.scroll = scrollView2;
        this.tit = textView;
        this.ttit = textView2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityCivics2005QuestionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityCivics2005QuestionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_civics2005_questions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCivics2005QuestionsBinding bind(View view) {
        int i = C2719R.C2722id.questions;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C2719R.C2722id.questions);
        if (recyclerView != null) {
            ScrollView scrollView = (ScrollView) view;
            i = C2719R.C2722id.tit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.tit);
            if (textView != null) {
                i = C2719R.C2722id.ttit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.ttit);
                if (textView2 != null) {
                    return new ActivityCivics2005QuestionsBinding(scrollView, recyclerView, scrollView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
