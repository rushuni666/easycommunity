package com.wxhh.easycommunity.service;

import com.wxhh.easycommunity.dao.AlphaDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {

    private static final Logger logger = LoggerFactory.getLogger(AlphaService.class);


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

    // 让该方法在多线程环境下,被异步的调用.
    @Async
    public void execute1() {
        logger.debug("execute1");
    }

    /*@Scheduled(initialDelay = 10000, fixedRate = 1000)*/
    public void execute2() {
        logger.debug("execute2");
    }
}
