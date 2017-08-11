package lm;

import bm.Bank;

public class Disbursement {

    /**
     * 开户行(发放到银行账户)
     */
    private Bank bank=new Bank();

    /**
     * 发放状态。0:未发放,1:已发放。
     */
    private String disbursementStatus="";
    /**
     * 贷款合同编号
     */
    private String contractNo="";
    /**
     * 申请贷款金额
     */
    private String applyAmount="";
    /**
     * 终审贷款金额
     */
    private String approvalAmount="";
    /**
     * 预收费用金额;扣除本金另收现金
     */
    private String preCostAmount="";
    /**
     * 扣除预收利息
     */
    private String preInterest="";
    /**
     * 实际支付金额
     */
    private String realDisbursementAmount="";
    /**
     * 支付方式;三方支付平台现金银行转账应收票据债权转让。0:第三方支付平台,1:现金,2:银行转账,3:应收票据,4:债权转让。
     */
    private String payType="";
    /**
     * 备注
     */
    private String remark="";

    /**
     * 发放金额
     */
    private String disbursementAmount="";
    /**
     * 发放月利率
     */
    private String disbursementMonthlyInterestRate="";
    /**
     * 发放期限
     */
    private String disbursementDate="";
    public String getApplyAmount() {
        return applyAmount;
    }
    public String getApprovalAmount() {
        return approvalAmount;
    }
    public Bank getBank() {
        return bank;
    }
    public String getContractNo() {
        return contractNo;
    }
    public String getDisbursementAmount() {
        return disbursementAmount;
    }
    public String getDisbursementDate() {
        return disbursementDate;
    }
    public String getDisbursementMonthlyInterestRate() {
        return disbursementMonthlyInterestRate;
    }
    public String getDisbursementStatus() {
        return disbursementStatus;
    }
    public String getPayType() {
        return payType;
    }
    public String getPreCostAmount() {
        return preCostAmount;
    }
    public String getPreInterest() {
        return preInterest;
    }
    public String getRealDisbursementAmount() {
        return realDisbursementAmount;
    }
    public String getRemark() {
        return remark;
    }
    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }
    public void setApprovalAmount(String approvalAmount) {
        this.approvalAmount = approvalAmount;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
    public void setDisbursementAmount(String disbursementAmount) {
        this.disbursementAmount = disbursementAmount;
    }
    public void setDisbursementDate(String disbursementDate) {
        this.disbursementDate = disbursementDate;
    }
    public void setDisbursementMonthlyInterestRate(String disbursementMonthlyInterestRate) {
        this.disbursementMonthlyInterestRate = disbursementMonthlyInterestRate;
    }
    public void setDisbursementStatus(String disbursementStatus) {
        this.disbursementStatus = disbursementStatus;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public void setPreCostAmount(String preCostAmount) {
        this.preCostAmount = preCostAmount;
    }
    public void setPreInterest(String preInterest) {
        this.preInterest = preInterest;
    }
    public void setRealDisbursementAmount(String realDisbursementAmount) {
        this.realDisbursementAmount = realDisbursementAmount;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}