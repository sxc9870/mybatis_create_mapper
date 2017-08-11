package lm;

public class CostInfo {

    /**
     * 费用计费方式
     */
    private String billingType="";
    /**
     * 计算方法
     */
    private String computationalMethod="";
    /**
     * 费用收取方式
     */
    private String collectType="";
    /**
     * 费率
     */
    private String rate="";
    /**
     * 备注
     */
    private String remark ="";
    public String getBillingType() {
        return billingType;
    }
    public String getCollectType() {
        return collectType;
    }
    public String getComputationalMethod() {
        return computationalMethod;
    }
    public String getRate() {
        return rate;
    }
    public String getRemark() {
        return remark;
    }
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }
    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }
    public void setComputationalMethod(String computationalMethod) {
        this.computationalMethod = computationalMethod;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}