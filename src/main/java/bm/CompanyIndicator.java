package bm;
public class CompanyIndicator {
    /**
     * 经营指标。0:净利润,1:纳税收入,2:销售额,3:采购金额,4:月均能耗。
     */
    private String businessIndicator="";;
    /**
     * 核算方法
     */
    private String businessAccountType="";;
    /**
     * 年度销售额
     */
    private String annualSales="";;
    /**
     * 月销售额
     */
    private String monthlySales="";;
    /**
     * 平均年度销售额
     */
    private String annualSalesAvg="";;
    /**
    
    */
    private String remark="";;
    public String getAnnualSales() {
        return annualSales;
    }
    public String getAnnualSalesAvg() {
        return annualSalesAvg;
    }
    public String getBusinessAccountType() {
        return businessAccountType;
    }
    public String getBusinessIndicator() {
        return businessIndicator;
    }
    public String getMonthlySales() {
        return monthlySales;
    }
    public String getRemark() {
        return remark;
    }
    public void setAnnualSales(String annualSales) {
        this.annualSales = annualSales;
    }
    public void setAnnualSalesAvg(String annualSalesAvg) {
        this.annualSalesAvg = annualSalesAvg;
    }
    public void setBusinessAccountType(String businessAccountType) {
        this.businessAccountType = businessAccountType;
    }
    public void setBusinessIndicator(String businessIndicator) {
        this.businessIndicator = businessIndicator;
    }
    public void setMonthlySales(String monthlySales) {
        this.monthlySales = monthlySales;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}