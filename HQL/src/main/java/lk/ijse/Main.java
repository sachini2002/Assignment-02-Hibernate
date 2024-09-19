package lk.ijse;

import lk.ijse.Entity.Student;
import lk.ijse.config.SessionFactoryConfiguration;
import lk.ijse.repository.Methods;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //insert
//        String SInsert = "INSERT INTO Student (id, name, address) VALUES (2, 'Sakidu', 'Panadura')";
//        int i = methods.InsertStudent(session, SInsert);
//        System.out.println(i);


        //update
//        String hql = "update Student set name =:name where id =:id";
//        int i1 = methods.UpdateStudent(hql, session);
//        System.out.println(i1);

//        //delete
//        String hql2 = "delete from Student where id =:id";
//        int i2 = methods.DeleteStudent(hql2, session);
//        System.out.println(i2);

//        Query query=session.createQuery("select id,name from Student where id=?1");
//        query.setParameter(1,1);
//        List <Object[]> students = query.list();
//        for (Object[] student : students) {
//            System.out.println(Arrays.toString(student));
//        }

//        Query query1=session.createQuery("select id,name from Student");
//        List <Object[]> students  = query1.list();
//        for (Object[] student : students) {
//            System.out.println(Arrays.toString(student));
//        }

        Query query3=session.createQuery("select a.aid,a.city from Address a inner join Student s on a.aid = s.id");
        List <Object[]> students = query3.list();
        for (Object[] student  : students){
            System.out.println(Arrays.toString(student));
        }


        transaction.commit();
        session.close();
    }
}