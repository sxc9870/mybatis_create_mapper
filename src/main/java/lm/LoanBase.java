package lm;

import java.util.ArrayList;
import java.util.List;

import bm.CommonAttachment;

public class LoanBase {
    
    private String  borrowerId="",loanBaseId="",loanStatus="";
    public String getLoanBaseId() {
        return loanBaseId;
    }
    public void setLoanBaseId(String loanBaseId) {
        this.loanBaseId = loanBaseId;
    }
    public String getLoanStatus() {
        return loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }
    public String getBorrowerId() {
        return borrowerId;
    }
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }
    /**
     * 业务编号
     */
    private String businessNo="";
    /**
     * 合同编号
     */
    private String contractNo="";
    /**
     * 业务来源。0:线上申请,1:电话营销。
     */
    private String businessSource="";
    /**
     * 贷款类型。0:车贷,1:现金贷,2:消费贷,3:供应链,4:房贷,5:信用贷,6:小额车贷。
     */
    private String loanType="";
    /**
     * 是否需要抵押品审核
     */
    private String isNeedCollateralAudit="";
    /**
     * 贷款投向。0:涉农,1:小微企业,2:其他。
     */
    private String loanInvest="";
    /**
     * 申请金额
     */
    private String applyAmount="";
    /**
     * 贷款用途。0:车贷,1:房贷,2:消费,3:周转,4:其他。
     */
    private String loanPurpose="";
    /**
     * 贷款期限
     */
    private String loanTerm="";
    /**
     * 月利率
     */
    private String monthlyInterestRate="";
    /**
     * 逾期上浮月利率
     */
    private String overdueMonthlyInterestRate="";
    /**
     * 违约金月利率
     */
    private String penaltyMonthlyInterestRate="";
    /**
     * 期望月还款额
     */
    private String expectedMonthlyPayment="";
    /**
     * 还款日
     */
    private String repaymentDate="";
    /**
     * 申请日期
     */
    private String applyDate="";
    /**
     * 担保方式。0:质押(含保证金),1:抵押,2:保证,3:信用,4:组合(含自然人保证),5:组合(不含自然人保证),6:农户联保。
     */
    private String guaranteeType="";
    /**
     * 还款方式。0:逐笔计息,1:"按月还息,2:到期还本付息,3:"预收全部利息,4:
     * "预收全部利息,5:等额本金,6:等额本息,7:等本等息,8:"等额本金。
     */
    private String repaymentType="";
    /**
     * 还款执行计划方式。0:严格,1:参照。
     */
    private String repaymentExecuteType="";
    /**
     * 投资意向
     */
    private String investmentIntention="";
    /**
     * 计算时间方式。0:计头不记尾。
     */
    private String calculationTimeType="";
    /**
     * 利息计算周期。0:日计息,1:月计息。
     */
    private String interestCalculationCycle="";
    /**
     * 还款日期计算策略。0:每月固定日期。
     */
    private String repaymentCalculationType="";
    /**
     * 还款周期
     */
    private String repaymentCycle="";
    /**
     * 每周期天数
     */
    private String cycleDayCount="";
    /**
     * 计息开始日期。0:发放贷款日期。
     */
    private String interestStartDateType="";
    /**
     * 还款计划是否避开节假日
     */
    private String isAvoidFestival="";
    /**
     * 是否允许提前还款
     */
    private String isAllowAdvanceRepayment="";
    /**
    
    */
    private String remark="";
    /**
     * LM_共同借款人
     */
    private List<Coborrower> coborrower=new ArrayList<>();
   
    /**
     * LM_抵押物
     */
    private List<Collateral> collateral=new ArrayList<>();
    /**
     * LM_费用信息
     */
    private List<CostInfo> costInfo=new ArrayList<>();
    /**
     * 
     */
    private List< CommonAttachment> commonAttachment=new ArrayList<>();
    {
        coborrower.add(new Coborrower());
        collateral.add(new Collateral());
        costInfo.add(new CostInfo());
        commonAttachment.add(new CommonAttachment());
    }
    
    public String getApplyAmount() {
        return applyAmount;
    }
    public String getApplyDate() {
        return applyDate;
    }
    public String getBusinessNo() {
        return businessNo;
    }
    public String getBusinessSource() {
        return businessSource;
    }
    public String getCalculationTimeType() {
        return calculationTimeType;
    }
    public List<Coborrower> getCoborrower() {
        return coborrower;
    }
    public List<Collateral> getCollateral() {
        return collateral;
    }
    public List<CommonAttachment> getCommonAttachment() {
        return commonAttachment;
    }
    public String getContractNo() {
        return contractNo;
    }
    public List<CostInfo> getCostInfo() {
        return costInfo;
    }
    public String getCycleDayCount() {
        return cycleDayCount;
    }
    public String getExpectedMonthlyPayment() {
        return expectedMonthlyPayment;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public String getInterestCalculationCycle() {
        return interestCalculationCycle;
    }
   
    public String getInvestmentIntention() {
        return investmentIntention;
    }
    public String getIsAllowAdvanceRepayment() {
        return isAllowAdvanceRepayment;
    }
    public String getIsAvoidFestival() {
        return isAvoidFestival;
    }
    public String getIsNeedCollateralAudit() {
        return isNeedCollateralAudit;
    }
    public String getLoanInvest() {
        return loanInvest;
    }
    public String getLoanPurpose() {
        return loanPurpose;
    }
    public String getLoanTerm() {
        return loanTerm;
    }
    public String getLoanType() {
        return loanType;
    }
    public String getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    public String getOverdueMonthlyInterestRate() {
        return overdueMonthlyInterestRate;
    }
    public String getPenaltyMonthlyInterestRate() {
        return penaltyMonthlyInterestRate;
    }
    public String getRemark() {
        return remark;
    }
    public String getRepaymentCalculationType() {
        return repaymentCalculationType;
    }
    public String getRepaymentCycle() {
        return repaymentCycle;
    }
    public String getRepaymentDate() {
        return repaymentDate;
    }
    public String getRepaymentExecuteType() {
        return repaymentExecuteType;
    }
    public String getRepaymentType() {
        return repaymentType;
    }
    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }
    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource;
    }
    public void setCalculationTimeType(String calculationTimeType) {
        this.calculationTimeType = calculationTimeType;
    }
    public void setCoborrower(List<Coborrower> coborrower) {
        this.coborrower = coborrower;
    }
    public void setCollateral(List<Collateral> collateral) {
        this.collateral = collateral;
    }
    public void setCommonAttachment(List<CommonAttachment> commonAttachment) {
        this.commonAttachment = commonAttachment;
    }
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
    public void setCostInfo(List<CostInfo> costInfo) {
        this.costInfo = costInfo;
    }
    public void setCycleDayCount(String cycleDayCount) {
        this.cycleDayCount = cycleDayCount;
    }
    public void setExpectedMonthlyPayment(String expectedMonthlyPayment) {
        this.expectedMonthlyPayment = expectedMonthlyPayment;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    public void setInterestCalculationCycle(String interestCalculationCycle) {
        this.interestCalculationCycle = interestCalculationCycle;
    }
     
    public String getInterestStartDateType() {
        return interestStartDateType;
    }
    public void setInterestStartDateType(String interestStartDateType) {
        this.interestStartDateType = interestStartDateType;
    }
    public void setInvestmentIntention(String investmentIntention) {
        this.investmentIntention = investmentIntention;
    }
    public void setIsAllowAdvanceRepayment(String isAllowAdvanceRepayment) {
        this.isAllowAdvanceRepayment = isAllowAdvanceRepayment;
    }
    public void setIsAvoidFestival(String isAvoidFestival) {
        this.isAvoidFestival = isAvoidFestival;
    }
    public void setIsNeedCollateralAudit(String isNeedCollateralAudit) {
        this.isNeedCollateralAudit = isNeedCollateralAudit;
    }
    public void setLoanInvest(String loanInvest) {
        this.loanInvest = loanInvest;
    }
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public void setMonthlyInterestRate(String monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }
    public void setOverdueMonthlyInterestRate(String overdueMonthlyInterestRate) {
        this.overdueMonthlyInterestRate = overdueMonthlyInterestRate;
    }
    public void setPenaltyMonthlyInterestRate(String penaltyMonthlyInterestRate) {
        this.penaltyMonthlyInterestRate = penaltyMonthlyInterestRate;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setRepaymentCalculationType(String repaymentCalculationType) {
        this.repaymentCalculationType = repaymentCalculationType;
    }
    public void setRepaymentCycle(String repaymentCycle) {
        this.repaymentCycle = repaymentCycle;
    }
    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
    public void setRepaymentExecuteType(String repaymentExecuteType) {
        this.repaymentExecuteType = repaymentExecuteType;
    }
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }
}