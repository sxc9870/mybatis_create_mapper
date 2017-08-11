package bm;
public class PersonalHouse {
    /**
     * 产权人
     */
    private String owner="";;
    /**
     * 房屋性质。0:商品房,1:房改房,2:存量房,3:集资房。
     */
    private String houseType="";;
    /**
     * 住房面积
     */
    private String acreage="";;
    /**
     * 估值
     */
    private String valuation="";;
    /**
     * 地址
     */
    private String address="";;
    /**
    
    */
    private String remark="";;
    public String getAcreage() {
        return acreage;
    }
    public String getAddress() {
        return address;
    }
    public String getHouseType() {
        return houseType;
    }
    public String getOwner() {
        return owner;
    }
    public String getRemark() {
        return remark;
    }
    public String getValuation() {
        return valuation;
    }
    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }
}