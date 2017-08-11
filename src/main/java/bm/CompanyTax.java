package bm;
public class CompanyTax {
    /**
     * 税种。0:营业税,1:增值税,2:企业所得税,3:城建税,4:教育费附加。
     */
    private String taxType="";;
    /**
     * 余额
     */
    private String balance="";;
    /**
     * 日期
     */
    private String taxDate="";;
    /**
     * 说明
     */
    private String remark="";;
    public String getBalance() {
        return balance;
    }
    public String getRemark() {
        return remark;
    }
    public String getTaxDate() {
        return taxDate;
    }
    public String getTaxType() {
        return taxType;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }
}