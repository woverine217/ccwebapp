package DAO;

import POJO.Register;
import POJO.User;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;


public class UserDao extends Dao {
    public User register(User u)  {
        try {
            super.begin();
            getSession().save(u);
            super.commit();
        } catch (Exception e) {
            super.rollback();
        } finally {

        }
        return u;
    }
    public User get(String em)  {
        User user=null;
        try {
            begin();
            Query q = getSession().createQuery("from User use where use.email = ?");
            q.setString(0, em);
             user = (User) q.uniqueResult();
            commit();

            return user;
        } catch (HibernateException e) {
            rollback();

        }
       return null;
    }

}
