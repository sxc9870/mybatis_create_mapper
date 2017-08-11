package lm;

public class Overdue {
    
    /**
     * 逾期天数
     */
    private String overdueDayCount="";
    /**
     * 逾期金额
     */
    private String overdueAmount="";;
    /**
     * 实际已还款本金
     */
    private String repaymentPrincipal="";
    /**
     * 实际已还款利息
     */
    private String repaymentInterest="";
    /**
     * 实际已还款费用
     */
    private String repaymentCost="";
    /**
     * 实际已还款小计
     */
    private String repaymentTotal="";
    /**
     * 备注
     */
    private String remark="";
    public String getOverdueAmount() {
        return overdueAmount;
    }
    public String getOverdueDayCount() {
        return overdueDayCount;
    }
    public String getRemark() {
        return remark;
    }
    public String getRepaymentCost() {
        return repaymentCost;
    }
    public String getRepaymentInterest() {
        return repaymentInterest;
    }
    public String getRepaymentPrincipal() {
        return repaymentPrincipal;
    }
    public String getRepaymentTotal() {
        return repaymentTotal;
    }
    public void setOverdueAmount(String overdueAmount) {
        this.overdueAmount = overdueAmount;
    }
    public void setOverdueDayCount(String overdueDayCount) {
        this.overdueDayCount = overdueDayCount;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setRepaymentCost(String repaymentCost) {
        this.repaymentCost = repaymentCost;
    }
    public void setRepaymentInterest(String repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }
    public void setRepaymentPrincipal(String repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }
    public void setRepaymentTotal(String repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }
}