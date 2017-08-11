package lm;

public class CarArchives {

    /**
     * 订单号
     */
    private String orderId="";
    /**
     * 车辆号码/牌照
     */
    private String plateNumber="";
    /**
     * 机动车所有人
     */
    private String owner="";
    /**
     * 身份证号码
     */
    private String idcardNo="";
    /**
     * 中文品牌
     */
    private String brandCn="";
    /**
     * 车辆型号
     */
    private String vehicleModel="";
    /**
     * 车辆识别代号
     */
    private String vehicleIdentificationCode="";
    /**
     * 发动机号
     */
    private String engineNumber="";
    /**
     * 使用性质。0:家庭自用汽车,1:企业飞营业客车 ,2:党政机关、事业团体非营业客车,3:飞营业货车,4:出租、租赁营业客车。
     */
    private String useType="";
    /**
     * 登记机关
     */
    private String registrationAuthority="";
    /**
     * 车身颜色
     */
    private String carColor="";
    /**
     * 核定载客
     */
    private String passengerCount="";
    /**
     * 行驶证芯编码
     */
    private String driverLicenseCode="";
    /**
     * 初次登记日期
     */
    private String initialRegistrationDate ="";
    /**
     * 出厂登记日期
     */
    private String registrationDate="";
    /**
     * 强制报废期止
     */
    private String scrapDate="";
    /**
     * 保险有效期止
     */
    private String insuranceValidityDate="";
    /**
     * 校验有效期止
     */
    private String verifyValidityDate="";
    /**
     * 新能源汽车
     */
    private String isNewEnergy="";
    /**
     * 排量功率
     */
    private String power="";
    /**
     * 机动车状态。0:正常,1:转出,2:被盗抢,3:停驶,4:注销,5:违法未处理,6:海关监管,7:事故未处理,8:嫌疑车,9:查封,10:暂扣,
     * 11:强制注销,12:事故逃逸,13:锁定,14:退车 。
     */
    private String carStatus="";
    /**
     * 事故逃逸
     */
    private String accidentEscape="";
    /**
     * 车辆套牌
     */
    private String vehicleDeck="";
    /**
     * 车辆盗抢
     */
    private String vehicleRobbery="";
    /**
     * 抵押标记
     */
    private String mortgageSign="";
    /**
     * 抵押时间
     */
    private String mortgageTime="";
    /**
     * 抵押权人
     */
    private String mortgageHolder="";
    /**
    
    */
    private String remark="";

    public String getAccidentEscape() {
        return accidentEscape;
    }

    public String getBrandCn() {
        return brandCn;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public String getDriverLicenseCode() {
        return driverLicenseCode;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public String getInitialRegistrationDate() {
        return initialRegistrationDate;
    }

    public String getInsuranceValidityDate() {
        return insuranceValidityDate;
    }

    public String getIsNewEnergy() {
        return isNewEnergy;
    }

    public String getMortgageHolder() {
        return mortgageHolder;
    }

    public String getMortgageSign() {
        return mortgageSign;
    }

    public String getMortgageTime() {
        return mortgageTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOwner() {
        return owner;
    }

    public String getPassengerCount() {
        return passengerCount;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getPower() {
        return power;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public String getRemark() {
        return remark;
    }

    public String getScrapDate() {
        return scrapDate;
    }

    public String getUseType() {
        return useType;
    }

    public String getVehicleDeck() {
        return vehicleDeck;
    }

    public String getVehicleIdentificationCode() {
        return vehicleIdentificationCode;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleRobbery() {
        return vehicleRobbery;
    }

    public String getVerifyValidityDate() {
        return verifyValidityDate;
    }

    public void setAccidentEscape(String accidentEscape) {
        this.accidentEscape = accidentEscape;
    }

    public void setBrandCn(String brandCn) {
        this.brandCn = brandCn;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public void setDriverLicenseCode(String driverLicenseCode) {
        this.driverLicenseCode = driverLicenseCode;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public void setInitialRegistrationDate(String initialRegistrationDate) {
        this.initialRegistrationDate = initialRegistrationDate;
    }

    public void setInsuranceValidityDate(String insuranceValidityDate) {
        this.insuranceValidityDate = insuranceValidityDate;
    }

    public void setIsNewEnergy(String isNewEnergy) {
        this.isNewEnergy = isNewEnergy;
    }

    public void setMortgageHolder(String mortgageHolder) {
        this.mortgageHolder = mortgageHolder;
    }

    public void setMortgageSign(String mortgageSign) {
        this.mortgageSign = mortgageSign;
    }

    public void setMortgageTime(String mortgageTime) {
        this.mortgageTime = mortgageTime;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPassengerCount(String passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setScrapDate(String scrapDate) {
        this.scrapDate = scrapDate;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public void setVehicleDeck(String vehicleDeck) {
        this.vehicleDeck = vehicleDeck;
    }

    public void setVehicleIdentificationCode(String vehicleIdentificationCode) {
        this.vehicleIdentificationCode = vehicleIdentificationCode;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleRobbery(String vehicleRobbery) {
        this.vehicleRobbery = vehicleRobbery;
    }

    public void setVerifyValidityDate(String verifyValidityDate) {
        this.verifyValidityDate = verifyValidityDate;
    }
}