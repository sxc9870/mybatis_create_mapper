package bm;
public class CompanyBadDebt {
    /**
     * 未结清的不良贷款业务种类
     */
    private String businessType="";;
    /**
     * 合同编号
     */
    private String contractNo="";;
    /**
     * 金额
     */
    private String amount="";;
    /**
     * 余额
     */
    private String balance="";;
    /**
    
    */
    private String remark="";;
    public String getAmount() {
        return amount;
    }
    public String getBalance() {
        return balance;
    }
    public String getBusinessType() {
        return businessType;
    }
    public String getContractNo() {
        return contractNo;
    }
    public String getRemark() {
        return remark;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}