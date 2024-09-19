package lk.ijse;

import lk.ijse.Entity.Student;
import lk.ijse.config.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

            //Insert
//        Student student = new Student();
//        student.setId(2);
//        student.setName("Saman");
//        student.setAddress("Kandy");
//        session.save(student);

             //update
//        String jpql1 = "update Student s set s.name = ?1,s.address=?2 where s.id = ?3";
//        Query query = session.createQuery(jpql1);
//        query.setParameter(1, "Kamal");
//        query.setParameter(2, "colombo");
//        query.setParameter(3, 1);
//        query.executeUpdate();

            //delete
        String jpql2 = "delete from Student s where s.id = ?1";
        Query query2 = session.createQuery(jpql2);
        query2.setParameter(1, 2);
        query2.executeUpdate();


        transaction.commit();
        session.close();
    }
}