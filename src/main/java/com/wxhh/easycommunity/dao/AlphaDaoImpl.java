package com.wxhh.easycommunity.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
