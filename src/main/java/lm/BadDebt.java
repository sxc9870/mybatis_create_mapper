package lm;

public class BadDebt {
    /**
     * 催收次数
     */
    private String pressCount="";
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
    public String getPressCount() {
        return pressCount;
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
    public void setPressCount(String pressCount) {
        this.pressCount = pressCount;
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