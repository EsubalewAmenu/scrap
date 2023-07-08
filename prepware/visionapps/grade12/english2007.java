package com.visionapps.grade12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.internal.view.SupportMenu;

public class english2007 extends AppCompatActivity {
    RadioGroup questionE2004;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2007);
    }

    public void check(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(((RadioGroup) view.getParent()).getId());
        this.questionE2004 = radioGroup;
        Button button = (Button) findViewById(radioGroup.getCheckedRadioButtonId());
        if (button.getTag().toString().equals("correct")) {
            button.setBackgroundColor(-16711936);
            return;
        }
        int i = 0;
        while (true) {
            if (i > 4) {
                break;
            }
            RadioButton radioButton = (RadioButton) this.questionE2004.getChildAt(i);
            if (radioButton.getTag().toString().equals("correct")) {
                radioButton.setBackgroundColor(-16711936);
                break;
            }
            i++;
        }
        button.setBackgroundColor(SupportMenu.CATEGORY_MASK);
    }
}
