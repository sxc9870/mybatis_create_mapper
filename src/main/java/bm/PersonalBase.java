package bm;
public class PersonalBase {
    private String borrowerId="";
    public String getBorrowerId() {
        return borrowerId;
    }
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }
    /**
     * 姓名
     */
    private String name="";;
    /**
     * 曾用名
     */
    private String formerName="";;
    /**
     * 性别。0:其他,1:男,2:女。
     */
    private String sex="";;

    /**
     * 风险评估
     */
    private String riskAssessment="";;
    /**
     * 出生年月
     */
    private String birthDate="";;
    /**
     * 婚姻状况。0:未婚,1:已婚,2:离异,3:丧偶。
     */
    private String maritalStatus="";;
    /**
     * 供养人数
     */
    private String supportCount="";;
    /**
     * 家庭人口数量
     */
    private String familyCount="";;
    /**
     * 教育程度。0:未上学,1:小学,2:初中,3:中专/高中,4:专科,5:本科,6:硕士研究生,7:博士研究生,8:博士后。
     */
    private String educationLevel="";;
    /**
     * 移动电话
     */
    private String mobilePhone="";;
    /**
     * 固定电话
     */
    private String telphone="";
    /**
     * 城市
     */
    private String cityCode="";;
    /**
     * 即时通讯
     */
    private String instantMessaging="";;
    /**
     * 现住址
     */
    private String currentAddress="";;
    /**
     * 邮寄地址
     */
    private String shippingAddress="";;
    /**
     * 邮政编码
     */
    private String zipCode="";;
    /**
     * 电子邮箱
     */
    private String email="";;
    /**
     * 来居住地时间
     */
    private String arrivalTime="";;
    /**
     * 户口类型。0:农村,1:非农村。
     */
    private String householdDegisterType="";;
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
     * 证件有效期
     */
    private String certificateValidityDate="";;
    /**
     * 驾驶证
     */
    private String driverLicense="";;
    /**
    
    */
    private String remark="";;
    public String getArrivalTime() {
        return arrivalTime;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getCertificateNo() {
        return certificateNo;
    }
    public String getCertificateType() {
        return certificateType;
    }
    public String getCertificateValidityDate() {
        return certificateValidityDate;
    }
     
    public String getCurrentAddress() {
        return currentAddress;
    }
    public String getDriverLicense() {
        return driverLicense;
    }
    public String getEducationLevel() {
        return educationLevel;
    }
    public String getEmail() {
        return email;
    }
    public String getFamilyCount() {
        return familyCount;
    }
    public String getFormerName() {
        return formerName;
    }
    public String getHouseholdDegisterType() {
        return householdDegisterType;
    }
    public String getInstantMessaging() {
        return instantMessaging;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getName() {
        return name;
    }
    public String getRemark() {
        return remark;
    }
    public String getRiskAssessment() {
        return riskAssessment;
    }
    public String getSex() {
        return sex;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public String getSupportCount() {
        return supportCount;
    }
    public String getTelphone() {
        return telphone;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
    public void setCertificateValidityDate(String certificateValidityDate) {
        this.certificateValidityDate = certificateValidityDate;
    }
    
    public String getCityCode() {
        return cityCode;
    }
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFamilyCount(String familyCount) {
        this.familyCount = familyCount;
    }
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }
    public void setHouseholdDegisterType(String householdDegisterType) {
        this.householdDegisterType = householdDegisterType;
    }
    public void setInstantMessaging(String instantMessaging) {
        this.instantMessaging = instantMessaging;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public void setSupportCount(String supportCount) {
        this.supportCount = supportCount;
    }
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}