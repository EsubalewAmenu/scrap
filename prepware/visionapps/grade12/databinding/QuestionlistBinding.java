package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class QuestionlistBinding implements ViewBinding {
    public final RadioGroup choice;
    public final RadioButton choice1;
    public final RadioButton choice2;
    public final RadioButton choice3;
    public final RadioButton choice4;
    public final TextView exp;
    public final RelativeLayout expandable;
    public final TextView explain;
    public final RelativeLayout firstrel;
    public final ImageView imgexp;
    public final ImageView imgquestion;
    public final TextView number;
    public final CardView parentq;
    public final TextView question;
    private final CardView rootView;

    private QuestionlistBinding(CardView cardView, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, TextView textView, RelativeLayout relativeLayout, TextView textView2, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, TextView textView3, CardView cardView2, TextView textView4) {
        this.rootView = cardView;
        this.choice = radioGroup;
        this.choice1 = radioButton;
        this.choice2 = radioButton2;
        this.choice3 = radioButton3;
        this.choice4 = radioButton4;
        this.exp = textView;
        this.expandable = relativeLayout;
        this.explain = textView2;
        this.firstrel = relativeLayout2;
        this.imgexp = imageView;
        this.imgquestion = imageView2;
        this.number = textView3;
        this.parentq = cardView2;
        this.question = textView4;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static QuestionlistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static QuestionlistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.questionlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static QuestionlistBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.choice;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice);
        if (radioGroup != null) {
            i = C2719R.C2722id.choice1;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice1);
            if (radioButton != null) {
                i = C2719R.C2722id.choice2;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice2);
                if (radioButton2 != null) {
                    i = C2719R.C2722id.choice3;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice3);
                    if (radioButton3 != null) {
                        i = C2719R.C2722id.choice4;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice4);
                        if (radioButton4 != null) {
                            i = C2719R.C2722id.exp;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.exp);
                            if (textView != null) {
                                i = C2719R.C2722id.expandable;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.expandable);
                                if (relativeLayout != null) {
                                    i = C2719R.C2722id.explain;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.explain);
                                    if (textView2 != null) {
                                        i = C2719R.C2722id.firstrel;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.firstrel);
                                        if (relativeLayout2 != null) {
                                            i = C2719R.C2722id.imgexp;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.imgexp);
                                            if (imageView != null) {
                                                i = C2719R.C2722id.imgquestion;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.imgquestion);
                                                if (imageView2 != null) {
                                                    i = C2719R.C2722id.number;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.number);
                                                    if (textView3 != null) {
                                                        CardView cardView = (CardView) view2;
                                                        i = C2719R.C2722id.question;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.question);
                                                        if (textView4 != null) {
                                                            return new QuestionlistBinding(cardView, radioGroup, radioButton, radioButton2, radioButton3, radioButton4, textView, relativeLayout, textView2, relativeLayout2, imageView, imageView2, textView3, cardView, textView4);
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
