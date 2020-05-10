package com.hibernateSessionFactoryUtil;

import com.entity.GeoipEntity;
import com.entity.RoomsEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
public class HibernateSessionFactoryUtil {
    public HibernateSessionFactoryUtil() {
    }

    public SessionFactory getSessionFactory() {
        try {

            Configuration configuration =
                    new Configuration().configure();
            configuration.addAnnotatedClass(GeoipEntity.class);
            configuration.addAnnotatedClass(RoomsEntity.class);



            StandardServiceRegistryBuilder builder =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(builder.build());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
