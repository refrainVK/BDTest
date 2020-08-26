package com.hello.springboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trace implements Serializable {
    private Long id;

    private Long strategyId;

    private String strategyName;

    private String felids;

    private String subcommand;

    private String felidsValue;

    private Date startTime;

    private Date endTime;

    private BigDecimal suspectPercent;

    private Long cnt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName == null ? null : strategyName.trim();
    }

    public String getFelids() {
        return felids;
    }

    public void setFelids(String felids) {
        this.felids = felids == null ? null : felids.trim();
    }

    public String getSubcommand() {
        return subcommand;
    }

    public void setSubcommand(String subcommand) {
        this.subcommand = subcommand == null ? null : subcommand.trim();
    }

    public String getFelidsValue() {
        return felidsValue;
    }

    public void setFelidsValue(String felidsValue) {
        this.felidsValue = felidsValue == null ? null : felidsValue.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getSuspectPercent() {
        return suspectPercent;
    }

    public void setSuspectPercent(BigDecimal suspectPercent) {
        this.suspectPercent = suspectPercent;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", strategyName=").append(strategyName);
        sb.append(", felids=").append(felids);
        sb.append(", subcommand=").append(subcommand);
        sb.append(", felidsValue=").append(felidsValue);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", suspectPercent=").append(suspectPercent);
        sb.append(", cnt=").append(cnt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}