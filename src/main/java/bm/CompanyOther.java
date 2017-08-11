package bm;
public class CompanyOther {
    /**
     * 行业
     */
    private String industry="";;
    /**
     * 品牌
     */
    private String brand="";;
    /**
     * 是否上市
     */
    private String isQuotedCompany="";;
    /**
     * 是否新企业
     */
    private String isNewCompany="";;
    /**
     * 是否集体公司
     */
    private String isCollectiveCompany="";;
    /**
     * 是否有进口经营权
     */
    private String isImportLicense="";;
    /**
    
    */
    private String remark="";;
    public String getBrand() {
        return brand;
    }
    public String getIndustry() {
        return industry;
    }
    public String getIsCollectiveCompany() {
        return isCollectiveCompany;
    }
    public String getIsImportLicense() {
        return isImportLicense;
    }
    public String getIsNewCompany() {
        return isNewCompany;
    }
    public String getIsQuotedCompany() {
        return isQuotedCompany;
    }
    public String getRemark() {
        return remark;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    public void setIsCollectiveCompany(String isCollectiveCompany) {
        this.isCollectiveCompany = isCollectiveCompany;
    }
    public void setIsImportLicense(String isImportLicense) {
        this.isImportLicense = isImportLicense;
    }
    public void setIsNewCompany(String isNewCompany) {
        this.isNewCompany = isNewCompany;
    }
    public void setIsQuotedCompany(String isQuotedCompany) {
        this.isQuotedCompany = isQuotedCompany;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}