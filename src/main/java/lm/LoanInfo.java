package lm;

import java.util.ArrayList;
import java.util.List;

public class LoanInfo {

    private LoanBase loanBase=new LoanBase();
    private Disbursement disbursement=new Disbursement();
    private List<RepaymentPlan> repaymentPlan=new ArrayList<>();
    private List<PressRecord> pressRecord=new ArrayList<>();
    {
        repaymentPlan.add(new RepaymentPlan());
        pressRecord.add(new PressRecord());
        
        
    }
    private BadDebt badDebt=new BadDebt();

    public BadDebt getBadDebt() {
        return badDebt;
    }

    public Disbursement getDisbursement() {
        return disbursement;
    }

    public LoanBase getLoanBase() {
        return loanBase;
    }

    public List<PressRecord> getPressRecord() {
        return pressRecord;
    }

    public List<RepaymentPlan> getRepaymentPlan() {
        return repaymentPlan;
    }

    public void setBadDebt(BadDebt badDebt) {
        this.badDebt = badDebt;
    }

    public void setDisbursement(Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    public void setLoanBase(LoanBase loanBase) {
        this.loanBase = loanBase;
    }

    public void setPressRecord(List<PressRecord> pressRecord) {
        this.pressRecord = pressRecord;
    }

    public void setRepaymentPlan(List<RepaymentPlan> repaymentPlan) {
        this.repaymentPlan = repaymentPlan;
    }

}
