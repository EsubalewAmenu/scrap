package com.visionapps.grade12;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;

public class ColorUtil {
    public static int changeColorAlphaTo20(int i) {
        return (i & 16777215) | 855638016;
    }

    public static int mixColors(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    public static int generatePrimaryTintedColorOverlay(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2719R.attr.primaryColor, typedValue, true);
        return (typedValue.data & 16777215) | 1073741824;
    }
}
