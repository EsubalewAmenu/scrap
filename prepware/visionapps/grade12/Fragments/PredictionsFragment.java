package com.visionapps.grade12.Fragments;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.visionapps.grade12.C2719R;
import java.util.ArrayList;

public class PredictionsFragment extends Fragment {
    private ArrayList<Float> fullList = new ArrayList<>();
    private TextView great3001;
    private TextView great4001;
    private TextView great5001;
    private TextView great6001;
    private TextView less3001;
    /* access modifiers changed from: private */
    public Button meaning;
    /* access modifiers changed from: private */
    public CardView meaningcard;

    public View onCreateView(LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_predictions, viewGroup, false);
        this.less3001 = (TextView) inflate.findViewById(C2719R.C2722id.less300);
        this.great3001 = (TextView) inflate.findViewById(C2719R.C2722id.great300);
        this.great4001 = (TextView) inflate.findViewById(C2719R.C2722id.great400);
        this.great5001 = (TextView) inflate.findViewById(C2719R.C2722id.great500);
        this.great6001 = (TextView) inflate.findViewById(C2719R.C2722id.great600);
        this.meaning = (Button) inflate.findViewById(C2719R.C2722id.pmeaning12);
        this.meaningcard = (CardView) inflate.findViewById(C2719R.C2722id.pmeaningcard);
        String string = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("field", "");
        this.meaning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PredictionsFragment.this.meaning.setVisibility(8);
                TransitionManager.beginDelayedTransition(viewGroup, new AutoTransition());
                PredictionsFragment.this.meaningcard.setVisibility(0);
            }
        });
        int i2 = 1;
        if (string.equals("Natural Science")) {
            ArrayList<Float> arrayList = getlistofscore("bio");
            ArrayList<Float> arrayList2 = getlistofscore("chem");
            ArrayList<Float> arrayList3 = getlistofscore("phy");
            ArrayList<Float> arrayList4 = getlistofscore("math");
            ArrayList<Float> arrayList5 = getlistofscore("eng");
            ArrayList<Float> arrayList6 = getlistofscore("sat");
            ArrayList<Float> arrayList7 = getlistofscore("civ");
            this.fullList.addAll(arrayList);
            this.fullList.addAll(arrayList2);
            this.fullList.addAll(arrayList3);
            this.fullList.addAll(arrayList4);
            this.fullList.addAll(arrayList6);
            this.fullList.addAll(arrayList5);
            this.fullList.addAll(arrayList7);
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i < this.fullList.size()) {
                if (!this.fullList.isEmpty()) {
                    int round = Math.round(this.fullList.get(i).floatValue());
                    if (round < 300) {
                        i3++;
                    }
                    if (round > 300) {
                        i4++;
                    }
                    if (round > 400) {
                        i5++;
                    }
                    if (round > 500) {
                        i6++;
                    }
                    if (round > 600) {
                        i7++;
                    }
                }
                i++;
            }
            int i8 = i3 + i4 + i5 + i6 + i7;
            if (i8 != 0) {
                i2 = i8;
            }
            startCountAnimation(this.less3001, (i3 * 100) / i2);
            startCountAnimation(this.great3001, (i4 * 100) / i2);
            startCountAnimation(this.great4001, (i5 * 100) / i2);
            startCountAnimation(this.great5001, (i6 * 100) / i2);
            startCountAnimation(this.great6001, (i7 * 100) / i2);
        } else {
            ArrayList<Float> arrayList8 = getlistofscore("econ");
            ArrayList<Float> arrayList9 = getlistofscore("geo");
            ArrayList<Float> arrayList10 = getlistofscore("hist");
            ArrayList<Float> arrayList11 = getlistofscore("math");
            ArrayList<Float> arrayList12 = getlistofscore("eng");
            ArrayList<Float> arrayList13 = getlistofscore("sat");
            ArrayList<Float> arrayList14 = getlistofscore("civ");
            this.fullList.addAll(arrayList8);
            this.fullList.addAll(arrayList9);
            this.fullList.addAll(arrayList10);
            this.fullList.addAll(arrayList11);
            this.fullList.addAll(arrayList13);
            this.fullList.addAll(arrayList12);
            this.fullList.addAll(arrayList14);
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i < this.fullList.size()) {
                if (!this.fullList.isEmpty()) {
                    int round2 = Math.round(this.fullList.get(i).floatValue());
                    if (round2 < 300) {
                        i9++;
                    }
                    if (round2 > 300) {
                        i10++;
                    }
                    if (round2 > 400) {
                        i11++;
                    }
                    if (round2 > 500) {
                        i12++;
                    }
                    if (round2 > 600) {
                        i13++;
                    }
                }
                i++;
            }
            int i14 = i9 + i10 + i11 + i12 + i13;
            if (i14 != 0) {
                i2 = i14;
            }
            startCountAnimation(this.less3001, (i9 * 100) / i2);
            startCountAnimation(this.great3001, (i10 * 100) / i2);
            startCountAnimation(this.great4001, (i11 * 100) / i2);
            startCountAnimation(this.great5001, (i12 * 100) / i2);
            startCountAnimation(this.great6001, (i13 * 100) / i2);
        }
        return inflate;
    }

    private ArrayList<Float> getlistofscore(String str) {
        ArrayList<Float> arrayList;
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Float> arrayList3 = new ArrayList<>();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Float valueOf = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "091", "0")));
        Float valueOf2 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "092", "0")));
        Float valueOf3 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "093", "0")));
        Float valueOf4 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "094", "0")));
        Float valueOf5 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "095", "0")));
        Float valueOf6 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "096", "0")));
        Float valueOf7 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "097", "0")));
        Float valueOf8 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "098", "0")));
        Float valueOf9 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "099", "0")));
        StringBuilder sb = new StringBuilder();
        sb.append(FirebaseAnalytics.Param.SCORE);
        sb.append(str2);
        ArrayList<Float> arrayList4 = arrayList3;
        sb.append("0910");
        Float valueOf10 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb.toString(), "0")));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FirebaseAnalytics.Param.SCORE);
        sb2.append(str2);
        Float f = valueOf10;
        sb2.append("101");
        Float valueOf11 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb2.toString(), "0")));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(FirebaseAnalytics.Param.SCORE);
        sb3.append(str2);
        Float f2 = valueOf11;
        sb3.append("102");
        Float valueOf12 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb3.toString(), "0")));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(FirebaseAnalytics.Param.SCORE);
        sb4.append(str2);
        Float f3 = valueOf12;
        sb4.append("103");
        Float valueOf13 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb4.toString(), "0")));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(FirebaseAnalytics.Param.SCORE);
        sb5.append(str2);
        Float f4 = valueOf13;
        sb5.append("104");
        Float valueOf14 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb5.toString(), "0")));
        StringBuilder sb6 = new StringBuilder();
        sb6.append(FirebaseAnalytics.Param.SCORE);
        sb6.append(str2);
        Float f5 = valueOf14;
        sb6.append("105");
        Float valueOf15 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb6.toString(), "0")));
        StringBuilder sb7 = new StringBuilder();
        sb7.append(FirebaseAnalytics.Param.SCORE);
        sb7.append(str2);
        Float f6 = valueOf15;
        sb7.append("106");
        Float valueOf16 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb7.toString(), "0")));
        StringBuilder sb8 = new StringBuilder();
        sb8.append(FirebaseAnalytics.Param.SCORE);
        sb8.append(str2);
        Float f7 = valueOf16;
        sb8.append("107");
        Float valueOf17 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb8.toString(), "0")));
        StringBuilder sb9 = new StringBuilder();
        sb9.append(FirebaseAnalytics.Param.SCORE);
        sb9.append(str2);
        Float f8 = valueOf17;
        sb9.append("108");
        Float valueOf18 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb9.toString(), "0")));
        StringBuilder sb10 = new StringBuilder();
        sb10.append(FirebaseAnalytics.Param.SCORE);
        sb10.append(str2);
        Float f9 = valueOf18;
        sb10.append("109");
        Float valueOf19 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb10.toString(), "0")));
        StringBuilder sb11 = new StringBuilder();
        sb11.append(FirebaseAnalytics.Param.SCORE);
        sb11.append(str2);
        Float f10 = valueOf19;
        sb11.append("1010");
        Float valueOf20 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb11.toString(), "0")));
        StringBuilder sb12 = new StringBuilder();
        sb12.append(FirebaseAnalytics.Param.SCORE);
        sb12.append(str2);
        Float f11 = valueOf20;
        sb12.append("111");
        Float valueOf21 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb12.toString(), "0")));
        StringBuilder sb13 = new StringBuilder();
        sb13.append(FirebaseAnalytics.Param.SCORE);
        sb13.append(str2);
        Float f12 = valueOf21;
        sb13.append("112");
        Float valueOf22 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb13.toString(), "0")));
        StringBuilder sb14 = new StringBuilder();
        sb14.append(FirebaseAnalytics.Param.SCORE);
        sb14.append(str2);
        Float f13 = valueOf22;
        sb14.append("113");
        Float valueOf23 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb14.toString(), "0")));
        StringBuilder sb15 = new StringBuilder();
        sb15.append(FirebaseAnalytics.Param.SCORE);
        sb15.append(str2);
        Float f14 = valueOf23;
        sb15.append("114");
        Float valueOf24 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb15.toString(), "0")));
        StringBuilder sb16 = new StringBuilder();
        sb16.append(FirebaseAnalytics.Param.SCORE);
        sb16.append(str2);
        Float f15 = valueOf24;
        sb16.append("115");
        Float valueOf25 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb16.toString(), "0")));
        StringBuilder sb17 = new StringBuilder();
        sb17.append(FirebaseAnalytics.Param.SCORE);
        sb17.append(str2);
        Float f16 = valueOf25;
        sb17.append("116");
        Float valueOf26 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb17.toString(), "0")));
        StringBuilder sb18 = new StringBuilder();
        sb18.append(FirebaseAnalytics.Param.SCORE);
        sb18.append(str2);
        Float f17 = valueOf26;
        sb18.append("117");
        Float valueOf27 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb18.toString(), "0")));
        StringBuilder sb19 = new StringBuilder();
        sb19.append(FirebaseAnalytics.Param.SCORE);
        sb19.append(str2);
        Float f18 = valueOf27;
        sb19.append("118");
        Float valueOf28 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb19.toString(), "0")));
        StringBuilder sb20 = new StringBuilder();
        sb20.append(FirebaseAnalytics.Param.SCORE);
        sb20.append(str2);
        Float f19 = valueOf28;
        sb20.append("119");
        Float valueOf29 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb20.toString(), "0")));
        StringBuilder sb21 = new StringBuilder();
        sb21.append(FirebaseAnalytics.Param.SCORE);
        sb21.append(str2);
        Float f20 = valueOf29;
        sb21.append("1110");
        Float valueOf30 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb21.toString(), "0")));
        StringBuilder sb22 = new StringBuilder();
        sb22.append(FirebaseAnalytics.Param.SCORE);
        sb22.append(str2);
        Float f21 = valueOf30;
        sb22.append("121");
        Float valueOf31 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb22.toString(), "0")));
        StringBuilder sb23 = new StringBuilder();
        sb23.append(FirebaseAnalytics.Param.SCORE);
        sb23.append(str2);
        Float f22 = valueOf31;
        sb23.append("122");
        Float valueOf32 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb23.toString(), "0")));
        StringBuilder sb24 = new StringBuilder();
        sb24.append(FirebaseAnalytics.Param.SCORE);
        sb24.append(str2);
        Float f23 = valueOf32;
        sb24.append("123");
        Float valueOf33 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb24.toString(), "0")));
        StringBuilder sb25 = new StringBuilder();
        sb25.append(FirebaseAnalytics.Param.SCORE);
        sb25.append(str2);
        Float f24 = valueOf33;
        sb25.append("124");
        Float valueOf34 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb25.toString(), "0")));
        StringBuilder sb26 = new StringBuilder();
        sb26.append(FirebaseAnalytics.Param.SCORE);
        sb26.append(str2);
        Float f25 = valueOf34;
        sb26.append("125");
        Float valueOf35 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb26.toString(), "0")));
        StringBuilder sb27 = new StringBuilder();
        sb27.append(FirebaseAnalytics.Param.SCORE);
        sb27.append(str2);
        Float f26 = valueOf35;
        sb27.append("126");
        Float valueOf36 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb27.toString(), "0")));
        StringBuilder sb28 = new StringBuilder();
        sb28.append(FirebaseAnalytics.Param.SCORE);
        sb28.append(str2);
        Float f27 = valueOf36;
        sb28.append("127");
        Float valueOf37 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb28.toString(), "0")));
        StringBuilder sb29 = new StringBuilder();
        sb29.append(FirebaseAnalytics.Param.SCORE);
        sb29.append(str2);
        Float f28 = valueOf37;
        sb29.append("128");
        Float valueOf38 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb29.toString(), "0")));
        StringBuilder sb30 = new StringBuilder();
        sb30.append(FirebaseAnalytics.Param.SCORE);
        sb30.append(str2);
        Float f29 = valueOf38;
        sb30.append("129");
        Float valueOf39 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb30.toString(), "0")));
        StringBuilder sb31 = new StringBuilder();
        sb31.append(FirebaseAnalytics.Param.SCORE);
        sb31.append(str2);
        Float f30 = valueOf39;
        sb31.append("1210");
        Float valueOf40 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb31.toString(), "0")));
        StringBuilder sb32 = new StringBuilder();
        sb32.append(FirebaseAnalytics.Param.SCORE);
        sb32.append(str2);
        Float f31 = valueOf40;
        sb32.append("131");
        Float valueOf41 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb32.toString(), "0")));
        StringBuilder sb33 = new StringBuilder();
        sb33.append(FirebaseAnalytics.Param.SCORE);
        sb33.append(str2);
        Float f32 = valueOf41;
        sb33.append("132");
        Float valueOf42 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb33.toString(), "0")));
        StringBuilder sb34 = new StringBuilder();
        sb34.append(FirebaseAnalytics.Param.SCORE);
        sb34.append(str2);
        Float f33 = valueOf42;
        sb34.append("133");
        Float valueOf43 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb34.toString(), "0")));
        StringBuilder sb35 = new StringBuilder();
        sb35.append(FirebaseAnalytics.Param.SCORE);
        sb35.append(str2);
        Float f34 = valueOf43;
        sb35.append("134");
        Float valueOf44 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb35.toString(), "0")));
        StringBuilder sb36 = new StringBuilder();
        sb36.append(FirebaseAnalytics.Param.SCORE);
        sb36.append(str2);
        Float f35 = valueOf44;
        sb36.append("135");
        Float valueOf45 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb36.toString(), "0")));
        StringBuilder sb37 = new StringBuilder();
        sb37.append(FirebaseAnalytics.Param.SCORE);
        sb37.append(str2);
        Float f36 = valueOf45;
        sb37.append("136");
        Float valueOf46 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb37.toString(), "0")));
        StringBuilder sb38 = new StringBuilder();
        sb38.append(FirebaseAnalytics.Param.SCORE);
        sb38.append(str2);
        Float f37 = valueOf46;
        sb38.append("137");
        Float valueOf47 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb38.toString(), "0")));
        StringBuilder sb39 = new StringBuilder();
        sb39.append(FirebaseAnalytics.Param.SCORE);
        sb39.append(str2);
        Float f38 = valueOf47;
        sb39.append("138");
        Float valueOf48 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb39.toString(), "0")));
        StringBuilder sb40 = new StringBuilder();
        sb40.append(FirebaseAnalytics.Param.SCORE);
        sb40.append(str2);
        Float f39 = valueOf48;
        sb40.append("139");
        Float valueOf49 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb40.toString(), "0")));
        Float valueOf50 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(FirebaseAnalytics.Param.SCORE + str2 + "1310", "0")));
        arrayList2.add(valueOf);
        arrayList2.add(valueOf2);
        arrayList2.add(valueOf3);
        arrayList2.add(valueOf4);
        arrayList2.add(valueOf5);
        arrayList2.add(valueOf6);
        arrayList2.add(valueOf7);
        arrayList2.add(valueOf8);
        arrayList2.add(valueOf9);
        arrayList2.add(f);
        arrayList2.add(f2);
        arrayList2.add(f3);
        arrayList2.add(f4);
        arrayList2.add(f5);
        arrayList2.add(f6);
        arrayList2.add(f7);
        arrayList2.add(f8);
        arrayList2.add(f9);
        arrayList2.add(f10);
        arrayList2.add(f11);
        arrayList2.add(f12);
        arrayList2.add(f13);
        arrayList2.add(f14);
        arrayList2.add(f15);
        arrayList2.add(f16);
        arrayList2.add(f17);
        arrayList2.add(f18);
        arrayList2.add(f19);
        arrayList2.add(f20);
        arrayList2.add(f21);
        arrayList2.add(f22);
        arrayList2.add(f23);
        arrayList2.add(f24);
        arrayList2.add(f25);
        arrayList2.add(f26);
        arrayList2.add(f27);
        arrayList2.add(f28);
        arrayList2.add(f29);
        arrayList2.add(f30);
        arrayList2.add(f31);
        arrayList2.add(f32);
        arrayList2.add(f33);
        arrayList2.add(f34);
        arrayList2.add(f35);
        arrayList2.add(f36);
        arrayList2.add(f37);
        arrayList2.add(f38);
        arrayList2.add(f39);
        arrayList2.add(valueOf49);
        arrayList2.add(valueOf50);
        int i = 0;
        while (i < arrayList2.size()) {
            if (((Float) arrayList2.get(i)).floatValue() > 0.0f) {
                arrayList = arrayList4;
                arrayList.add(Float.valueOf(((Float) arrayList2.get(i)).floatValue() * 7.0f));
            } else {
                arrayList = arrayList4;
            }
            i++;
            arrayList4 = arrayList;
        }
        return arrayList4;
    }

    private void startCountAnimation(final TextView textView, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
        ofInt.setDuration(2000);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView textView = textView;
                textView.setText(valueAnimator.getAnimatedValue().toString() + " %");
            }
        });
        ofInt.start();
    }
}
