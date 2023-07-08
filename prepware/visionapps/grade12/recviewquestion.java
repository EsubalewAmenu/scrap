package com.visionapps.grade12;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class recviewquestion extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public int answer1;
    /* access modifiers changed from: private */
    public int answer10;
    /* access modifiers changed from: private */
    public int answer11;
    /* access modifiers changed from: private */
    public int answer12;
    /* access modifiers changed from: private */
    public int answer13;
    /* access modifiers changed from: private */
    public int answer2;
    /* access modifiers changed from: private */
    public int answer3;
    /* access modifiers changed from: private */
    public int answer4;
    /* access modifiers changed from: private */
    public int answer5;
    /* access modifiers changed from: private */
    public int answer6;
    /* access modifiers changed from: private */
    public int answer7;
    /* access modifiers changed from: private */
    public int answer8;
    /* access modifiers changed from: private */
    public int answer9;
    /* access modifiers changed from: private */
    public int answered1;
    /* access modifiers changed from: private */
    public int answered10;
    /* access modifiers changed from: private */
    public int answered11;
    /* access modifiers changed from: private */
    public int answered12;
    /* access modifiers changed from: private */
    public int answered13;
    /* access modifiers changed from: private */
    public int answered2;
    /* access modifiers changed from: private */
    public int answered3;
    /* access modifiers changed from: private */
    public int answered4;
    /* access modifiers changed from: private */
    public int answered5;
    /* access modifiers changed from: private */
    public int answered6;
    /* access modifiers changed from: private */
    public int answered7;
    /* access modifiers changed from: private */
    public int answered8;
    /* access modifiers changed from: private */
    public int answered9;
    public ArrayList<questions> questions = new ArrayList<>();
    public View view;

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.view = LayoutInflater.from(viewGroup.getContext()).inflate(C2719R.C2724layout.questionlist, viewGroup, false);
        return new ViewHolder(this.view);
    }

    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(viewHolder.f616cv.getContext()).edit();
        viewHolder.f617no.setText(this.questions.get(i).getQueno());
        viewHolder.txt.setText(this.questions.get(i).getQuestion());
        viewHolder.exp.setText(this.questions.get(i).getExplanation());
        viewHolder.img.setImageResource(this.questions.get(i).getImgquestion());
        viewHolder.imgexp.setImageResource(this.questions.get(i).getImgexp());
        Boolean mode = this.questions.get(i).getMode();
        int part = this.questions.get(i).getPart();
        if (this.questions.get(i).getRb1().equals("")) {
            viewHolder.rb1.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb1(), 0, 0, 0);
        } else {
            viewHolder.rb1.setText(this.questions.get(i).getRb1());
        }
        if (this.questions.get(i).getRb2().equals("")) {
            viewHolder.rb2.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb2(), 0, 0, 0);
        } else {
            viewHolder.rb2.setText(this.questions.get(i).getRb2());
        }
        if (this.questions.get(i).getRb3().equals("")) {
            viewHolder.rb3.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb3(), 0, 0, 0);
        } else {
            viewHolder.rb3.setText(this.questions.get(i).getRb3());
        }
        if (this.questions.get(i).getRb4().equals("")) {
            viewHolder.rb4.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb4(), 0, 0, 0);
        } else {
            viewHolder.rb4.setText(this.questions.get(i).getRb4());
        }
        String answer = this.questions.get(i).getAnswer();
        if (answer.equals("a")) {
            viewHolder.rb1.setTag("correct");
        } else if (answer.equals("b")) {
            viewHolder.rb2.setTag("correct");
        } else if (answer.equals("c")) {
            viewHolder.rb3.setTag("correct");
        } else if (answer.equals("d")) {
            viewHolder.rb4.setTag("correct");
        } else if (answer.equals("n")) {
            viewHolder.rb1.setTag("incorrect");
            viewHolder.rb2.setTag("incorrect");
            viewHolder.rb3.setTag("incorrect");
            viewHolder.rb4.setTag("incorrect");
        }
        viewHolder.show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (viewHolder.f619rl.getVisibility() == 8) {
                    viewHolder.show.setText("Hide explanation");
                    TransitionManager.beginDelayedTransition(viewHolder.f616cv, new AutoTransition());
                    viewHolder.f619rl.setVisibility(0);
                    return;
                }
                viewHolder.show.setText("Show explanation");
                TransitionManager.beginDelayedTransition(viewHolder.f616cv, new AutoTransition());
                viewHolder.f619rl.setVisibility(8);
            }
        });
        final Boolean bool = mode;
        final int i2 = part;
        final SharedPreferences.Editor editor = edit;
        final ViewHolder viewHolder2 = viewHolder;
        viewHolder.rb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent();
                String obj = view.getTag().toString();
                int i = 3;
                int i2 = 1;
                if (bool.booleanValue()) {
                    int i3 = 0;
                    while (i3 <= i) {
                        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i3);
                        if (i3 != 0 && (radioButton.isChecked() || radioButton.isSelected() || !radioButton.isEnabled())) {
                            String obj2 = radioButton.getTag().toString();
                            if (obj2.equals("correct") && !obj2.equals("incorrect")) {
                                int i4 = i2;
                                if (i4 == i2) {
                                    recviewquestion recviewquestion = recviewquestion.this;
                                    int unused = recviewquestion.answer1 = recviewquestion.answer1 - 1;
                                    editor.putInt("ans1", recviewquestion.this.answer1);
                                    editor.commit();
                                } else if (i4 == 2) {
                                    recviewquestion recviewquestion2 = recviewquestion.this;
                                    int unused2 = recviewquestion2.answer2 = recviewquestion2.answer2 - i2;
                                    editor.putInt("ans2", recviewquestion.this.answer2);
                                    editor.commit();
                                } else if (i4 == 3) {
                                    recviewquestion recviewquestion3 = recviewquestion.this;
                                    int unused3 = recviewquestion3.answer3 = recviewquestion3.answer3 - i2;
                                    editor.putInt("ans3", recviewquestion.this.answer3);
                                    editor.commit();
                                } else if (i4 == 4) {
                                    recviewquestion recviewquestion4 = recviewquestion.this;
                                    int unused4 = recviewquestion4.answer4 = recviewquestion4.answer4 - 1;
                                    editor.putInt("ans4", recviewquestion.this.answer4);
                                    editor.commit();
                                } else if (i4 == 5) {
                                    recviewquestion recviewquestion5 = recviewquestion.this;
                                    int unused5 = recviewquestion5.answer5 = recviewquestion5.answer5 - 1;
                                    editor.putInt("ans5", recviewquestion.this.answer5);
                                    editor.commit();
                                } else if (i4 == 6) {
                                    recviewquestion recviewquestion6 = recviewquestion.this;
                                    int unused6 = recviewquestion6.answer6 = recviewquestion6.answer6 - 1;
                                    editor.putInt("ans6", recviewquestion.this.answer6);
                                    editor.commit();
                                } else if (i4 == 7) {
                                    recviewquestion recviewquestion7 = recviewquestion.this;
                                    int unused7 = recviewquestion7.answer7 = recviewquestion7.answer7 - 1;
                                    editor.putInt("ans7", recviewquestion.this.answer7);
                                    editor.commit();
                                } else if (i4 == 8) {
                                    recviewquestion recviewquestion8 = recviewquestion.this;
                                    int unused8 = recviewquestion8.answer8 = recviewquestion8.answer8 - 1;
                                    editor.putInt("ans8", recviewquestion.this.answer8);
                                    editor.commit();
                                } else if (i4 == 9) {
                                    recviewquestion recviewquestion9 = recviewquestion.this;
                                    int unused9 = recviewquestion9.answer9 = recviewquestion9.answer9 - 1;
                                    editor.putInt("ans9", recviewquestion.this.answer9);
                                    editor.commit();
                                } else if (i4 == 10) {
                                    recviewquestion recviewquestion10 = recviewquestion.this;
                                    int unused10 = recviewquestion10.answer10 = recviewquestion10.answer10 - 1;
                                    editor.putInt("ans10", recviewquestion.this.answer10);
                                    editor.commit();
                                } else if (i4 == 11) {
                                    recviewquestion recviewquestion11 = recviewquestion.this;
                                    int unused11 = recviewquestion11.answer11 = recviewquestion11.answer11 - 1;
                                    editor.putInt("ans11", recviewquestion.this.answer11);
                                    editor.commit();
                                } else if (i4 == 12) {
                                    recviewquestion recviewquestion12 = recviewquestion.this;
                                    int unused12 = recviewquestion12.answer12 = recviewquestion12.answer12 - 1;
                                    editor.putInt("ans12", recviewquestion.this.answer12);
                                    editor.commit();
                                } else if (i4 == 13) {
                                    recviewquestion recviewquestion13 = recviewquestion.this;
                                    int unused13 = recviewquestion13.answer13 = recviewquestion13.answer13 - 1;
                                    editor.putInt("ans13", recviewquestion.this.answer13);
                                    editor.commit();
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            i = 3;
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                        i = 3;
                        i2 = 1;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i5 = i2;
                        if (i5 == 1) {
                            recviewquestion recviewquestion14 = recviewquestion.this;
                            int unused14 = recviewquestion14.answer1 = recviewquestion14.answer1 + 1;
                            recviewquestion recviewquestion15 = recviewquestion.this;
                            int unused15 = recviewquestion15.answered1 = recviewquestion15.answered1 + 1;
                            editor.putInt("answered1", recviewquestion.this.answered1);
                            editor.putInt("ans1", recviewquestion.this.answer1);
                            editor.commit();
                        } else if (i5 == 2) {
                            recviewquestion recviewquestion16 = recviewquestion.this;
                            int unused16 = recviewquestion16.answer2 = recviewquestion16.answer2 + 1;
                            recviewquestion recviewquestion17 = recviewquestion.this;
                            int unused17 = recviewquestion17.answered2 = recviewquestion17.answered2 + 1;
                            editor.putInt("answered2", recviewquestion.this.answered2);
                            editor.putInt("ans2", recviewquestion.this.answer2);
                            editor.commit();
                        } else if (i5 == 3) {
                            recviewquestion recviewquestion18 = recviewquestion.this;
                            int unused18 = recviewquestion18.answer3 = recviewquestion18.answer3 + 1;
                            recviewquestion recviewquestion19 = recviewquestion.this;
                            int unused19 = recviewquestion19.answered3 = recviewquestion19.answered3 + 1;
                            editor.putInt("answered3", recviewquestion.this.answered3);
                            editor.putInt("ans3", recviewquestion.this.answer3);
                            editor.commit();
                        } else if (i5 == 4) {
                            recviewquestion recviewquestion20 = recviewquestion.this;
                            int unused20 = recviewquestion20.answer4 = recviewquestion20.answer4 + 1;
                            recviewquestion recviewquestion21 = recviewquestion.this;
                            int unused21 = recviewquestion21.answered4 = recviewquestion21.answered4 + 1;
                            editor.putInt("answered4", recviewquestion.this.answered4);
                            editor.putInt("ans4", recviewquestion.this.answer4);
                            editor.commit();
                        } else if (i5 == 5) {
                            recviewquestion recviewquestion22 = recviewquestion.this;
                            int unused22 = recviewquestion22.answer5 = recviewquestion22.answer5 + 1;
                            recviewquestion recviewquestion23 = recviewquestion.this;
                            int unused23 = recviewquestion23.answered5 = recviewquestion23.answered5 + 1;
                            editor.putInt("answered5", recviewquestion.this.answered5);
                            editor.putInt("ans5", recviewquestion.this.answer5);
                            editor.commit();
                        } else if (i5 == 6) {
                            recviewquestion recviewquestion24 = recviewquestion.this;
                            int unused24 = recviewquestion24.answer6 = recviewquestion24.answer6 + 1;
                            recviewquestion recviewquestion25 = recviewquestion.this;
                            int unused25 = recviewquestion25.answered6 = recviewquestion25.answered6 + 1;
                            editor.putInt("answered6", recviewquestion.this.answered6);
                            editor.putInt("ans6", recviewquestion.this.answer6);
                            editor.commit();
                        } else if (i5 == 7) {
                            recviewquestion recviewquestion26 = recviewquestion.this;
                            int unused26 = recviewquestion26.answer7 = recviewquestion26.answer7 + 1;
                            recviewquestion recviewquestion27 = recviewquestion.this;
                            int unused27 = recviewquestion27.answered7 = recviewquestion27.answered7 + 1;
                            editor.putInt("answered7", recviewquestion.this.answered7);
                            editor.putInt("ans7", recviewquestion.this.answer7);
                            editor.commit();
                        } else if (i5 == 8) {
                            recviewquestion recviewquestion28 = recviewquestion.this;
                            int unused28 = recviewquestion28.answer8 = recviewquestion28.answer8 + 1;
                            recviewquestion recviewquestion29 = recviewquestion.this;
                            int unused29 = recviewquestion29.answered8 = recviewquestion29.answered8 + 1;
                            editor.putInt("answered8", recviewquestion.this.answered8);
                            editor.putInt("ans8", recviewquestion.this.answer8);
                            editor.commit();
                        } else if (i5 == 9) {
                            recviewquestion recviewquestion30 = recviewquestion.this;
                            int unused30 = recviewquestion30.answer9 = recviewquestion30.answer9 + 1;
                            recviewquestion recviewquestion31 = recviewquestion.this;
                            int unused31 = recviewquestion31.answered9 = recviewquestion31.answered9 + 1;
                            editor.putInt("answered9", recviewquestion.this.answered9);
                            editor.putInt("ans9", recviewquestion.this.answer9);
                            editor.commit();
                        } else if (i5 == 10) {
                            recviewquestion recviewquestion32 = recviewquestion.this;
                            int unused32 = recviewquestion32.answer10 = recviewquestion32.answer10 + 1;
                            recviewquestion recviewquestion33 = recviewquestion.this;
                            int unused33 = recviewquestion33.answered10 = recviewquestion33.answered10 + 1;
                            editor.putInt("answered10", recviewquestion.this.answered10);
                            editor.putInt("ans10", recviewquestion.this.answer10);
                            editor.commit();
                        } else if (i5 == 11) {
                            recviewquestion recviewquestion34 = recviewquestion.this;
                            int unused34 = recviewquestion34.answer11 = recviewquestion34.answer11 + 1;
                            recviewquestion recviewquestion35 = recviewquestion.this;
                            int unused35 = recviewquestion35.answered11 = recviewquestion35.answered11 + 1;
                            editor.putInt("answered11", recviewquestion.this.answered11);
                            editor.putInt("ans11", recviewquestion.this.answer11);
                            editor.commit();
                        } else if (i5 == 12) {
                            recviewquestion recviewquestion36 = recviewquestion.this;
                            int unused36 = recviewquestion36.answer12 = recviewquestion36.answer12 + 1;
                            recviewquestion recviewquestion37 = recviewquestion.this;
                            int unused37 = recviewquestion37.answered12 = recviewquestion37.answered12 + 1;
                            editor.putInt("answered12", recviewquestion.this.answered12);
                            editor.putInt("ans12", recviewquestion.this.answer12);
                            editor.commit();
                        } else if (i5 == 13) {
                            recviewquestion recviewquestion38 = recviewquestion.this;
                            int unused38 = recviewquestion38.answer13 = recviewquestion38.answer13 + 1;
                            recviewquestion recviewquestion39 = recviewquestion.this;
                            int unused39 = recviewquestion39.answered13 = recviewquestion39.answered13 + 1;
                            editor.putInt("answered13", recviewquestion.this.answered13);
                            editor.putInt("ans13", recviewquestion.this.answer13);
                            editor.commit();
                        }
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view2.setEnabled(false);
                    return;
                }
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestion recviewquestion40 = recviewquestion.this;
                        int unused40 = recviewquestion40.answer1 = recviewquestion40.answer1 + 1;
                        recviewquestion recviewquestion41 = recviewquestion.this;
                        int unused41 = recviewquestion41.answered1 = recviewquestion41.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.putInt("ans1", recviewquestion.this.answer1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestion recviewquestion42 = recviewquestion.this;
                        int unused42 = recviewquestion42.answer2 = recviewquestion42.answer2 + 1;
                        recviewquestion recviewquestion43 = recviewquestion.this;
                        int unused43 = recviewquestion43.answered2 = recviewquestion43.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.putInt("ans2", recviewquestion.this.answer2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestion recviewquestion44 = recviewquestion.this;
                        int unused44 = recviewquestion44.answer3 = recviewquestion44.answer3 + 1;
                        recviewquestion recviewquestion45 = recviewquestion.this;
                        int unused45 = recviewquestion45.answered3 = recviewquestion45.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.putInt("ans3", recviewquestion.this.answer3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestion recviewquestion46 = recviewquestion.this;
                        int unused46 = recviewquestion46.answer4 = recviewquestion46.answer4 + 1;
                        recviewquestion recviewquestion47 = recviewquestion.this;
                        int unused47 = recviewquestion47.answered4 = recviewquestion47.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.putInt("ans4", recviewquestion.this.answer4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestion recviewquestion48 = recviewquestion.this;
                        int unused48 = recviewquestion48.answer5 = recviewquestion48.answer5 + 1;
                        recviewquestion recviewquestion49 = recviewquestion.this;
                        int unused49 = recviewquestion49.answered5 = recviewquestion49.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.putInt("ans5", recviewquestion.this.answer5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestion recviewquestion50 = recviewquestion.this;
                        int unused50 = recviewquestion50.answer6 = recviewquestion50.answer6 + 1;
                        recviewquestion recviewquestion51 = recviewquestion.this;
                        int unused51 = recviewquestion51.answered6 = recviewquestion51.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.putInt("ans6", recviewquestion.this.answer6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestion recviewquestion52 = recviewquestion.this;
                        int unused52 = recviewquestion52.answer7 = recviewquestion52.answer7 + 1;
                        recviewquestion recviewquestion53 = recviewquestion.this;
                        int unused53 = recviewquestion53.answered7 = recviewquestion53.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.putInt("ans7", recviewquestion.this.answer7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestion recviewquestion54 = recviewquestion.this;
                        int unused54 = recviewquestion54.answer8 = recviewquestion54.answer8 + 1;
                        recviewquestion recviewquestion55 = recviewquestion.this;
                        int unused55 = recviewquestion55.answered8 = recviewquestion55.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.putInt("ans8", recviewquestion.this.answer8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestion recviewquestion56 = recviewquestion.this;
                        int unused56 = recviewquestion56.answer9 = recviewquestion56.answer9 + 1;
                        recviewquestion recviewquestion57 = recviewquestion.this;
                        int unused57 = recviewquestion57.answered9 = recviewquestion57.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.putInt("ans9", recviewquestion.this.answer9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestion recviewquestion58 = recviewquestion.this;
                        int unused58 = recviewquestion58.answer10 = recviewquestion58.answer10 + 1;
                        recviewquestion recviewquestion59 = recviewquestion.this;
                        int unused59 = recviewquestion59.answered10 = recviewquestion59.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.putInt("ans10", recviewquestion.this.answer10);
                        editor.commit();
                    } else if (i6 == 11) {
                        recviewquestion recviewquestion60 = recviewquestion.this;
                        int unused60 = recviewquestion60.answer11 = recviewquestion60.answer11 + 1;
                        recviewquestion recviewquestion61 = recviewquestion.this;
                        int unused61 = recviewquestion61.answered11 = recviewquestion61.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.putInt("ans11", recviewquestion.this.answer11);
                        editor.commit();
                    } else if (i6 == 12) {
                        recviewquestion recviewquestion62 = recviewquestion.this;
                        int unused62 = recviewquestion62.answer12 = recviewquestion62.answer12 + 1;
                        recviewquestion recviewquestion63 = recviewquestion.this;
                        int unused63 = recviewquestion63.answered12 = recviewquestion63.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.putInt("ans12", recviewquestion.this.answer12);
                        editor.commit();
                    } else if (i6 == 13) {
                        recviewquestion recviewquestion64 = recviewquestion.this;
                        int unused64 = recviewquestion64.answer13 = recviewquestion64.answer13 + 1;
                        recviewquestion recviewquestion65 = recviewquestion.this;
                        int unused65 = recviewquestion65.answered13 = recviewquestion65.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.putInt("ans13", recviewquestion.this.answer13);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i7 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(i7);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        }
                        i7++;
                    }
                    int i8 = i2;
                    if (i8 == 1) {
                        recviewquestion recviewquestion66 = recviewquestion.this;
                        int unused66 = recviewquestion66.answered1 = recviewquestion66.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.commit();
                    } else if (i8 == 2) {
                        recviewquestion recviewquestion67 = recviewquestion.this;
                        int unused67 = recviewquestion67.answered2 = recviewquestion67.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.commit();
                    } else if (i8 == 3) {
                        recviewquestion recviewquestion68 = recviewquestion.this;
                        int unused68 = recviewquestion68.answered3 = recviewquestion68.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.commit();
                    } else if (i8 == 4) {
                        recviewquestion recviewquestion69 = recviewquestion.this;
                        int unused69 = recviewquestion69.answered4 = recviewquestion69.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.commit();
                    } else if (i8 == 5) {
                        recviewquestion recviewquestion70 = recviewquestion.this;
                        int unused70 = recviewquestion70.answered5 = recviewquestion70.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.commit();
                    } else if (i8 == 6) {
                        recviewquestion recviewquestion71 = recviewquestion.this;
                        int unused71 = recviewquestion71.answered6 = recviewquestion71.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.commit();
                    } else if (i8 == 7) {
                        recviewquestion recviewquestion72 = recviewquestion.this;
                        int unused72 = recviewquestion72.answered7 = recviewquestion72.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.commit();
                    } else if (i8 == 8) {
                        recviewquestion recviewquestion73 = recviewquestion.this;
                        int unused73 = recviewquestion73.answered8 = recviewquestion73.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.commit();
                    } else if (i8 == 9) {
                        recviewquestion recviewquestion74 = recviewquestion.this;
                        int unused74 = recviewquestion74.answered9 = recviewquestion74.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.commit();
                    } else if (i8 == 10) {
                        recviewquestion recviewquestion75 = recviewquestion.this;
                        int unused75 = recviewquestion75.answered10 = recviewquestion75.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.commit();
                    } else if (i8 == 11) {
                        recviewquestion recviewquestion76 = recviewquestion.this;
                        int unused76 = recviewquestion76.answered11 = recviewquestion76.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.commit();
                    } else if (i8 == 12) {
                        recviewquestion recviewquestion77 = recviewquestion.this;
                        int unused77 = recviewquestion77.answered12 = recviewquestion77.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.commit();
                    } else if (i8 == 13) {
                        recviewquestion recviewquestion78 = recviewquestion.this;
                        int unused78 = recviewquestion78.answered13 = recviewquestion78.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.commit();
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                } else if (obj.equals("incorrect")) {
                    viewHolder2.rb1.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb3.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                }
                viewHolder2.rb1.setEnabled(false);
                viewHolder2.rb2.setEnabled(false);
                viewHolder2.rb3.setEnabled(false);
                viewHolder2.rb4.setEnabled(false);
                TransitionManager.beginDelayedTransition(viewHolder2.f616cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent();
                String obj = view.getTag().toString();
                int i = 3;
                int i2 = 1;
                if (bool.booleanValue()) {
                    int i3 = 0;
                    while (i3 <= i) {
                        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i3);
                        if (i3 != i2 && (radioButton.isChecked() || radioButton.isSelected() || !radioButton.isEnabled())) {
                            String obj2 = radioButton.getTag().toString();
                            if (obj2.equals("correct") && !obj2.equals("incorrect")) {
                                int i4 = i2;
                                if (i4 == i2) {
                                    recviewquestion recviewquestion = recviewquestion.this;
                                    int unused = recviewquestion.answer1 = recviewquestion.answer1 - 1;
                                    editor.putInt("ans1", recviewquestion.this.answer1);
                                    editor.commit();
                                } else if (i4 == 2) {
                                    recviewquestion recviewquestion2 = recviewquestion.this;
                                    int unused2 = recviewquestion2.answer2 = recviewquestion2.answer2 - i2;
                                    editor.putInt("ans2", recviewquestion.this.answer2);
                                    editor.commit();
                                } else if (i4 == 3) {
                                    recviewquestion recviewquestion3 = recviewquestion.this;
                                    int unused3 = recviewquestion3.answer3 = recviewquestion3.answer3 - i2;
                                    editor.putInt("ans3", recviewquestion.this.answer3);
                                    editor.commit();
                                } else if (i4 == 4) {
                                    recviewquestion recviewquestion4 = recviewquestion.this;
                                    int unused4 = recviewquestion4.answer4 = recviewquestion4.answer4 - 1;
                                    editor.putInt("ans4", recviewquestion.this.answer4);
                                    editor.commit();
                                } else if (i4 == 5) {
                                    recviewquestion recviewquestion5 = recviewquestion.this;
                                    int unused5 = recviewquestion5.answer5 = recviewquestion5.answer5 - 1;
                                    editor.putInt("ans5", recviewquestion.this.answer5);
                                    editor.commit();
                                } else if (i4 == 6) {
                                    recviewquestion recviewquestion6 = recviewquestion.this;
                                    int unused6 = recviewquestion6.answer6 = recviewquestion6.answer6 - 1;
                                    editor.putInt("ans6", recviewquestion.this.answer6);
                                    editor.commit();
                                } else if (i4 == 7) {
                                    recviewquestion recviewquestion7 = recviewquestion.this;
                                    int unused7 = recviewquestion7.answer7 = recviewquestion7.answer7 - 1;
                                    editor.putInt("ans7", recviewquestion.this.answer7);
                                    editor.commit();
                                } else if (i4 == 8) {
                                    recviewquestion recviewquestion8 = recviewquestion.this;
                                    int unused8 = recviewquestion8.answer8 = recviewquestion8.answer8 - 1;
                                    editor.putInt("ans8", recviewquestion.this.answer8);
                                    editor.commit();
                                } else if (i4 == 9) {
                                    recviewquestion recviewquestion9 = recviewquestion.this;
                                    int unused9 = recviewquestion9.answer9 = recviewquestion9.answer9 - 1;
                                    editor.putInt("ans9", recviewquestion.this.answer9);
                                    editor.commit();
                                } else if (i4 == 10) {
                                    recviewquestion recviewquestion10 = recviewquestion.this;
                                    int unused10 = recviewquestion10.answer10 = recviewquestion10.answer10 - 1;
                                    editor.putInt("ans10", recviewquestion.this.answer10);
                                    editor.commit();
                                } else if (i4 == 11) {
                                    recviewquestion recviewquestion11 = recviewquestion.this;
                                    int unused11 = recviewquestion11.answer11 = recviewquestion11.answer11 - 1;
                                    editor.putInt("ans11", recviewquestion.this.answer11);
                                    editor.commit();
                                } else if (i4 == 12) {
                                    recviewquestion recviewquestion12 = recviewquestion.this;
                                    int unused12 = recviewquestion12.answer12 = recviewquestion12.answer12 - 1;
                                    editor.putInt("ans12", recviewquestion.this.answer12);
                                    editor.commit();
                                } else if (i4 == 13) {
                                    recviewquestion recviewquestion13 = recviewquestion.this;
                                    int unused13 = recviewquestion13.answer13 = recviewquestion13.answer13 - 1;
                                    editor.putInt("ans13", recviewquestion.this.answer13);
                                    editor.commit();
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            i = 3;
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                        i = 3;
                        i2 = 1;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i5 = i2;
                        if (i5 == 1) {
                            recviewquestion recviewquestion14 = recviewquestion.this;
                            int unused14 = recviewquestion14.answer1 = recviewquestion14.answer1 + 1;
                            recviewquestion recviewquestion15 = recviewquestion.this;
                            int unused15 = recviewquestion15.answered1 = recviewquestion15.answered1 + 1;
                            editor.putInt("answered1", recviewquestion.this.answered1);
                            editor.putInt("ans1", recviewquestion.this.answer1);
                            editor.commit();
                        } else if (i5 == 2) {
                            recviewquestion recviewquestion16 = recviewquestion.this;
                            int unused16 = recviewquestion16.answer2 = recviewquestion16.answer2 + 1;
                            recviewquestion recviewquestion17 = recviewquestion.this;
                            int unused17 = recviewquestion17.answered2 = recviewquestion17.answered2 + 1;
                            editor.putInt("answered2", recviewquestion.this.answered2);
                            editor.putInt("ans2", recviewquestion.this.answer2);
                            editor.commit();
                        } else if (i5 == 3) {
                            recviewquestion recviewquestion18 = recviewquestion.this;
                            int unused18 = recviewquestion18.answer3 = recviewquestion18.answer3 + 1;
                            recviewquestion recviewquestion19 = recviewquestion.this;
                            int unused19 = recviewquestion19.answered3 = recviewquestion19.answered3 + 1;
                            editor.putInt("answered3", recviewquestion.this.answered3);
                            editor.putInt("ans3", recviewquestion.this.answer3);
                            editor.commit();
                        } else if (i5 == 4) {
                            recviewquestion recviewquestion20 = recviewquestion.this;
                            int unused20 = recviewquestion20.answer4 = recviewquestion20.answer4 + 1;
                            recviewquestion recviewquestion21 = recviewquestion.this;
                            int unused21 = recviewquestion21.answered4 = recviewquestion21.answered4 + 1;
                            editor.putInt("answered4", recviewquestion.this.answered4);
                            editor.putInt("ans4", recviewquestion.this.answer4);
                            editor.commit();
                        } else if (i5 == 5) {
                            recviewquestion recviewquestion22 = recviewquestion.this;
                            int unused22 = recviewquestion22.answer5 = recviewquestion22.answer5 + 1;
                            recviewquestion recviewquestion23 = recviewquestion.this;
                            int unused23 = recviewquestion23.answered5 = recviewquestion23.answered5 + 1;
                            editor.putInt("answered5", recviewquestion.this.answered5);
                            editor.putInt("ans5", recviewquestion.this.answer5);
                            editor.commit();
                        } else if (i5 == 6) {
                            recviewquestion recviewquestion24 = recviewquestion.this;
                            int unused24 = recviewquestion24.answer6 = recviewquestion24.answer6 + 1;
                            recviewquestion recviewquestion25 = recviewquestion.this;
                            int unused25 = recviewquestion25.answered6 = recviewquestion25.answered6 + 1;
                            editor.putInt("answered6", recviewquestion.this.answered6);
                            editor.putInt("ans6", recviewquestion.this.answer6);
                            editor.commit();
                        } else if (i5 == 7) {
                            recviewquestion recviewquestion26 = recviewquestion.this;
                            int unused26 = recviewquestion26.answer7 = recviewquestion26.answer7 + 1;
                            recviewquestion recviewquestion27 = recviewquestion.this;
                            int unused27 = recviewquestion27.answered7 = recviewquestion27.answered7 + 1;
                            editor.putInt("answered7", recviewquestion.this.answered7);
                            editor.putInt("ans7", recviewquestion.this.answer7);
                            editor.commit();
                        } else if (i5 == 8) {
                            recviewquestion recviewquestion28 = recviewquestion.this;
                            int unused28 = recviewquestion28.answer8 = recviewquestion28.answer8 + 1;
                            recviewquestion recviewquestion29 = recviewquestion.this;
                            int unused29 = recviewquestion29.answered8 = recviewquestion29.answered8 + 1;
                            editor.putInt("answered8", recviewquestion.this.answered8);
                            editor.putInt("ans8", recviewquestion.this.answer8);
                            editor.commit();
                        } else if (i5 == 9) {
                            recviewquestion recviewquestion30 = recviewquestion.this;
                            int unused30 = recviewquestion30.answer9 = recviewquestion30.answer9 + 1;
                            recviewquestion recviewquestion31 = recviewquestion.this;
                            int unused31 = recviewquestion31.answered9 = recviewquestion31.answered9 + 1;
                            editor.putInt("answered9", recviewquestion.this.answered9);
                            editor.putInt("ans9", recviewquestion.this.answer9);
                            editor.commit();
                        } else if (i5 == 10) {
                            recviewquestion recviewquestion32 = recviewquestion.this;
                            int unused32 = recviewquestion32.answer10 = recviewquestion32.answer10 + 1;
                            recviewquestion recviewquestion33 = recviewquestion.this;
                            int unused33 = recviewquestion33.answered10 = recviewquestion33.answered10 + 1;
                            editor.putInt("answered10", recviewquestion.this.answered10);
                            editor.putInt("ans10", recviewquestion.this.answer10);
                            editor.commit();
                        } else if (i5 == 11) {
                            recviewquestion recviewquestion34 = recviewquestion.this;
                            int unused34 = recviewquestion34.answer11 = recviewquestion34.answer11 + 1;
                            recviewquestion recviewquestion35 = recviewquestion.this;
                            int unused35 = recviewquestion35.answered11 = recviewquestion35.answered11 + 1;
                            editor.putInt("answered11", recviewquestion.this.answered11);
                            editor.putInt("ans11", recviewquestion.this.answer11);
                            editor.commit();
                        } else if (i5 == 12) {
                            recviewquestion recviewquestion36 = recviewquestion.this;
                            int unused36 = recviewquestion36.answer12 = recviewquestion36.answer12 + 1;
                            recviewquestion recviewquestion37 = recviewquestion.this;
                            int unused37 = recviewquestion37.answered12 = recviewquestion37.answered12 + 1;
                            editor.putInt("answered12", recviewquestion.this.answered12);
                            editor.putInt("ans12", recviewquestion.this.answer12);
                            editor.commit();
                        } else if (i5 == 13) {
                            recviewquestion recviewquestion38 = recviewquestion.this;
                            int unused38 = recviewquestion38.answer13 = recviewquestion38.answer13 + 1;
                            recviewquestion recviewquestion39 = recviewquestion.this;
                            int unused39 = recviewquestion39.answered13 = recviewquestion39.answered13 + 1;
                            editor.putInt("answered13", recviewquestion.this.answered13);
                            editor.putInt("ans13", recviewquestion.this.answer13);
                            editor.commit();
                        }
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view2.setEnabled(false);
                    return;
                }
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestion recviewquestion40 = recviewquestion.this;
                        int unused40 = recviewquestion40.answer1 = recviewquestion40.answer1 + 1;
                        recviewquestion recviewquestion41 = recviewquestion.this;
                        int unused41 = recviewquestion41.answered1 = recviewquestion41.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.putInt("ans1", recviewquestion.this.answer1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestion recviewquestion42 = recviewquestion.this;
                        int unused42 = recviewquestion42.answer2 = recviewquestion42.answer2 + 1;
                        recviewquestion recviewquestion43 = recviewquestion.this;
                        int unused43 = recviewquestion43.answered2 = recviewquestion43.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.putInt("ans2", recviewquestion.this.answer2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestion recviewquestion44 = recviewquestion.this;
                        int unused44 = recviewquestion44.answer3 = recviewquestion44.answer3 + 1;
                        recviewquestion recviewquestion45 = recviewquestion.this;
                        int unused45 = recviewquestion45.answered3 = recviewquestion45.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.putInt("ans3", recviewquestion.this.answer3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestion recviewquestion46 = recviewquestion.this;
                        int unused46 = recviewquestion46.answer4 = recviewquestion46.answer4 + 1;
                        recviewquestion recviewquestion47 = recviewquestion.this;
                        int unused47 = recviewquestion47.answered4 = recviewquestion47.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.putInt("ans4", recviewquestion.this.answer4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestion recviewquestion48 = recviewquestion.this;
                        int unused48 = recviewquestion48.answer5 = recviewquestion48.answer5 + 1;
                        recviewquestion recviewquestion49 = recviewquestion.this;
                        int unused49 = recviewquestion49.answered5 = recviewquestion49.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.putInt("ans5", recviewquestion.this.answer5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestion recviewquestion50 = recviewquestion.this;
                        int unused50 = recviewquestion50.answer6 = recviewquestion50.answer6 + 1;
                        recviewquestion recviewquestion51 = recviewquestion.this;
                        int unused51 = recviewquestion51.answered6 = recviewquestion51.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.putInt("ans6", recviewquestion.this.answer6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestion recviewquestion52 = recviewquestion.this;
                        int unused52 = recviewquestion52.answer7 = recviewquestion52.answer7 + 1;
                        recviewquestion recviewquestion53 = recviewquestion.this;
                        int unused53 = recviewquestion53.answered7 = recviewquestion53.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.putInt("ans7", recviewquestion.this.answer7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestion recviewquestion54 = recviewquestion.this;
                        int unused54 = recviewquestion54.answer8 = recviewquestion54.answer8 + 1;
                        recviewquestion recviewquestion55 = recviewquestion.this;
                        int unused55 = recviewquestion55.answered8 = recviewquestion55.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.putInt("ans8", recviewquestion.this.answer8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestion recviewquestion56 = recviewquestion.this;
                        int unused56 = recviewquestion56.answer9 = recviewquestion56.answer9 + 1;
                        recviewquestion recviewquestion57 = recviewquestion.this;
                        int unused57 = recviewquestion57.answered9 = recviewquestion57.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.putInt("ans9", recviewquestion.this.answer9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestion recviewquestion58 = recviewquestion.this;
                        int unused58 = recviewquestion58.answer10 = recviewquestion58.answer10 + 1;
                        recviewquestion recviewquestion59 = recviewquestion.this;
                        int unused59 = recviewquestion59.answered10 = recviewquestion59.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.putInt("ans10", recviewquestion.this.answer10);
                        editor.commit();
                    } else if (i6 == 11) {
                        recviewquestion recviewquestion60 = recviewquestion.this;
                        int unused60 = recviewquestion60.answer11 = recviewquestion60.answer11 + 1;
                        recviewquestion recviewquestion61 = recviewquestion.this;
                        int unused61 = recviewquestion61.answered11 = recviewquestion61.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.putInt("ans11", recviewquestion.this.answer11);
                        editor.commit();
                    } else if (i6 == 12) {
                        recviewquestion recviewquestion62 = recviewquestion.this;
                        int unused62 = recviewquestion62.answer12 = recviewquestion62.answer12 + 1;
                        recviewquestion recviewquestion63 = recviewquestion.this;
                        int unused63 = recviewquestion63.answered12 = recviewquestion63.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.putInt("ans12", recviewquestion.this.answer12);
                        editor.commit();
                    } else if (i6 == 13) {
                        recviewquestion recviewquestion64 = recviewquestion.this;
                        int unused64 = recviewquestion64.answer13 = recviewquestion64.answer13 + 1;
                        recviewquestion recviewquestion65 = recviewquestion.this;
                        int unused65 = recviewquestion65.answered13 = recviewquestion65.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.putInt("ans13", recviewquestion.this.answer13);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i7 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(i7);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        }
                        i7++;
                    }
                    int i8 = i2;
                    if (i8 == 1) {
                        recviewquestion recviewquestion66 = recviewquestion.this;
                        int unused66 = recviewquestion66.answered1 = recviewquestion66.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.commit();
                    } else if (i8 == 2) {
                        recviewquestion recviewquestion67 = recviewquestion.this;
                        int unused67 = recviewquestion67.answered2 = recviewquestion67.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.commit();
                    } else if (i8 == 3) {
                        recviewquestion recviewquestion68 = recviewquestion.this;
                        int unused68 = recviewquestion68.answered3 = recviewquestion68.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.commit();
                    } else if (i8 == 4) {
                        recviewquestion recviewquestion69 = recviewquestion.this;
                        int unused69 = recviewquestion69.answered4 = recviewquestion69.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.commit();
                    } else if (i8 == 5) {
                        recviewquestion recviewquestion70 = recviewquestion.this;
                        int unused70 = recviewquestion70.answered5 = recviewquestion70.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.commit();
                    } else if (i8 == 6) {
                        recviewquestion recviewquestion71 = recviewquestion.this;
                        int unused71 = recviewquestion71.answered6 = recviewquestion71.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.commit();
                    } else if (i8 == 7) {
                        recviewquestion recviewquestion72 = recviewquestion.this;
                        int unused72 = recviewquestion72.answered7 = recviewquestion72.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.commit();
                    } else if (i8 == 8) {
                        recviewquestion recviewquestion73 = recviewquestion.this;
                        int unused73 = recviewquestion73.answered8 = recviewquestion73.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.commit();
                    } else if (i8 == 9) {
                        recviewquestion recviewquestion74 = recviewquestion.this;
                        int unused74 = recviewquestion74.answered9 = recviewquestion74.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.commit();
                    } else if (i8 == 10) {
                        recviewquestion recviewquestion75 = recviewquestion.this;
                        int unused75 = recviewquestion75.answered10 = recviewquestion75.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.commit();
                    } else if (i8 == 11) {
                        recviewquestion recviewquestion76 = recviewquestion.this;
                        int unused76 = recviewquestion76.answered11 = recviewquestion76.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.commit();
                    } else if (i8 == 12) {
                        recviewquestion recviewquestion77 = recviewquestion.this;
                        int unused77 = recviewquestion77.answered12 = recviewquestion77.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.commit();
                    } else if (i8 == 13) {
                        recviewquestion recviewquestion78 = recviewquestion.this;
                        int unused78 = recviewquestion78.answered13 = recviewquestion78.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.commit();
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                } else if (obj.equals("incorrect")) {
                    viewHolder2.rb1.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb3.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                }
                viewHolder2.rb1.setEnabled(false);
                viewHolder2.rb2.setEnabled(false);
                viewHolder2.rb3.setEnabled(false);
                viewHolder2.rb4.setEnabled(false);
                TransitionManager.beginDelayedTransition(viewHolder2.f616cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent();
                String obj = view.getTag().toString();
                int i = 2;
                int i2 = 3;
                int i3 = 1;
                if (bool.booleanValue()) {
                    int i4 = 0;
                    while (i4 <= i2) {
                        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i4);
                        if (i4 != i && (radioButton.isChecked() || radioButton.isSelected() || !radioButton.isEnabled())) {
                            String obj2 = radioButton.getTag().toString();
                            if (obj2.equals("correct") && !obj2.equals("incorrect")) {
                                int i5 = i2;
                                if (i5 == i3) {
                                    recviewquestion recviewquestion = recviewquestion.this;
                                    int unused = recviewquestion.answer1 = recviewquestion.answer1 - 1;
                                    editor.putInt("ans1", recviewquestion.this.answer1);
                                    editor.commit();
                                } else if (i5 == i) {
                                    recviewquestion recviewquestion2 = recviewquestion.this;
                                    int unused2 = recviewquestion2.answer2 = recviewquestion2.answer2 - i3;
                                    editor.putInt("ans2", recviewquestion.this.answer2);
                                    editor.commit();
                                } else if (i5 == 3) {
                                    recviewquestion recviewquestion3 = recviewquestion.this;
                                    int unused3 = recviewquestion3.answer3 = recviewquestion3.answer3 - i3;
                                    editor.putInt("ans3", recviewquestion.this.answer3);
                                    editor.commit();
                                } else if (i5 == 4) {
                                    recviewquestion recviewquestion4 = recviewquestion.this;
                                    int unused4 = recviewquestion4.answer4 = recviewquestion4.answer4 - 1;
                                    editor.putInt("ans4", recviewquestion.this.answer4);
                                    editor.commit();
                                } else if (i5 == 5) {
                                    recviewquestion recviewquestion5 = recviewquestion.this;
                                    int unused5 = recviewquestion5.answer5 = recviewquestion5.answer5 - 1;
                                    editor.putInt("ans5", recviewquestion.this.answer5);
                                    editor.commit();
                                } else if (i5 == 6) {
                                    recviewquestion recviewquestion6 = recviewquestion.this;
                                    int unused6 = recviewquestion6.answer6 = recviewquestion6.answer6 - 1;
                                    editor.putInt("ans6", recviewquestion.this.answer6);
                                    editor.commit();
                                } else if (i5 == 7) {
                                    recviewquestion recviewquestion7 = recviewquestion.this;
                                    int unused7 = recviewquestion7.answer7 = recviewquestion7.answer7 - 1;
                                    editor.putInt("ans7", recviewquestion.this.answer7);
                                    editor.commit();
                                } else if (i5 == 8) {
                                    recviewquestion recviewquestion8 = recviewquestion.this;
                                    int unused8 = recviewquestion8.answer8 = recviewquestion8.answer8 - 1;
                                    editor.putInt("ans8", recviewquestion.this.answer8);
                                    editor.commit();
                                } else if (i5 == 9) {
                                    recviewquestion recviewquestion9 = recviewquestion.this;
                                    int unused9 = recviewquestion9.answer9 = recviewquestion9.answer9 - 1;
                                    editor.putInt("ans9", recviewquestion.this.answer9);
                                    editor.commit();
                                } else if (i5 == 10) {
                                    recviewquestion recviewquestion10 = recviewquestion.this;
                                    int unused10 = recviewquestion10.answer10 = recviewquestion10.answer10 - 1;
                                    editor.putInt("ans10", recviewquestion.this.answer10);
                                    editor.commit();
                                } else if (i5 == 11) {
                                    recviewquestion recviewquestion11 = recviewquestion.this;
                                    int unused11 = recviewquestion11.answer11 = recviewquestion11.answer11 - 1;
                                    editor.putInt("ans11", recviewquestion.this.answer11);
                                    editor.commit();
                                } else if (i5 == 12) {
                                    recviewquestion recviewquestion12 = recviewquestion.this;
                                    int unused12 = recviewquestion12.answer12 = recviewquestion12.answer12 - 1;
                                    editor.putInt("ans12", recviewquestion.this.answer12);
                                    editor.commit();
                                } else if (i5 == 13) {
                                    recviewquestion recviewquestion13 = recviewquestion.this;
                                    int unused13 = recviewquestion13.answer13 = recviewquestion13.answer13 - 1;
                                    editor.putInt("ans13", recviewquestion.this.answer13);
                                    editor.commit();
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            i2 = 3;
                        }
                        if (i4 == i2) {
                            break;
                        }
                        i4++;
                        i2 = 3;
                        i3 = 1;
                        i = 2;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i6 = i2;
                        if (i6 == 1) {
                            recviewquestion recviewquestion14 = recviewquestion.this;
                            int unused14 = recviewquestion14.answer1 = recviewquestion14.answer1 + 1;
                            recviewquestion recviewquestion15 = recviewquestion.this;
                            int unused15 = recviewquestion15.answered1 = recviewquestion15.answered1 + 1;
                            editor.putInt("answered1", recviewquestion.this.answered1);
                            editor.putInt("ans1", recviewquestion.this.answer1);
                            editor.commit();
                        } else if (i6 == 2) {
                            recviewquestion recviewquestion16 = recviewquestion.this;
                            int unused16 = recviewquestion16.answer2 = recviewquestion16.answer2 + 1;
                            recviewquestion recviewquestion17 = recviewquestion.this;
                            int unused17 = recviewquestion17.answered2 = recviewquestion17.answered2 + 1;
                            editor.putInt("answered2", recviewquestion.this.answered2);
                            editor.putInt("ans2", recviewquestion.this.answer2);
                            editor.commit();
                        } else if (i6 == 3) {
                            recviewquestion recviewquestion18 = recviewquestion.this;
                            int unused18 = recviewquestion18.answer3 = recviewquestion18.answer3 + 1;
                            recviewquestion recviewquestion19 = recviewquestion.this;
                            int unused19 = recviewquestion19.answered3 = recviewquestion19.answered3 + 1;
                            editor.putInt("answered3", recviewquestion.this.answered3);
                            editor.putInt("ans3", recviewquestion.this.answer3);
                            editor.commit();
                        } else if (i6 == 4) {
                            recviewquestion recviewquestion20 = recviewquestion.this;
                            int unused20 = recviewquestion20.answer4 = recviewquestion20.answer4 + 1;
                            recviewquestion recviewquestion21 = recviewquestion.this;
                            int unused21 = recviewquestion21.answered4 = recviewquestion21.answered4 + 1;
                            editor.putInt("answered4", recviewquestion.this.answered4);
                            editor.putInt("ans4", recviewquestion.this.answer4);
                            editor.commit();
                        } else if (i6 == 5) {
                            recviewquestion recviewquestion22 = recviewquestion.this;
                            int unused22 = recviewquestion22.answer5 = recviewquestion22.answer5 + 1;
                            recviewquestion recviewquestion23 = recviewquestion.this;
                            int unused23 = recviewquestion23.answered5 = recviewquestion23.answered5 + 1;
                            editor.putInt("answered5", recviewquestion.this.answered5);
                            editor.putInt("ans5", recviewquestion.this.answer5);
                            editor.commit();
                        } else if (i6 == 6) {
                            recviewquestion recviewquestion24 = recviewquestion.this;
                            int unused24 = recviewquestion24.answer6 = recviewquestion24.answer6 + 1;
                            recviewquestion recviewquestion25 = recviewquestion.this;
                            int unused25 = recviewquestion25.answered6 = recviewquestion25.answered6 + 1;
                            editor.putInt("answered6", recviewquestion.this.answered6);
                            editor.putInt("ans6", recviewquestion.this.answer6);
                            editor.commit();
                        } else if (i6 == 7) {
                            recviewquestion recviewquestion26 = recviewquestion.this;
                            int unused26 = recviewquestion26.answer7 = recviewquestion26.answer7 + 1;
                            recviewquestion recviewquestion27 = recviewquestion.this;
                            int unused27 = recviewquestion27.answered7 = recviewquestion27.answered7 + 1;
                            editor.putInt("answered7", recviewquestion.this.answered7);
                            editor.putInt("ans7", recviewquestion.this.answer7);
                            editor.commit();
                        } else if (i6 == 8) {
                            recviewquestion recviewquestion28 = recviewquestion.this;
                            int unused28 = recviewquestion28.answer8 = recviewquestion28.answer8 + 1;
                            recviewquestion recviewquestion29 = recviewquestion.this;
                            int unused29 = recviewquestion29.answered8 = recviewquestion29.answered8 + 1;
                            editor.putInt("answered8", recviewquestion.this.answered8);
                            editor.putInt("ans8", recviewquestion.this.answer8);
                            editor.commit();
                        } else if (i6 == 9) {
                            recviewquestion recviewquestion30 = recviewquestion.this;
                            int unused30 = recviewquestion30.answer9 = recviewquestion30.answer9 + 1;
                            recviewquestion recviewquestion31 = recviewquestion.this;
                            int unused31 = recviewquestion31.answered9 = recviewquestion31.answered9 + 1;
                            editor.putInt("answered9", recviewquestion.this.answered9);
                            editor.putInt("ans9", recviewquestion.this.answer9);
                            editor.commit();
                        } else if (i6 == 10) {
                            recviewquestion recviewquestion32 = recviewquestion.this;
                            int unused32 = recviewquestion32.answer10 = recviewquestion32.answer10 + 1;
                            recviewquestion recviewquestion33 = recviewquestion.this;
                            int unused33 = recviewquestion33.answered10 = recviewquestion33.answered10 + 1;
                            editor.putInt("answered10", recviewquestion.this.answered10);
                            editor.putInt("ans10", recviewquestion.this.answer10);
                            editor.commit();
                        } else if (i6 == 11) {
                            recviewquestion recviewquestion34 = recviewquestion.this;
                            int unused34 = recviewquestion34.answer11 = recviewquestion34.answer11 + 1;
                            recviewquestion recviewquestion35 = recviewquestion.this;
                            int unused35 = recviewquestion35.answered11 = recviewquestion35.answered11 + 1;
                            editor.putInt("answered11", recviewquestion.this.answered11);
                            editor.putInt("ans11", recviewquestion.this.answer11);
                            editor.commit();
                        } else if (i6 == 12) {
                            recviewquestion recviewquestion36 = recviewquestion.this;
                            int unused36 = recviewquestion36.answer12 = recviewquestion36.answer12 + 1;
                            recviewquestion recviewquestion37 = recviewquestion.this;
                            int unused37 = recviewquestion37.answered12 = recviewquestion37.answered12 + 1;
                            editor.putInt("answered12", recviewquestion.this.answered12);
                            editor.putInt("ans12", recviewquestion.this.answer12);
                            editor.commit();
                        } else if (i6 == 13) {
                            recviewquestion recviewquestion38 = recviewquestion.this;
                            int unused38 = recviewquestion38.answer13 = recviewquestion38.answer13 + 1;
                            recviewquestion recviewquestion39 = recviewquestion.this;
                            int unused39 = recviewquestion39.answered13 = recviewquestion39.answered13 + 1;
                            editor.putInt("answered13", recviewquestion.this.answered13);
                            editor.putInt("ans13", recviewquestion.this.answer13);
                            editor.commit();
                        }
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view2.setEnabled(false);
                    return;
                }
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i7 = i2;
                    if (i7 == 1) {
                        recviewquestion recviewquestion40 = recviewquestion.this;
                        int unused40 = recviewquestion40.answer1 = recviewquestion40.answer1 + 1;
                        recviewquestion recviewquestion41 = recviewquestion.this;
                        int unused41 = recviewquestion41.answered1 = recviewquestion41.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.putInt("ans1", recviewquestion.this.answer1);
                        editor.commit();
                    } else if (i7 == 2) {
                        recviewquestion recviewquestion42 = recviewquestion.this;
                        int unused42 = recviewquestion42.answer2 = recviewquestion42.answer2 + 1;
                        recviewquestion recviewquestion43 = recviewquestion.this;
                        int unused43 = recviewquestion43.answered2 = recviewquestion43.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.putInt("ans2", recviewquestion.this.answer2);
                        editor.commit();
                    } else if (i7 == 3) {
                        recviewquestion recviewquestion44 = recviewquestion.this;
                        int unused44 = recviewquestion44.answer3 = recviewquestion44.answer3 + 1;
                        recviewquestion recviewquestion45 = recviewquestion.this;
                        int unused45 = recviewquestion45.answered3 = recviewquestion45.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.putInt("ans3", recviewquestion.this.answer3);
                        editor.commit();
                    } else if (i7 == 4) {
                        recviewquestion recviewquestion46 = recviewquestion.this;
                        int unused46 = recviewquestion46.answer4 = recviewquestion46.answer4 + 1;
                        recviewquestion recviewquestion47 = recviewquestion.this;
                        int unused47 = recviewquestion47.answered4 = recviewquestion47.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.putInt("ans4", recviewquestion.this.answer4);
                        editor.commit();
                    } else if (i7 == 5) {
                        recviewquestion recviewquestion48 = recviewquestion.this;
                        int unused48 = recviewquestion48.answer5 = recviewquestion48.answer5 + 1;
                        recviewquestion recviewquestion49 = recviewquestion.this;
                        int unused49 = recviewquestion49.answered5 = recviewquestion49.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.putInt("ans5", recviewquestion.this.answer5);
                        editor.commit();
                    } else if (i7 == 6) {
                        recviewquestion recviewquestion50 = recviewquestion.this;
                        int unused50 = recviewquestion50.answer6 = recviewquestion50.answer6 + 1;
                        recviewquestion recviewquestion51 = recviewquestion.this;
                        int unused51 = recviewquestion51.answered6 = recviewquestion51.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.putInt("ans6", recviewquestion.this.answer6);
                        editor.commit();
                    } else if (i7 == 7) {
                        recviewquestion recviewquestion52 = recviewquestion.this;
                        int unused52 = recviewquestion52.answer7 = recviewquestion52.answer7 + 1;
                        recviewquestion recviewquestion53 = recviewquestion.this;
                        int unused53 = recviewquestion53.answered7 = recviewquestion53.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.putInt("ans7", recviewquestion.this.answer7);
                        editor.commit();
                    } else if (i7 == 8) {
                        recviewquestion recviewquestion54 = recviewquestion.this;
                        int unused54 = recviewquestion54.answer8 = recviewquestion54.answer8 + 1;
                        recviewquestion recviewquestion55 = recviewquestion.this;
                        int unused55 = recviewquestion55.answered8 = recviewquestion55.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.putInt("ans8", recviewquestion.this.answer8);
                        editor.commit();
                    } else if (i7 == 9) {
                        recviewquestion recviewquestion56 = recviewquestion.this;
                        int unused56 = recviewquestion56.answer9 = recviewquestion56.answer9 + 1;
                        recviewquestion recviewquestion57 = recviewquestion.this;
                        int unused57 = recviewquestion57.answered9 = recviewquestion57.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.putInt("ans9", recviewquestion.this.answer9);
                        editor.commit();
                    } else if (i7 == 10) {
                        recviewquestion recviewquestion58 = recviewquestion.this;
                        int unused58 = recviewquestion58.answer10 = recviewquestion58.answer10 + 1;
                        recviewquestion recviewquestion59 = recviewquestion.this;
                        int unused59 = recviewquestion59.answered10 = recviewquestion59.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.putInt("ans10", recviewquestion.this.answer10);
                        editor.commit();
                    } else if (i7 == 11) {
                        recviewquestion recviewquestion60 = recviewquestion.this;
                        int unused60 = recviewquestion60.answer11 = recviewquestion60.answer11 + 1;
                        recviewquestion recviewquestion61 = recviewquestion.this;
                        int unused61 = recviewquestion61.answered11 = recviewquestion61.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.putInt("ans11", recviewquestion.this.answer11);
                        editor.commit();
                    } else if (i7 == 12) {
                        recviewquestion recviewquestion62 = recviewquestion.this;
                        int unused62 = recviewquestion62.answer12 = recviewquestion62.answer12 + 1;
                        recviewquestion recviewquestion63 = recviewquestion.this;
                        int unused63 = recviewquestion63.answered12 = recviewquestion63.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.putInt("ans12", recviewquestion.this.answer12);
                        editor.commit();
                    } else if (i7 == 13) {
                        recviewquestion recviewquestion64 = recviewquestion.this;
                        int unused64 = recviewquestion64.answer13 = recviewquestion64.answer13 + 1;
                        recviewquestion recviewquestion65 = recviewquestion.this;
                        int unused65 = recviewquestion65.answered13 = recviewquestion65.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.putInt("ans13", recviewquestion.this.answer13);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i8 = 0;
                    while (true) {
                        if (i8 > 4) {
                            break;
                        }
                        RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(i8);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        }
                        i8++;
                    }
                    int i9 = i2;
                    if (i9 == 1) {
                        recviewquestion recviewquestion66 = recviewquestion.this;
                        int unused66 = recviewquestion66.answered1 = recviewquestion66.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.commit();
                    } else if (i9 == 2) {
                        recviewquestion recviewquestion67 = recviewquestion.this;
                        int unused67 = recviewquestion67.answered2 = recviewquestion67.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.commit();
                    } else if (i9 == 3) {
                        recviewquestion recviewquestion68 = recviewquestion.this;
                        int unused68 = recviewquestion68.answered3 = recviewquestion68.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.commit();
                    } else if (i9 == 4) {
                        recviewquestion recviewquestion69 = recviewquestion.this;
                        int unused69 = recviewquestion69.answered4 = recviewquestion69.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.commit();
                    } else if (i9 == 5) {
                        recviewquestion recviewquestion70 = recviewquestion.this;
                        int unused70 = recviewquestion70.answered5 = recviewquestion70.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.commit();
                    } else if (i9 == 6) {
                        recviewquestion recviewquestion71 = recviewquestion.this;
                        int unused71 = recviewquestion71.answered6 = recviewquestion71.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.commit();
                    } else if (i9 == 7) {
                        recviewquestion recviewquestion72 = recviewquestion.this;
                        int unused72 = recviewquestion72.answered7 = recviewquestion72.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.commit();
                    } else if (i9 == 8) {
                        recviewquestion recviewquestion73 = recviewquestion.this;
                        int unused73 = recviewquestion73.answered8 = recviewquestion73.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.commit();
                    } else if (i9 == 9) {
                        recviewquestion recviewquestion74 = recviewquestion.this;
                        int unused74 = recviewquestion74.answered9 = recviewquestion74.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.commit();
                    } else if (i9 == 10) {
                        recviewquestion recviewquestion75 = recviewquestion.this;
                        int unused75 = recviewquestion75.answered10 = recviewquestion75.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.commit();
                    } else if (i9 == 11) {
                        recviewquestion recviewquestion76 = recviewquestion.this;
                        int unused76 = recviewquestion76.answered11 = recviewquestion76.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.commit();
                    } else if (i9 == 12) {
                        recviewquestion recviewquestion77 = recviewquestion.this;
                        int unused77 = recviewquestion77.answered12 = recviewquestion77.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.commit();
                    } else if (i9 == 13) {
                        recviewquestion recviewquestion78 = recviewquestion.this;
                        int unused78 = recviewquestion78.answered13 = recviewquestion78.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.commit();
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                } else if (obj.equals("incorrect")) {
                    viewHolder2.rb1.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb3.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                }
                viewHolder2.rb1.setEnabled(false);
                viewHolder2.rb2.setEnabled(false);
                viewHolder2.rb3.setEnabled(false);
                viewHolder2.rb4.setEnabled(false);
                TransitionManager.beginDelayedTransition(viewHolder2.f616cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent();
                String obj = view.getTag().toString();
                int i = 3;
                int i2 = 1;
                if (bool.booleanValue()) {
                    int i3 = 0;
                    while (i3 <= i) {
                        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i3);
                        if (i3 != i && (radioButton.isChecked() || radioButton.isSelected() || !radioButton.isEnabled())) {
                            String obj2 = radioButton.getTag().toString();
                            if (obj2.equals("correct") && !obj2.equals("incorrect")) {
                                int i4 = i2;
                                if (i4 == i2) {
                                    recviewquestion recviewquestion = recviewquestion.this;
                                    int unused = recviewquestion.answer1 = recviewquestion.answer1 - 1;
                                    editor.putInt("ans1", recviewquestion.this.answer1);
                                    editor.commit();
                                } else if (i4 == 2) {
                                    recviewquestion recviewquestion2 = recviewquestion.this;
                                    int unused2 = recviewquestion2.answer2 = recviewquestion2.answer2 - i2;
                                    editor.putInt("ans2", recviewquestion.this.answer2);
                                    editor.commit();
                                } else if (i4 == 3) {
                                    recviewquestion recviewquestion3 = recviewquestion.this;
                                    int unused3 = recviewquestion3.answer3 = recviewquestion3.answer3 - i2;
                                    editor.putInt("ans3", recviewquestion.this.answer3);
                                    editor.commit();
                                } else if (i4 == 4) {
                                    recviewquestion recviewquestion4 = recviewquestion.this;
                                    int unused4 = recviewquestion4.answer4 = recviewquestion4.answer4 - 1;
                                    editor.putInt("ans4", recviewquestion.this.answer4);
                                    editor.commit();
                                } else if (i4 == 5) {
                                    recviewquestion recviewquestion5 = recviewquestion.this;
                                    int unused5 = recviewquestion5.answer5 = recviewquestion5.answer5 - 1;
                                    editor.putInt("ans5", recviewquestion.this.answer5);
                                    editor.commit();
                                } else if (i4 == 6) {
                                    recviewquestion recviewquestion6 = recviewquestion.this;
                                    int unused6 = recviewquestion6.answer6 = recviewquestion6.answer6 - 1;
                                    editor.putInt("ans6", recviewquestion.this.answer6);
                                    editor.commit();
                                } else if (i4 == 7) {
                                    recviewquestion recviewquestion7 = recviewquestion.this;
                                    int unused7 = recviewquestion7.answer7 = recviewquestion7.answer7 - 1;
                                    editor.putInt("ans7", recviewquestion.this.answer7);
                                    editor.commit();
                                } else if (i4 == 8) {
                                    recviewquestion recviewquestion8 = recviewquestion.this;
                                    int unused8 = recviewquestion8.answer8 = recviewquestion8.answer8 - 1;
                                    editor.putInt("ans8", recviewquestion.this.answer8);
                                    editor.commit();
                                } else if (i4 == 9) {
                                    recviewquestion recviewquestion9 = recviewquestion.this;
                                    int unused9 = recviewquestion9.answer9 = recviewquestion9.answer9 - 1;
                                    editor.putInt("ans9", recviewquestion.this.answer9);
                                    editor.commit();
                                } else if (i4 == 10) {
                                    recviewquestion recviewquestion10 = recviewquestion.this;
                                    int unused10 = recviewquestion10.answer10 = recviewquestion10.answer10 - 1;
                                    editor.putInt("ans10", recviewquestion.this.answer10);
                                    editor.commit();
                                } else if (i4 == 11) {
                                    recviewquestion recviewquestion11 = recviewquestion.this;
                                    int unused11 = recviewquestion11.answer11 = recviewquestion11.answer11 - 1;
                                    editor.putInt("ans11", recviewquestion.this.answer11);
                                    editor.commit();
                                } else if (i4 == 12) {
                                    recviewquestion recviewquestion12 = recviewquestion.this;
                                    int unused12 = recviewquestion12.answer12 = recviewquestion12.answer12 - 1;
                                    editor.putInt("ans12", recviewquestion.this.answer12);
                                    editor.commit();
                                } else if (i4 == 13) {
                                    recviewquestion recviewquestion13 = recviewquestion.this;
                                    int unused13 = recviewquestion13.answer13 = recviewquestion13.answer13 - 1;
                                    editor.putInt("ans13", recviewquestion.this.answer13);
                                    editor.commit();
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            i = 3;
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                        i = 3;
                        i2 = 1;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i5 = i2;
                        if (i5 == 1) {
                            recviewquestion recviewquestion14 = recviewquestion.this;
                            int unused14 = recviewquestion14.answer1 = recviewquestion14.answer1 + 1;
                            recviewquestion recviewquestion15 = recviewquestion.this;
                            int unused15 = recviewquestion15.answered1 = recviewquestion15.answered1 + 1;
                            editor.putInt("answered1", recviewquestion.this.answered1);
                            editor.putInt("ans1", recviewquestion.this.answer1);
                            editor.commit();
                        } else if (i5 == 2) {
                            recviewquestion recviewquestion16 = recviewquestion.this;
                            int unused16 = recviewquestion16.answer2 = recviewquestion16.answer2 + 1;
                            recviewquestion recviewquestion17 = recviewquestion.this;
                            int unused17 = recviewquestion17.answered2 = recviewquestion17.answered2 + 1;
                            editor.putInt("answered2", recviewquestion.this.answered2);
                            editor.putInt("ans2", recviewquestion.this.answer2);
                            editor.commit();
                        } else if (i5 == 3) {
                            recviewquestion recviewquestion18 = recviewquestion.this;
                            int unused18 = recviewquestion18.answer3 = recviewquestion18.answer3 + 1;
                            recviewquestion recviewquestion19 = recviewquestion.this;
                            int unused19 = recviewquestion19.answered3 = recviewquestion19.answered3 + 1;
                            editor.putInt("answered3", recviewquestion.this.answered3);
                            editor.putInt("ans3", recviewquestion.this.answer3);
                            editor.commit();
                        } else if (i5 == 4) {
                            recviewquestion recviewquestion20 = recviewquestion.this;
                            int unused20 = recviewquestion20.answer4 = recviewquestion20.answer4 + 1;
                            recviewquestion recviewquestion21 = recviewquestion.this;
                            int unused21 = recviewquestion21.answered4 = recviewquestion21.answered4 + 1;
                            editor.putInt("answered4", recviewquestion.this.answered4);
                            editor.putInt("ans4", recviewquestion.this.answer4);
                            editor.commit();
                        } else if (i5 == 5) {
                            recviewquestion recviewquestion22 = recviewquestion.this;
                            int unused22 = recviewquestion22.answer5 = recviewquestion22.answer5 + 1;
                            recviewquestion recviewquestion23 = recviewquestion.this;
                            int unused23 = recviewquestion23.answered5 = recviewquestion23.answered5 + 1;
                            editor.putInt("answered5", recviewquestion.this.answered5);
                            editor.putInt("ans5", recviewquestion.this.answer5);
                            editor.commit();
                        } else if (i5 == 6) {
                            recviewquestion recviewquestion24 = recviewquestion.this;
                            int unused24 = recviewquestion24.answer6 = recviewquestion24.answer6 + 1;
                            recviewquestion recviewquestion25 = recviewquestion.this;
                            int unused25 = recviewquestion25.answered6 = recviewquestion25.answered6 + 1;
                            editor.putInt("answered6", recviewquestion.this.answered6);
                            editor.putInt("ans6", recviewquestion.this.answer6);
                            editor.commit();
                        } else if (i5 == 7) {
                            recviewquestion recviewquestion26 = recviewquestion.this;
                            int unused26 = recviewquestion26.answer7 = recviewquestion26.answer7 + 1;
                            recviewquestion recviewquestion27 = recviewquestion.this;
                            int unused27 = recviewquestion27.answered7 = recviewquestion27.answered7 + 1;
                            editor.putInt("answered7", recviewquestion.this.answered7);
                            editor.putInt("ans7", recviewquestion.this.answer7);
                            editor.commit();
                        } else if (i5 == 8) {
                            recviewquestion recviewquestion28 = recviewquestion.this;
                            int unused28 = recviewquestion28.answer8 = recviewquestion28.answer8 + 1;
                            recviewquestion recviewquestion29 = recviewquestion.this;
                            int unused29 = recviewquestion29.answered8 = recviewquestion29.answered8 + 1;
                            editor.putInt("answered8", recviewquestion.this.answered8);
                            editor.putInt("ans8", recviewquestion.this.answer8);
                            editor.commit();
                        } else if (i5 == 9) {
                            recviewquestion recviewquestion30 = recviewquestion.this;
                            int unused30 = recviewquestion30.answer9 = recviewquestion30.answer9 + 1;
                            recviewquestion recviewquestion31 = recviewquestion.this;
                            int unused31 = recviewquestion31.answered9 = recviewquestion31.answered9 + 1;
                            editor.putInt("answered9", recviewquestion.this.answered9);
                            editor.putInt("ans9", recviewquestion.this.answer9);
                            editor.commit();
                        } else if (i5 == 10) {
                            recviewquestion recviewquestion32 = recviewquestion.this;
                            int unused32 = recviewquestion32.answer10 = recviewquestion32.answer10 + 1;
                            recviewquestion recviewquestion33 = recviewquestion.this;
                            int unused33 = recviewquestion33.answered10 = recviewquestion33.answered10 + 1;
                            editor.putInt("answered10", recviewquestion.this.answered10);
                            editor.putInt("ans10", recviewquestion.this.answer10);
                            editor.commit();
                        } else if (i5 == 11) {
                            recviewquestion recviewquestion34 = recviewquestion.this;
                            int unused34 = recviewquestion34.answer11 = recviewquestion34.answer11 + 1;
                            recviewquestion recviewquestion35 = recviewquestion.this;
                            int unused35 = recviewquestion35.answered11 = recviewquestion35.answered11 + 1;
                            editor.putInt("answered11", recviewquestion.this.answered11);
                            editor.putInt("ans11", recviewquestion.this.answer11);
                            editor.commit();
                        } else if (i5 == 12) {
                            recviewquestion recviewquestion36 = recviewquestion.this;
                            int unused36 = recviewquestion36.answer12 = recviewquestion36.answer12 + 1;
                            recviewquestion recviewquestion37 = recviewquestion.this;
                            int unused37 = recviewquestion37.answered12 = recviewquestion37.answered12 + 1;
                            editor.putInt("answered12", recviewquestion.this.answered12);
                            editor.putInt("ans12", recviewquestion.this.answer12);
                            editor.commit();
                        } else if (i5 == 13) {
                            recviewquestion recviewquestion38 = recviewquestion.this;
                            int unused38 = recviewquestion38.answer13 = recviewquestion38.answer13 + 1;
                            recviewquestion recviewquestion39 = recviewquestion.this;
                            int unused39 = recviewquestion39.answered13 = recviewquestion39.answered13 + 1;
                            editor.putInt("answered13", recviewquestion.this.answered13);
                            editor.putInt("ans13", recviewquestion.this.answer13);
                            editor.commit();
                        }
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view2.setEnabled(false);
                    return;
                }
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestion recviewquestion40 = recviewquestion.this;
                        int unused40 = recviewquestion40.answer1 = recviewquestion40.answer1 + 1;
                        recviewquestion recviewquestion41 = recviewquestion.this;
                        int unused41 = recviewquestion41.answered1 = recviewquestion41.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.putInt("ans1", recviewquestion.this.answer1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestion recviewquestion42 = recviewquestion.this;
                        int unused42 = recviewquestion42.answer2 = recviewquestion42.answer2 + 1;
                        recviewquestion recviewquestion43 = recviewquestion.this;
                        int unused43 = recviewquestion43.answered2 = recviewquestion43.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.putInt("ans2", recviewquestion.this.answer2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestion recviewquestion44 = recviewquestion.this;
                        int unused44 = recviewquestion44.answer3 = recviewquestion44.answer3 + 1;
                        recviewquestion recviewquestion45 = recviewquestion.this;
                        int unused45 = recviewquestion45.answered3 = recviewquestion45.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.putInt("ans3", recviewquestion.this.answer3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestion recviewquestion46 = recviewquestion.this;
                        int unused46 = recviewquestion46.answer4 = recviewquestion46.answer4 + 1;
                        recviewquestion recviewquestion47 = recviewquestion.this;
                        int unused47 = recviewquestion47.answered4 = recviewquestion47.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.putInt("ans4", recviewquestion.this.answer4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestion recviewquestion48 = recviewquestion.this;
                        int unused48 = recviewquestion48.answer5 = recviewquestion48.answer5 + 1;
                        recviewquestion recviewquestion49 = recviewquestion.this;
                        int unused49 = recviewquestion49.answered5 = recviewquestion49.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.putInt("ans5", recviewquestion.this.answer5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestion recviewquestion50 = recviewquestion.this;
                        int unused50 = recviewquestion50.answer6 = recviewquestion50.answer6 + 1;
                        recviewquestion recviewquestion51 = recviewquestion.this;
                        int unused51 = recviewquestion51.answered6 = recviewquestion51.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.putInt("ans6", recviewquestion.this.answer6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestion recviewquestion52 = recviewquestion.this;
                        int unused52 = recviewquestion52.answer7 = recviewquestion52.answer7 + 1;
                        recviewquestion recviewquestion53 = recviewquestion.this;
                        int unused53 = recviewquestion53.answered7 = recviewquestion53.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.putInt("ans7", recviewquestion.this.answer7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestion recviewquestion54 = recviewquestion.this;
                        int unused54 = recviewquestion54.answer8 = recviewquestion54.answer8 + 1;
                        recviewquestion recviewquestion55 = recviewquestion.this;
                        int unused55 = recviewquestion55.answered8 = recviewquestion55.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.putInt("ans8", recviewquestion.this.answer8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestion recviewquestion56 = recviewquestion.this;
                        int unused56 = recviewquestion56.answer9 = recviewquestion56.answer9 + 1;
                        recviewquestion recviewquestion57 = recviewquestion.this;
                        int unused57 = recviewquestion57.answered9 = recviewquestion57.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.putInt("ans9", recviewquestion.this.answer9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestion recviewquestion58 = recviewquestion.this;
                        int unused58 = recviewquestion58.answer10 = recviewquestion58.answer10 + 1;
                        recviewquestion recviewquestion59 = recviewquestion.this;
                        int unused59 = recviewquestion59.answered10 = recviewquestion59.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.putInt("ans10", recviewquestion.this.answer10);
                        editor.commit();
                    } else if (i6 == 11) {
                        recviewquestion recviewquestion60 = recviewquestion.this;
                        int unused60 = recviewquestion60.answer11 = recviewquestion60.answer11 + 1;
                        recviewquestion recviewquestion61 = recviewquestion.this;
                        int unused61 = recviewquestion61.answered11 = recviewquestion61.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.putInt("ans11", recviewquestion.this.answer11);
                        editor.commit();
                    } else if (i6 == 12) {
                        recviewquestion recviewquestion62 = recviewquestion.this;
                        int unused62 = recviewquestion62.answer12 = recviewquestion62.answer12 + 1;
                        recviewquestion recviewquestion63 = recviewquestion.this;
                        int unused63 = recviewquestion63.answered12 = recviewquestion63.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.putInt("ans12", recviewquestion.this.answer12);
                        editor.commit();
                    } else if (i6 == 13) {
                        recviewquestion recviewquestion64 = recviewquestion.this;
                        int unused64 = recviewquestion64.answer13 = recviewquestion64.answer13 + 1;
                        recviewquestion recviewquestion65 = recviewquestion.this;
                        int unused65 = recviewquestion65.answered13 = recviewquestion65.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.putInt("ans13", recviewquestion.this.answer13);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i7 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(i7);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        }
                        i7++;
                    }
                    int i8 = i2;
                    if (i8 == 1) {
                        recviewquestion recviewquestion66 = recviewquestion.this;
                        int unused66 = recviewquestion66.answered1 = recviewquestion66.answered1 + 1;
                        editor.putInt("answered1", recviewquestion.this.answered1);
                        editor.commit();
                    } else if (i8 == 2) {
                        recviewquestion recviewquestion67 = recviewquestion.this;
                        int unused67 = recviewquestion67.answered2 = recviewquestion67.answered2 + 1;
                        editor.putInt("answered2", recviewquestion.this.answered2);
                        editor.commit();
                    } else if (i8 == 3) {
                        recviewquestion recviewquestion68 = recviewquestion.this;
                        int unused68 = recviewquestion68.answered3 = recviewquestion68.answered3 + 1;
                        editor.putInt("answered3", recviewquestion.this.answered3);
                        editor.commit();
                    } else if (i8 == 4) {
                        recviewquestion recviewquestion69 = recviewquestion.this;
                        int unused69 = recviewquestion69.answered4 = recviewquestion69.answered4 + 1;
                        editor.putInt("answered4", recviewquestion.this.answered4);
                        editor.commit();
                    } else if (i8 == 5) {
                        recviewquestion recviewquestion70 = recviewquestion.this;
                        int unused70 = recviewquestion70.answered5 = recviewquestion70.answered5 + 1;
                        editor.putInt("answered5", recviewquestion.this.answered5);
                        editor.commit();
                    } else if (i8 == 6) {
                        recviewquestion recviewquestion71 = recviewquestion.this;
                        int unused71 = recviewquestion71.answered6 = recviewquestion71.answered6 + 1;
                        editor.putInt("answered6", recviewquestion.this.answered6);
                        editor.commit();
                    } else if (i8 == 7) {
                        recviewquestion recviewquestion72 = recviewquestion.this;
                        int unused72 = recviewquestion72.answered7 = recviewquestion72.answered7 + 1;
                        editor.putInt("answered7", recviewquestion.this.answered7);
                        editor.commit();
                    } else if (i8 == 8) {
                        recviewquestion recviewquestion73 = recviewquestion.this;
                        int unused73 = recviewquestion73.answered8 = recviewquestion73.answered8 + 1;
                        editor.putInt("answered8", recviewquestion.this.answered8);
                        editor.commit();
                    } else if (i8 == 9) {
                        recviewquestion recviewquestion74 = recviewquestion.this;
                        int unused74 = recviewquestion74.answered9 = recviewquestion74.answered9 + 1;
                        editor.putInt("answered9", recviewquestion.this.answered9);
                        editor.commit();
                    } else if (i8 == 10) {
                        recviewquestion recviewquestion75 = recviewquestion.this;
                        int unused75 = recviewquestion75.answered10 = recviewquestion75.answered10 + 1;
                        editor.putInt("answered10", recviewquestion.this.answered10);
                        editor.commit();
                    } else if (i8 == 11) {
                        recviewquestion recviewquestion76 = recviewquestion.this;
                        int unused76 = recviewquestion76.answered11 = recviewquestion76.answered11 + 1;
                        editor.putInt("answered11", recviewquestion.this.answered11);
                        editor.commit();
                    } else if (i8 == 12) {
                        recviewquestion recviewquestion77 = recviewquestion.this;
                        int unused77 = recviewquestion77.answered12 = recviewquestion77.answered12 + 1;
                        editor.putInt("answered12", recviewquestion.this.answered12);
                        editor.commit();
                    } else if (i8 == 13) {
                        recviewquestion recviewquestion78 = recviewquestion.this;
                        int unused78 = recviewquestion78.answered13 = recviewquestion78.answered13 + 1;
                        editor.putInt("answered13", recviewquestion.this.answered13);
                        editor.commit();
                    }
                    view2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                } else if (obj.equals("incorrect")) {
                    viewHolder2.rb1.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb3.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                    viewHolder2.rb4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
                }
                viewHolder2.rb1.setEnabled(false);
                viewHolder2.rb2.setEnabled(false);
                viewHolder2.rb3.setEnabled(false);
                viewHolder2.rb4.setEnabled(false);
                TransitionManager.beginDelayedTransition(viewHolder2.f616cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
    }

    public int getItemCount() {
        return this.questions.size();
    }

    public void setQuestions(ArrayList<questions> arrayList) {
        this.questions = arrayList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: cv */
        public final CardView f616cv;
        /* access modifiers changed from: private */
        public final TextView exp;
        /* access modifiers changed from: private */
        public final ImageView img;
        /* access modifiers changed from: private */
        public final ImageView imgexp;
        /* access modifiers changed from: private */

        /* renamed from: no */
        public final TextView f617no;
        /* access modifiers changed from: private */
        public final RadioButton rb1;
        /* access modifiers changed from: private */
        public final RadioButton rb2;
        /* access modifiers changed from: private */
        public final RadioButton rb3;
        /* access modifiers changed from: private */
        public final RadioButton rb4;

        /* renamed from: rg */
        private final RadioGroup f618rg;
        /* access modifiers changed from: private */

        /* renamed from: rl */
        public final RelativeLayout f619rl;
        /* access modifiers changed from: private */
        public final TextView show;
        /* access modifiers changed from: private */
        public final TextView txt;

        public ViewHolder(View view) {
            super(view);
            this.txt = (TextView) view.findViewById(C2719R.C2722id.question);
            this.f617no = (TextView) view.findViewById(C2719R.C2722id.number);
            this.exp = (TextView) view.findViewById(C2719R.C2722id.exp);
            this.rb1 = (RadioButton) view.findViewById(C2719R.C2722id.choice1);
            this.rb2 = (RadioButton) view.findViewById(C2719R.C2722id.choice2);
            this.rb3 = (RadioButton) view.findViewById(C2719R.C2722id.choice3);
            this.rb4 = (RadioButton) view.findViewById(C2719R.C2722id.choice4);
            this.imgexp = (ImageView) view.findViewById(C2719R.C2722id.imgexp);
            this.img = (ImageView) view.findViewById(C2719R.C2722id.imgquestion);
            this.show = (TextView) view.findViewById(C2719R.C2722id.explain);
            this.f619rl = (RelativeLayout) view.findViewById(C2719R.C2722id.expandable);
            this.f616cv = (CardView) view.findViewById(C2719R.C2722id.parentq);
            this.f618rg = (RadioGroup) view.findViewById(C2719R.C2722id.choice);
        }
    }
}
