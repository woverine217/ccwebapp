package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao {
    private static final SessionFactory sf = new Configuration().configure().buildSessionFactory();
    private static Session session;

    public static Session getSession() {
        if (session == null) {
            session = sf.openSession();
        }
        return session;
    }

    public void begin() {
        getSession().beginTransaction();
    }

    public void commit() {
        getSession().getTransaction().commit();
    }

    public void close() {
        getSession().close();
    }

    public void rollback() {
        getSession().getTransaction().rollback();
    }
}
