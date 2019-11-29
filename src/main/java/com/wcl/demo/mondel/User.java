package com.wcl.demo.mondel;

import java.util.Date;

public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 创建人
     */
    private Integer userCreatBy;

    /**
     * 创建时间
     */
    private Date userCreatTime;

    /**
     * 修改人
     */
    private Integer userUpdateBy;

    /**
     * 修改时间
     */
    private Date userUpdateTime;

    /**
     * 备注
     */
    private String userRemark;

    /**
     * 用户ID
     * @return USER_ID 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     * @return USER_NAME 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return PASS_WORD 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 密码
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * 创建人
     * @return USER_CREAT_BY 创建人
     */
    public Integer getUserCreatBy() {
        return userCreatBy;
    }

    /**
     * 创建人
     * @param userCreatBy 创建人
     */
    public void setUserCreatBy(Integer userCreatBy) {
        this.userCreatBy = userCreatBy;
    }

    /**
     * 创建时间
     * @return USER_CREAT_TIME 创建时间
     */
    public Date getUserCreatTime() {
        return userCreatTime;
    }

    /**
     * 创建时间
     * @param userCreatTime 创建时间
     */
    public void setUserCreatTime(Date userCreatTime) {
        this.userCreatTime = userCreatTime;
    }

    /**
     * 修改人
     * @return USER_UPDATE_BY 修改人
     */
    public Integer getUserUpdateBy() {
        return userUpdateBy;
    }

    /**
     * 修改人
     * @param userUpdateBy 修改人
     */
    public void setUserUpdateBy(Integer userUpdateBy) {
        this.userUpdateBy = userUpdateBy;
    }

    /**
     * 修改时间
     * @return USER_UPDATE_TIME 修改时间
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * 修改时间
     * @param userUpdateTime 修改时间
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    /**
     * 备注
     * @return USER_REMARK 备注
     */
    public String getUserRemark() {
        return userRemark;
    }

    /**
     * 备注
     * @param userRemark 备注
     */
    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }
}