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
import com.visionapps.grade12.C2719R;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class OverviewFragment extends Fragment {
    private double averages;
    private double averagesi;
    private TextView bioaverage;
    private CardView biocard;
    private TextView biohighscore;
    private TextView bioiscore;
    private TextView biopercent;
    private TextView chemaverage;
    private CardView chemcard;
    private TextView chemhighscore;
    private TextView chemiscore;
    private TextView chempercent;
    private TextView civaverage;
    private CardView civcard;
    private TextView civhighscore;
    private TextView civiscore;
    private TextView civpercent;
    private TextView econaverage;
    private CardView econcard;
    private TextView econhighscore;
    private TextView econiscore;
    private TextView econpercent;
    private TextView engaverage;
    private CardView engcard;
    private TextView enghighscore;
    private TextView engiscore;
    private TextView engpercent;
    private TextView geoaverage;
    private CardView geocard;
    private TextView geohighscore;
    private TextView geoiscore;
    private TextView geopercent;
    private TextView histaverage;
    private CardView histcard;
    private TextView histhighscore;
    private TextView histiscore;
    private TextView histpercent;
    private TextView mathaverage;
    private CardView mathcard;
    private TextView mathhighscore;
    private TextView mathiscore;
    private TextView mathpercent;
    /* access modifiers changed from: private */
    public Button meaning;
    /* access modifiers changed from: private */
    public CardView meaningcard;
    private TextView phyaverage;
    private CardView phycard;
    private TextView phyhighscore;
    private TextView phyiscore;
    private TextView phypercent;
    private TextView sataverage;
    private CardView satcard;
    private TextView sathighscore;
    private TextView satiscore;
    private TextView satpercent;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final ViewGroup viewGroup2 = viewGroup;
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_overview, viewGroup2, false);
        this.meaning = (Button) inflate.findViewById(C2719R.C2722id.meaning12);
        this.meaningcard = (CardView) inflate.findViewById(C2719R.C2722id.meaningcard);
        this.biocard = (CardView) inflate.findViewById(C2719R.C2722id.Biocard);
        this.chemcard = (CardView) inflate.findViewById(C2719R.C2722id.Chemcard);
        this.civcard = (CardView) inflate.findViewById(C2719R.C2722id.Civcard);
        this.econcard = (CardView) inflate.findViewById(C2719R.C2722id.Econcard);
        this.engcard = (CardView) inflate.findViewById(C2719R.C2722id.Engcard);
        this.geocard = (CardView) inflate.findViewById(C2719R.C2722id.Geocard);
        this.histcard = (CardView) inflate.findViewById(C2719R.C2722id.Histcard);
        this.mathcard = (CardView) inflate.findViewById(C2719R.C2722id.Mathcard);
        this.phycard = (CardView) inflate.findViewById(C2719R.C2722id.Phycard);
        this.satcard = (CardView) inflate.findViewById(C2719R.C2722id.Satcard);
        this.bioiscore = (TextView) inflate.findViewById(C2719R.C2722id.bioiScore);
        this.chemiscore = (TextView) inflate.findViewById(C2719R.C2722id.chemiScore);
        this.civiscore = (TextView) inflate.findViewById(C2719R.C2722id.civiScore);
        this.econiscore = (TextView) inflate.findViewById(C2719R.C2722id.econiScore);
        this.engiscore = (TextView) inflate.findViewById(C2719R.C2722id.engiScore);
        this.geoiscore = (TextView) inflate.findViewById(C2719R.C2722id.geoiScore);
        this.histiscore = (TextView) inflate.findViewById(C2719R.C2722id.histiScore);
        this.mathiscore = (TextView) inflate.findViewById(C2719R.C2722id.mathiScore);
        this.phyiscore = (TextView) inflate.findViewById(C2719R.C2722id.phyiScore);
        this.satiscore = (TextView) inflate.findViewById(C2719R.C2722id.satiScore);
        this.biopercent = (TextView) inflate.findViewById(C2719R.C2722id.biopercent);
        this.chempercent = (TextView) inflate.findViewById(C2719R.C2722id.chempercent);
        this.civpercent = (TextView) inflate.findViewById(C2719R.C2722id.civpercent);
        this.econpercent = (TextView) inflate.findViewById(C2719R.C2722id.econpercent);
        this.engpercent = (TextView) inflate.findViewById(C2719R.C2722id.engpercent);
        this.geopercent = (TextView) inflate.findViewById(C2719R.C2722id.geopercent);
        this.histpercent = (TextView) inflate.findViewById(C2719R.C2722id.histpercent);
        this.mathpercent = (TextView) inflate.findViewById(C2719R.C2722id.mathpercent);
        this.phypercent = (TextView) inflate.findViewById(C2719R.C2722id.phypercent);
        this.satpercent = (TextView) inflate.findViewById(C2719R.C2722id.satpercent);
        this.bioaverage = (TextView) inflate.findViewById(C2719R.C2722id.bioaverage);
        this.chemaverage = (TextView) inflate.findViewById(C2719R.C2722id.chemaverage);
        this.civaverage = (TextView) inflate.findViewById(C2719R.C2722id.civaverage);
        this.econaverage = (TextView) inflate.findViewById(C2719R.C2722id.econaverage);
        this.engaverage = (TextView) inflate.findViewById(C2719R.C2722id.engaverage);
        this.geoaverage = (TextView) inflate.findViewById(C2719R.C2722id.geoaverage);
        this.histaverage = (TextView) inflate.findViewById(C2719R.C2722id.histaverage);
        this.mathaverage = (TextView) inflate.findViewById(C2719R.C2722id.mathaverage);
        this.phyaverage = (TextView) inflate.findViewById(C2719R.C2722id.phyaverage);
        this.sataverage = (TextView) inflate.findViewById(C2719R.C2722id.sataverage);
        this.biohighscore = (TextView) inflate.findViewById(C2719R.C2722id.biohighscore);
        this.chemhighscore = (TextView) inflate.findViewById(C2719R.C2722id.chemhighscore);
        this.civhighscore = (TextView) inflate.findViewById(C2719R.C2722id.civhighscore);
        this.econhighscore = (TextView) inflate.findViewById(C2719R.C2722id.econhighscore);
        this.enghighscore = (TextView) inflate.findViewById(C2719R.C2722id.enghighscore);
        this.geohighscore = (TextView) inflate.findViewById(C2719R.C2722id.geohighscore);
        this.histhighscore = (TextView) inflate.findViewById(C2719R.C2722id.histhighscore);
        this.mathhighscore = (TextView) inflate.findViewById(C2719R.C2722id.mathhighscore);
        this.phyhighscore = (TextView) inflate.findViewById(C2719R.C2722id.phyhighscore);
        this.sathighscore = (TextView) inflate.findViewById(C2719R.C2722id.sathighscore);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (defaultSharedPreferences.getString("field", "").equals("Natural Science")) {
            this.biocard.setVisibility(0);
            this.chemcard.setVisibility(0);
            this.civcard.setVisibility(0);
            this.engcard.setVisibility(0);
            this.mathcard.setVisibility(0);
            this.phycard.setVisibility(0);
            this.satcard.setVisibility(0);
            this.econcard.setVisibility(8);
            this.geocard.setVisibility(8);
            this.histcard.setVisibility(8);
        } else {
            this.biocard.setVisibility(8);
            this.chemcard.setVisibility(8);
            this.civcard.setVisibility(0);
            this.engcard.setVisibility(0);
            this.mathcard.setVisibility(0);
            this.phycard.setVisibility(8);
            this.satcard.setVisibility(0);
            this.econcard.setVisibility(0);
            this.geocard.setVisibility(0);
            this.histcard.setVisibility(0);
        }
        this.meaning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OverviewFragment.this.meaning.setVisibility(8);
                TransitionManager.beginDelayedTransition(viewGroup2, new AutoTransition());
                OverviewFragment.this.meaningcard.setVisibility(0);
            }
        });
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        float f = defaultSharedPreferences.getFloat("averagebioiScore", 1.0f);
        float floatValue = Float.valueOf(decimalFormat.format(getaveragescore("bio"))).floatValue();
        double iscore = getIscore("bio");
        float floatValue2 = Float.valueOf(decimalFormat.format(iscore)).floatValue();
        float f2 = getpercent("bio", f, floatValue2);
        edit.putFloat("averagebioiScore", floatValue2);
        int i = (floatValue2 > f ? 1 : (floatValue2 == f ? 0 : -1));
        if (i > 0) {
            TextView textView = this.biopercent;
            textView.setText("+" + String.valueOf(f2) + " %");
            this.biopercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue2 < f || i == 0) {
            TextView textView2 = this.biopercent;
            textView2.setText(String.valueOf(f2) + " %");
            this.biopercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.biohighscore.setText(String.valueOf(gethighscore("bio")));
        startCountAnimation(this.bioiscore, Float.valueOf((float) iscore));
        this.bioaverage.setText(String.valueOf(floatValue));
        float f3 = defaultSharedPreferences.getFloat("averagechemiScore", 1.0f);
        float floatValue3 = Float.valueOf(decimalFormat.format(getaveragescore("chem"))).floatValue();
        double iscore2 = getIscore("chem");
        float floatValue4 = Float.valueOf(decimalFormat.format(iscore2)).floatValue();
        float f4 = getpercent("chem", f3, floatValue4);
        edit.putFloat("averagechemiScore", floatValue4);
        int i2 = (floatValue4 > f3 ? 1 : (floatValue4 == f3 ? 0 : -1));
        if (i2 > 0) {
            TextView textView3 = this.chempercent;
            textView3.setText("+" + String.valueOf(f4) + " %");
            this.chempercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue4 < f3 || i2 == 0) {
            TextView textView4 = this.chempercent;
            textView4.setText(String.valueOf(f4) + " %");
            this.chempercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.chemhighscore.setText(String.valueOf(gethighscore("chem")));
        startCountAnimation(this.chemiscore, Float.valueOf((float) iscore2));
        this.chemaverage.setText(String.valueOf(floatValue3));
        float f5 = defaultSharedPreferences.getFloat("averageciviScore", 1.0f);
        float floatValue5 = Float.valueOf(decimalFormat.format(getaveragescore("civ"))).floatValue();
        double iscore3 = getIscore("civ");
        float floatValue6 = Float.valueOf(decimalFormat.format(iscore3)).floatValue();
        float f6 = getpercent("civ", f5, floatValue6);
        edit.putFloat("averageciviScore", floatValue6);
        int i3 = (floatValue6 > f5 ? 1 : (floatValue6 == f5 ? 0 : -1));
        if (i3 > 0) {
            TextView textView5 = this.civpercent;
            textView5.setText("+" + String.valueOf(f6) + " %");
            this.civpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue6 < f5 || i3 == 0) {
            TextView textView6 = this.civpercent;
            textView6.setText(String.valueOf(f6) + " %");
            this.civpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.civhighscore.setText(String.valueOf(gethighscore("civ")));
        startCountAnimation(this.civiscore, Float.valueOf((float) iscore3));
        this.civaverage.setText(String.valueOf(floatValue5));
        float f7 = defaultSharedPreferences.getFloat("averageeconiScore", 1.0f);
        float floatValue7 = Float.valueOf(decimalFormat.format(getaveragescore("econ"))).floatValue();
        double iscore4 = getIscore("econ");
        float floatValue8 = Float.valueOf(decimalFormat.format(iscore4)).floatValue();
        float f8 = getpercent("econ", f7, floatValue8);
        edit.putFloat("averageeconiScore", floatValue8);
        int i4 = (floatValue8 > f7 ? 1 : (floatValue8 == f7 ? 0 : -1));
        if (i4 > 0) {
            TextView textView7 = this.econpercent;
            textView7.setText("+" + String.valueOf(f8) + " %");
            this.econpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue8 < f7 || i4 == 0) {
            TextView textView8 = this.econpercent;
            textView8.setText(String.valueOf(f8) + " %");
            this.econpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.econhighscore.setText(String.valueOf(gethighscore("econ")));
        startCountAnimation(this.econiscore, Float.valueOf((float) iscore4));
        this.econaverage.setText(String.valueOf(floatValue7));
        float f9 = defaultSharedPreferences.getFloat("averageengiScore", 1.0f);
        float floatValue9 = Float.valueOf(decimalFormat.format(getaveragescore("eng"))).floatValue();
        double iscore5 = getIscore("eng");
        float floatValue10 = Float.valueOf(decimalFormat.format(iscore5)).floatValue();
        float f10 = getpercent("eng", f9, floatValue10);
        edit.putFloat("averageengiScore", floatValue10);
        int i5 = (floatValue10 > f9 ? 1 : (floatValue10 == f9 ? 0 : -1));
        if (i5 > 0) {
            TextView textView9 = this.engpercent;
            textView9.setText("+" + String.valueOf(f10) + " %");
            this.engpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue10 < f9 || i5 == 0) {
            TextView textView10 = this.engpercent;
            textView10.setText(String.valueOf(f10) + " %");
            this.engpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.enghighscore.setText(String.valueOf(gethighscore("eng")));
        startCountAnimation(this.engiscore, Float.valueOf((float) iscore5));
        this.engaverage.setText(String.valueOf(floatValue9));
        float f11 = defaultSharedPreferences.getFloat("averagegeoiScore", 1.0f);
        float floatValue11 = Float.valueOf(decimalFormat.format(getaveragescore("geo"))).floatValue();
        double iscore6 = getIscore("geo");
        float floatValue12 = Float.valueOf(decimalFormat.format(iscore6)).floatValue();
        float f12 = getpercent("geo", f11, floatValue12);
        edit.putFloat("averagegeoiScore", floatValue12);
        int i6 = (floatValue12 > f11 ? 1 : (floatValue12 == f11 ? 0 : -1));
        if (i6 > 0) {
            TextView textView11 = this.geopercent;
            textView11.setText("+" + String.valueOf(f12) + " %");
            this.geopercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue12 < f11 || i6 == 0) {
            TextView textView12 = this.geopercent;
            textView12.setText(String.valueOf(f12) + " %");
            this.geopercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.geohighscore.setText(String.valueOf(gethighscore("geo")));
        startCountAnimation(this.geoiscore, Float.valueOf((float) iscore6));
        this.geoaverage.setText(String.valueOf(floatValue11));
        float f13 = defaultSharedPreferences.getFloat("averagehistiScore", 1.0f);
        float floatValue13 = Float.valueOf(decimalFormat.format(getaveragescore("hist"))).floatValue();
        double iscore7 = getIscore("hist");
        float floatValue14 = Float.valueOf(decimalFormat.format(iscore7)).floatValue();
        float f14 = getpercent("hist", f13, floatValue14);
        edit.putFloat("averagehistiScore", floatValue14);
        int i7 = (floatValue14 > f13 ? 1 : (floatValue14 == f13 ? 0 : -1));
        if (i7 > 0) {
            TextView textView13 = this.histpercent;
            textView13.setText("+" + String.valueOf(f14) + " %");
            this.histpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue14 < f13 || i7 == 0) {
            TextView textView14 = this.histpercent;
            textView14.setText(String.valueOf(f14) + " %");
            this.histpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.histhighscore.setText(String.valueOf(gethighscore("hist")));
        startCountAnimation(this.histiscore, Float.valueOf((float) iscore7));
        this.histaverage.setText(String.valueOf(floatValue13));
        float f15 = defaultSharedPreferences.getFloat("averagemathiScore", 1.0f);
        float floatValue15 = Float.valueOf(decimalFormat.format(getaveragescore("math"))).floatValue();
        double iscore8 = getIscore("math");
        float floatValue16 = Float.valueOf(decimalFormat.format(iscore8)).floatValue();
        float f16 = getpercent("math", f15, floatValue16);
        edit.putFloat("averagemathiScore", floatValue16);
        int i8 = (floatValue16 > f15 ? 1 : (floatValue16 == f15 ? 0 : -1));
        if (i8 > 0) {
            TextView textView15 = this.mathpercent;
            textView15.setText("+" + String.valueOf(f16) + " %");
            this.mathpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue16 < f15 || i8 == 0) {
            TextView textView16 = this.mathpercent;
            textView16.setText(String.valueOf(f16) + " %");
            this.mathpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.mathhighscore.setText(String.valueOf(gethighscore("math")));
        startCountAnimation(this.mathiscore, Float.valueOf((float) iscore8));
        this.mathaverage.setText(String.valueOf(floatValue15));
        float f17 = defaultSharedPreferences.getFloat("averagephyiScore", 1.0f);
        float floatValue17 = Float.valueOf(decimalFormat.format(getaveragescore("phy"))).floatValue();
        double iscore9 = getIscore("phy");
        float floatValue18 = Float.valueOf(decimalFormat.format(iscore9)).floatValue();
        float f18 = getpercent("phy", f17, floatValue18);
        edit.putFloat("averagephyiScore", floatValue18);
        int i9 = (floatValue18 > f17 ? 1 : (floatValue18 == f17 ? 0 : -1));
        if (i9 > 0) {
            TextView textView17 = this.phypercent;
            textView17.setText("+" + String.valueOf(f18) + " %");
            this.phypercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue18 < f17 || i9 == 0) {
            TextView textView18 = this.phypercent;
            textView18.setText(String.valueOf(f18) + " %");
            this.phypercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.phyhighscore.setText(String.valueOf(gethighscore("phy")));
        startCountAnimation(this.phyiscore, Float.valueOf((float) iscore9));
        this.phyaverage.setText(String.valueOf(floatValue17));
        float f19 = defaultSharedPreferences.getFloat("averagesatiScore", 1.0f);
        float floatValue19 = Float.valueOf(decimalFormat.format(getaveragescore("sat"))).floatValue();
        double iscore10 = getIscore("sat");
        float floatValue20 = Float.valueOf(decimalFormat.format(iscore10)).floatValue();
        float f20 = getpercent("sat", f19, floatValue20);
        edit.putFloat("averagesatiScore", floatValue20);
        if (iscore10 > ((double) f19)) {
            TextView textView19 = this.satpercent;
            textView19.setText("+" + String.valueOf(f20) + " %");
            this.satpercent.setTextColor(C2719R.C2720color.md_green_A700);
        } else if (floatValue20 < f19 || floatValue20 == f19) {
            TextView textView20 = this.satpercent;
            textView20.setText(String.valueOf(f20) + " %");
            this.satpercent.setTextColor(C2719R.C2720color.redcolor);
        }
        this.sathighscore.setText(String.valueOf(gethighscore("sat")));
        startCountAnimation(this.satiscore, Float.valueOf((float) iscore10));
        this.sataverage.setText(String.valueOf(floatValue19));
        edit.commit();
        return inflate;
    }

    public int gethighscore(String str) {
        ArrayList arrayList = new ArrayList();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        int i = defaultSharedPreferences.getInt(str + "2009hs", 0);
        int i2 = defaultSharedPreferences.getInt(str + "2010hs", 0);
        int i3 = defaultSharedPreferences.getInt(str + "2011hs", 0);
        int i4 = defaultSharedPreferences.getInt(str + "2012hs", 0);
        int i5 = defaultSharedPreferences.getInt(str + "2013hs", 0);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i5));
        int intValue = ((Integer) arrayList.get(0)).intValue();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (((Integer) arrayList.get(i6)).intValue() > intValue) {
                intValue = ((Integer) arrayList.get(i6)).intValue();
            }
        }
        return intValue;
    }

    public double getaveragescore(String str) {
        ArrayList arrayList = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        int i = defaultSharedPreferences.getInt(str + "2009hs", 0);
        int i2 = defaultSharedPreferences.getInt(str + "2010hs", 0);
        int i3 = defaultSharedPreferences.getInt(str + "2011hs", 0);
        int i4 = defaultSharedPreferences.getInt(str + "2012hs", 0);
        int i5 = defaultSharedPreferences.getInt(str + "2013hs", 0);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i5));
        double d = 0.0d;
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((Integer) arrayList.get(i7)).intValue() > 0) {
                d += (double) ((Integer) arrayList.get(i7)).intValue();
                i6++;
            }
        }
        double d2 = d / ((double) i6);
        this.averages = d2;
        return (double) Float.valueOf(decimalFormat.format(d2)).floatValue();
    }

    public double getIscore(String str) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Float valueOf = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "091", "0")));
        Float valueOf2 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "092", "0")));
        Float valueOf3 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "093", "0")));
        Float valueOf4 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "094", "0")));
        Float valueOf5 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "095", "0")));
        Float valueOf6 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "096", "0")));
        Float valueOf7 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "097", "0")));
        Float valueOf8 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "098", "0")));
        Float valueOf9 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "099", "0")));
        Float valueOf10 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "0910", "0")));
        StringBuilder sb = new StringBuilder();
        sb.append("iScore");
        sb.append(str2);
        Float f = valueOf10;
        sb.append("101");
        Float valueOf11 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb.toString(), "0")));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("iScore");
        sb2.append(str2);
        Float f2 = valueOf11;
        sb2.append("102");
        Float valueOf12 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb2.toString(), "0")));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("iScore");
        sb3.append(str2);
        Float f3 = valueOf12;
        sb3.append("103");
        Float valueOf13 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb3.toString(), "0")));
        StringBuilder sb4 = new StringBuilder();
        sb4.append("iScore");
        sb4.append(str2);
        Float f4 = valueOf13;
        sb4.append("104");
        Float valueOf14 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb4.toString(), "0")));
        StringBuilder sb5 = new StringBuilder();
        sb5.append("iScore");
        sb5.append(str2);
        Float f5 = valueOf14;
        sb5.append("105");
        Float valueOf15 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb5.toString(), "0")));
        StringBuilder sb6 = new StringBuilder();
        sb6.append("iScore");
        sb6.append(str2);
        Float f6 = valueOf15;
        sb6.append("106");
        Float valueOf16 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb6.toString(), "0")));
        StringBuilder sb7 = new StringBuilder();
        sb7.append("iScore");
        sb7.append(str2);
        Float f7 = valueOf16;
        sb7.append("107");
        Float valueOf17 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb7.toString(), "0")));
        StringBuilder sb8 = new StringBuilder();
        sb8.append("iScore");
        sb8.append(str2);
        Float f8 = valueOf17;
        sb8.append("108");
        Float valueOf18 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb8.toString(), "0")));
        StringBuilder sb9 = new StringBuilder();
        sb9.append("iScore");
        sb9.append(str2);
        Float f9 = valueOf18;
        sb9.append("109");
        Float valueOf19 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb9.toString(), "0")));
        StringBuilder sb10 = new StringBuilder();
        sb10.append("iScore");
        sb10.append(str2);
        Float f10 = valueOf19;
        sb10.append("1010");
        Float valueOf20 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb10.toString(), "0")));
        StringBuilder sb11 = new StringBuilder();
        sb11.append("iScore");
        sb11.append(str2);
        Float f11 = valueOf20;
        sb11.append("111");
        Float valueOf21 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb11.toString(), "0")));
        StringBuilder sb12 = new StringBuilder();
        sb12.append("iScore");
        sb12.append(str2);
        Float f12 = valueOf21;
        sb12.append("112");
        Float valueOf22 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb12.toString(), "0")));
        StringBuilder sb13 = new StringBuilder();
        sb13.append("iScore");
        sb13.append(str2);
        Float f13 = valueOf22;
        sb13.append("113");
        Float valueOf23 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb13.toString(), "0")));
        StringBuilder sb14 = new StringBuilder();
        sb14.append("iScore");
        sb14.append(str2);
        Float f14 = valueOf23;
        sb14.append("114");
        Float valueOf24 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb14.toString(), "0")));
        StringBuilder sb15 = new StringBuilder();
        sb15.append("iScore");
        sb15.append(str2);
        Float f15 = valueOf24;
        sb15.append("115");
        Float valueOf25 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb15.toString(), "0")));
        StringBuilder sb16 = new StringBuilder();
        sb16.append("iScore");
        sb16.append(str2);
        Float f16 = valueOf25;
        sb16.append("116");
        Float valueOf26 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb16.toString(), "0")));
        StringBuilder sb17 = new StringBuilder();
        sb17.append("iScore");
        sb17.append(str2);
        Float f17 = valueOf26;
        sb17.append("117");
        Float valueOf27 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb17.toString(), "0")));
        StringBuilder sb18 = new StringBuilder();
        sb18.append("iScore");
        sb18.append(str2);
        Float f18 = valueOf27;
        sb18.append("118");
        Float valueOf28 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb18.toString(), "0")));
        StringBuilder sb19 = new StringBuilder();
        sb19.append("iScore");
        sb19.append(str2);
        Float f19 = valueOf28;
        sb19.append("119");
        Float valueOf29 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb19.toString(), "0")));
        StringBuilder sb20 = new StringBuilder();
        sb20.append("iScore");
        sb20.append(str2);
        Float f20 = valueOf29;
        sb20.append("1110");
        Float valueOf30 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb20.toString(), "0")));
        StringBuilder sb21 = new StringBuilder();
        sb21.append("iScore");
        sb21.append(str2);
        Float f21 = valueOf30;
        sb21.append("121");
        Float valueOf31 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb21.toString(), "0")));
        StringBuilder sb22 = new StringBuilder();
        sb22.append("iScore");
        sb22.append(str2);
        Float f22 = valueOf31;
        sb22.append("122");
        Float valueOf32 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb22.toString(), "0")));
        StringBuilder sb23 = new StringBuilder();
        sb23.append("iScore");
        sb23.append(str2);
        Float f23 = valueOf32;
        sb23.append("123");
        Float valueOf33 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb23.toString(), "0")));
        StringBuilder sb24 = new StringBuilder();
        sb24.append("iScore");
        sb24.append(str2);
        Float f24 = valueOf33;
        sb24.append("124");
        Float valueOf34 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb24.toString(), "0")));
        StringBuilder sb25 = new StringBuilder();
        sb25.append("iScore");
        sb25.append(str2);
        Float f25 = valueOf34;
        sb25.append("125");
        Float valueOf35 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb25.toString(), "0")));
        StringBuilder sb26 = new StringBuilder();
        sb26.append("iScore");
        sb26.append(str2);
        Float f26 = valueOf35;
        sb26.append("126");
        Float valueOf36 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb26.toString(), "0")));
        StringBuilder sb27 = new StringBuilder();
        sb27.append("iScore");
        sb27.append(str2);
        Float f27 = valueOf36;
        sb27.append("127");
        Float valueOf37 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb27.toString(), "0")));
        StringBuilder sb28 = new StringBuilder();
        sb28.append("iScore");
        sb28.append(str2);
        Float f28 = valueOf37;
        sb28.append("128");
        Float valueOf38 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb28.toString(), "0")));
        StringBuilder sb29 = new StringBuilder();
        sb29.append("iScore");
        sb29.append(str2);
        Float f29 = valueOf38;
        sb29.append("129");
        Float valueOf39 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb29.toString(), "0")));
        StringBuilder sb30 = new StringBuilder();
        sb30.append("iScore");
        sb30.append(str2);
        Float f30 = valueOf39;
        sb30.append("1210");
        Float valueOf40 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb30.toString(), "0")));
        StringBuilder sb31 = new StringBuilder();
        sb31.append("iScore");
        sb31.append(str2);
        Float f31 = valueOf40;
        sb31.append("131");
        Float valueOf41 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb31.toString(), "0")));
        StringBuilder sb32 = new StringBuilder();
        sb32.append("iScore");
        sb32.append(str2);
        Float f32 = valueOf41;
        sb32.append("132");
        Float valueOf42 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb32.toString(), "0")));
        StringBuilder sb33 = new StringBuilder();
        sb33.append("iScore");
        sb33.append(str2);
        Float f33 = valueOf42;
        sb33.append("133");
        Float valueOf43 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb33.toString(), "0")));
        StringBuilder sb34 = new StringBuilder();
        sb34.append("iScore");
        sb34.append(str2);
        Float f34 = valueOf43;
        sb34.append("134");
        Float valueOf44 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb34.toString(), "0")));
        StringBuilder sb35 = new StringBuilder();
        sb35.append("iScore");
        sb35.append(str2);
        Float f35 = valueOf44;
        sb35.append("135");
        Float valueOf45 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb35.toString(), "0")));
        StringBuilder sb36 = new StringBuilder();
        sb36.append("iScore");
        sb36.append(str2);
        Float f36 = valueOf45;
        sb36.append("136");
        Float valueOf46 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb36.toString(), "0")));
        StringBuilder sb37 = new StringBuilder();
        sb37.append("iScore");
        sb37.append(str2);
        Float f37 = valueOf46;
        sb37.append("137");
        Float valueOf47 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb37.toString(), "0")));
        StringBuilder sb38 = new StringBuilder();
        sb38.append("iScore");
        sb38.append(str2);
        Float f38 = valueOf47;
        sb38.append("138");
        Float valueOf48 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb38.toString(), "0")));
        StringBuilder sb39 = new StringBuilder();
        sb39.append("iScore");
        sb39.append(str2);
        Float f39 = valueOf48;
        sb39.append("139");
        Float valueOf49 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString(sb39.toString(), "0")));
        Float valueOf50 = Float.valueOf(Float.parseFloat(defaultSharedPreferences.getString("iScore" + str2 + "1310", "0")));
        arrayList.add(valueOf);
        arrayList.add(valueOf2);
        arrayList.add(valueOf3);
        arrayList.add(valueOf4);
        arrayList.add(valueOf5);
        arrayList.add(valueOf6);
        arrayList.add(valueOf7);
        arrayList.add(valueOf8);
        arrayList.add(valueOf9);
        arrayList.add(f);
        arrayList.add(f2);
        arrayList.add(f3);
        arrayList.add(f4);
        arrayList.add(f5);
        arrayList.add(f6);
        arrayList.add(f7);
        arrayList.add(f8);
        arrayList.add(f9);
        arrayList.add(f10);
        arrayList.add(f11);
        arrayList.add(f12);
        arrayList.add(f13);
        arrayList.add(f14);
        arrayList.add(f15);
        arrayList.add(f16);
        arrayList.add(f17);
        arrayList.add(f18);
        arrayList.add(f19);
        arrayList.add(f20);
        arrayList.add(f21);
        arrayList.add(f22);
        arrayList.add(f23);
        arrayList.add(f24);
        arrayList.add(f25);
        arrayList.add(f26);
        arrayList.add(f27);
        arrayList.add(f28);
        arrayList.add(f29);
        arrayList.add(f30);
        arrayList.add(f31);
        arrayList.add(f32);
        arrayList.add(f33);
        arrayList.add(f34);
        arrayList.add(f35);
        arrayList.add(f36);
        arrayList.add(f37);
        arrayList.add(f38);
        arrayList.add(f39);
        arrayList.add(valueOf49);
        arrayList.add(valueOf50);
        Float valueOf51 = Float.valueOf(0.0f);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Float) arrayList.get(i2)).floatValue() > 0.0f) {
                valueOf51 = Float.valueOf(valueOf51.floatValue() + ((Float) arrayList.get(i2)).floatValue());
                i++;
            }
        }
        double floatValue = (double) (valueOf51.floatValue() / ((float) i));
        this.averagesi = floatValue;
        return floatValue;
    }

    public float getpercent(String str, float f, float f2) {
        return Float.valueOf(new DecimalFormat("##.##").format((double) (((f2 - f) / f) * 100.0f))).floatValue();
    }

    private void startCountAnimation(final TextView textView, Float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, Float.valueOf(new DecimalFormat("##.##").format(f)).floatValue()});
        ofFloat.setDuration(2000);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                textView.setText(valueAnimator.getAnimatedValue().toString());
            }
        });
        ofFloat.start();
    }
}
