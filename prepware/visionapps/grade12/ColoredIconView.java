package com.visionapps.grade12;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class ColoredIconView extends AppCompatImageView {
    public ColoredIconView(Context context) {
        super(context);
        initialize(context, (AttributeSet) null);
    }

    public ColoredIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    public ColoredIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2719R.styleable.ColoredIconView);
        setBackground(context.getDrawable(C2719R.C2721drawable.plain_circle));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C2719R.dimen.icon_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setImageResource(obtainStyledAttributes.getResourceId(1, C2719R.C2721drawable.rect_cut_card));
        int color = obtainStyledAttributes.getColor(3, -16776961);
        int changeColorAlphaTo20 = ColorUtil.changeColorAlphaTo20(obtainStyledAttributes.getColor(2, color));
        setImageTintList(ColorStateList.valueOf(color));
        setBackgroundTintList(ColorStateList.valueOf(changeColorAlphaTo20));
        obtainStyledAttributes.recycle();
    }
}
