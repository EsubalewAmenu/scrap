package com.visionapps.grade12.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.visionapps.grade12.C2719R;
import java.util.ArrayList;
import java.util.Collections;

public class RecommendationsFragment extends Fragment {
    private double averagesi;
    private double bio;
    private CardView bio1;
    private CardView bio2;
    private CardView bio3;
    private double chem;
    private CardView chem1;
    private CardView chem2;
    private CardView chem3;
    private double civ;
    private CardView civ1;
    private CardView civ2;
    private CardView civ3;
    private double econ;
    private CardView econ1;
    private CardView econ2;
    private CardView econ3;
    private double eng;
    private CardView eng1;
    private CardView eng2;
    private CardView eng3;
    private double geo;
    private CardView geo1;
    private CardView geo2;
    private CardView geo3;
    private double hist;
    private CardView hist1;
    private CardView hist2;
    private CardView hist3;
    private ArrayList<Double> listnat = new ArrayList<>();
    private ArrayList<Double> listsoc = new ArrayList<>();
    private double math;
    private CardView math1;
    private CardView math2;
    private CardView math3;
    /* access modifiers changed from: private */
    public Button meaning;
    /* access modifiers changed from: private */
    public CardView meaningcard;
    private double phy;
    private CardView phy1;
    private CardView phy2;
    private CardView phy3;
    private double sat;
    private CardView sat1;
    private CardView sat2;
    private CardView sat3;

