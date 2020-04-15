package com.wxhh.easycommunity.service;

import com.wxhh.easycommunity.dao.DiscussPostMapper;
import com.wxhh.easycommunity.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userid, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userid, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
