import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class BootStrapper {

    private static SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private static ThreadLocal<Session> session = new ThreadLocal<Session>();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static Session getSession() {
        if(session.get() == null){
            session.set(sessionFactory.getCurrentSession());
        }
        return session.get();
    }
}
