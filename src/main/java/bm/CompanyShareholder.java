package bm;
public class CompanyShareholder {
    /**
     * 股东姓名
     */
    private String shareholderName="";;
    /**
     * 股东类型。0:自然人,1:法人。
     */
    private String shareholderType="";;
    /**
     * 证件类型。1:身份证,2:军官证,3:国内护照,4:户口本,5:学员证,6:退休证,7:临时身份证,8:组织机构代码,9:营业执照,A:武警证,B
     * :士兵证,C:回乡证,D:外国护照,E:港澳台居民身份证。
     */
    private String certificateType="";;
    /**
     * 证件号码
     */
    private String certificateNo="";;
    /**
     * 持股比例
     */
    private String shareholdRatio="";;
    /**
     * 持股金额
     */
    private String shareholdAmount="";;
    /**
    
    */
    private String remark="";;
    public String getCertificateNo() {
        return certificateNo;
    }
    public String getCertificateType() {
        return certificateType;
    }
    public String getRemark() {
        return remark;
    }
    public String getShareholdAmount() {
        return shareholdAmount;
    }
    public String getShareholderName() {
        return shareholderName;
    }
    public String getShareholderType() {
        return shareholderType;
    }
    public String getShareholdRatio() {
        return shareholdRatio;
    }
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setShareholdAmount(String shareholdAmount) {
        this.shareholdAmount = shareholdAmount;
    }
    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }
    public void setShareholderType(String shareholderType) {
        this.shareholderType = shareholderType;
    }
    public void setShareholdRatio(String shareholdRatio) {
        this.shareholdRatio = shareholdRatio;
    }
}