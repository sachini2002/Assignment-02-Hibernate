package lk.ijse;

import lk.ijse.config.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //insert
//        NativeQuery nativeQuery = session.createNativeQuery("insert into Student values (?1, ?2, ?3)");
//        nativeQuery.setParameter(1, 1);
//        nativeQuery.setParameter(2, "Schini");
//        nativeQuery.setParameter(3, "Mathugama");
//        nativeQuery.executeUpdate();


        //update
//        NativeQuery nativeQuery1 = session.createNativeQuery("update Student set name = ?1,address=?2 where id = ?3");
//        nativeQuery1.setParameter(1, "Kamal");
//        nativeQuery1.setParameter(2, "colombo");
//        nativeQuery1.setParameter(3, 1);
//        nativeQuery1.executeUpdate();


        //delete
//        NativeQuery nativeQuery2 = session.createNativeQuery("delete from Student where id = ?1");
//        nativeQuery2.setParameter(1, 1);
//        nativeQuery2.executeUpdate();


//        //search-by-name
        NativeQuery<Object[]> query3 = session.createNativeQuery("select name, address from Student where id = :id");
        query3.setParameter("id", 1);
        List<Object[]> Student = query3.list();

        for (Object[] Students : Student) {
            System.out.println("Name: " + Students[0]);
            System.out.println("Address: " + Students[1]);
        }

        transaction.commit();
        session.close();



    }
}