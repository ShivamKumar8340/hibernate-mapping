package com.sunglowsys.oneToOne;

import javax.persistence.*;

@Entity
public class QusetionJ {
    @Id
    private int questionId;
    private String question;

    @OneToOne(cascade = CascadeType.ALL)
    private AnswerJ answerJ;

    public QusetionJ() {
    }

    public QusetionJ(int questionId, String question, AnswerJ answerJ) {
        this.questionId = questionId;
        this.question = question;
        this.answerJ = answerJ;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerJ getAnswerJ() {
        return answerJ;
    }

    public void setAnswerJ(AnswerJ answerJ) {
        this.answerJ = answerJ;
    }

    @Override
    public String toString() {
        return "QusetionJ{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answerJ=" + answerJ +
                '}';
    }
}
