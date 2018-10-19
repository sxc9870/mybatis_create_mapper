import java.util.Date;

public class ActivityConfigModel {
    private String name;
    private Date startDate;
    private Date endDate;
    private Date smsDate;
    private boolean rank;
    private boolean roll;
    private boolean newMoney;

    public java.util.Date getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getSmsDate() {
        return smsDate;
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public boolean isNewMoney() {
        return newMoney;
    }

    public boolean isRank() {
        return rank;
    }

    public boolean isRoll() {
        return roll;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewMoney(boolean newMoney) {
        this.newMoney = newMoney;
    }

    public void setRank(boolean rank) {
        this.rank = rank;
    }

    public void setRoll(boolean roll) {
        this.roll = roll;
    }

    public void setSmsDate(java.util.Date smsDate) {
        this.smsDate = smsDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }
}
