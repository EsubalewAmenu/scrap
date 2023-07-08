package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ReclistBinding implements ViewBinding {
    public final ImageView img;
    public final CardView parent;
    private final CardView rootView;
    public final TextView subs;

    private ReclistBinding(CardView cardView, ImageView imageView, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.img = imageView;
        this.parent = cardView2;
        this.subs = textView;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static ReclistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ReclistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.reclist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReclistBinding bind(View view) {
        int i = C2719R.C2722id.img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C2719R.C2722id.img);
        if (imageView != null) {
            CardView cardView = (CardView) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.subs);
            if (textView != null) {
                return new ReclistBinding(cardView, imageView, cardView, textView);
            }
            i = C2719R.C2722id.subs;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
