package hibernate_hql_skill3.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_hql_skill3.entity.Product;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure(
                    HibernateUtil.class.getClassLoader().getResource("hibernate.cfg.xml")
            );
            configuration.addAnnotatedClass(Product.class);
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.out.println("SessionFactory creation failed.");
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}