    public View onCreateView(LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.fragment_recommendations, viewGroup, false);
        this.meaning = (Button) inflate.findViewById(C2719R.C2722id.rmeaning12);
        this.meaningcard = (CardView) inflate.findViewById(C2719R.C2722id.rmeaningcard);
        this.bio1 = (CardView) inflate.findViewById(C2719R.C2722id.bio1);
        this.bio2 = (CardView) inflate.findViewById(C2719R.C2722id.bio2);
        this.bio3 = (CardView) inflate.findViewById(C2719R.C2722id.bio3);
        this.chem1 = (CardView) inflate.findViewById(C2719R.C2722id.chem1);
        this.chem2 = (CardView) inflate.findViewById(C2719R.C2722id.chem2);
        this.chem3 = (CardView) inflate.findViewById(C2719R.C2722id.chem3);
        this.civ1 = (CardView) inflate.findViewById(C2719R.C2722id.civ1);
        this.civ2 = (CardView) inflate.findViewById(C2719R.C2722id.civ2);
        this.civ3 = (CardView) inflate.findViewById(C2719R.C2722id.civ3);
        this.econ1 = (CardView) inflate.findViewById(C2719R.C2722id.econ1);
        this.econ2 = (CardView) inflate.findViewById(C2719R.C2722id.econ2);
        this.econ3 = (CardView) inflate.findViewById(C2719R.C2722id.econ3);
        this.eng1 = (CardView) inflate.findViewById(C2719R.C2722id.eng1);
        this.eng2 = (CardView) inflate.findViewById(C2719R.C2722id.eng2);
        this.eng3 = (CardView) inflate.findViewById(C2719R.C2722id.eng3);
        this.geo1 = (CardView) inflate.findViewById(C2719R.C2722id.geo1);
        this.geo2 = (CardView) inflate.findViewById(C2719R.C2722id.geo2);
        this.geo3 = (CardView) inflate.findViewById(C2719R.C2722id.geo3);
        this.hist1 = (CardView) inflate.findViewById(C2719R.C2722id.hist1);
        this.hist2 = (CardView) inflate.findViewById(C2719R.C2722id.hist2);
        this.hist3 = (CardView) inflate.findViewById(C2719R.C2722id.hist3);
        this.math1 = (CardView) inflate.findViewById(C2719R.C2722id.math1);
        this.math2 = (CardView) inflate.findViewById(C2719R.C2722id.math2);
        this.math3 = (CardView) inflate.findViewById(C2719R.C2722id.math3);
        this.phy1 = (CardView) inflate.findViewById(C2719R.C2722id.phy1);
        this.phy2 = (CardView) inflate.findViewById(C2719R.C2722id.phy2);
        this.phy3 = (CardView) inflate.findViewById(C2719R.C2722id.phy3);
        this.sat1 = (CardView) inflate.findViewById(C2719R.C2722id.sat1);
        this.sat2 = (CardView) inflate.findViewById(C2719R.C2722id.sat2);
        this.sat3 = (CardView) inflate.findViewById(C2719R.C2722id.sat3);
        this.bio = getIscore("bio");
        this.chem = getIscore("chem");
        this.civ = getIscore("civ");
        this.econ = getIscore("econ");
        this.eng = getIscore("eng");
        this.geo = getIscore("geo");
        this.hist = getIscore("hist");
        this.math = getIscore("math");
        this.phy = getIscore("phy");
        this.sat = getIscore("sat");
        this.listnat.add(Double.valueOf(this.bio));
        this.listnat.add(Double.valueOf(this.chem));
        this.listnat.add(Double.valueOf(this.phy));
        this.listnat.add(Double.valueOf(this.sat));
        this.listnat.add(Double.valueOf(this.math));
        this.listnat.add(Double.valueOf(this.civ));
        this.listnat.add(Double.valueOf(this.eng));
        this.listsoc.add(Double.valueOf(this.sat));
        this.listsoc.add(Double.valueOf(this.eng));
        this.listsoc.add(Double.valueOf(this.geo));
        this.listsoc.add(Double.valueOf(this.hist));
        this.listsoc.add(Double.valueOf(this.civ));
        this.listsoc.add(Double.valueOf(this.econ));
        this.listsoc.add(Double.valueOf(this.math));
        Collections.sort(this.listnat);
        Collections.sort(this.listsoc);
        if (PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("field", "").equals("Natural Science")) {
            if (this.listnat.get(0).doubleValue() == this.bio || this.listnat.get(1).doubleValue() == this.bio) {
                this.bio1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.chem || this.listnat.get(1).doubleValue() == this.chem) {
                this.chem1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.math || this.listnat.get(1).doubleValue() == this.math) {
                this.math1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.civ || this.listnat.get(1).doubleValue() == this.civ) {
                this.civ1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.eng || this.listnat.get(1).doubleValue() == this.eng) {
                this.eng1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.phy || this.listnat.get(1).doubleValue() == this.phy) {
                this.phy1.setVisibility(0);
            }
            if (this.listnat.get(0).doubleValue() == this.sat || this.listnat.get(1).doubleValue() == this.sat) {
                this.sat1.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.bio || this.listnat.get(3).doubleValue() == this.bio || this.listnat.get(4).doubleValue() == this.bio) {
                this.bio2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.chem || this.listnat.get(3).doubleValue() == this.chem || this.listnat.get(4).doubleValue() == this.chem) {
                this.chem2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.civ || this.listnat.get(3).doubleValue() == this.civ || this.listnat.get(4).doubleValue() == this.civ) {
                this.civ2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.math || this.listnat.get(3).doubleValue() == this.math || this.listnat.get(4).doubleValue() == this.math) {
                this.math2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.eng || this.listnat.get(3).doubleValue() == this.eng || this.listnat.get(4).doubleValue() == this.eng) {
                this.eng2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.phy || this.listnat.get(3).doubleValue() == this.phy || this.listnat.get(4).doubleValue() == this.phy) {
                this.phy2.setVisibility(0);
            }
            if (this.listnat.get(2).doubleValue() == this.sat || this.listnat.get(3).doubleValue() == this.sat || this.listnat.get(4).doubleValue() == this.sat) {
                this.sat2.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.bio || this.listnat.get(6).doubleValue() == this.bio) {
                this.bio3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.chem || this.listnat.get(6).doubleValue() == this.chem) {
                this.chem3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.civ || this.listnat.get(6).doubleValue() == this.civ) {
                this.civ3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.math || this.listnat.get(6).doubleValue() == this.math) {
                this.math3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.eng || this.listnat.get(6).doubleValue() == this.eng) {
                this.eng3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.phy || this.listnat.get(6).doubleValue() == this.phy) {
                this.phy3.setVisibility(0);
            }
            if (this.listnat.get(5).doubleValue() == this.sat || this.listnat.get(6).doubleValue() == this.sat) {
                this.sat3.setVisibility(0);
            }
        } else {
            if (this.listsoc.get(0).doubleValue() == this.econ || this.listsoc.get(1).doubleValue() == this.econ) {
                this.econ1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.geo || this.listsoc.get(1).doubleValue() == this.geo) {
                this.geo1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.math || this.listsoc.get(1).doubleValue() == this.math) {
                this.math1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.civ || this.listsoc.get(1).doubleValue() == this.civ) {
                this.civ1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.eng || this.listsoc.get(1).doubleValue() == this.eng) {
                this.eng1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.hist || this.listsoc.get(1).doubleValue() == this.hist) {
                this.hist1.setVisibility(0);
            }
            if (this.listsoc.get(0).doubleValue() == this.sat || this.listsoc.get(1).doubleValue() == this.sat) {
                this.sat1.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.econ || this.listsoc.get(3).doubleValue() == this.econ || this.listsoc.get(4).doubleValue() == this.econ) {
                this.econ2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.geo || this.listsoc.get(3).doubleValue() == this.geo || this.listsoc.get(4).doubleValue() == this.geo) {
                this.geo2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.civ || this.listsoc.get(3).doubleValue() == this.civ || this.listsoc.get(4).doubleValue() == this.civ) {
                this.civ2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.math || this.listsoc.get(3).doubleValue() == this.math || this.listsoc.get(4).doubleValue() == this.math) {
                this.math2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.eng || this.listsoc.get(3).doubleValue() == this.eng || this.listsoc.get(4).doubleValue() == this.eng) {
                this.eng2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.hist || this.listsoc.get(3).doubleValue() == this.hist || this.listsoc.get(4).doubleValue() == this.hist) {
                this.hist2.setVisibility(0);
            }
            if (this.listsoc.get(2).doubleValue() == this.sat || this.listsoc.get(3).doubleValue() == this.sat || this.listsoc.get(4).doubleValue() == this.sat) {
                this.sat2.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.econ || this.listsoc.get(6).doubleValue() == this.econ) {
                this.econ3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.geo || this.listsoc.get(6).doubleValue() == this.geo) {
                this.geo3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.civ || this.listsoc.get(6).doubleValue() == this.civ) {
                this.civ3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.math || this.listsoc.get(6).doubleValue() == this.math) {
                this.math3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.eng || this.listsoc.get(6).doubleValue() == this.eng) {
                this.eng3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.hist || this.listsoc.get(6).doubleValue() == this.hist) {
                this.hist3.setVisibility(0);
            }
            if (this.listsoc.get(5).doubleValue() == this.sat || this.listsoc.get(6).doubleValue() == this.sat) {
                this.sat3.setVisibility(0);
            }
        }
        this.listnat.clear();
        this.listsoc.clear();
        this.meaning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RecommendationsFragment.this.meaning.setVisibility(8);
                TransitionManager.beginDelayedTransition(viewGroup, new AutoTransition());
                RecommendationsFragment.this.meaningcard.setVisibility(0);
            }
        });
        return inflate;
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
}
