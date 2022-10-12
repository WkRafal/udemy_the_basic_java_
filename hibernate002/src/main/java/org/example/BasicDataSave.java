package org.example;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BasicDataSave {
    public static void main(String[] args) {

        StandardServiceRegistry ssr = (StandardServiceRegistry) new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        //employee.setId(1);//poniewaz increment w ustawieniach
        employee.setName("adam");
        employee.setSurname("kowalski");
        employee.setJobTitle("programer");
        employee.setSalary(10000);

        session.save(employee);
        transaction.commit();

        System.out.println("employee save");
        sessionFactory.close();
        session.close();
    }
}
