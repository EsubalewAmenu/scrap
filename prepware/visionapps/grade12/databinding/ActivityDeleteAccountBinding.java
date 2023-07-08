package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;

public final class ActivityDeleteAccountBinding implements ViewBinding {
    public final RelativeLayout areYouSureDelete;
    public final CardView cardDelete;
    public final Button deleteNo;
    public final Button deleteYes;
    public final EditText emailAuth;
    public final EditText logpass;
    private final RelativeLayout rootView;
    public final TextView sorry;
    public final Button submit;
    public final View topView;
    public final TextView warning;
    public final View wave;

    private ActivityDeleteAccountBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, CardView cardView, Button button, Button button2, EditText editText, EditText editText2, TextView textView, Button button3, View view, TextView textView2, View view2) {
        this.rootView = relativeLayout;
        this.areYouSureDelete = relativeLayout2;
        this.cardDelete = cardView;
        this.deleteNo = button;
        this.deleteYes = button2;
        this.emailAuth = editText;
        this.logpass = editText2;
        this.sorry = textView;
        this.submit = button3;
        this.topView = view;
        this.warning = textView2;
        this.wave = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDeleteAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityDeleteAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_delete_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDeleteAccountBinding bind(View view) {
        int i = C2719R.C2722id.areYouSureDelete;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C2719R.C2722id.areYouSureDelete);
        if (relativeLayout != null) {
            i = C2719R.C2722id.cardDelete;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, C2719R.C2722id.cardDelete);
            if (cardView != null) {
                i = C2719R.C2722id.deleteNo;
                Button button = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.deleteNo);
                if (button != null) {
                    i = C2719R.C2722id.deleteYes;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.deleteYes);
                    if (button2 != null) {
                        i = C2719R.C2722id.emailAuth;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, C2719R.C2722id.emailAuth);
                        if (editText != null) {
                            i = C2719R.C2722id.logpass;
                            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, C2719R.C2722id.logpass);
                            if (editText2 != null) {
                                i = C2719R.C2722id.sorry;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.sorry);
                                if (textView != null) {
                                    i = C2719R.C2722id.submit;
                                    Button button3 = (Button) ViewBindings.findChildViewById(view, C2719R.C2722id.submit);
                                    if (button3 != null) {
                                        i = C2719R.C2722id.topView;
                                        View findChildViewById = ViewBindings.findChildViewById(view, C2719R.C2722id.topView);
                                        if (findChildViewById != null) {
                                            i = C2719R.C2722id.warning;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C2719R.C2722id.warning);
                                            if (textView2 != null) {
                                                i = C2719R.C2722id.wave;
                                                View findChildViewById2 = ViewBindings.findChildViewById(view, C2719R.C2722id.wave);
                                                if (findChildViewById2 != null) {
                                                    return new ActivityDeleteAccountBinding((RelativeLayout) view, relativeLayout, cardView, button, button2, editText, editText2, textView, button3, findChildViewById, textView2, findChildViewById2);
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
