package com.fogcoding.model;

public class User {
    private Long _id;
    private String _account;
    private String passwd;
    private String _name;
    private String user_group;
    private int authority_level;

    public User() {
    }

    public User(Long _id, String _account, String passwd, String _name, String user_group, int authority_level) {
        this._id = _id;
        this._account = _account;
        this.passwd = passwd;
        this._name = _name;
        this.user_group = user_group;
        this.authority_level = authority_level;
    }


    public User(String _account, String passwd, String _name, String user_group, int authority_level) {
        this._account = _account;
        this.passwd = passwd;
        this._name = _name;
        this.user_group = user_group;
        this.authority_level = authority_level;
    }



    public String get_account() {
        return _account;
    }

    public void set_account(String _account) {
        this._account = _account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String getUser_group() {
        return user_group;
    }

    public void setUser_group(String user_group) {
        this.user_group = user_group;
    }

    public int getAuthority_level() {
        return authority_level;
    }

    public void setAuthority_level(int authority_level) {
        this.authority_level = authority_level;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id=" + _id +
                ", _account='" + _account + '\'' +
                ", passwd='" + passwd + '\'' +
                ", _name='" + _name + '\'' +
                ", user_group='" + user_group + '\'' +
                ", authority_level=" + authority_level +
                '}';
    }
}
