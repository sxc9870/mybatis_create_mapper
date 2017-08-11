package lm;

/**
 * 催收记录
 *
 * @author shixuechen
 * @date 2017年8月11日
 */
public class PressRecord {
    /**
     * 催收结果。0:拒绝还款,1:无力还款,2:延迟还款,3:电话停机,4:不接电话。
     */
    private String pressResult="";
    /**
     * 催收日期
     */
    private String pressDate="";
    /**
     * 逾期缘由
     */
    private String reason="";
    /**
     * 还款进度
     */
    private String process="";
    /**
     * 还款意向
     */
    private String repayIntention="";
    /**
     * 已还本金
     */
    private String repayedPrincipal="";
    /**
     * 已还利息
     */
    private String repayedInterest="";
    /**
     * 已还小计
     */
    private String repayedTotal="";
    /**
     * 未还本金
     */
    private String unrepayPrincipal="";
    /**
     * 未还利息
     */
    private String unrepayInterest="";
    /**
     * 未还小计
     */
    private String unrepayTotal="";
    /**
     * 未还期数
     */
    private String unrepayPeriod="";
    /**
    
    */
    private String remark="";
    public String getPressDate() {
        return pressDate;
    }
    public String getPressResult() {
        return pressResult;
    }
    public String getProcess() {
        return process;
    }
    public String getReason() {
        return reason;
    }
    public String getRemark() {
        return remark;
    }
    public String getRepayedInterest() {
        return repayedInterest;
    }
    public String getRepayedPrincipal() {
        return repayedPrincipal;
    }
    public String getRepayedTotal() {
        return repayedTotal;
    }
    public String getRepayIntention() {
        return repayIntention;
    }
    public String getUnrepayInterest() {
        return unrepayInterest;
    }
    public String getUnrepayPeriod() {
        return unrepayPeriod;
    }
    public String getUnrepayPrincipal() {
        return unrepayPrincipal;
    }
    public String getUnrepayTotal() {
        return unrepayTotal;
    }
    public void setPressDate(String pressDate) {
        this.pressDate = pressDate;
    }
    public void setPressResult(String pressResult) {
        this.pressResult = pressResult;
    }
    public void setProcess(String process) {
        this.process = process;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setRepayedInterest(String repayedInterest) {
        this.repayedInterest = repayedInterest;
    }
    public void setRepayedPrincipal(String repayedPrincipal) {
        this.repayedPrincipal = repayedPrincipal;
    }
    public void setRepayedTotal(String repayedTotal) {
        this.repayedTotal = repayedTotal;
    }
    public void setRepayIntention(String repayIntention) {
        this.repayIntention = repayIntention;
    }
    public void setUnrepayInterest(String unrepayInterest) {
        this.unrepayInterest = unrepayInterest;
    }
    public void setUnrepayPeriod(String unrepayPeriod) {
        this.unrepayPeriod = unrepayPeriod;
    }
    public void setUnrepayPrincipal(String unrepayPrincipal) {
        this.unrepayPrincipal = unrepayPrincipal;
    }
    public void setUnrepayTotal(String unrepayTotal) {
        this.unrepayTotal = unrepayTotal;
    }
}