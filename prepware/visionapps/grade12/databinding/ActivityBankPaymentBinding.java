package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityBankPaymentBinding implements ViewBinding {
    public final Spinner bankSpinner;
    public final CardView cardStep1;
    public final CardView cardStep2;
    public final CardView cardStep3;
    public final CardView cardStep4;
    public final TextView check;
    public final Button chooseFile;

    /* renamed from: eg */
    public final TextView f517eg;
    public final Button iPaid;
    public final TextView notice;
    public final EditText payersName;
    public final EditText payersNumber;
    public final ProgressBar progressBarPay;
    private final ScrollView rootView;
    public final TextView step1;
    public final TextView step2;
    public final TextView step3;
    public final TextView step4;
    public final View topView;
    public final ImageView uploadPhoto;
    public final View wave;

    private ActivityBankPaymentBinding(ScrollView scrollView, Spinner spinner, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, TextView textView, Button button, TextView textView2, Button button2, TextView textView3, EditText editText, EditText editText2, ProgressBar progressBar, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, ImageView imageView, View view2) {
        this.rootView = scrollView;
        this.bankSpinner = spinner;
        this.cardStep1 = cardView;
        this.cardStep2 = cardView2;
        this.cardStep3 = cardView3;
        this.cardStep4 = cardView4;
        this.check = textView;
        this.chooseFile = button;
        this.f517eg = textView2;
        this.iPaid = button2;
        this.notice = textView3;
        this.payersName = editText;
        this.payersNumber = editText2;
        this.progressBarPay = progressBar;
        this.step1 = textView4;
        this.step2 = textView5;
        this.step3 = textView6;
        this.step4 = textView7;
        this.topView = view;
        this.uploadPhoto = imageView;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityBankPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityBankPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_bank_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBankPaymentBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.bankSpinner;
        Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C2719R.C2722id.bankSpinner);
        if (spinner != null) {
            i = C2719R.C2722id.cardStep1;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep1);
            if (cardView != null) {
                i = C2719R.C2722id.cardStep2;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep2);
                if (cardView2 != null) {
                    i = C2719R.C2722id.cardStep3;
                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep3);
                    if (cardView3 != null) {
                        i = C2719R.C2722id.cardStep4;
                        CardView cardView4 = (CardView) ViewBindings.findChildViewById(view2, C2719R.C2722id.cardStep4);
                        if (cardView4 != null) {
                            i = C2719R.C2722id.check;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.check);
                            if (textView != null) {
                                i = C2719R.C2722id.chooseFile;
                                Button button = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.chooseFile);
                                if (button != null) {
                                    i = C2719R.C2722id.f444eg;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.f444eg);
                                    if (textView2 != null) {
                                        i = C2719R.C2722id.iPaid;
                                        Button button2 = (Button) ViewBindings.findChildViewById(view2, C2719R.C2722id.iPaid);
                                        if (button2 != null) {
                                            i = C2719R.C2722id.notice;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.notice);
                                            if (textView3 != null) {
                                                i = C2719R.C2722id.payersName;
                                                EditText editText = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.payersName);
                                                if (editText != null) {
                                                    i = C2719R.C2722id.payersNumber;
                                                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C2719R.C2722id.payersNumber);
                                                    if (editText2 != null) {
                                                        i = C2719R.C2722id.progressBarPay;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C2719R.C2722id.progressBarPay);
                                                        if (progressBar != null) {
                                                            i = C2719R.C2722id.step1;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step1);
                                                            if (textView4 != null) {
                                                                i = C2719R.C2722id.step2;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step2);
                                                                if (textView5 != null) {
                                                                    i = C2719R.C2722id.step3;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step3);
                                                                    if (textView6 != null) {
                                                                        i = C2719R.C2722id.step4;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.step4);
                                                                        if (textView7 != null) {
                                                                            i = C2719R.C2722id.topView;
                                                                            View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                            if (findChildViewById != null) {
                                                                                i = C2719R.C2722id.uploadPhoto;
                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.uploadPhoto);
                                                                                if (imageView != null) {
                                                                                    i = C2719R.C2722id.wave;
                                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                                                    if (findChildViewById2 != null) {
                                                                                        return new ActivityBankPaymentBinding((ScrollView) view2, spinner, cardView, cardView2, cardView3, cardView4, textView, button, textView2, button2, textView3, editText, editText2, progressBar, textView4, textView5, textView6, textView7, findChildViewById, imageView, findChildViewById2);
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
