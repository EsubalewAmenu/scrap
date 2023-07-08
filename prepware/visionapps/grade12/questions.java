package com.visionapps.grade12;

public class questions {
    private String answer;
    private String explanation;
    private int imgexp;
    private int imgquestion;
    private int imgrb1;
    private int imgrb2;
    private int imgrb3;
    private int imgrb4;
    private Boolean mode;
    private int part;
    private String queno;
    private String question;
    private String rb1;
    private String rb2;
    private String rb3;
    private String rb4;

    public questions(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, String str5, String str6, String str7, String str8, int i6) {
    }

    public questions(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, String str5, String str6, String str7, String str8, int i6, int i7, Boolean bool) {
        this.queno = str;
        this.question = str2;
        this.imgrb1 = i2;
        this.imgrb2 = i3;
        this.imgrb3 = i4;
        this.imgrb4 = i5;
        this.imgquestion = i;
        this.rb1 = str3;
        this.rb2 = str4;
        this.rb3 = str5;
        this.rb4 = str6;
        this.explanation = str7;
        this.answer = str8;
        this.imgexp = i6;
        this.part = i7;
        this.mode = bool;
    }

    public int getPart() {
        return this.part;
    }

    public void setPart(int i) {
        this.part = i;
    }

    public String getRb1() {
        return this.rb1;
    }

    public void setRb1(String str) {
        this.rb1 = str;
    }

    public int getImgexp() {
        return this.imgexp;
    }

    public void setImgexp(int i) {
        this.imgexp = i;
    }

    public String getRb2() {
        return this.rb2;
    }

    public void setRb2(String str) {
        this.rb2 = str;
    }

    public String getRb3() {
        return this.rb3;
    }

    public void setRb3(String str) {
        this.rb3 = str;
    }

    public String getRb4() {
        return this.rb4;
    }

    public void setRb4(String str) {
        this.rb4 = str;
    }

    public Boolean getMode() {
        return this.mode;
    }

    public void setMode(Boolean bool) {
        this.mode = bool;
    }

    public int getImgrb1() {
        return this.imgrb1;
    }

    public void setImgrb1(int i) {
        this.imgrb1 = i;
    }

    public int getImgrb2() {
        return this.imgrb2;
    }

    public void setImgrb2(int i) {
        this.imgrb2 = i;
    }

    public int getImgrb3() {
        return this.imgrb3;
    }

    public void setImgrb3(int i) {
        this.imgrb3 = i;
    }

    public int getImgrb4() {
        return this.imgrb4;
    }

    public void setImgrb4(int i) {
        this.imgrb4 = i;
    }

    public int getImgquestion() {
        return this.imgquestion;
    }

    public void setImgquestion(int i) {
        this.imgquestion = i;
    }

    public String getQueno() {
        return this.queno;
    }

    public void setQueno(String str) {
        this.queno = str;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String str) {
        this.explanation = str;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String str) {
        this.answer = str;
    }

    public String toString() {
        return "questions{queno='" + this.queno + '\'' + ", question='" + this.question + '\'' + ", imgrb1=" + this.imgrb1 + ", imgrb2=" + this.imgrb2 + ", imgrb3=" + this.imgrb3 + ", imgrb4=" + this.imgrb4 + ", imgquestion=" + this.imgquestion + ", rb1='" + this.rb1 + '\'' + ", rb2='" + this.rb2 + '\'' + ", rb3='" + this.rb3 + '\'' + ", rb4='" + this.rb4 + '\'' + ", explanation='" + this.explanation + '\'' + ", answer='" + this.answer + '\'' + ", imgexp=" + this.imgexp + ", part=" + this.part + ", mode='" + this.mode + '\'' + '}';
    }
}
