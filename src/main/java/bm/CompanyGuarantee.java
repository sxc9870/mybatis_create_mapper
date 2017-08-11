package bm;
public class CompanyGuarantee {
    /**
     * 担保类别。0:担保,1:被担保。
     */
    private String guaranteeCategory="";;
    /**
     * 金额
     */
    private String amount="";;
    /**
     * 担保状态。0:有效。
     */
    private String guaranteeStatus="";;
    /**
     * 合同编号
     */
    private String contractNo="";;
    /**
     * 金融机构
     */
    private String institution="";;
    /**
     * 备注
     */
    private String remark="";;
    public String getAmount() {
        return amount;
    }
    public String getContractNo() {
        return contractNo;
    }
    public String getGuaranteeCategory() {
        return guaranteeCategory;
    }
    public String getGuaranteeStatus() {
        return guaranteeStatus;
    }
    public String getInstitution() {
        return institution;
    }
    public String getRemark() {
        return remark;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
    public void setGuaranteeCategory(String guaranteeCategory) {
        this.guaranteeCategory = guaranteeCategory;
    }
    public void setGuaranteeStatus(String guaranteeStatus) {
        this.guaranteeStatus = guaranteeStatus;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}