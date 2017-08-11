package bm;
public class PersonalIncome {
    /**
     * 个人主要收入来源
     */
    private String personalIncomeSource="";;
    /**
     * 个人月收入
     */
    private String personalMonthlyIncome="";;
    /**
     * 个人年收入
     */
    private String personalAnnualIncome="";;
    /**
     * 家庭主要收入来源
     */
    private String familyIncomeSource="";;
    /**
     * 家庭月收入
     */
    private String familyMonthlyIncome="";;
    /**
     * 家庭年收入
     */
    private String familyAnnualIncome="";;
    /**
    
    */
    private String remark="";;
    public String getFamilyAnnualIncome() {
        return familyAnnualIncome;
    }
    public String getFamilyIncomeSource() {
        return familyIncomeSource;
    }
    public String getFamilyMonthlyIncome() {
        return familyMonthlyIncome;
    }
    public String getPersonalAnnualIncome() {
        return personalAnnualIncome;
    }
    public String getPersonalIncomeSource() {
        return personalIncomeSource;
    }
    public String getPersonalMonthlyIncome() {
        return personalMonthlyIncome;
    }
    public String getRemark() {
        return remark;
    }
    public void setFamilyAnnualIncome(String familyAnnualIncome) {
        this.familyAnnualIncome = familyAnnualIncome;
    }
    public void setFamilyIncomeSource(String familyIncomeSource) {
        this.familyIncomeSource = familyIncomeSource;
    }
    public void setFamilyMonthlyIncome(String familyMonthlyIncome) {
        this.familyMonthlyIncome = familyMonthlyIncome;
    }
    public void setPersonalAnnualIncome(String personalAnnualIncome) {
        this.personalAnnualIncome = personalAnnualIncome;
    }
    public void setPersonalIncomeSource(String personalIncomeSource) {
        this.personalIncomeSource = personalIncomeSource;
    }
    public void setPersonalMonthlyIncome(String personalMonthlyIncome) {
        this.personalMonthlyIncome = personalMonthlyIncome;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}