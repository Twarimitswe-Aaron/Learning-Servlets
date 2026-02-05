package com.servlet.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import com.servlet.model.House;
import com.servlet.util.HibernateUtil;


public class HouseDAO {


    public void save(House house) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("Saving house");
        session.save(house);
        System.out.println("Saved house");
        tx.commit();
        System.out.println("Saved house 11");
        session.close();
    }


    public List<House> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<House> houses = session.createQuery("from House", House.class).list();
        session.close();
        return houses;
    }
}
