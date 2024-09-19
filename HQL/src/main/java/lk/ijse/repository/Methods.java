package lk.ijse.repository;

import jakarta.persistence.Query;
import lk.ijse.Entity.Student;
import org.hibernate.Session;

import java.util.List;

public class Methods {

    public int InsertStudent(Session session, String SInsert) {
        Query query = session.createQuery(SInsert);
        int i = query.executeUpdate();
        return i;
    }

    public int UpdateStudent(String sql,Session session) {
        Query query = session.createQuery(sql);
        query.setParameter("name", "Poornima");
        query.setParameter("id", 2);
        return query.executeUpdate();
    }

    public int DeleteStudent(String sql,Session session) {
        Query query = session.createQuery(sql);
        query.setParameter("id", 2);
        return query.executeUpdate();
    }

}
