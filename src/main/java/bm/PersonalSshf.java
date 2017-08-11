package bm;
public class PersonalSshf {
    /**
     * 社保单位名称
     */
    private String ssCompany="";;
    /**
     * 社保缴存基数
     */
    private String ssPayBase="";;
    /**
     * 社保缴费截止年月
     */
    private String ssPayStopDate="";;
    /**
     * 公积金单位名称
     */
    private String hfCompany="";;
    /**
     * 公积金开户日期
     */
    private String hfOpenDate="";;
    /**
     * 公积金缴费截止年月
     */
    private String hfPayStopDate="";;
    /**
     * 公积金月缴额
     */
    private String hfMonthPay="";;
    /**
     * 公积金查询日期
     */
    private String hfQueryDate="";;
    /**
     * 公积金查询时余额
     */
    private String hrQueryBalance="";;
    /**
    
    */
    private String remark="";;
    public String getHfCompany() {
        return hfCompany;
    }
    public String getHfMonthPay() {
        return hfMonthPay;
    }
    public String getHfOpenDate() {
        return hfOpenDate;
    }
    public String getHfPayStopDate() {
        return hfPayStopDate;
    }
    public String getHfQueryDate() {
        return hfQueryDate;
    }
    public String getHrQueryBalance() {
        return hrQueryBalance;
    }
    public String getRemark() {
        return remark;
    }
    public String getSsCompany() {
        return ssCompany;
    }
    public String getSsPayBase() {
        return ssPayBase;
    }
    public String getSsPayStopDate() {
        return ssPayStopDate;
    }
    public void setHfCompany(String hfCompany) {
        this.hfCompany = hfCompany;
    }
    public void setHfMonthPay(String hfMonthPay) {
        this.hfMonthPay = hfMonthPay;
    }
    public void setHfOpenDate(String hfOpenDate) {
        this.hfOpenDate = hfOpenDate;
    }
    public void setHfPayStopDate(String hfPayStopDate) {
        this.hfPayStopDate = hfPayStopDate;
    }
    public void setHfQueryDate(String hfQueryDate) {
        this.hfQueryDate = hfQueryDate;
    }
    public void setHrQueryBalance(String hrQueryBalance) {
        this.hrQueryBalance = hrQueryBalance;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setSsCompany(String ssCompany) {
        this.ssCompany = ssCompany;
    }
    public void setSsPayBase(String ssPayBase) {
        this.ssPayBase = ssPayBase;
    }
    public void setSsPayStopDate(String ssPayStopDate) {
        this.ssPayStopDate = ssPayStopDate;
    }
}