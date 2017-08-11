package bm;
public class PersonalCar {
    /**
     * 车牌号
     */
    private String plateNumber="";
    /**
     * 里程
     */
    private String mileage="";;
    /**
     * 估值
     */
    private String valuation="";;
    /**
     * 品牌
     */
    private String brand="";;
    /**
     * 车辆型号
     */
    private String vehicleModel="";;
    /**
     * 车架号
     */
    private String vinNo="";;
    /**
     * 报废年限
     */
    private String serviceLife="";;
    /**
    
    */
    private String remark="";;
    public String getBrand() {
        return brand;
    }
    public String getMileage() {
        return mileage;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public String getRemark() {
        return remark;
    }
    public String getServiceLife() {
        return serviceLife;
    }
    public String getValuation() {
        return valuation;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public String getVinNo() {
        return vinNo;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
    }
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }
}