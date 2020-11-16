package com.fogcoding.mybatis.model;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : test_env
 * @author notes
 * @date 2020-11-16 11:13:49
 */
public class test_env implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 测试阶段类型
     */
    private String type;

    /**
     * 系统
     */
    private String system;

    /**
     * 行方项目经理
     */
    private String pm;

    /**
     * 服务器地址
     */
    private String hostaddr;

    /**
     * 服务器用户密码
     */
    private String hostuser;

    /**
     * 数据库地址
     */
    private String dbaddr;

    /**
     * 数据库用户密码
     */
    private String dbuser;

    /**
     * 前端地址
     */
    private String url;

    /**
     * 前端用户密码
     */
    private String webuser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm == null ? null : pm.trim();
    }

    public String getHostaddr() {
        return hostaddr;
    }

    public void setHostaddr(String hostaddr) {
        this.hostaddr = hostaddr == null ? null : hostaddr.trim();
    }

    public String getHostuser() {
        return hostuser;
    }

    public void setHostuser(String hostuser) {
        this.hostuser = hostuser == null ? null : hostuser.trim();
    }

    public String getDbaddr() {
        return dbaddr;
    }

    public void setDbaddr(String dbaddr) {
        this.dbaddr = dbaddr == null ? null : dbaddr.trim();
    }

    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser == null ? null : dbuser.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getWebuser() {
        return webuser;
    }

    public void setWebuser(String webuser) {
        this.webuser = webuser == null ? null : webuser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", system=").append(system);
        sb.append(", pm=").append(pm);
        sb.append(", hostaddr=").append(hostaddr);
        sb.append(", hostuser=").append(hostuser);
        sb.append(", dbaddr=").append(dbaddr);
        sb.append(", dbuser=").append(dbuser);
        sb.append(", url=").append(url);
        sb.append(", webuser=").append(webuser);
        sb.append("]");
        return sb.toString();
    }
}