package bm;

import java.util.ArrayList;
import java.util.List;

public class Bankflow {
    /**
     * 银行名称
     */
    private String bankName = "";
    /**
     * 银行流水账号
     */
    private String bankAccount = "";
    /**
     * 流水开始日期
     */
    private String startDate = "";
    /**
     * 流水结束日期
     */
    private String endDate = "";
    /**
     * 余额
     */
    private String balance = "";
    /**
     * 账号是否查实
     */
    private String isConfirm = "";
    /**
     * 资产统计日期
     */
    private String assetsStatisticsDate = "";
    /**
    
    */
    private String remark = "";
    /**
     * BankFlowDetail
     */
    private List<BankFlowDetail> bankFlowDetail = new ArrayList<BankFlowDetail>();

    {
        bankFlowDetail.add(new BankFlowDetail());
    }

    public String getAssetsStatisticsDate() {
        return assetsStatisticsDate;
    }

    public String getBalance() {
        return balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public List<BankFlowDetail> getBankFlowDetail() {
        return bankFlowDetail;
    }

    public String getBankName() {
        return bankName;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public String getRemark() {
        return remark;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setAssetsStatisticsDate(String assetsStatisticsDate) {
        this.assetsStatisticsDate = assetsStatisticsDate;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankFlowDetail(List<BankFlowDetail> bankFlowDetail) {
        this.bankFlowDetail = bankFlowDetail;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}