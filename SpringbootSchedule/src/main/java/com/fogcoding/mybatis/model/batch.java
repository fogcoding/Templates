package com.fogcoding.mybatis.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : batch
 * @author notes
 * @date 2020-11-16 11:13:49
 */
public class batch implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 跑批环境
     */
    private String env;

    /**
     * 跑批系统
     */
    private String sys;

    /**
     * 批前日期
     */
    private Date preDate;

    /**
     * 批后日期
     */
    private Date afterDate;

    /**
     * 需求提出人
     */
    private String requester;

    /**
     * 对应需求
     */
    private String requestContent;

    /**
     * 执行日期
     */
    private Date runDate;

    /**
     * 开始时间
     */
    private String runTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 跑批执行人
     */
    private String operator;

    /**
     * 跑批注意事项
     */
    private String notice;

    /**
     * 任务状态（未完成，进行中，已完成，转处理）
     */
    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys == null ? null : sys.trim();
    }

    public Date getPreDate() {
        return preDate;
    }

    public void setPreDate(Date preDate) {
        this.preDate = preDate;
    }

    public Date getAfterDate() {
        return afterDate;
    }

    public void setAfterDate(Date afterDate) {
        this.afterDate = afterDate;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester == null ? null : requester.trim();
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent == null ? null : requestContent.trim();
    }

    public Date getRunDate() {
        return runDate;
    }

    public void setRunDate(Date runDate) {
        this.runDate = runDate;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime == null ? null : runTime.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", env=").append(env);
        sb.append(", sys=").append(sys);
        sb.append(", preDate=").append(preDate);
        sb.append(", afterDate=").append(afterDate);
        sb.append(", requester=").append(requester);
        sb.append(", requestContent=").append(requestContent);
        sb.append(", runDate=").append(runDate);
        sb.append(", runTime=").append(runTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", operator=").append(operator);
        sb.append(", notice=").append(notice);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}