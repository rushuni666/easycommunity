package com.wxhh.easycommunity.utils;

import com.wxhh.easycommunity.entity.User;
import org.springframework.stereotype.Component;

/**
 * 代替Session对象
 */

@Component
public class HostHolder {
    // 底层是map
    // 通过线程id来做key
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }
    public User getUser() {
        return users.get();
    }
    public void clear() {
        users.remove();
    }
}



























