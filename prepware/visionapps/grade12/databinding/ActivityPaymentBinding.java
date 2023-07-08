package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityPaymentBinding implements ViewBinding {
    public final Button CBE;
    public final Button awashBank;
    public final CardView cardView2003;
    public final Button cbeBirr;
    public final TextView payTxt;
    private final ScrollView rootView;
    public final Button teleBirr;

    /* renamed from: tt */
    public final TextView f531tt;
    public final ImageView youtube;

    private ActivityPaymentBinding(ScrollView scrollView, Button button, Button button2, CardView cardView, Button button3, TextView textView, Button button4, TextView textView2, ImageView imageView) {
        this.rootView = scrollView;
        this.CBE = button;
        this.awashBank = button2;
        this.cardView2003 = cardView;
        this.cbeBirr = button3;
        this.payTxt = textView;
        this.teleBirr = button4;
        this.f531tt = textView2;
        this.youtube = imageView;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPaymentBinding bind(View view) {
        int i = C2719R.C2722id.CBE;
        Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.CBE);
        if (button != null) {
            i = C2719R.C2722id.awashBank;
            Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.awashBank);
            if (button2 != null) {
                i = C2719R.C2722id.cardView2003;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, C2719R.C2722id.cardView2003);
                if (cardView != null) {
                    i = C2719R.C2722id.cbeBirr;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.cbeBirr);
                    if (button3 != null) {
                        i = C2719R.C2722id.payTxt;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.payTxt);
                        if (textView != null) {
                            i = C2719R.C2722id.teleBirr;
                            Button button4 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.teleBirr);
                            if (button4 != null) {
                                i = C2719R.C2722id.f448tt;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.f448tt);
                                if (textView2 != null) {
                                    i = C2719R.C2722id.youtube;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.youtube);
                                    if (imageView != null) {
                                        return new ActivityPaymentBinding((ScrollView) view, button, button2, cardView, button3, textView, button4, textView2, imageView);
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
