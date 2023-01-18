package com.application.employee.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


public class CustomHibernateDaoSupport  extends HibernateDaoSupport {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }



}
