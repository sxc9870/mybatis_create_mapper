package bm;
public class CompanyLiability {
    /**
     * 本负债
     */
    private String borrowerName="";;
    /**
     * 银行
     */
    private String bankName="";;
    /**
     * 金额
     */
    private String amount="";;
    /**
     * 余额
     */
    private String balance="";;
    /**
     * 开始时间
     */
    private String startDate="";;
    /**
     * 结束时间
     */
    private String endDate="";;
    /**
     * 还款方式。0:逐笔计息,1:"按月还息,2:到期还本付息,3:"预收全部利息,4:
     * "预收全部利息,5:等额本金,6:等额本息,7:等本等息,8:"等额本金。
     */
    private String repaymentType="";;
    /**
     * 担保方式。0:质押(含保证金),1:抵押,2:保证,3:信用,4:组合(含自然人保证),5:组合(不含自然人保证),6:农户联保。
     */
    private String guaranteeType="";;
    /**
    
    */
    private String remark="";;
    public String getAmount() {
        return amount;
    }
    public String getBalance() {
        return balance;
    }
    public String getBankName() {
        return bankName;
    }
    public String getBorrowerName() {
        return borrowerName;
    }
    public String getEndDate() {
        return endDate;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public String getRemark() {
        return remark;
    }
    public String getRepaymentType() {
        return repaymentType;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}