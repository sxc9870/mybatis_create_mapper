package bm;
public class PersonalCompany {
    /**
     * 名称
     */
    private String name="";;
    /**
     * 公司性质
     */
    private String companyType="";;
    /**
     * 营业执照号码
     */
    private String businessLicense="";;
    /**
     * 注册资本
     */
    private String registerCapital="";;
    /**
     * 机构代码证
     */
    private String institutionCode="";;
    /**
     * 法定代表人
     */
    private String corporation="";;
    /**
     * 经营地址
     */
    private String address="";;
    /**
     * 固定电话
     */
    private String telephone="";;
    /**
    
    */
    private String remark="";;
    public String getAddress() {
        return address;
    }
    public String getBusinessLicense() {
        return businessLicense;
    }
    public String getCompanyType() {
        return companyType;
    }
    public String getCorporation() {
        return corporation;
    }
    public String getInstitutionCode() {
        return institutionCode;
    }
    public String getName() {
        return name;
    }
    public String getRegisterCapital() {
        return registerCapital;
    }
    public String getRemark() {
        return remark;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }
    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRegisterCapital(String registerCapital) {
        this.registerCapital = registerCapital;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}