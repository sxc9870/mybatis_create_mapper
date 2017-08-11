package bm;
public class BankFlowDetail {
    /**
     * 记录时间
     */
    private String recordDate="";;
    /**
     * 进出额
     */
    private String amount="";;
    /**
     * 余额
     */
    private String balance="";;
  
    private String remark="";;
    public String getAmount() {
        return amount;
    }
    public String getBalance() {
        return balance;
    }
    public String getRecordDate() {
        return recordDate;
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
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
    
    */
}