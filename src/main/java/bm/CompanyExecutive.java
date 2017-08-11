package bm;
public class CompanyExecutive {
    /**
    
    */
    private String name="";;
    /**
     * 性别。0:其他,1:男,2:女。
     */
    private String sex="";;
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
     * 办公电话
     */
    private String officePhone="";;
    /**
     * 固定电话
     */
    private String homePhone="";;
    /**
     * 手机电话
     */
    private String mobilePhone="";;
    /**
     * 领导类型。0:法定代表人,1:股东,2:高管。
     */
    private String leaderType="";;
    /**
     * 职位
     */
    private String position="";;
    /**
    
    */
    private String remark="";;
    public String getCertificateNo() {
        return certificateNo;
    }
    public String getCertificateType() {
        return certificateType;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public String getLeaderType() {
        return leaderType;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getName() {
        return name;
    }
    public String getOfficePhone() {
        return officePhone;
    }
    public String getPosition() {
        return position;
    }
    public String getRemark() {
        return remark;
    }
    public String getSex() {
        return sex;
    }
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public void setLeaderType(String leaderType) {
        this.leaderType = leaderType;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}