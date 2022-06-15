package com.example.wcd_t2009a_nguyenmanhnam.util;

import com.example.wcd_t2009a_nguyenmanhnam.model.Phone;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties setting = new Properties();
                setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                setting.put(Environment.URL, "jdbc:mysql://localhost:8889/wcd_t2009a");
                setting.put(Environment.USER, "root");
                setting.put(Environment.PASS, "root");
                setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                setting.put(Environment.SHOW_SQL, "true");
                setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                setting.put(Environment.HBM2DDL_AUTO, "update");
                configuration.setProperties(setting);

                configuration.addAnnotatedClass(Phone.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                System.out.println("Hello World");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
