package com.sunglowsys.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestManyToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        EmployeeM e1 = new EmployeeM();
        EmployeeM e2 = new EmployeeM();
        e1.seteId(34);
        e1.setName("amit");

        e2.seteId(35);
        e2.setName("shivam");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setpId(121);
        p1.setProjectName("library manager");

        p2.setpId(122);
        p2.setProjectName("chatbot");

        List<EmployeeM> list1 = new ArrayList<EmployeeM>();
        List<Project> list2 = new ArrayList<Project>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);


        e1.setProjects(list2);
        p2.setEmployies(list1);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        transaction.commit();
        session.close();
        factory.close();


    }
}
