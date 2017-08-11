package lm;

import java.util.ArrayList;
import java.util.List;

public class RepaymentPlan {

    /**
     * 还款计划状态。0:未启动,1:启动中,2:未还清,3:已还清。
     */
    private String planStatus = "";
    /**
     * 期数
     */
    private String period = "";
    /**
     * 应还日期
     */
    private String repaymentDate = "";
    /**
     * 应还本金
     */
    private String repaymentPrincipal = "";
    /**
     * 应还利息
     */
    private String repaymentInterest = "";
    /**
     * 应还费用
     */
    private String repaymentCost = "";
    /**
     * 应还小计
     */
    private String repaymentTotal = "";
    /**
     * 进度
     */
    private String progress = "";
    /**
     * 实际还款时间
     */
    private String realRepaymentDate = "";
    /**
     * 当期一次还清金额
     */
    private String realRepaymentAmount = "";
    /**
     * 备注
     */
    private String remark = "";
    /**
     * LM_逾期记录
     */
    private Overdue overdue = new Overdue();
    /**
     * LM_还款记录
     */
    private List<RepaymentRecord> repaymentRecord = new ArrayList<>();
    {
        repaymentRecord.add(new RepaymentRecord());
    }

    public Overdue getOverdue() {
        return overdue;
    }

    public String getPeriod() {
        return period;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public String getProgress() {
        return progress;
    }

    public String getRealRepaymentAmount() {
        return realRepaymentAmount;
    }

    public String getRealRepaymentDate() {
        return realRepaymentDate;
    }

    public String getRemark() {
        return remark;
    }

    public String getRepaymentCost() {
        return repaymentCost;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public String getRepaymentInterest() {
        return repaymentInterest;
    }

    public String getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    public List<RepaymentRecord> getRepaymentRecord() {
        return repaymentRecord;
    }

    public String getRepaymentTotal() {
        return repaymentTotal;
    }

    public void setOverdue(Overdue overdue) {
        this.overdue = overdue;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public void setRealRepaymentAmount(String realRepaymentAmount) {
        this.realRepaymentAmount = realRepaymentAmount;
    }

    public void setRealRepaymentDate(String realRepaymentDate) {
        this.realRepaymentDate = realRepaymentDate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRepaymentCost(String repaymentCost) {
        this.repaymentCost = repaymentCost;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public void setRepaymentInterest(String repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    public void setRepaymentPrincipal(String repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    public void setRepaymentRecord(List<RepaymentRecord> repaymentRecord) {
        this.repaymentRecord = repaymentRecord;
    }

    public void setRepaymentTotal(String repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }
}