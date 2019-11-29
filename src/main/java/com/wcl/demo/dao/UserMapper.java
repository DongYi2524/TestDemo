package com.wcl.demo.dao;

import com.wcl.demo.mondel.User;

public interface UserMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated
     */
    int insert(User record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(User record);
}