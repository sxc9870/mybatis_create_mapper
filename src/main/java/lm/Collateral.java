package lm;

import java.util.ArrayList;
import java.util.List;

import bm.CommonAttachment;

public class Collateral {
    /**
     * 名称
     */
    private String name="";
    /**
     * 抵押物类型。0:车辆,1:房产。
     */
    private String collateralType ="";
    /**
     * 产权人姓名
     */
    private String ownerName="";
    /**
     * 产权人身份证号
     */
    private String ownerIdcardNo="";
    /**
     * 新品价格
     */
    private String newPrice="";
    /**
     * 发票号码
     */
    private String invoiceNo="";
    /**
     * 估值
     */
    private String valuation="";
    /**
     * 抵押金额
     */
    private String mortgageAmount="";
    /**
     * 备注
     */
    private String remark="";
    /**
     * LM_车辆档案
     */
    private CarArchives carArchives=new CarArchives();
    /**
     * LM_车辆保险
     */
    private List<CarInsurance> carInsurance=new ArrayList<>();
    {
        carInsurance.add(new CarInsurance());
    }
    
    
    private List< CommonAttachment> commonAttachment=new ArrayList<>();
    {
        commonAttachment.add(new CommonAttachment());
    }
    public List<CommonAttachment> getCommonAttachment() {
        return commonAttachment;
    }
    public void setCommonAttachment(List<CommonAttachment> commonAttachment) {
        this.commonAttachment = commonAttachment;
    }
    public CarArchives getCarArchives() {
        return carArchives;
    }
    public List<CarInsurance> getCarInsurance() {
        return carInsurance;
    }
    public String getCollateralType() {
        return collateralType;
    }
    public String getInvoiceNo() {
        return invoiceNo;
    }
    public String getMortgageAmount() {
        return mortgageAmount;
    }
    public String getName() {
        return name;
    }
    public String getNewPrice() {
        return newPrice;
    }
    public String getOwnerIdcardNo() {
        return ownerIdcardNo;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getRemark() {
        return remark;
    }
    public String getValuation() {
        return valuation;
    }
    public void setCarArchives(CarArchives carArchives) {
        this.carArchives = carArchives;
    }
    public void setCarInsurance(List<CarInsurance> carInsurance) {
        this.carInsurance = carInsurance;
    }
    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    public void setMortgageAmount(String mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }
    public void setOwnerIdcardNo(String ownerIdcardNo) {
        this.ownerIdcardNo = ownerIdcardNo;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }
}