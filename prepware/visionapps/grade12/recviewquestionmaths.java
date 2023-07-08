package com.visionapps.grade12;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.chrisbanes.photoview.PhotoView;
import java.util.ArrayList;

public class recviewquestionmaths extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public int answer1;
    /* access modifiers changed from: private */
    public int answer10;
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
        this.view = LayoutInflater.from(viewGroup.getContext()).inflate(C2719R.C2724layout.questionlistmaths, viewGroup, false);
        return new ViewHolder(this.view);
    }

    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(viewHolder.f620cv.getContext()).edit();
        viewHolder.f621no.setText(this.questions.get(i).getQueno());
        viewHolder.txt.setText(this.questions.get(i).getQuestion());
        viewHolder.Photo.setImageResource(this.questions.get(i).getImgquestion());
        viewHolder.rb1.setText(this.questions.get(i).getRb1());
        viewHolder.rb2.setText(this.questions.get(i).getRb2());
        viewHolder.rb3.setText(this.questions.get(i).getRb3());
        viewHolder.rb4.setText(this.questions.get(i).getRb4());
        viewHolder.exp.setText(this.questions.get(i).getExplanation());
        viewHolder.imgexp.setImageResource(this.questions.get(i).getImgexp());
        Boolean mode = this.questions.get(i).getMode();
        int part = this.questions.get(i).getPart();
        if (this.questions.get(i).getRb1().equals("")) {
            viewHolder.rb1.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb1(), 0, 0, 0);
        } else {
            viewHolder.rb1math.setImageResource(this.questions.get(i).getImgrb1());
        }
        if (this.questions.get(i).getRb2().equals("")) {
            viewHolder.rb2.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb2(), 0, 0, 0);
        } else {
            viewHolder.rb2math.setImageResource(this.questions.get(i).getImgrb2());
        }
        if (this.questions.get(i).getRb3().equals("")) {
            viewHolder.rb3.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb3(), 0, 0, 0);
        } else {
            viewHolder.rb3math.setImageResource(this.questions.get(i).getImgrb3());
        }
        if (this.questions.get(i).getRb4().equals("")) {
            viewHolder.rb4.setCompoundDrawablesWithIntrinsicBounds(this.questions.get(i).getImgrb4(), 0, 0, 0);
        } else {
            viewHolder.rb4math.setImageResource(this.questions.get(i).getImgrb4());
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
                if (viewHolder.f623rl.getVisibility() == 8) {
                    viewHolder.show.setText("Hide explanation");
                    TransitionManager.beginDelayedTransition(viewHolder.f620cv, new AutoTransition());
                    viewHolder.f623rl.setVisibility(0);
                    return;
                }
                viewHolder.show.setText("Show explanation");
                TransitionManager.beginDelayedTransition(viewHolder.f620cv, new AutoTransition());
                viewHolder.f623rl.setVisibility(8);
            }
        });
        final Boolean bool = mode;
        final int i2 = part;
        final SharedPreferences.Editor editor = edit;
        final ViewHolder viewHolder2 = viewHolder;
        viewHolder.rb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent().getParent();
                String obj = view.getTag().toString();
                String str2 = "answered4";
                if (bool.booleanValue()) {
                    int i = 0;
                    while (true) {
                        if (i > 3) {
                            str = str2;
                            break;
                        }
                        RadioGroup radioGroup2 = radioGroup;
                        RadioButton radioButton = (RadioButton) ((ViewGroup) radioGroup.getChildAt(i)).getChildAt(0);
                        if (i == 0 || (!radioButton.isChecked() && !radioButton.isSelected() && radioButton.isEnabled())) {
                            str = str2;
                        } else {
                            String obj2 = radioButton.getTag().toString();
                            if (!obj2.equals("correct") || obj2.equals("incorrect")) {
                                str = str2;
                            } else {
                                int i2 = i2;
                                if (i2 == 1) {
                                    recviewquestionmaths recviewquestionmaths = recviewquestionmaths.this;
                                    str = str2;
                                    int unused = recviewquestionmaths.answer1 = recviewquestionmaths.answer1 - 1;
                                    editor.putInt("ans1", recviewquestionmaths.this.answer1);
                                    editor.commit();
                                } else {
                                    str = str2;
                                    if (i2 == 2) {
                                        recviewquestionmaths recviewquestionmaths2 = recviewquestionmaths.this;
                                        int unused2 = recviewquestionmaths2.answer2 = recviewquestionmaths2.answer2 - 1;
                                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                                        editor.commit();
                                    } else if (i2 == 3) {
                                        recviewquestionmaths recviewquestionmaths3 = recviewquestionmaths.this;
                                        int unused3 = recviewquestionmaths3.answer3 = recviewquestionmaths3.answer3 - 1;
                                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                                        editor.commit();
                                    } else if (i2 == 4) {
                                        recviewquestionmaths recviewquestionmaths4 = recviewquestionmaths.this;
                                        int unused4 = recviewquestionmaths4.answer4 = recviewquestionmaths4.answer4 - 1;
                                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                                        editor.commit();
                                    } else if (i2 == 5) {
                                        recviewquestionmaths recviewquestionmaths5 = recviewquestionmaths.this;
                                        int unused5 = recviewquestionmaths5.answer5 = recviewquestionmaths5.answer5 - 1;
                                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                                        editor.commit();
                                    } else if (i2 == 6) {
                                        recviewquestionmaths recviewquestionmaths6 = recviewquestionmaths.this;
                                        int unused6 = recviewquestionmaths6.answer6 = recviewquestionmaths6.answer6 - 1;
                                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                                        editor.commit();
                                    } else if (i2 == 7) {
                                        recviewquestionmaths recviewquestionmaths7 = recviewquestionmaths.this;
                                        int unused7 = recviewquestionmaths7.answer7 = recviewquestionmaths7.answer7 - 1;
                                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                                        editor.commit();
                                    } else if (i2 == 8) {
                                        recviewquestionmaths recviewquestionmaths8 = recviewquestionmaths.this;
                                        int unused8 = recviewquestionmaths8.answer8 = recviewquestionmaths8.answer8 - 1;
                                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                                        editor.commit();
                                    } else if (i2 == 9) {
                                        recviewquestionmaths recviewquestionmaths9 = recviewquestionmaths.this;
                                        int unused9 = recviewquestionmaths9.answer9 = recviewquestionmaths9.answer9 - 1;
                                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                                        editor.commit();
                                    } else if (i2 == 10) {
                                        recviewquestionmaths recviewquestionmaths10 = recviewquestionmaths.this;
                                        int unused10 = recviewquestionmaths10.answer10 = recviewquestionmaths10.answer10 - 1;
                                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                                        editor.commit();
                                    }
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            radioButton.setChecked(false);
                        }
                        if (i == 3) {
                            break;
                        }
                        i++;
                        View view3 = view;
                        radioGroup = radioGroup2;
                        str2 = str;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i3 = i2;
                        if (i3 == 1) {
                            recviewquestionmaths recviewquestionmaths11 = recviewquestionmaths.this;
                            int unused11 = recviewquestionmaths11.answer1 = recviewquestionmaths11.answer1 + 1;
                            recviewquestionmaths recviewquestionmaths12 = recviewquestionmaths.this;
                            int unused12 = recviewquestionmaths12.answered1 = recviewquestionmaths12.answered1 + 1;
                            editor.putInt("answered1", recviewquestionmaths.this.answered1);
                            editor.putInt("ans1", recviewquestionmaths.this.answer1);
                            editor.commit();
                        } else if (i3 == 2) {
                            recviewquestionmaths recviewquestionmaths13 = recviewquestionmaths.this;
                            int unused13 = recviewquestionmaths13.answer2 = recviewquestionmaths13.answer2 + 1;
                            recviewquestionmaths recviewquestionmaths14 = recviewquestionmaths.this;
                            int unused14 = recviewquestionmaths14.answered2 = recviewquestionmaths14.answered2 + 1;
                            editor.putInt("answered2", recviewquestionmaths.this.answered2);
                            editor.putInt("ans2", recviewquestionmaths.this.answer2);
                            editor.commit();
                        } else if (i3 == 3) {
                            recviewquestionmaths recviewquestionmaths15 = recviewquestionmaths.this;
                            int unused15 = recviewquestionmaths15.answer3 = recviewquestionmaths15.answer3 + 1;
                            recviewquestionmaths recviewquestionmaths16 = recviewquestionmaths.this;
                            int unused16 = recviewquestionmaths16.answered3 = recviewquestionmaths16.answered3 + 1;
                            editor.putInt("answered3", recviewquestionmaths.this.answered3);
                            editor.putInt("ans3", recviewquestionmaths.this.answer3);
                            editor.commit();
                        } else if (i3 == 4) {
                            recviewquestionmaths recviewquestionmaths17 = recviewquestionmaths.this;
                            int unused17 = recviewquestionmaths17.answer4 = recviewquestionmaths17.answer4 + 1;
                            recviewquestionmaths recviewquestionmaths18 = recviewquestionmaths.this;
                            int unused18 = recviewquestionmaths18.answered4 = recviewquestionmaths18.answered4 + 1;
                            editor.putInt(str, recviewquestionmaths.this.answered4);
                            editor.putInt("ans4", recviewquestionmaths.this.answer4);
                            editor.commit();
                        } else if (i3 == 5) {
                            recviewquestionmaths recviewquestionmaths19 = recviewquestionmaths.this;
                            int unused19 = recviewquestionmaths19.answer5 = recviewquestionmaths19.answer5 + 1;
                            recviewquestionmaths recviewquestionmaths20 = recviewquestionmaths.this;
                            int unused20 = recviewquestionmaths20.answered5 = recviewquestionmaths20.answered5 + 1;
                            editor.putInt("answered5", recviewquestionmaths.this.answered5);
                            editor.putInt("ans5", recviewquestionmaths.this.answer5);
                            editor.commit();
                        } else if (i3 == 6) {
                            recviewquestionmaths recviewquestionmaths21 = recviewquestionmaths.this;
                            int unused21 = recviewquestionmaths21.answer6 = recviewquestionmaths21.answer6 + 1;
                            recviewquestionmaths recviewquestionmaths22 = recviewquestionmaths.this;
                            int unused22 = recviewquestionmaths22.answered6 = recviewquestionmaths22.answered6 + 1;
                            editor.putInt("answered6", recviewquestionmaths.this.answered6);
                            editor.putInt("ans6", recviewquestionmaths.this.answer6);
                            editor.commit();
                        } else if (i3 == 7) {
                            recviewquestionmaths recviewquestionmaths23 = recviewquestionmaths.this;
                            int unused23 = recviewquestionmaths23.answer7 = recviewquestionmaths23.answer7 + 1;
                            recviewquestionmaths recviewquestionmaths24 = recviewquestionmaths.this;
                            int unused24 = recviewquestionmaths24.answered7 = recviewquestionmaths24.answered7 + 1;
                            editor.putInt("answered7", recviewquestionmaths.this.answered7);
                            editor.putInt("ans7", recviewquestionmaths.this.answer7);
                            editor.commit();
                        } else if (i3 == 8) {
                            recviewquestionmaths recviewquestionmaths25 = recviewquestionmaths.this;
                            int unused25 = recviewquestionmaths25.answer8 = recviewquestionmaths25.answer8 + 1;
                            recviewquestionmaths recviewquestionmaths26 = recviewquestionmaths.this;
                            int unused26 = recviewquestionmaths26.answered8 = recviewquestionmaths26.answered8 + 1;
                            editor.putInt("answered8", recviewquestionmaths.this.answered8);
                            editor.putInt("ans8", recviewquestionmaths.this.answer8);
                            editor.commit();
                        } else if (i3 == 9) {
                            recviewquestionmaths recviewquestionmaths27 = recviewquestionmaths.this;
                            int unused27 = recviewquestionmaths27.answer9 = recviewquestionmaths27.answer9 + 1;
                            recviewquestionmaths recviewquestionmaths28 = recviewquestionmaths.this;
                            int unused28 = recviewquestionmaths28.answered9 = recviewquestionmaths28.answered9 + 1;
                            editor.putInt("answered9", recviewquestionmaths.this.answered9);
                            editor.putInt("ans9", recviewquestionmaths.this.answer9);
                            editor.commit();
                        } else if (i3 == 10) {
                            recviewquestionmaths recviewquestionmaths29 = recviewquestionmaths.this;
                            int unused29 = recviewquestionmaths29.answer10 = recviewquestionmaths29.answer10 + 1;
                            recviewquestionmaths recviewquestionmaths30 = recviewquestionmaths.this;
                            int unused30 = recviewquestionmaths30.answered10 = recviewquestionmaths30.answered10 + 1;
                            editor.putInt("answered10", recviewquestionmaths.this.answered10);
                            editor.putInt("ans10", recviewquestionmaths.this.answer10);
                            editor.commit();
                        }
                    }
                    View view4 = view;
                    view4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view4.setEnabled(false);
                    return;
                }
                RadioGroup radioGroup3 = radioGroup;
                String str3 = str2;
                View view5 = view2;
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i4 = i2;
                    if (i4 == 1) {
                        recviewquestionmaths recviewquestionmaths31 = recviewquestionmaths.this;
                        int unused31 = recviewquestionmaths31.answer1 = recviewquestionmaths31.answer1 + 1;
                        recviewquestionmaths recviewquestionmaths32 = recviewquestionmaths.this;
                        int unused32 = recviewquestionmaths32.answered1 = recviewquestionmaths32.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.putInt("ans1", recviewquestionmaths.this.answer1);
                        editor.commit();
                    } else if (i4 == 2) {
                        recviewquestionmaths recviewquestionmaths33 = recviewquestionmaths.this;
                        int unused33 = recviewquestionmaths33.answer2 = recviewquestionmaths33.answer2 + 1;
                        recviewquestionmaths recviewquestionmaths34 = recviewquestionmaths.this;
                        int unused34 = recviewquestionmaths34.answered2 = recviewquestionmaths34.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                        editor.commit();
                    } else if (i4 == 3) {
                        recviewquestionmaths recviewquestionmaths35 = recviewquestionmaths.this;
                        int unused35 = recviewquestionmaths35.answer3 = recviewquestionmaths35.answer3 + 1;
                        recviewquestionmaths recviewquestionmaths36 = recviewquestionmaths.this;
                        int unused36 = recviewquestionmaths36.answered3 = recviewquestionmaths36.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                        editor.commit();
                    } else if (i4 == 4) {
                        recviewquestionmaths recviewquestionmaths37 = recviewquestionmaths.this;
                        int unused37 = recviewquestionmaths37.answer4 = recviewquestionmaths37.answer4 + 1;
                        recviewquestionmaths recviewquestionmaths38 = recviewquestionmaths.this;
                        int unused38 = recviewquestionmaths38.answered4 = recviewquestionmaths38.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                        editor.commit();
                    } else if (i4 == 5) {
                        recviewquestionmaths recviewquestionmaths39 = recviewquestionmaths.this;
                        int unused39 = recviewquestionmaths39.answer5 = recviewquestionmaths39.answer5 + 1;
                        recviewquestionmaths recviewquestionmaths40 = recviewquestionmaths.this;
                        int unused40 = recviewquestionmaths40.answered5 = recviewquestionmaths40.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                        editor.commit();
                    } else if (i4 == 6) {
                        recviewquestionmaths recviewquestionmaths41 = recviewquestionmaths.this;
                        int unused41 = recviewquestionmaths41.answer6 = recviewquestionmaths41.answer6 + 1;
                        recviewquestionmaths recviewquestionmaths42 = recviewquestionmaths.this;
                        int unused42 = recviewquestionmaths42.answered6 = recviewquestionmaths42.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                        editor.commit();
                    } else if (i4 == 7) {
                        recviewquestionmaths recviewquestionmaths43 = recviewquestionmaths.this;
                        int unused43 = recviewquestionmaths43.answer7 = recviewquestionmaths43.answer7 + 1;
                        recviewquestionmaths recviewquestionmaths44 = recviewquestionmaths.this;
                        int unused44 = recviewquestionmaths44.answered7 = recviewquestionmaths44.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                        editor.commit();
                    } else if (i4 == 8) {
                        recviewquestionmaths recviewquestionmaths45 = recviewquestionmaths.this;
                        int unused45 = recviewquestionmaths45.answer8 = recviewquestionmaths45.answer8 + 1;
                        recviewquestionmaths recviewquestionmaths46 = recviewquestionmaths.this;
                        int unused46 = recviewquestionmaths46.answered8 = recviewquestionmaths46.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                        editor.commit();
                    } else if (i4 == 9) {
                        recviewquestionmaths recviewquestionmaths47 = recviewquestionmaths.this;
                        int unused47 = recviewquestionmaths47.answer9 = recviewquestionmaths47.answer9 + 1;
                        recviewquestionmaths recviewquestionmaths48 = recviewquestionmaths.this;
                        int unused48 = recviewquestionmaths48.answered9 = recviewquestionmaths48.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                        editor.commit();
                    } else if (i4 == 10) {
                        recviewquestionmaths recviewquestionmaths49 = recviewquestionmaths.this;
                        int unused49 = recviewquestionmaths49.answer10 = recviewquestionmaths49.answer10 + 1;
                        recviewquestionmaths recviewquestionmaths50 = recviewquestionmaths.this;
                        int unused50 = recviewquestionmaths50.answered10 = recviewquestionmaths50.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i5 = 0;
                    while (true) {
                        if (i5 > 4) {
                            break;
                        }
                        RadioGroup radioGroup4 = radioGroup3;
                        RadioButton radioButton2 = (RadioButton) ((ViewGroup) radioGroup4.getChildAt(i5)).getChildAt(0);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        } else {
                            i5++;
                            radioGroup3 = radioGroup4;
                        }
                    }
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestionmaths recviewquestionmaths51 = recviewquestionmaths.this;
                        int unused51 = recviewquestionmaths51.answered1 = recviewquestionmaths51.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestionmaths recviewquestionmaths52 = recviewquestionmaths.this;
                        int unused52 = recviewquestionmaths52.answered2 = recviewquestionmaths52.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestionmaths recviewquestionmaths53 = recviewquestionmaths.this;
                        int unused53 = recviewquestionmaths53.answered3 = recviewquestionmaths53.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestionmaths recviewquestionmaths54 = recviewquestionmaths.this;
                        int unused54 = recviewquestionmaths54.answered4 = recviewquestionmaths54.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestionmaths recviewquestionmaths55 = recviewquestionmaths.this;
                        int unused55 = recviewquestionmaths55.answered5 = recviewquestionmaths55.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestionmaths recviewquestionmaths56 = recviewquestionmaths.this;
                        int unused56 = recviewquestionmaths56.answered6 = recviewquestionmaths56.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestionmaths recviewquestionmaths57 = recviewquestionmaths.this;
                        int unused57 = recviewquestionmaths57.answered7 = recviewquestionmaths57.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestionmaths recviewquestionmaths58 = recviewquestionmaths.this;
                        int unused58 = recviewquestionmaths58.answered8 = recviewquestionmaths58.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestionmaths recviewquestionmaths59 = recviewquestionmaths.this;
                        int unused59 = recviewquestionmaths59.answered9 = recviewquestionmaths59.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestionmaths recviewquestionmaths60 = recviewquestionmaths.this;
                        int unused60 = recviewquestionmaths60.answered10 = recviewquestionmaths60.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.commit();
                    }
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
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
                TransitionManager.beginDelayedTransition(viewHolder2.f620cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent().getParent();
                String obj = view.getTag().toString();
                String str2 = "answered4";
                if (bool.booleanValue()) {
                    int i = 0;
                    while (true) {
                        if (i > 3) {
                            str = str2;
                            break;
                        }
                        RadioGroup radioGroup2 = radioGroup;
                        RadioButton radioButton = (RadioButton) ((ViewGroup) radioGroup.getChildAt(i)).getChildAt(0);
                        if (i == 1 || (!radioButton.isChecked() && !radioButton.isSelected() && radioButton.isEnabled())) {
                            str = str2;
                        } else {
                            String obj2 = radioButton.getTag().toString();
                            if (!obj2.equals("correct") || obj2.equals("incorrect")) {
                                str = str2;
                            } else {
                                int i2 = i2;
                                if (i2 == 1) {
                                    recviewquestionmaths recviewquestionmaths = recviewquestionmaths.this;
                                    str = str2;
                                    int unused = recviewquestionmaths.answer1 = recviewquestionmaths.answer1 - 1;
                                    editor.putInt("ans1", recviewquestionmaths.this.answer1);
                                    editor.commit();
                                } else {
                                    str = str2;
                                    if (i2 == 2) {
                                        recviewquestionmaths recviewquestionmaths2 = recviewquestionmaths.this;
                                        int unused2 = recviewquestionmaths2.answer2 = recviewquestionmaths2.answer2 - 1;
                                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                                        editor.commit();
                                    } else if (i2 == 3) {
                                        recviewquestionmaths recviewquestionmaths3 = recviewquestionmaths.this;
                                        int unused3 = recviewquestionmaths3.answer3 = recviewquestionmaths3.answer3 - 1;
                                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                                        editor.commit();
                                    } else if (i2 == 4) {
                                        recviewquestionmaths recviewquestionmaths4 = recviewquestionmaths.this;
                                        int unused4 = recviewquestionmaths4.answer4 = recviewquestionmaths4.answer4 - 1;
                                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                                        editor.commit();
                                    } else if (i2 == 5) {
                                        recviewquestionmaths recviewquestionmaths5 = recviewquestionmaths.this;
                                        int unused5 = recviewquestionmaths5.answer5 = recviewquestionmaths5.answer5 - 1;
                                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                                        editor.commit();
                                    } else if (i2 == 6) {
                                        recviewquestionmaths recviewquestionmaths6 = recviewquestionmaths.this;
                                        int unused6 = recviewquestionmaths6.answer6 = recviewquestionmaths6.answer6 - 1;
                                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                                        editor.commit();
                                    } else if (i2 == 7) {
                                        recviewquestionmaths recviewquestionmaths7 = recviewquestionmaths.this;
                                        int unused7 = recviewquestionmaths7.answer7 = recviewquestionmaths7.answer7 - 1;
                                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                                        editor.commit();
                                    } else if (i2 == 8) {
                                        recviewquestionmaths recviewquestionmaths8 = recviewquestionmaths.this;
                                        int unused8 = recviewquestionmaths8.answer8 = recviewquestionmaths8.answer8 - 1;
                                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                                        editor.commit();
                                    } else if (i2 == 9) {
                                        recviewquestionmaths recviewquestionmaths9 = recviewquestionmaths.this;
                                        int unused9 = recviewquestionmaths9.answer9 = recviewquestionmaths9.answer9 - 1;
                                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                                        editor.commit();
                                    } else if (i2 == 10) {
                                        recviewquestionmaths recviewquestionmaths10 = recviewquestionmaths.this;
                                        int unused10 = recviewquestionmaths10.answer10 = recviewquestionmaths10.answer10 - 1;
                                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                                        editor.commit();
                                    }
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            radioButton.setChecked(false);
                        }
                        if (i == 3) {
                            break;
                        }
                        i++;
                        View view3 = view;
                        radioGroup = radioGroup2;
                        str2 = str;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i3 = i2;
                        if (i3 == 1) {
                            recviewquestionmaths recviewquestionmaths11 = recviewquestionmaths.this;
                            int unused11 = recviewquestionmaths11.answer1 = recviewquestionmaths11.answer1 + 1;
                            recviewquestionmaths recviewquestionmaths12 = recviewquestionmaths.this;
                            int unused12 = recviewquestionmaths12.answered1 = recviewquestionmaths12.answered1 + 1;
                            editor.putInt("answered1", recviewquestionmaths.this.answered1);
                            editor.putInt("ans1", recviewquestionmaths.this.answer1);
                            editor.commit();
                        } else if (i3 == 2) {
                            recviewquestionmaths recviewquestionmaths13 = recviewquestionmaths.this;
                            int unused13 = recviewquestionmaths13.answer2 = recviewquestionmaths13.answer2 + 1;
                            recviewquestionmaths recviewquestionmaths14 = recviewquestionmaths.this;
                            int unused14 = recviewquestionmaths14.answered2 = recviewquestionmaths14.answered2 + 1;
                            editor.putInt("answered2", recviewquestionmaths.this.answered2);
                            editor.putInt("ans2", recviewquestionmaths.this.answer2);
                            editor.commit();
                        } else if (i3 == 3) {
                            recviewquestionmaths recviewquestionmaths15 = recviewquestionmaths.this;
                            int unused15 = recviewquestionmaths15.answer3 = recviewquestionmaths15.answer3 + 1;
                            recviewquestionmaths recviewquestionmaths16 = recviewquestionmaths.this;
                            int unused16 = recviewquestionmaths16.answered3 = recviewquestionmaths16.answered3 + 1;
                            editor.putInt("answered3", recviewquestionmaths.this.answered3);
                            editor.putInt("ans3", recviewquestionmaths.this.answer3);
                            editor.commit();
                        } else if (i3 == 4) {
                            recviewquestionmaths recviewquestionmaths17 = recviewquestionmaths.this;
                            int unused17 = recviewquestionmaths17.answer4 = recviewquestionmaths17.answer4 + 1;
                            recviewquestionmaths recviewquestionmaths18 = recviewquestionmaths.this;
                            int unused18 = recviewquestionmaths18.answered4 = recviewquestionmaths18.answered4 + 1;
                            editor.putInt(str, recviewquestionmaths.this.answered4);
                            editor.putInt("ans4", recviewquestionmaths.this.answer4);
                            editor.commit();
                        } else if (i3 == 5) {
                            recviewquestionmaths recviewquestionmaths19 = recviewquestionmaths.this;
                            int unused19 = recviewquestionmaths19.answer5 = recviewquestionmaths19.answer5 + 1;
                            recviewquestionmaths recviewquestionmaths20 = recviewquestionmaths.this;
                            int unused20 = recviewquestionmaths20.answered5 = recviewquestionmaths20.answered5 + 1;
                            editor.putInt("answered5", recviewquestionmaths.this.answered5);
                            editor.putInt("ans5", recviewquestionmaths.this.answer5);
                            editor.commit();
                        } else if (i3 == 6) {
                            recviewquestionmaths recviewquestionmaths21 = recviewquestionmaths.this;
                            int unused21 = recviewquestionmaths21.answer6 = recviewquestionmaths21.answer6 + 1;
                            recviewquestionmaths recviewquestionmaths22 = recviewquestionmaths.this;
                            int unused22 = recviewquestionmaths22.answered6 = recviewquestionmaths22.answered6 + 1;
                            editor.putInt("answered6", recviewquestionmaths.this.answered6);
                            editor.putInt("ans6", recviewquestionmaths.this.answer6);
                            editor.commit();
                        } else if (i3 == 7) {
                            recviewquestionmaths recviewquestionmaths23 = recviewquestionmaths.this;
                            int unused23 = recviewquestionmaths23.answer7 = recviewquestionmaths23.answer7 + 1;
                            recviewquestionmaths recviewquestionmaths24 = recviewquestionmaths.this;
                            int unused24 = recviewquestionmaths24.answered7 = recviewquestionmaths24.answered7 + 1;
                            editor.putInt("answered7", recviewquestionmaths.this.answered7);
                            editor.putInt("ans7", recviewquestionmaths.this.answer7);
                            editor.commit();
                        } else if (i3 == 8) {
                            recviewquestionmaths recviewquestionmaths25 = recviewquestionmaths.this;
                            int unused25 = recviewquestionmaths25.answer8 = recviewquestionmaths25.answer8 + 1;
                            recviewquestionmaths recviewquestionmaths26 = recviewquestionmaths.this;
                            int unused26 = recviewquestionmaths26.answered8 = recviewquestionmaths26.answered8 + 1;
                            editor.putInt("answered8", recviewquestionmaths.this.answered8);
                            editor.putInt("ans8", recviewquestionmaths.this.answer8);
                            editor.commit();
                        } else if (i3 == 9) {
                            recviewquestionmaths recviewquestionmaths27 = recviewquestionmaths.this;
                            int unused27 = recviewquestionmaths27.answer9 = recviewquestionmaths27.answer9 + 1;
                            recviewquestionmaths recviewquestionmaths28 = recviewquestionmaths.this;
                            int unused28 = recviewquestionmaths28.answered9 = recviewquestionmaths28.answered9 + 1;
                            editor.putInt("answered9", recviewquestionmaths.this.answered9);
                            editor.putInt("ans9", recviewquestionmaths.this.answer9);
                            editor.commit();
                        } else if (i3 == 10) {
                            recviewquestionmaths recviewquestionmaths29 = recviewquestionmaths.this;
                            int unused29 = recviewquestionmaths29.answer10 = recviewquestionmaths29.answer10 + 1;
                            recviewquestionmaths recviewquestionmaths30 = recviewquestionmaths.this;
                            int unused30 = recviewquestionmaths30.answered10 = recviewquestionmaths30.answered10 + 1;
                            editor.putInt("answered10", recviewquestionmaths.this.answered10);
                            editor.putInt("ans10", recviewquestionmaths.this.answer10);
                            editor.commit();
                        }
                    }
                    View view4 = view;
                    view4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view4.setEnabled(false);
                    return;
                }
                RadioGroup radioGroup3 = radioGroup;
                String str3 = str2;
                View view5 = view2;
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i4 = i2;
                    if (i4 == 1) {
                        recviewquestionmaths recviewquestionmaths31 = recviewquestionmaths.this;
                        int unused31 = recviewquestionmaths31.answer1 = recviewquestionmaths31.answer1 + 1;
                        recviewquestionmaths recviewquestionmaths32 = recviewquestionmaths.this;
                        int unused32 = recviewquestionmaths32.answered1 = recviewquestionmaths32.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.putInt("ans1", recviewquestionmaths.this.answer1);
                        editor.commit();
                    } else if (i4 == 2) {
                        recviewquestionmaths recviewquestionmaths33 = recviewquestionmaths.this;
                        int unused33 = recviewquestionmaths33.answer2 = recviewquestionmaths33.answer2 + 1;
                        recviewquestionmaths recviewquestionmaths34 = recviewquestionmaths.this;
                        int unused34 = recviewquestionmaths34.answered2 = recviewquestionmaths34.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                        editor.commit();
                    } else if (i4 == 3) {
                        recviewquestionmaths recviewquestionmaths35 = recviewquestionmaths.this;
                        int unused35 = recviewquestionmaths35.answer3 = recviewquestionmaths35.answer3 + 1;
                        recviewquestionmaths recviewquestionmaths36 = recviewquestionmaths.this;
                        int unused36 = recviewquestionmaths36.answered3 = recviewquestionmaths36.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                        editor.commit();
                    } else if (i4 == 4) {
                        recviewquestionmaths recviewquestionmaths37 = recviewquestionmaths.this;
                        int unused37 = recviewquestionmaths37.answer4 = recviewquestionmaths37.answer4 + 1;
                        recviewquestionmaths recviewquestionmaths38 = recviewquestionmaths.this;
                        int unused38 = recviewquestionmaths38.answered4 = recviewquestionmaths38.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                        editor.commit();
                    } else if (i4 == 5) {
                        recviewquestionmaths recviewquestionmaths39 = recviewquestionmaths.this;
                        int unused39 = recviewquestionmaths39.answer5 = recviewquestionmaths39.answer5 + 1;
                        recviewquestionmaths recviewquestionmaths40 = recviewquestionmaths.this;
                        int unused40 = recviewquestionmaths40.answered5 = recviewquestionmaths40.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                        editor.commit();
                    } else if (i4 == 6) {
                        recviewquestionmaths recviewquestionmaths41 = recviewquestionmaths.this;
                        int unused41 = recviewquestionmaths41.answer6 = recviewquestionmaths41.answer6 + 1;
                        recviewquestionmaths recviewquestionmaths42 = recviewquestionmaths.this;
                        int unused42 = recviewquestionmaths42.answered6 = recviewquestionmaths42.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                        editor.commit();
                    } else if (i4 == 7) {
                        recviewquestionmaths recviewquestionmaths43 = recviewquestionmaths.this;
                        int unused43 = recviewquestionmaths43.answer7 = recviewquestionmaths43.answer7 + 1;
                        recviewquestionmaths recviewquestionmaths44 = recviewquestionmaths.this;
                        int unused44 = recviewquestionmaths44.answered7 = recviewquestionmaths44.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                        editor.commit();
                    } else if (i4 == 8) {
                        recviewquestionmaths recviewquestionmaths45 = recviewquestionmaths.this;
                        int unused45 = recviewquestionmaths45.answer8 = recviewquestionmaths45.answer8 + 1;
                        recviewquestionmaths recviewquestionmaths46 = recviewquestionmaths.this;
                        int unused46 = recviewquestionmaths46.answered8 = recviewquestionmaths46.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                        editor.commit();
                    } else if (i4 == 9) {
                        recviewquestionmaths recviewquestionmaths47 = recviewquestionmaths.this;
                        int unused47 = recviewquestionmaths47.answer9 = recviewquestionmaths47.answer9 + 1;
                        recviewquestionmaths recviewquestionmaths48 = recviewquestionmaths.this;
                        int unused48 = recviewquestionmaths48.answered9 = recviewquestionmaths48.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                        editor.commit();
                    } else if (i4 == 10) {
                        recviewquestionmaths recviewquestionmaths49 = recviewquestionmaths.this;
                        int unused49 = recviewquestionmaths49.answer10 = recviewquestionmaths49.answer10 + 1;
                        recviewquestionmaths recviewquestionmaths50 = recviewquestionmaths.this;
                        int unused50 = recviewquestionmaths50.answered10 = recviewquestionmaths50.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i5 = 0;
                    while (true) {
                        if (i5 > 4) {
                            break;
                        }
                        RadioGroup radioGroup4 = radioGroup3;
                        RadioButton radioButton2 = (RadioButton) ((ViewGroup) radioGroup4.getChildAt(i5)).getChildAt(0);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        } else {
                            i5++;
                            radioGroup3 = radioGroup4;
                        }
                    }
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestionmaths recviewquestionmaths51 = recviewquestionmaths.this;
                        int unused51 = recviewquestionmaths51.answered1 = recviewquestionmaths51.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestionmaths recviewquestionmaths52 = recviewquestionmaths.this;
                        int unused52 = recviewquestionmaths52.answered2 = recviewquestionmaths52.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestionmaths recviewquestionmaths53 = recviewquestionmaths.this;
                        int unused53 = recviewquestionmaths53.answered3 = recviewquestionmaths53.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestionmaths recviewquestionmaths54 = recviewquestionmaths.this;
                        int unused54 = recviewquestionmaths54.answered4 = recviewquestionmaths54.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestionmaths recviewquestionmaths55 = recviewquestionmaths.this;
                        int unused55 = recviewquestionmaths55.answered5 = recviewquestionmaths55.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestionmaths recviewquestionmaths56 = recviewquestionmaths.this;
                        int unused56 = recviewquestionmaths56.answered6 = recviewquestionmaths56.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestionmaths recviewquestionmaths57 = recviewquestionmaths.this;
                        int unused57 = recviewquestionmaths57.answered7 = recviewquestionmaths57.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestionmaths recviewquestionmaths58 = recviewquestionmaths.this;
                        int unused58 = recviewquestionmaths58.answered8 = recviewquestionmaths58.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestionmaths recviewquestionmaths59 = recviewquestionmaths.this;
                        int unused59 = recviewquestionmaths59.answered9 = recviewquestionmaths59.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestionmaths recviewquestionmaths60 = recviewquestionmaths.this;
                        int unused60 = recviewquestionmaths60.answered10 = recviewquestionmaths60.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.commit();
                    }
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
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
                TransitionManager.beginDelayedTransition(viewHolder2.f620cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent().getParent();
                String obj = view.getTag().toString();
                String str2 = "answered4";
                if (bool.booleanValue()) {
                    int i = 0;
                    while (true) {
                        if (i > 3) {
                            str = str2;
                            break;
                        }
                        RadioGroup radioGroup2 = radioGroup;
                        RadioButton radioButton = (RadioButton) ((ViewGroup) radioGroup.getChildAt(i)).getChildAt(0);
                        if (i == 2 || (!radioButton.isChecked() && !radioButton.isSelected() && radioButton.isEnabled())) {
                            str = str2;
                        } else {
                            String obj2 = radioButton.getTag().toString();
                            if (!obj2.equals("correct") || obj2.equals("incorrect")) {
                                str = str2;
                            } else {
                                int i2 = i2;
                                if (i2 == 1) {
                                    recviewquestionmaths recviewquestionmaths = recviewquestionmaths.this;
                                    str = str2;
                                    int unused = recviewquestionmaths.answer1 = recviewquestionmaths.answer1 - 1;
                                    editor.putInt("ans1", recviewquestionmaths.this.answer1);
                                    editor.commit();
                                } else {
                                    str = str2;
                                    if (i2 == 2) {
                                        recviewquestionmaths recviewquestionmaths2 = recviewquestionmaths.this;
                                        int unused2 = recviewquestionmaths2.answer2 = recviewquestionmaths2.answer2 - 1;
                                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                                        editor.commit();
                                    } else if (i2 == 3) {
                                        recviewquestionmaths recviewquestionmaths3 = recviewquestionmaths.this;
                                        int unused3 = recviewquestionmaths3.answer3 = recviewquestionmaths3.answer3 - 1;
                                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                                        editor.commit();
                                    } else if (i2 == 4) {
                                        recviewquestionmaths recviewquestionmaths4 = recviewquestionmaths.this;
                                        int unused4 = recviewquestionmaths4.answer4 = recviewquestionmaths4.answer4 - 1;
                                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                                        editor.commit();
                                    } else if (i2 == 5) {
                                        recviewquestionmaths recviewquestionmaths5 = recviewquestionmaths.this;
                                        int unused5 = recviewquestionmaths5.answer5 = recviewquestionmaths5.answer5 - 1;
                                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                                        editor.commit();
                                    } else if (i2 == 6) {
                                        recviewquestionmaths recviewquestionmaths6 = recviewquestionmaths.this;
                                        int unused6 = recviewquestionmaths6.answer6 = recviewquestionmaths6.answer6 - 1;
                                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                                        editor.commit();
                                    } else if (i2 == 7) {
                                        recviewquestionmaths recviewquestionmaths7 = recviewquestionmaths.this;
                                        int unused7 = recviewquestionmaths7.answer7 = recviewquestionmaths7.answer7 - 1;
                                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                                        editor.commit();
                                    } else if (i2 == 8) {
                                        recviewquestionmaths recviewquestionmaths8 = recviewquestionmaths.this;
                                        int unused8 = recviewquestionmaths8.answer8 = recviewquestionmaths8.answer8 - 1;
                                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                                        editor.commit();
                                    } else if (i2 == 9) {
                                        recviewquestionmaths recviewquestionmaths9 = recviewquestionmaths.this;
                                        int unused9 = recviewquestionmaths9.answer9 = recviewquestionmaths9.answer9 - 1;
                                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                                        editor.commit();
                                    } else if (i2 == 10) {
                                        recviewquestionmaths recviewquestionmaths10 = recviewquestionmaths.this;
                                        int unused10 = recviewquestionmaths10.answer10 = recviewquestionmaths10.answer10 - 1;
                                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                                        editor.commit();
                                    }
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            radioButton.setChecked(false);
                        }
                        if (i == 3) {
                            break;
                        }
                        i++;
                        View view3 = view;
                        radioGroup = radioGroup2;
                        str2 = str;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i3 = i2;
                        if (i3 == 1) {
                            recviewquestionmaths recviewquestionmaths11 = recviewquestionmaths.this;
                            int unused11 = recviewquestionmaths11.answer1 = recviewquestionmaths11.answer1 + 1;
                            recviewquestionmaths recviewquestionmaths12 = recviewquestionmaths.this;
                            int unused12 = recviewquestionmaths12.answered1 = recviewquestionmaths12.answered1 + 1;
                            editor.putInt("answered1", recviewquestionmaths.this.answered1);
                            editor.putInt("ans1", recviewquestionmaths.this.answer1);
                            editor.commit();
                        } else if (i3 == 2) {
                            recviewquestionmaths recviewquestionmaths13 = recviewquestionmaths.this;
                            int unused13 = recviewquestionmaths13.answer2 = recviewquestionmaths13.answer2 + 1;
                            recviewquestionmaths recviewquestionmaths14 = recviewquestionmaths.this;
                            int unused14 = recviewquestionmaths14.answered2 = recviewquestionmaths14.answered2 + 1;
                            editor.putInt("answered2", recviewquestionmaths.this.answered2);
                            editor.putInt("ans2", recviewquestionmaths.this.answer2);
                            editor.commit();
                        } else if (i3 == 3) {
                            recviewquestionmaths recviewquestionmaths15 = recviewquestionmaths.this;
                            int unused15 = recviewquestionmaths15.answer3 = recviewquestionmaths15.answer3 + 1;
                            recviewquestionmaths recviewquestionmaths16 = recviewquestionmaths.this;
                            int unused16 = recviewquestionmaths16.answered3 = recviewquestionmaths16.answered3 + 1;
                            editor.putInt("answered3", recviewquestionmaths.this.answered3);
                            editor.putInt("ans3", recviewquestionmaths.this.answer3);
                            editor.commit();
                        } else if (i3 == 4) {
                            recviewquestionmaths recviewquestionmaths17 = recviewquestionmaths.this;
                            int unused17 = recviewquestionmaths17.answer4 = recviewquestionmaths17.answer4 + 1;
                            recviewquestionmaths recviewquestionmaths18 = recviewquestionmaths.this;
                            int unused18 = recviewquestionmaths18.answered4 = recviewquestionmaths18.answered4 + 1;
                            editor.putInt(str, recviewquestionmaths.this.answered4);
                            editor.putInt("ans4", recviewquestionmaths.this.answer4);
                            editor.commit();
                        } else if (i3 == 5) {
                            recviewquestionmaths recviewquestionmaths19 = recviewquestionmaths.this;
                            int unused19 = recviewquestionmaths19.answer5 = recviewquestionmaths19.answer5 + 1;
                            recviewquestionmaths recviewquestionmaths20 = recviewquestionmaths.this;
                            int unused20 = recviewquestionmaths20.answered5 = recviewquestionmaths20.answered5 + 1;
                            editor.putInt("answered5", recviewquestionmaths.this.answered5);
                            editor.putInt("ans5", recviewquestionmaths.this.answer5);
                            editor.commit();
                        } else if (i3 == 6) {
                            recviewquestionmaths recviewquestionmaths21 = recviewquestionmaths.this;
                            int unused21 = recviewquestionmaths21.answer6 = recviewquestionmaths21.answer6 + 1;
                            recviewquestionmaths recviewquestionmaths22 = recviewquestionmaths.this;
                            int unused22 = recviewquestionmaths22.answered6 = recviewquestionmaths22.answered6 + 1;
                            editor.putInt("answered6", recviewquestionmaths.this.answered6);
                            editor.putInt("ans6", recviewquestionmaths.this.answer6);
                            editor.commit();
                        } else if (i3 == 7) {
                            recviewquestionmaths recviewquestionmaths23 = recviewquestionmaths.this;
                            int unused23 = recviewquestionmaths23.answer7 = recviewquestionmaths23.answer7 + 1;
                            recviewquestionmaths recviewquestionmaths24 = recviewquestionmaths.this;
                            int unused24 = recviewquestionmaths24.answered7 = recviewquestionmaths24.answered7 + 1;
                            editor.putInt("answered7", recviewquestionmaths.this.answered7);
                            editor.putInt("ans7", recviewquestionmaths.this.answer7);
                            editor.commit();
                        } else if (i3 == 8) {
                            recviewquestionmaths recviewquestionmaths25 = recviewquestionmaths.this;
                            int unused25 = recviewquestionmaths25.answer8 = recviewquestionmaths25.answer8 + 1;
                            recviewquestionmaths recviewquestionmaths26 = recviewquestionmaths.this;
                            int unused26 = recviewquestionmaths26.answered8 = recviewquestionmaths26.answered8 + 1;
                            editor.putInt("answered8", recviewquestionmaths.this.answered8);
                            editor.putInt("ans8", recviewquestionmaths.this.answer8);
                            editor.commit();
                        } else if (i3 == 9) {
                            recviewquestionmaths recviewquestionmaths27 = recviewquestionmaths.this;
                            int unused27 = recviewquestionmaths27.answer9 = recviewquestionmaths27.answer9 + 1;
                            recviewquestionmaths recviewquestionmaths28 = recviewquestionmaths.this;
                            int unused28 = recviewquestionmaths28.answered9 = recviewquestionmaths28.answered9 + 1;
                            editor.putInt("answered9", recviewquestionmaths.this.answered9);
                            editor.putInt("ans9", recviewquestionmaths.this.answer9);
                            editor.commit();
                        } else if (i3 == 10) {
                            recviewquestionmaths recviewquestionmaths29 = recviewquestionmaths.this;
                            int unused29 = recviewquestionmaths29.answer10 = recviewquestionmaths29.answer10 + 1;
                            recviewquestionmaths recviewquestionmaths30 = recviewquestionmaths.this;
                            int unused30 = recviewquestionmaths30.answered10 = recviewquestionmaths30.answered10 + 1;
                            editor.putInt("answered10", recviewquestionmaths.this.answered10);
                            editor.putInt("ans10", recviewquestionmaths.this.answer10);
                            editor.commit();
                        }
                    }
                    View view4 = view;
                    view4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view4.setEnabled(false);
                    return;
                }
                RadioGroup radioGroup3 = radioGroup;
                String str3 = str2;
                View view5 = view2;
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i4 = i2;
                    if (i4 == 1) {
                        recviewquestionmaths recviewquestionmaths31 = recviewquestionmaths.this;
                        int unused31 = recviewquestionmaths31.answer1 = recviewquestionmaths31.answer1 + 1;
                        recviewquestionmaths recviewquestionmaths32 = recviewquestionmaths.this;
                        int unused32 = recviewquestionmaths32.answered1 = recviewquestionmaths32.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.putInt("ans1", recviewquestionmaths.this.answer1);
                        editor.commit();
                    } else if (i4 == 2) {
                        recviewquestionmaths recviewquestionmaths33 = recviewquestionmaths.this;
                        int unused33 = recviewquestionmaths33.answer2 = recviewquestionmaths33.answer2 + 1;
                        recviewquestionmaths recviewquestionmaths34 = recviewquestionmaths.this;
                        int unused34 = recviewquestionmaths34.answered2 = recviewquestionmaths34.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                        editor.commit();
                    } else if (i4 == 3) {
                        recviewquestionmaths recviewquestionmaths35 = recviewquestionmaths.this;
                        int unused35 = recviewquestionmaths35.answer3 = recviewquestionmaths35.answer3 + 1;
                        recviewquestionmaths recviewquestionmaths36 = recviewquestionmaths.this;
                        int unused36 = recviewquestionmaths36.answered3 = recviewquestionmaths36.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                        editor.commit();
                    } else if (i4 == 4) {
                        recviewquestionmaths recviewquestionmaths37 = recviewquestionmaths.this;
                        int unused37 = recviewquestionmaths37.answer4 = recviewquestionmaths37.answer4 + 1;
                        recviewquestionmaths recviewquestionmaths38 = recviewquestionmaths.this;
                        int unused38 = recviewquestionmaths38.answered4 = recviewquestionmaths38.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                        editor.commit();
                    } else if (i4 == 5) {
                        recviewquestionmaths recviewquestionmaths39 = recviewquestionmaths.this;
                        int unused39 = recviewquestionmaths39.answer5 = recviewquestionmaths39.answer5 + 1;
                        recviewquestionmaths recviewquestionmaths40 = recviewquestionmaths.this;
                        int unused40 = recviewquestionmaths40.answered5 = recviewquestionmaths40.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                        editor.commit();
                    } else if (i4 == 6) {
                        recviewquestionmaths recviewquestionmaths41 = recviewquestionmaths.this;
                        int unused41 = recviewquestionmaths41.answer6 = recviewquestionmaths41.answer6 + 1;
                        recviewquestionmaths recviewquestionmaths42 = recviewquestionmaths.this;
                        int unused42 = recviewquestionmaths42.answered6 = recviewquestionmaths42.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                        editor.commit();
                    } else if (i4 == 7) {
                        recviewquestionmaths recviewquestionmaths43 = recviewquestionmaths.this;
                        int unused43 = recviewquestionmaths43.answer7 = recviewquestionmaths43.answer7 + 1;
                        recviewquestionmaths recviewquestionmaths44 = recviewquestionmaths.this;
                        int unused44 = recviewquestionmaths44.answered7 = recviewquestionmaths44.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                        editor.commit();
                    } else if (i4 == 8) {
                        recviewquestionmaths recviewquestionmaths45 = recviewquestionmaths.this;
                        int unused45 = recviewquestionmaths45.answer8 = recviewquestionmaths45.answer8 + 1;
                        recviewquestionmaths recviewquestionmaths46 = recviewquestionmaths.this;
                        int unused46 = recviewquestionmaths46.answered8 = recviewquestionmaths46.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                        editor.commit();
                    } else if (i4 == 9) {
                        recviewquestionmaths recviewquestionmaths47 = recviewquestionmaths.this;
                        int unused47 = recviewquestionmaths47.answer9 = recviewquestionmaths47.answer9 + 1;
                        recviewquestionmaths recviewquestionmaths48 = recviewquestionmaths.this;
                        int unused48 = recviewquestionmaths48.answered9 = recviewquestionmaths48.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                        editor.commit();
                    } else if (i4 == 10) {
                        recviewquestionmaths recviewquestionmaths49 = recviewquestionmaths.this;
                        int unused49 = recviewquestionmaths49.answer10 = recviewquestionmaths49.answer10 + 1;
                        recviewquestionmaths recviewquestionmaths50 = recviewquestionmaths.this;
                        int unused50 = recviewquestionmaths50.answered10 = recviewquestionmaths50.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i5 = 0;
                    while (true) {
                        if (i5 > 4) {
                            break;
                        }
                        RadioGroup radioGroup4 = radioGroup3;
                        RadioButton radioButton2 = (RadioButton) ((ViewGroup) radioGroup4.getChildAt(i5)).getChildAt(0);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        } else {
                            i5++;
                            radioGroup3 = radioGroup4;
                        }
                    }
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestionmaths recviewquestionmaths51 = recviewquestionmaths.this;
                        int unused51 = recviewquestionmaths51.answered1 = recviewquestionmaths51.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestionmaths recviewquestionmaths52 = recviewquestionmaths.this;
                        int unused52 = recviewquestionmaths52.answered2 = recviewquestionmaths52.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestionmaths recviewquestionmaths53 = recviewquestionmaths.this;
                        int unused53 = recviewquestionmaths53.answered3 = recviewquestionmaths53.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestionmaths recviewquestionmaths54 = recviewquestionmaths.this;
                        int unused54 = recviewquestionmaths54.answered4 = recviewquestionmaths54.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestionmaths recviewquestionmaths55 = recviewquestionmaths.this;
                        int unused55 = recviewquestionmaths55.answered5 = recviewquestionmaths55.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestionmaths recviewquestionmaths56 = recviewquestionmaths.this;
                        int unused56 = recviewquestionmaths56.answered6 = recviewquestionmaths56.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestionmaths recviewquestionmaths57 = recviewquestionmaths.this;
                        int unused57 = recviewquestionmaths57.answered7 = recviewquestionmaths57.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestionmaths recviewquestionmaths58 = recviewquestionmaths.this;
                        int unused58 = recviewquestionmaths58.answered8 = recviewquestionmaths58.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestionmaths recviewquestionmaths59 = recviewquestionmaths.this;
                        int unused59 = recviewquestionmaths59.answered9 = recviewquestionmaths59.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestionmaths recviewquestionmaths60 = recviewquestionmaths.this;
                        int unused60 = recviewquestionmaths60.answered10 = recviewquestionmaths60.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.commit();
                    }
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
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
                TransitionManager.beginDelayedTransition(viewHolder2.f620cv, new AutoTransition());
                viewHolder2.show.setVisibility(0);
            }
        });
        viewHolder.rb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                View view2 = view;
                RadioGroup radioGroup = (RadioGroup) view.getParent().getParent();
                String obj = view.getTag().toString();
                String str2 = "answered4";
                if (bool.booleanValue()) {
                    int i = 0;
                    while (true) {
                        if (i > 3) {
                            str = str2;
                            break;
                        }
                        RadioGroup radioGroup2 = radioGroup;
                        RadioButton radioButton = (RadioButton) ((ViewGroup) radioGroup.getChildAt(i)).getChildAt(0);
                        if (i == 3 || (!radioButton.isChecked() && !radioButton.isSelected() && radioButton.isEnabled())) {
                            str = str2;
                        } else {
                            String obj2 = radioButton.getTag().toString();
                            if (!obj2.equals("correct") || obj2.equals("incorrect")) {
                                str = str2;
                            } else {
                                int i2 = i2;
                                if (i2 == 1) {
                                    recviewquestionmaths recviewquestionmaths = recviewquestionmaths.this;
                                    str = str2;
                                    int unused = recviewquestionmaths.answer1 = recviewquestionmaths.answer1 - 1;
                                    editor.putInt("ans1", recviewquestionmaths.this.answer1);
                                    editor.commit();
                                } else {
                                    str = str2;
                                    if (i2 == 2) {
                                        recviewquestionmaths recviewquestionmaths2 = recviewquestionmaths.this;
                                        int unused2 = recviewquestionmaths2.answer2 = recviewquestionmaths2.answer2 - 1;
                                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                                        editor.commit();
                                    } else if (i2 == 3) {
                                        recviewquestionmaths recviewquestionmaths3 = recviewquestionmaths.this;
                                        int unused3 = recviewquestionmaths3.answer3 = recviewquestionmaths3.answer3 - 1;
                                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                                        editor.commit();
                                    } else if (i2 == 4) {
                                        recviewquestionmaths recviewquestionmaths4 = recviewquestionmaths.this;
                                        int unused4 = recviewquestionmaths4.answer4 = recviewquestionmaths4.answer4 - 1;
                                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                                        editor.commit();
                                    } else if (i2 == 5) {
                                        recviewquestionmaths recviewquestionmaths5 = recviewquestionmaths.this;
                                        int unused5 = recviewquestionmaths5.answer5 = recviewquestionmaths5.answer5 - 1;
                                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                                        editor.commit();
                                    } else if (i2 == 6) {
                                        recviewquestionmaths recviewquestionmaths6 = recviewquestionmaths.this;
                                        int unused6 = recviewquestionmaths6.answer6 = recviewquestionmaths6.answer6 - 1;
                                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                                        editor.commit();
                                    } else if (i2 == 7) {
                                        recviewquestionmaths recviewquestionmaths7 = recviewquestionmaths.this;
                                        int unused7 = recviewquestionmaths7.answer7 = recviewquestionmaths7.answer7 - 1;
                                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                                        editor.commit();
                                    } else if (i2 == 8) {
                                        recviewquestionmaths recviewquestionmaths8 = recviewquestionmaths.this;
                                        int unused8 = recviewquestionmaths8.answer8 = recviewquestionmaths8.answer8 - 1;
                                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                                        editor.commit();
                                    } else if (i2 == 9) {
                                        recviewquestionmaths recviewquestionmaths9 = recviewquestionmaths.this;
                                        int unused9 = recviewquestionmaths9.answer9 = recviewquestionmaths9.answer9 - 1;
                                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                                        editor.commit();
                                    } else if (i2 == 10) {
                                        recviewquestionmaths recviewquestionmaths10 = recviewquestionmaths.this;
                                        int unused10 = recviewquestionmaths10.answer10 = recviewquestionmaths10.answer10 - 1;
                                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                                        editor.commit();
                                    }
                                }
                            }
                            radioButton.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.white));
                            radioButton.setEnabled(true);
                            radioButton.setChecked(false);
                        }
                        if (i == 3) {
                            break;
                        }
                        i++;
                        View view3 = view;
                        str2 = str;
                        radioGroup = radioGroup2;
                    }
                    if (obj.equals("correct") && !obj.equals("incorrect")) {
                        int i3 = i2;
                        if (i3 == 1) {
                            recviewquestionmaths recviewquestionmaths11 = recviewquestionmaths.this;
                            int unused11 = recviewquestionmaths11.answer1 = recviewquestionmaths11.answer1 + 1;
                            recviewquestionmaths recviewquestionmaths12 = recviewquestionmaths.this;
                            int unused12 = recviewquestionmaths12.answered1 = recviewquestionmaths12.answered1 + 1;
                            editor.putInt("answered1", recviewquestionmaths.this.answered1);
                            editor.putInt("ans1", recviewquestionmaths.this.answer1);
                            editor.commit();
                        } else if (i3 == 2) {
                            recviewquestionmaths recviewquestionmaths13 = recviewquestionmaths.this;
                            int unused13 = recviewquestionmaths13.answer2 = recviewquestionmaths13.answer2 + 1;
                            recviewquestionmaths recviewquestionmaths14 = recviewquestionmaths.this;
                            int unused14 = recviewquestionmaths14.answered2 = recviewquestionmaths14.answered2 + 1;
                            editor.putInt("answered2", recviewquestionmaths.this.answered2);
                            editor.putInt("ans2", recviewquestionmaths.this.answer2);
                            editor.commit();
                        } else if (i3 == 3) {
                            recviewquestionmaths recviewquestionmaths15 = recviewquestionmaths.this;
                            int unused15 = recviewquestionmaths15.answer3 = recviewquestionmaths15.answer3 + 1;
                            recviewquestionmaths recviewquestionmaths16 = recviewquestionmaths.this;
                            int unused16 = recviewquestionmaths16.answered3 = recviewquestionmaths16.answered3 + 1;
                            editor.putInt("answered3", recviewquestionmaths.this.answered3);
                            editor.putInt("ans3", recviewquestionmaths.this.answer3);
                            editor.commit();
                        } else if (i3 == 4) {
                            recviewquestionmaths recviewquestionmaths17 = recviewquestionmaths.this;
                            int unused17 = recviewquestionmaths17.answer4 = recviewquestionmaths17.answer4 + 1;
                            recviewquestionmaths recviewquestionmaths18 = recviewquestionmaths.this;
                            int unused18 = recviewquestionmaths18.answered4 = recviewquestionmaths18.answered4 + 1;
                            editor.putInt(str, recviewquestionmaths.this.answered4);
                            editor.putInt("ans4", recviewquestionmaths.this.answer4);
                            editor.commit();
                        } else if (i3 == 5) {
                            recviewquestionmaths recviewquestionmaths19 = recviewquestionmaths.this;
                            int unused19 = recviewquestionmaths19.answer5 = recviewquestionmaths19.answer5 + 1;
                            recviewquestionmaths recviewquestionmaths20 = recviewquestionmaths.this;
                            int unused20 = recviewquestionmaths20.answered5 = recviewquestionmaths20.answered5 + 1;
                            editor.putInt("answered5", recviewquestionmaths.this.answered5);
                            editor.putInt("ans5", recviewquestionmaths.this.answer5);
                            editor.commit();
                        } else if (i3 == 6) {
                            recviewquestionmaths recviewquestionmaths21 = recviewquestionmaths.this;
                            int unused21 = recviewquestionmaths21.answer6 = recviewquestionmaths21.answer6 + 1;
                            recviewquestionmaths recviewquestionmaths22 = recviewquestionmaths.this;
                            int unused22 = recviewquestionmaths22.answered6 = recviewquestionmaths22.answered6 + 1;
                            editor.putInt("answered6", recviewquestionmaths.this.answered6);
                            editor.putInt("ans6", recviewquestionmaths.this.answer6);
                            editor.commit();
                        } else if (i3 == 7) {
                            recviewquestionmaths recviewquestionmaths23 = recviewquestionmaths.this;
                            int unused23 = recviewquestionmaths23.answer7 = recviewquestionmaths23.answer7 + 1;
                            recviewquestionmaths recviewquestionmaths24 = recviewquestionmaths.this;
                            int unused24 = recviewquestionmaths24.answered7 = recviewquestionmaths24.answered7 + 1;
                            editor.putInt("answered7", recviewquestionmaths.this.answered7);
                            editor.putInt("ans7", recviewquestionmaths.this.answer7);
                            editor.commit();
                        } else if (i3 == 8) {
                            recviewquestionmaths recviewquestionmaths25 = recviewquestionmaths.this;
                            int unused25 = recviewquestionmaths25.answer8 = recviewquestionmaths25.answer8 + 1;
                            recviewquestionmaths recviewquestionmaths26 = recviewquestionmaths.this;
                            int unused26 = recviewquestionmaths26.answered8 = recviewquestionmaths26.answered8 + 1;
                            editor.putInt("answered8", recviewquestionmaths.this.answered8);
                            editor.putInt("ans8", recviewquestionmaths.this.answer8);
                            editor.commit();
                        } else if (i3 == 9) {
                            recviewquestionmaths recviewquestionmaths27 = recviewquestionmaths.this;
                            int unused27 = recviewquestionmaths27.answer9 = recviewquestionmaths27.answer9 + 1;
                            recviewquestionmaths recviewquestionmaths28 = recviewquestionmaths.this;
                            int unused28 = recviewquestionmaths28.answered9 = recviewquestionmaths28.answered9 + 1;
                            editor.putInt("answered9", recviewquestionmaths.this.answered9);
                            editor.putInt("ans9", recviewquestionmaths.this.answer9);
                            editor.commit();
                        } else if (i3 == 10) {
                            recviewquestionmaths recviewquestionmaths29 = recviewquestionmaths.this;
                            int unused29 = recviewquestionmaths29.answer10 = recviewquestionmaths29.answer10 + 1;
                            recviewquestionmaths recviewquestionmaths30 = recviewquestionmaths.this;
                            int unused30 = recviewquestionmaths30.answered10 = recviewquestionmaths30.answered10 + 1;
                            editor.putInt("answered10", recviewquestionmaths.this.answered10);
                            editor.putInt("ans10", recviewquestionmaths.this.answer10);
                            editor.commit();
                        }
                    }
                    View view4 = view;
                    view4.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.md_teal_A400));
                    view4.setEnabled(false);
                    return;
                }
                RadioGroup radioGroup3 = radioGroup;
                String str3 = str2;
                View view5 = view2;
                if (obj.equals("correct") && !obj.equals("incorrect")) {
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                    int i4 = i2;
                    if (i4 == 1) {
                        recviewquestionmaths recviewquestionmaths31 = recviewquestionmaths.this;
                        int unused31 = recviewquestionmaths31.answer1 = recviewquestionmaths31.answer1 + 1;
                        recviewquestionmaths recviewquestionmaths32 = recviewquestionmaths.this;
                        int unused32 = recviewquestionmaths32.answered1 = recviewquestionmaths32.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.putInt("ans1", recviewquestionmaths.this.answer1);
                        editor.commit();
                    } else if (i4 == 2) {
                        recviewquestionmaths recviewquestionmaths33 = recviewquestionmaths.this;
                        int unused33 = recviewquestionmaths33.answer2 = recviewquestionmaths33.answer2 + 1;
                        recviewquestionmaths recviewquestionmaths34 = recviewquestionmaths.this;
                        int unused34 = recviewquestionmaths34.answered2 = recviewquestionmaths34.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.putInt("ans2", recviewquestionmaths.this.answer2);
                        editor.commit();
                    } else if (i4 == 3) {
                        recviewquestionmaths recviewquestionmaths35 = recviewquestionmaths.this;
                        int unused35 = recviewquestionmaths35.answer3 = recviewquestionmaths35.answer3 + 1;
                        recviewquestionmaths recviewquestionmaths36 = recviewquestionmaths.this;
                        int unused36 = recviewquestionmaths36.answered3 = recviewquestionmaths36.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.putInt("ans3", recviewquestionmaths.this.answer3);
                        editor.commit();
                    } else if (i4 == 4) {
                        recviewquestionmaths recviewquestionmaths37 = recviewquestionmaths.this;
                        int unused37 = recviewquestionmaths37.answer4 = recviewquestionmaths37.answer4 + 1;
                        recviewquestionmaths recviewquestionmaths38 = recviewquestionmaths.this;
                        int unused38 = recviewquestionmaths38.answered4 = recviewquestionmaths38.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.putInt("ans4", recviewquestionmaths.this.answer4);
                        editor.commit();
                    } else if (i4 == 5) {
                        recviewquestionmaths recviewquestionmaths39 = recviewquestionmaths.this;
                        int unused39 = recviewquestionmaths39.answer5 = recviewquestionmaths39.answer5 + 1;
                        recviewquestionmaths recviewquestionmaths40 = recviewquestionmaths.this;
                        int unused40 = recviewquestionmaths40.answered5 = recviewquestionmaths40.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.putInt("ans5", recviewquestionmaths.this.answer5);
                        editor.commit();
                    } else if (i4 == 6) {
                        recviewquestionmaths recviewquestionmaths41 = recviewquestionmaths.this;
                        int unused41 = recviewquestionmaths41.answer6 = recviewquestionmaths41.answer6 + 1;
                        recviewquestionmaths recviewquestionmaths42 = recviewquestionmaths.this;
                        int unused42 = recviewquestionmaths42.answered6 = recviewquestionmaths42.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.putInt("ans6", recviewquestionmaths.this.answer6);
                        editor.commit();
                    } else if (i4 == 7) {
                        recviewquestionmaths recviewquestionmaths43 = recviewquestionmaths.this;
                        int unused43 = recviewquestionmaths43.answer7 = recviewquestionmaths43.answer7 + 1;
                        recviewquestionmaths recviewquestionmaths44 = recviewquestionmaths.this;
                        int unused44 = recviewquestionmaths44.answered7 = recviewquestionmaths44.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.putInt("ans7", recviewquestionmaths.this.answer7);
                        editor.commit();
                    } else if (i4 == 8) {
                        recviewquestionmaths recviewquestionmaths45 = recviewquestionmaths.this;
                        int unused45 = recviewquestionmaths45.answer8 = recviewquestionmaths45.answer8 + 1;
                        recviewquestionmaths recviewquestionmaths46 = recviewquestionmaths.this;
                        int unused46 = recviewquestionmaths46.answered8 = recviewquestionmaths46.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.putInt("ans8", recviewquestionmaths.this.answer8);
                        editor.commit();
                    } else if (i4 == 9) {
                        recviewquestionmaths recviewquestionmaths47 = recviewquestionmaths.this;
                        int unused47 = recviewquestionmaths47.answer9 = recviewquestionmaths47.answer9 + 1;
                        recviewquestionmaths recviewquestionmaths48 = recviewquestionmaths.this;
                        int unused48 = recviewquestionmaths48.answered9 = recviewquestionmaths48.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.putInt("ans9", recviewquestionmaths.this.answer9);
                        editor.commit();
                    } else if (i4 == 10) {
                        recviewquestionmaths recviewquestionmaths49 = recviewquestionmaths.this;
                        int unused49 = recviewquestionmaths49.answer10 = recviewquestionmaths49.answer10 + 1;
                        recviewquestionmaths recviewquestionmaths50 = recviewquestionmaths.this;
                        int unused50 = recviewquestionmaths50.answered10 = recviewquestionmaths50.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.putInt("ans10", recviewquestionmaths.this.answer10);
                        editor.commit();
                    }
                } else if (!obj.equals("correct") && !obj.equals("incorrect")) {
                    int i5 = 0;
                    while (true) {
                        if (i5 > 4) {
                            break;
                        }
                        RadioGroup radioGroup4 = radioGroup3;
                        RadioButton radioButton2 = (RadioButton) ((ViewGroup) radioGroup4.getChildAt(i5)).getChildAt(0);
                        if (radioButton2.getTag().toString().equals("correct")) {
                            radioButton2.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.right));
                            break;
                        } else {
                            i5++;
                            radioGroup3 = radioGroup4;
                        }
                    }
                    int i6 = i2;
                    if (i6 == 1) {
                        recviewquestionmaths recviewquestionmaths51 = recviewquestionmaths.this;
                        int unused51 = recviewquestionmaths51.answered1 = recviewquestionmaths51.answered1 + 1;
                        editor.putInt("answered1", recviewquestionmaths.this.answered1);
                        editor.commit();
                    } else if (i6 == 2) {
                        recviewquestionmaths recviewquestionmaths52 = recviewquestionmaths.this;
                        int unused52 = recviewquestionmaths52.answered2 = recviewquestionmaths52.answered2 + 1;
                        editor.putInt("answered2", recviewquestionmaths.this.answered2);
                        editor.commit();
                    } else if (i6 == 3) {
                        recviewquestionmaths recviewquestionmaths53 = recviewquestionmaths.this;
                        int unused53 = recviewquestionmaths53.answered3 = recviewquestionmaths53.answered3 + 1;
                        editor.putInt("answered3", recviewquestionmaths.this.answered3);
                        editor.commit();
                    } else if (i6 == 4) {
                        recviewquestionmaths recviewquestionmaths54 = recviewquestionmaths.this;
                        int unused54 = recviewquestionmaths54.answered4 = recviewquestionmaths54.answered4 + 1;
                        editor.putInt(str3, recviewquestionmaths.this.answered4);
                        editor.commit();
                    } else if (i6 == 5) {
                        recviewquestionmaths recviewquestionmaths55 = recviewquestionmaths.this;
                        int unused55 = recviewquestionmaths55.answered5 = recviewquestionmaths55.answered5 + 1;
                        editor.putInt("answered5", recviewquestionmaths.this.answered5);
                        editor.commit();
                    } else if (i6 == 6) {
                        recviewquestionmaths recviewquestionmaths56 = recviewquestionmaths.this;
                        int unused56 = recviewquestionmaths56.answered6 = recviewquestionmaths56.answered6 + 1;
                        editor.putInt("answered6", recviewquestionmaths.this.answered6);
                        editor.commit();
                    } else if (i6 == 7) {
                        recviewquestionmaths recviewquestionmaths57 = recviewquestionmaths.this;
                        int unused57 = recviewquestionmaths57.answered7 = recviewquestionmaths57.answered7 + 1;
                        editor.putInt("answered7", recviewquestionmaths.this.answered7);
                        editor.commit();
                    } else if (i6 == 8) {
                        recviewquestionmaths recviewquestionmaths58 = recviewquestionmaths.this;
                        int unused58 = recviewquestionmaths58.answered8 = recviewquestionmaths58.answered8 + 1;
                        editor.putInt("answered8", recviewquestionmaths.this.answered8);
                        editor.commit();
                    } else if (i6 == 9) {
                        recviewquestionmaths recviewquestionmaths59 = recviewquestionmaths.this;
                        int unused59 = recviewquestionmaths59.answered9 = recviewquestionmaths59.answered9 + 1;
                        editor.putInt("answered9", recviewquestionmaths.this.answered9);
                        editor.commit();
                    } else if (i6 == 10) {
                        recviewquestionmaths recviewquestionmaths60 = recviewquestionmaths.this;
                        int unused60 = recviewquestionmaths60.answered10 = recviewquestionmaths60.answered10 + 1;
                        editor.putInt("answered10", recviewquestionmaths.this.answered10);
                        editor.commit();
                    }
                    view5.setBackgroundColor(view.getResources().getColor(C2719R.C2720color.wrong));
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
                TransitionManager.beginDelayedTransition(viewHolder2.f620cv, new AutoTransition());
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
        public final PhotoView Photo;
        /* access modifiers changed from: private */

        /* renamed from: cv */
        public final CardView f620cv;
        /* access modifiers changed from: private */
        public final TextView exp;
        private PhotoView img;
        /* access modifiers changed from: private */
        public final PhotoView imgexp;
        /* access modifiers changed from: private */

        /* renamed from: no */
        public final TextView f621no;
        /* access modifiers changed from: private */
        public final RadioButton rb1;
        /* access modifiers changed from: private */
        public final PhotoView rb1math;
        /* access modifiers changed from: private */
        public final RadioButton rb2;
        /* access modifiers changed from: private */
        public final PhotoView rb2math;
        /* access modifiers changed from: private */
        public final RadioButton rb3;
        /* access modifiers changed from: private */
        public final PhotoView rb3math;
        /* access modifiers changed from: private */
        public final RadioButton rb4;
        /* access modifiers changed from: private */
        public final PhotoView rb4math;

        /* renamed from: rg */
        private final RadioGroup f622rg;
        /* access modifiers changed from: private */

        /* renamed from: rl */
        public final RelativeLayout f623rl;
        /* access modifiers changed from: private */
        public final TextView show;
        /* access modifiers changed from: private */
        public final TextView txt;

        public ViewHolder(View view) {
            super(view);
            this.Photo = (PhotoView) view.findViewById(C2719R.C2722id.questionmaths);
            this.txt = (TextView) view.findViewById(C2719R.C2722id.question1);
            this.f621no = (TextView) view.findViewById(C2719R.C2722id.numbermaths);
            this.exp = (TextView) view.findViewById(C2719R.C2722id.expmaths);
            this.rb1 = (RadioButton) view.findViewById(C2719R.C2722id.choice1maths);
            this.rb1math = (PhotoView) view.findViewById(C2719R.C2722id.choice1mathstext);
            this.rb2 = (RadioButton) view.findViewById(C2719R.C2722id.choice2maths);
            this.rb2math = (PhotoView) view.findViewById(C2719R.C2722id.choice2mathstext);
            this.rb3 = (RadioButton) view.findViewById(C2719R.C2722id.choice3maths);
            this.rb3math = (PhotoView) view.findViewById(C2719R.C2722id.choice3mathstext);
            this.rb4 = (RadioButton) view.findViewById(C2719R.C2722id.choice4maths);
            this.rb4math = (PhotoView) view.findViewById(C2719R.C2722id.choice4mathstext);
            this.imgexp = (PhotoView) view.findViewById(C2719R.C2722id.imgexpmaths);
            this.show = (TextView) view.findViewById(C2719R.C2722id.explainmaths);
            this.f623rl = (RelativeLayout) view.findViewById(C2719R.C2722id.expandablemaths);
            this.f620cv = (CardView) view.findViewById(C2719R.C2722id.parentqmaths);
            this.f622rg = (RadioGroup) view.findViewById(C2719R.C2722id.choicemaths);
        }
    }
}
