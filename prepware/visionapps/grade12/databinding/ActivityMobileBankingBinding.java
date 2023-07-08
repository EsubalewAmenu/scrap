package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityMobileBankingBinding implements ViewBinding {
    public final CardView cardStep1;
    public final CardView cardStep2;
    public final CardView cardStep3;
    public final TextView check1;

    /* renamed from: eg */
    public final TextView f530eg;
    public final Button iPaid1;
    public final EditText mobileName;
    public final EditText mobileNumber;
    public final Spinner mobileSpinner;
    public final TextView notice;
    private final ScrollView rootView;
    public final TextView step1;
    public final TextView step2;
    public final TextView step3;
    public final View topView;
    public final View wave;

    private ActivityMobileBankingBinding(ScrollView scrollView, CardView cardView, CardView cardView2, CardView cardView3, TextView textView, TextView textView2, Button button, EditText editText, EditText editText2, Spinner spinner, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view, View view2) {
        this.rootView = scrollView;
        this.cardStep1 = cardView;
        this.cardStep2 = cardView2;
        this.cardStep3 = cardView3;
        this.check1 = textView;
        this.f530eg = textView2;
        this.iPaid1 = button;
        this.mobileName = editText;
        this.mobileNumber = editText2;
        this.mobileSpinner = spinner;
        this.notice = textView3;
        this.step1 = textView4;
        this.step2 = textView5;
        this.step3 = textView6;
        this.topView = view;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityMobileBankingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMobileBankingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_mobile_banking, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMobileBankingBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.cardStep1;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep1);
        if (cardView != null) {
            i = C2719R.C2722id.cardStep2;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep2);
            if (cardView2 != null) {
                i = C2719R.C2722id.cardStep3;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep3);
                if (cardView3 != null) {
                    i = C2719R.C2722id.check1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.check1);
                    if (textView != null) {
                        i = C2719R.C2722id.f444eg;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f444eg);
                        if (textView2 != null) {
                            i = C2719R.C2722id.iPaid1;
                            Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.iPaid1);
                            if (button != null) {
                                i = C2719R.C2722id.mobileName;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.mobileName);
                                if (editText != null) {
                                    i = C2719R.C2722id.mobileNumber;
                                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.mobileNumber);
                                    if (editText2 != null) {
                                        i = C2719R.C2722id.mobileSpinner;
                                        Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.mobileSpinner);
                                        if (spinner != null) {
                                            i = C2719R.C2722id.notice;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.notice);
                                            if (textView3 != null) {
                                                i = C2719R.C2722id.step1;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step1);
                                                if (textView4 != null) {
                                                    i = C2719R.C2722id.step2;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step2);
                                                    if (textView5 != null) {
                                                        i = C2719R.C2722id.step3;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step3);
                                                        if (textView6 != null) {
                                                            i = C2719R.C2722id.topView;
                                                            View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                            if (findChildViewById != null) {
                                                                i = C2719R.C2722id.wave;
                                                                View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                                if (findChildViewById2 != null) {
                                                                    return new ActivityMobileBankingBinding((ScrollView) view2, cardView, cardView2, cardView3, textView, textView2, button, editText, editText2, spinner, textView3, textView4, textView5, textView6, findChildViewById, findChildViewById2);
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
