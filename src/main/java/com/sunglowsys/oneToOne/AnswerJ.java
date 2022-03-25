package com.sunglowsys.oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnswerJ {
    @Id
    private int answerId;

    private String answer;

    public AnswerJ() {}

    public AnswerJ(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnswerJ{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
