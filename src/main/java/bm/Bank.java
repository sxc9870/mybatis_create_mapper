package bm;
public class Bank {
    /**
    
    */
    private String bankCode="";
    /**
     * 银行名称
     */
    private String bankName="";
    /**
     * 分行/开户行名称
     */
    private String bankBranchName="";
    /**
     * 银行账号
     */
    private String accountNo="";
    /**
    
    */
    private String remark="";
    public String getAccountNo() {
        return accountNo;
    }
    public String getBankBranchName() {
        return bankBranchName;
    }
    public String getBankCode() {
        return bankCode;
    }
    public String getBankName() {
        return bankName;
    }
    public String getRemark() {
        return remark;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}