package com.wxhh.easycommunity.service;

import com.wxhh.easycommunity.dao.AlphaDao;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {

    private final AlphaDao alphaDao;

    public String find() {
        return alphaDao.select();
    }

    public AlphaService(AlphaDao alphaDao) {
        System.out.println("实例化AlphaService");
        this.alphaDao = alphaDao;
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化AlphaService");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("销毁AlphaService");
    }
}
