package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    //TODO: create a method to find all whiskeys of a particular year
    //TODO: create a method to find all whiskeys of a particular region
    //TODO: create a method to find all distilleries of a particular region
    //TODO: create a method to find all whiskeys of a particular distillery with a specific age

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Whisky> getWhiskysOfParticularAgeFromDistillery(String distillery, int age){
        List<Whisky> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("age", age));
            cr.createAlias("distillery", "entity");
            cr.add(Restrictions.eq("entity.name", distillery));

            results = cr.list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Distillery> getDistilleriesWithParticularWhiskyAge(int age){
        List<Distillery> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Distillery.class);
            cr.createAlias("whiskies", "whisky");
            cr.add(Restrictions.eq("whisky.age", age));

            results = cr.list();
        } catch(HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Distillery> getDistilleryWithParticularRegion(String region){
        List<Distillery> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("region", region));

            results = cr.list();
        } catch(HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
