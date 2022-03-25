package com.sunglowsys.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Employee e = new Employee();
        e.setId(101);
        e.setName("shivam kashyap");

        Account a = new Account();
        a.setId(111);
        a.setBank("SBI");

        Account a1 = new Account();
        a1.setId(112);
        a1.setBank("HDFC");

        Account a2 = new Account();
        a2.setId(113);
        a2.setBank("AXIS");

        Account a3= new Account();
        a3.setId(114);
        a3.setBank("SBI");

       List<Account> list = new ArrayList<Account>();
       list.add(a);
       list.add(a1);
       list.add(a2);
       list.add(a3);
       e.setAccounts(list);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e);
        session.save(a);
        session.save(a1);
        session.save(a2);
        session.save(a3);

        transaction.commit();
        session.close();




    }
}
