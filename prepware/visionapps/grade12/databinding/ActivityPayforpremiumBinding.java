package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityPayforpremiumBinding implements ViewBinding {
    public final ImageView cancel;
    public final CardView gopremium;
    public final TextView pay;
    private final RelativeLayout rootView;

    private ActivityPayforpremiumBinding(RelativeLayout relativeLayout, ImageView imageView, CardView cardView, TextView textView) {
        this.rootView = relativeLayout;
        this.cancel = imageView;
        this.gopremium = cardView;
        this.pay = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPayforpremiumBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityPayforpremiumBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_payforpremium, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPayforpremiumBinding bind(View view) {
        int i = C2719R.C2722id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.cancel);
        if (imageView != null) {
            i = C2719R.C2722id.gopremium;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, C2719R.C2722id.gopremium);
            if (cardView != null) {
                i = C2719R.C2722id.pay;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.pay);
                if (textView != null) {
                    return new ActivityPayforpremiumBinding((RelativeLayout) view, imageView, cardView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
