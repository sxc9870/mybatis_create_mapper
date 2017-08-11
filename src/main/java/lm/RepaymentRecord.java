package lm;

/**
 * 还款记录
 *
 * @author shixuechen
 * @date 2017年8月11日
 */
public class RepaymentRecord {
   
    /**
     * 还款记录状态。0:未结算,1:已结算。
     */
    private String recordStatus="";
    /**
     * 实际还款时间
     */
    private String repaymentDate="";
    /**
     * 实际还款本金
     */
    private String repaymentPrincipal="";
    /**
     * 实际还款利息
     */
    private String repaymentInterest="";
    /**
     * 实际还款费用
     */
    private String repaymentCost="";
    /**
     * 实际还款小计
     */
    private String repaymentTotal="";
    /**
     * 备注
     */
    private String remark="";
    
    public String getRecordStatus() {
        return recordStatus;
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
    public String getRepaymentTotal() {
        return repaymentTotal;
    }
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
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
    public void setRepaymentTotal(String repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }
}