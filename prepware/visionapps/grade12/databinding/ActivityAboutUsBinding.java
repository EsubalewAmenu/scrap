package com.visionapps.grade12.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.visionapps.grade12.C2719R;
import com.visionapps.grade12.ColoredIconView;

public final class ActivityAboutUsBinding implements ViewBinding {
    public final TextView detMiss;
    public final ColoredIconView instagramLogo;
    public final ColoredIconView instagramLogo1;
    public final TextView leadDeveloperName;
    public final TextView leadDeveloperName1;
    public final ImageView leadDeveloperProfileIcon;
    public final ImageView leadDeveloperProfileIcon1;
    public final TextView leadDeveloperUserName;
    public final TextView leadDeveloperUserName1;
    public final ColoredIconView mailLogo;
    public final ColoredIconView mailLogo1;
    public final TextView mission;
    public final ColoredIconView phoneLogo;
    public final ColoredIconView phoneLogo1;
    private final ScrollView rootView;
    public final ColoredIconView telegramLogo;
    public final ColoredIconView telegramLogo1;
    public final LinearLayout tempo;
    public final LinearLayout tempo1;
    public final View topView;
    public final TextView vision;
    public final TextView vissionDet;
    public final View wave;

    private ActivityAboutUsBinding(ScrollView scrollView, TextView textView, ColoredIconView coloredIconView, ColoredIconView coloredIconView2, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, TextView textView4, TextView textView5, ColoredIconView coloredIconView3, ColoredIconView coloredIconView4, TextView textView6, ColoredIconView coloredIconView5, ColoredIconView coloredIconView6, ColoredIconView coloredIconView7, ColoredIconView coloredIconView8, LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView7, TextView textView8, View view2) {
        this.rootView = scrollView;
        this.detMiss = textView;
        this.instagramLogo = coloredIconView;
        this.instagramLogo1 = coloredIconView2;
        this.leadDeveloperName = textView2;
        this.leadDeveloperName1 = textView3;
        this.leadDeveloperProfileIcon = imageView;
        this.leadDeveloperProfileIcon1 = imageView2;
        this.leadDeveloperUserName = textView4;
        this.leadDeveloperUserName1 = textView5;
        this.mailLogo = coloredIconView3;
        this.mailLogo1 = coloredIconView4;
        this.mission = textView6;
        this.phoneLogo = coloredIconView5;
        this.phoneLogo1 = coloredIconView6;
        this.telegramLogo = coloredIconView7;
        this.telegramLogo1 = coloredIconView8;
        this.tempo = linearLayout;
        this.tempo1 = linearLayout2;
        this.topView = view;
        this.vision = textView7;
        this.vissionDet = textView8;
        this.wave = view2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityAboutUsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityAboutUsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2719R.C2724layout.activity_about_us, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAboutUsBinding bind(View view) {
        View view2 = view;
        int i = C2719R.C2722id.detMiss;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.detMiss);
        if (textView != null) {
            i = C2719R.C2722id.instagram_logo;
            ColoredIconView coloredIconView = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instagram_logo);
            if (coloredIconView != null) {
                i = C2719R.C2722id.instagram_logo1;
                ColoredIconView coloredIconView2 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.instagram_logo1);
                if (coloredIconView2 != null) {
                    i = C2719R.C2722id.lead_developer_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_name);
                    if (textView2 != null) {
                        i = C2719R.C2722id.lead_developer_name1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_name1);
                        if (textView3 != null) {
                            i = C2719R.C2722id.lead_developer_profile_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_profile_icon);
                            if (imageView != null) {
                                i = C2719R.C2722id.lead_developer_profile_icon1;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_profile_icon1);
                                if (imageView2 != null) {
                                    i = C2719R.C2722id.lead_developer_user_name;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_user_name);
                                    if (textView4 != null) {
                                        i = C2719R.C2722id.lead_developer_user_name1;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.lead_developer_user_name1);
                                        if (textView5 != null) {
                                            i = C2719R.C2722id.mail_logo;
                                            ColoredIconView coloredIconView3 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mail_logo);
                                            if (coloredIconView3 != null) {
                                                i = C2719R.C2722id.mail_logo1;
                                                ColoredIconView coloredIconView4 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mail_logo1);
                                                if (coloredIconView4 != null) {
                                                    i = C2719R.C2722id.mission;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.mission);
                                                    if (textView6 != null) {
                                                        i = C2719R.C2722id.phone_logo;
                                                        ColoredIconView coloredIconView5 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phone_logo);
                                                        if (coloredIconView5 != null) {
                                                            i = C2719R.C2722id.phone_logo1;
                                                            ColoredIconView coloredIconView6 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.phone_logo1);
                                                            if (coloredIconView6 != null) {
                                                                i = C2719R.C2722id.telegram_logo;
                                                                ColoredIconView coloredIconView7 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_logo);
                                                                if (coloredIconView7 != null) {
                                                                    i = C2719R.C2722id.telegram_logo1;
                                                                    ColoredIconView coloredIconView8 = (ColoredIconView) ViewBindings.findChildViewById(view2, C2719R.C2722id.telegram_logo1);
                                                                    if (coloredIconView8 != null) {
                                                                        i = C2719R.C2722id.tempo;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.tempo);
                                                                        if (linearLayout != null) {
                                                                            i = C2719R.C2722id.tempo1;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C2719R.C2722id.tempo1);
                                                                            if (linearLayout2 != null) {
                                                                                i = C2719R.C2722id.topView;
                                                                                View findChildViewById = ViewBindings.findChildViewById(view2, C2719R.C2722id.topView);
                                                                                if (findChildViewById != null) {
                                                                                    i = C2719R.C2722id.vision;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.vision);
                                                                                    if (textView7 != null) {
                                                                                        i = C2719R.C2722id.vissionDet;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C2719R.C2722id.vissionDet);
                                                                                        if (textView8 != null) {
                                                                                            i = C2719R.C2722id.wave;
                                                                                            View findChildViewById2 = ViewBindings.findChildViewById(view2, C2719R.C2722id.wave);
                                                                                            if (findChildViewById2 != null) {
                                                                                                return new ActivityAboutUsBinding((ScrollView) view2, textView, coloredIconView, coloredIconView2, textView2, textView3, imageView, imageView2, textView4, textView5, coloredIconView3, coloredIconView4, textView6, coloredIconView5, coloredIconView6, coloredIconView7, coloredIconView8, linearLayout, linearLayout2, findChildViewById, textView7, textView8, findChildViewById2);
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
