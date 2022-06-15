package com.example.wcd_t2009a_nguyenmanhnam.dao;

import com.example.wcd_t2009a_nguyenmanhnam.model.Phone;
import com.example.wcd_t2009a_nguyenmanhnam.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAO {


    public void insertPhone(Phone phone){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(phone);
            transaction.commit();

        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }

            e.printStackTrace();
        }
    }

    public void updatePhone(int  id){
        Transaction transaction = null;
        try(
                Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(id);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletePhone(int id){
        Transaction transaction = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Phone phone = session.get(Phone.class, id);
            if (phone != null){
                session.delete(phone);
            }
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Phone findPhone(int id){
        Transaction transaction = null;

        Phone products = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            products = session.get(Phone.class, id);
            transaction.commit();
        }
        catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return products;
    }

    public List<Phone> getList(){
        Transaction transaction = null;

        List<Phone> list = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Phone p where p.id = :pID");
            query.setParameter("pID", 1);
            list = query.getResultList();
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return list;
    }


}



