package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import com.visionapps.grade12.C2719R;

public final class QuestionlistmathsBinding implements ViewBinding {
    public final RadioButton choice1maths;
    public final PhotoView choice1mathstext;
    public final RadioButton choice2maths;
    public final PhotoView choice2mathstext;
    public final RadioButton choice3maths;
    public final PhotoView choice3mathstext;
    public final RadioButton choice4maths;
    public final PhotoView choice4mathstext;
    public final RadioGroup choicemaths;
    public final RelativeLayout expandablemaths;
    public final TextView explainmaths;
    public final TextView expmaths;
    public final RelativeLayout firstrelmaths;
    public final PhotoView imgexpmaths;
    public final TextView numbermaths;
    public final CardView parentqmaths;
    public final TextView question1;
    public final PhotoView questionmaths;
    private final CardView rootView;

    private QuestionlistmathsBinding(CardView cardView, RadioButton radioButton, PhotoView photoView, RadioButton radioButton2, PhotoView photoView2, RadioButton radioButton3, PhotoView photoView3, RadioButton radioButton4, PhotoView photoView4, RadioGroup radioGroup, RelativeLayout relativeLayout, TextView textView, TextView textView2, RelativeLayout relativeLayout2, PhotoView photoView5, TextView textView3, CardView cardView2, TextView textView4, PhotoView photoView6) {
        this.rootView = cardView;
        this.choice1maths = radioButton;
        this.choice1mathstext = photoView;
        this.choice2maths = radioButton2;
        this.choice2mathstext = photoView2;
        this.choice3maths = radioButton3;
        this.choice3mathstext = photoView3;
        this.choice4maths = radioButton4;
        this.choice4mathstext = photoView4;
        this.choicemaths = radioGroup;
        this.expandablemaths = relativeLayout;
        this.explainmaths = textView;
        this.expmaths = textView2;
        this.firstrelmaths = relativeLayout2;
        this.imgexpmaths = photoView5;
        this.numbermaths = textView3;
        this.parentqmaths = cardView2;
        this.question1 = textView4;
        this.questionmaths = photoView6;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static QuestionlistmathsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static QuestionlistmathsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.questionlistmaths, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static QuestionlistmathsBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.choice1maths;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice1maths);
        if (radioButton != null) {
            i = C2719R.C2722id.choice1mathstext;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice1mathstext);
            if (photoView != null) {
                i = C2719R.C2722id.choice2maths;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice2maths);
                if (radioButton2 != null) {
                    i = C2719R.C2722id.choice2mathstext;
                    PhotoView photoView2 = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice2mathstext);
                    if (photoView2 != null) {
                        i = C2719R.C2722id.choice3maths;
                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice3maths);
                        if (radioButton3 != null) {
                            i = C2719R.C2722id.choice3mathstext;
                            PhotoView photoView3 = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice3mathstext);
                            if (photoView3 != null) {
                                i = C2719R.C2722id.choice4maths;
                                RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice4maths);
                                if (radioButton4 != null) {
                                    i = C2719R.C2722id.choice4mathstext;
                                    PhotoView photoView4 = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.choice4mathstext);
                                    if (photoView4 != null) {
                                        i = C2719R.C2722id.choicemaths;
                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view2, C2719R.C2722id.choicemaths);
                                        if (radioGroup != null) {
                                            i = C2719R.C2722id.expandablemaths;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.expandablemaths);
                                            if (relativeLayout != null) {
                                                i = C2719R.C2722id.explainmaths;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.explainmaths);
                                                if (textView != null) {
                                                    i = C2719R.C2722id.expmaths;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.expmaths);
                                                    if (textView2 != null) {
                                                        i = C2719R.C2722id.firstrelmaths;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.firstrelmaths);
                                                        if (relativeLayout2 != null) {
                                                            i = C2719R.C2722id.imgexpmaths;
                                                            PhotoView photoView5 = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.imgexpmaths);
                                                            if (photoView5 != null) {
                                                                i = C2719R.C2722id.numbermaths;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.numbermaths);
                                                                if (textView3 != null) {
                                                                    CardView cardView = (CardView) view2;
                                                                    i = C2719R.C2722id.question1;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.question1);
                                                                    if (textView4 != null) {
                                                                        i = C2719R.C2722id.questionmaths;
                                                                        PhotoView photoView6 = (PhotoView) ViewBindings.findChildViewById(view2, C2719R.C2722id.questionmaths);
                                                                        if (photoView6 != null) {
                                                                            return new QuestionlistmathsBinding(cardView, radioButton, photoView, radioButton2, photoView2, radioButton3, photoView3, radioButton4, photoView4, radioGroup, relativeLayout, textView, textView2, relativeLayout2, photoView5, textView3, cardView, textView4, photoView6);
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
