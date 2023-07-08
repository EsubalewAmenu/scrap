package com.visionapps.grade12;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ColorView extends View {
    private int mColor;
    private final Paint mPaint = new Paint();

    public ColorView(Context context) {
        super(context);
    }

    public ColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setBackgroundColor(int i) {
        this.mColor = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i = width - (paddingRight + paddingLeft);
        int paddingBottom = height - (getPaddingBottom() + paddingTop);
        this.mPaint.setColor(this.mColor);
        canvas.drawCircle((float) (paddingLeft + (i / 2)), (float) (paddingTop + (paddingBottom / 2)), (float) (Math.min(i, paddingBottom) / 2), this.mPaint);
    }
}
