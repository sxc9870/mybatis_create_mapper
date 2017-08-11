package lm;

public class Coborrower {

    /**
    
    */
    private String name="";
    /**
     * 证件类型。1:身份证,2:军官证,3:国内护照,4:户口本,5:学员证,6:退休证,7:临时身份证,8:组织机构代码,9:营业执照,A:武警证,B
     * :士兵证,C:回乡证,D:外国护照,E:港澳台居民身份证。
     */
    private String certificateType="";
    /**
     * 证件号码
     */
    private String certificateNo="";
    /**
    
    */
    private String phone="";
    /**
    
    */
    private String remark="";
    public String getCertificateNo() {
        return certificateNo;
    }
    public String getCertificateType() {
        return certificateType;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getRemark() {
        return remark;
    }
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}