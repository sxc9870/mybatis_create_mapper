package bm;
public class CompanyChannel {
    /**
     * 渠道类型
     */
    private String channelType="";;
    /**
     * 合作单位
     */
    private String cooperativeCompany="";;
    /**
     * 合作性质
     */
    private String cooperativeType="";;
    /**
     * 合作年限
     */
    private String cooperativeAgeLimit="";;
    /**
     * 结算方式
     */
    private String settlementType="";;
    /**
     * 应付账款
     */
    private String payableAccount="";;
    /**
     * 其他说明
     */
    private String remark="";;
    public String getChannelType() {
        return channelType;
    }
    public String getCooperativeAgeLimit() {
        return cooperativeAgeLimit;
    }
    public String getCooperativeCompany() {
        return cooperativeCompany;
    }
    public String getCooperativeType() {
        return cooperativeType;
    }
    public String getPayableAccount() {
        return payableAccount;
    }
    public String getRemark() {
        return remark;
    }
    public String getSettlementType() {
        return settlementType;
    }
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
    public void setCooperativeAgeLimit(String cooperativeAgeLimit) {
        this.cooperativeAgeLimit = cooperativeAgeLimit;
    }
    public void setCooperativeCompany(String cooperativeCompany) {
        this.cooperativeCompany = cooperativeCompany;
    }
    public void setCooperativeType(String cooperativeType) {
        this.cooperativeType = cooperativeType;
    }
    public void setPayableAccount(String payableAccount) {
        this.payableAccount = payableAccount;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }
}