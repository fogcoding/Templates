package com.fogcoding.mybatis.model;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : users
 * @author notes
 * @date 2020-11-16 11:13:49
 */
public class users implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 登录账户
     */
    private String account;

    /**
     * 姓名
     */
    private String name;

    /**
     * 登录密码
     */
    private String passwd;

    /**
     * 用户组
     */
    private String userGroup;

    /**
     * 用户权限等级
     */
    private Integer authorityLevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup == null ? null : userGroup.trim();
    }

    public Integer getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(Integer authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", name=").append(name);
        sb.append(", passwd=").append(passwd);
        sb.append(", userGroup=").append(userGroup);
        sb.append(", authorityLevel=").append(authorityLevel);
        sb.append("]");
        return sb.toString();
    }
}