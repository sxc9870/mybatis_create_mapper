package bm;
public class PersonalAdditional {
    /**
     * 手机运营商。0:移动,1:联通,2:电信,3:虚拟。
     */
    private String phoneServiceProviders="";;
    /**
     * 手机归属地
     */
    private String phoneAttribution="";;
    /**
     * 手机账号密码
     */
    private String phoneAccountPwd="";;
    /**
     * 借呗额度
     */
    private String jiebeiLimit="";;
    /**
     * 花呗额度
     */
    private String huabeiLimit="";;
    /**
     * 借贷宝账号
     */
    private String jiedaibaoAccount="";;
    /**
     * 支付宝账号
     */
    private String zhifubaoAccount="";;
    /**
     * 芝麻信用分
     */
    private String zhimaCredit="";;
    /**
    
    */
    private String remark="";;
    public String getHuabeiLimit() {
        return huabeiLimit;
    }
    public String getJiebeiLimit() {
        return jiebeiLimit;
    }
    public String getJiedaibaoAccount() {
        return jiedaibaoAccount;
    }
    public String getPhoneAccountPwd() {
        return phoneAccountPwd;
    }
    public String getPhoneAttribution() {
        return phoneAttribution;
    }
    public String getPhoneServiceProviders() {
        return phoneServiceProviders;
    }
    public String getRemark() {
        return remark;
    }
    public String getZhifubaoAccount() {
        return zhifubaoAccount;
    }
    public String getZhimaCredit() {
        return zhimaCredit;
    }
    public void setHuabeiLimit(String huabeiLimit) {
        this.huabeiLimit = huabeiLimit;
    }
    public void setJiebeiLimit(String jiebeiLimit) {
        this.jiebeiLimit = jiebeiLimit;
    }
    public void setJiedaibaoAccount(String jiedaibaoAccount) {
        this.jiedaibaoAccount = jiedaibaoAccount;
    }
    public void setPhoneAccountPwd(String phoneAccountPwd) {
        this.phoneAccountPwd = phoneAccountPwd;
    }
    public void setPhoneAttribution(String phoneAttribution) {
        this.phoneAttribution = phoneAttribution;
    }
    public void setPhoneServiceProviders(String phoneServiceProviders) {
        this.phoneServiceProviders = phoneServiceProviders;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setZhifubaoAccount(String zhifubaoAccount) {
        this.zhifubaoAccount = zhifubaoAccount;
    }
    public void setZhimaCredit(String zhimaCredit) {
        this.zhimaCredit = zhimaCredit;
    }
}