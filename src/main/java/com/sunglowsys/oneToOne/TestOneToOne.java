package com.sunglowsys.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        QusetionJ q1 = new QusetionJ();
        q1.setQuestionId(223);
        q1.setQuestion("hey shivam wats'up");



        AnswerJ ans = new AnswerJ();
        ans.setAnswerId(225);
        ans.setAnswer("nothing I create a programme");
        q1.setAnswerJ(ans);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(q1);
        transaction.commit();
        session.close();
        factory.close();
    }
}
