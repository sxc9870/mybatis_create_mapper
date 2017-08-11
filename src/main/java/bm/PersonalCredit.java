package bm;
public class PersonalCredit {
    /**
     * 信用卡数量
     */
    private String creditCardCount="";;
    /**
     * 信用卡总额度
     */
    private String creditCardTotalAmount="";;
    /**
     * 信用卡使用比例
     */
    private String creditCardUseRatio="";;
    /**
     * 信用卡月供
     */
    private String creditCardMonthlyPayment="";;
    /**
     * 信用卡未结清/未销户账户数
     */
    private String creditCardUncleareUncancelAccountCount="";;
    
    /**
     * 信用卡发生过预期账户数
     */
    private String creditCardOverdueAccountCount="";;
    /**
     * 信用卡有过90天以上预期账户数
     */
    private String creditCardOverdue90AccountCount="";;
    /**
     * 信用卡为他人担保笔数
     */         
    private String creditCardOtherGuaranteeCount="";;
    /**
     * 贷款笔数
     */
    private String loanCount="";;
    /**
     * 贷款总额度
     */
    private String loanTotalAmount="";;
    /**
     * 贷款余额
     */
    private String loanBalance="";;
    /**
     * 贷款月供金额
     */
    private String loanMonthlyPayment="";;
    /**
     * 贷款逾期信息
     */
    private String loadOverdueInfo="";;
    /**
     * 住房贷款未结清/未销户账户数
     */
    private String homeLoanUncleareUncancelAccountCount="";;
    /**
     * 住房贷款发生过预期账户数
     */
    private String homeLoanOverdueAccountCount="";;
    /**
     * 住房贷款有过90天以上预期账户数
     */
    private String homeLoanOverdue90AccountCount="";;
    /**
     * 住房贷款为他人担保笔数
     */
    private String homeLoanOtherGuaranteeCount="";;
    /**
     * 其他贷款未结清/未销户账户数
     */
    private String otherLoanUncleareUncancelAccountCount="";;
    /**
     * 其他贷款发生过预期账户数
     */
    private String otherLoanOverdueAccountCount="";;
    /**
     * 其他贷款有过90天以上预期账户数
     */
    private String otherLoanOverdue90AccountCount="";;
    /**
     * 其他贷款为他人担保笔数
     */
    private String otherLoanOtherGuaranteeCount="";;
    /**
     * 担保笔数
     */
    private String guaranteeCount="";;
    /**
     * 担保总金额
     */
    private String guaranteeTotalAmount="";;
    /**
     * 担保余额
     */
    private String guaranteeBalance="";;
    /**
     * 担保逾期状况
     */
    private String guaranteeOverdueStatus="";;
    /**
     * 征信查询次数
     */
    private String creditQueryCount="";;
    /**
     * 近一年内查询次数
     */
    private String oneYearQueryCount="";;
    /**
     * 法院网诉讼次数
     */
    private String chinacourtLitigationCount="";;
    /**
     * 个人口碑及社会地位
     */
    private String personalReputationSocialPosition="";;
    /**
     * 其他信用描述
     */
    private String otherCreditDescribe="";;
    /**
     * 备注
     */
    private String remark="";;
    public String getChinacourtLitigationCount() {
        return chinacourtLitigationCount;
    }
    public String getCreditCardCount() {
        return creditCardCount;
    }
    public String getCreditCardMonthlyPayment() {
        return creditCardMonthlyPayment;
    }
    public String getCreditCardOtherGuaranteeCount() {
        return creditCardOtherGuaranteeCount;
    }
    public String getCreditCardOverdue90AccountCount() {
        return creditCardOverdue90AccountCount;
    }
    public String getCreditCardOverdueAccountCount() {
        return creditCardOverdueAccountCount;
    }
    public String getCreditCardTotalAmount() {
        return creditCardTotalAmount;
    }
    public String getCreditCardUncleareUncancelAccountCount() {
        return creditCardUncleareUncancelAccountCount;
    }
    public String getCreditCardUseRatio() {
        return creditCardUseRatio;
    }
    public String getCreditQueryCount() {
        return creditQueryCount;
    }
    public String getGuaranteeBalance() {
        return guaranteeBalance;
    }
    public String getGuaranteeCount() {
        return guaranteeCount;
    }
    public String getGuaranteeOverdueStatus() {
        return guaranteeOverdueStatus;
    }
    public String getGuaranteeTotalAmount() {
        return guaranteeTotalAmount;
    }
    public String getHomeLoanOtherGuaranteeCount() {
        return homeLoanOtherGuaranteeCount;
    }
    public String getHomeLoanOverdue90AccountCount() {
        return homeLoanOverdue90AccountCount;
    }
    public String getHomeLoanOverdueAccountCount() {
        return homeLoanOverdueAccountCount;
    }
    public String getHomeLoanUncleareUncancelAccountCount() {
        return homeLoanUncleareUncancelAccountCount;
    }
    public String getLoadOverdueInfo() {
        return loadOverdueInfo;
    }
    public String getLoanBalance() {
        return loanBalance;
    }
    public String getLoanCount() {
        return loanCount;
    }
    public String getLoanMonthlyPayment() {
        return loanMonthlyPayment;
    }
    public String getLoanTotalAmount() {
        return loanTotalAmount;
    }
    public String getOneYearQueryCount() {
        return oneYearQueryCount;
    }
    public String getOtherCreditDescribe() {
        return otherCreditDescribe;
    }
    public String getOtherLoanOtherGuaranteeCount() {
        return otherLoanOtherGuaranteeCount;
    }
    public String getOtherLoanOverdue90AccountCount() {
        return otherLoanOverdue90AccountCount;
    }
    public String getOtherLoanOverdueAccountCount() {
        return otherLoanOverdueAccountCount;
    }
    public String getOtherLoanUncleareUncancelAccountCount() {
        return otherLoanUncleareUncancelAccountCount;
    }
    public String getPersonalReputationSocialPosition() {
        return personalReputationSocialPosition;
    }
    public String getRemark() {
        return remark;
    }
    public void setChinacourtLitigationCount(String chinacourtLitigationCount) {
        this.chinacourtLitigationCount = chinacourtLitigationCount;
    }
    public void setCreditCardCount(String creditCardCount) {
        this.creditCardCount = creditCardCount;
    }
    public void setCreditCardMonthlyPayment(String creditCardMonthlyPayment) {
        this.creditCardMonthlyPayment = creditCardMonthlyPayment;
    }
    public void setCreditCardOtherGuaranteeCount(String creditCardOtherGuaranteeCount) {
        this.creditCardOtherGuaranteeCount = creditCardOtherGuaranteeCount;
    }
    public void setCreditCardOverdue90AccountCount(String creditCardOverdue90AccountCount) {
        this.creditCardOverdue90AccountCount = creditCardOverdue90AccountCount;
    }
    public void setCreditCardOverdueAccountCount(String creditCardOverdueAccountCount) {
        this.creditCardOverdueAccountCount = creditCardOverdueAccountCount;
    }
    public void setCreditCardTotalAmount(String creditCardTotalAmount) {
        this.creditCardTotalAmount = creditCardTotalAmount;
    }
    public void setCreditCardUncleareUncancelAccountCount(String creditCardUncleareUncancelAccountCount) {
        this.creditCardUncleareUncancelAccountCount = creditCardUncleareUncancelAccountCount;
    }
    public void setCreditCardUseRatio(String creditCardUseRatio) {
        this.creditCardUseRatio = creditCardUseRatio;
    }
    public void setCreditQueryCount(String creditQueryCount) {
        this.creditQueryCount = creditQueryCount;
    }
    public void setGuaranteeBalance(String guaranteeBalance) {
        this.guaranteeBalance = guaranteeBalance;
    }
    public void setGuaranteeCount(String guaranteeCount) {
        this.guaranteeCount = guaranteeCount;
    }
    public void setGuaranteeOverdueStatus(String guaranteeOverdueStatus) {
        this.guaranteeOverdueStatus = guaranteeOverdueStatus;
    }
    public void setGuaranteeTotalAmount(String guaranteeTotalAmount) {
        this.guaranteeTotalAmount = guaranteeTotalAmount;
    }
    public void setHomeLoanOtherGuaranteeCount(String homeLoanOtherGuaranteeCount) {
        this.homeLoanOtherGuaranteeCount = homeLoanOtherGuaranteeCount;
    }
    public void setHomeLoanOverdue90AccountCount(String homeLoanOverdue90AccountCount) {
        this.homeLoanOverdue90AccountCount = homeLoanOverdue90AccountCount;
    }
    public void setHomeLoanOverdueAccountCount(String homeLoanOverdueAccountCount) {
        this.homeLoanOverdueAccountCount = homeLoanOverdueAccountCount;
    }
    public void setHomeLoanUncleareUncancelAccountCount(String homeLoanUncleareUncancelAccountCount) {
        this.homeLoanUncleareUncancelAccountCount = homeLoanUncleareUncancelAccountCount;
    }
    public void setLoadOverdueInfo(String loadOverdueInfo) {
        this.loadOverdueInfo = loadOverdueInfo;
    }
    public void setLoanBalance(String loanBalance) {
        this.loanBalance = loanBalance;
    }
    public void setLoanCount(String loanCount) {
        this.loanCount = loanCount;
    }
    public void setLoanMonthlyPayment(String loanMonthlyPayment) {
        this.loanMonthlyPayment = loanMonthlyPayment;
    }
    public void setLoanTotalAmount(String loanTotalAmount) {
        this.loanTotalAmount = loanTotalAmount;
    }
    public void setOneYearQueryCount(String oneYearQueryCount) {
        this.oneYearQueryCount = oneYearQueryCount;
    }
    public void setOtherCreditDescribe(String otherCreditDescribe) {
        this.otherCreditDescribe = otherCreditDescribe;
    }
    public void setOtherLoanOtherGuaranteeCount(String otherLoanOtherGuaranteeCount) {
        this.otherLoanOtherGuaranteeCount = otherLoanOtherGuaranteeCount;
    }
    public void setOtherLoanOverdue90AccountCount(String otherLoanOverdue90AccountCount) {
        this.otherLoanOverdue90AccountCount = otherLoanOverdue90AccountCount;
    }
    public void setOtherLoanOverdueAccountCount(String otherLoanOverdueAccountCount) {
        this.otherLoanOverdueAccountCount = otherLoanOverdueAccountCount;
    }
    public void setOtherLoanUncleareUncancelAccountCount(String otherLoanUncleareUncancelAccountCount) {
        this.otherLoanUncleareUncancelAccountCount = otherLoanUncleareUncancelAccountCount;
    }
    public void setPersonalReputationSocialPosition(String personalReputationSocialPosition) {
        this.personalReputationSocialPosition = personalReputationSocialPosition;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}