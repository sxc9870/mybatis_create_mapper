package lm;

public class CarInsurance {

    /**
     * 车辆品牌
     */
    private String brand="";

    /**
     * 订单号
     */
    private String orderId="";

    /**
     * 车架号
     */
    private String vinNo="";

    /**
     * 报告生成时间
     */
    private String reportCreateDate="";

    /**
     * summary出现理赔摘要
     */
    private String claimSettlementSummary="";

    /**
    
    */
    private String remark="";

    public String getBrand() {
        return brand;
    }

    public String getClaimSettlementSummary() {
        return claimSettlementSummary;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getRemark() {
        return remark;
    }

    public String getReportCreateDate() {
        return reportCreateDate;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setClaimSettlementSummary(String claimSettlementSummary) {
        this.claimSettlementSummary = claimSettlementSummary;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setReportCreateDate(String reportCreateDate) {
        this.reportCreateDate = reportCreateDate;
    }
    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }
}