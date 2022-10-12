package org.example.oneToMany;

import org.example.oneToMany.model.Answer;
import org.example.oneToMany.model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    public static void main(String[] args) {

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question1 = new Question("ile to 5 * 5");
        Answer a1 = new Answer("8",false);
        Answer a2 = new Answer("17",false);
        Answer a3 = new Answer("25",true);
        Answer a4 = new Answer("67",false);
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(a1);
        answers1.add(a2);
        answers1.add(a3);
        answers1.add(a4);
        question1.setAnswers(answers1);

        //session.save(question1);

        Question question2 = new Question("ile jest 4 - 4");
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("0", true));
        answers2.add(new Answer("1", false));
        question2.setAnswers(answers2);

        //session.save(question2);

        Query query = session.createQuery("FROM Question");
        List<Question> questions = query.list();

        questions.stream().forEach(
                question -> {
                    System.out.println("\n" + question + ":");
                    question.getAnswers().stream().forEach(
                            answer -> System.out.println("-" + answer));
                }
        );



        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
