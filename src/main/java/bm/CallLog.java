package bm;
public class CallLog {

    /**
     * 电话号码
     */
    private String phoneNo="";;
    /**
     * 时长
     */
    private String duration="";;
    /**
     * 主叫次数
     */
    private String activeCount="";;
    /**
     * 被叫次数
     */
    private String calledCount="";;
    /**
     * 归属地
     */
    private String phoneAttribution="";;
    /**
    
    */
    private String remark="";;
    public String getActiveCount() {
        return activeCount;
    }
    public String getCalledCount() {
        return calledCount;
    }
    public String getDuration() {
        return duration;
    }
    public String getPhoneAttribution() {
        return phoneAttribution;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public String getRemark() {
        return remark;
    }
    public void setActiveCount(String activeCount) {
        this.activeCount = activeCount;
    }
    public void setCalledCount(String calledCount) {
        this.calledCount = calledCount;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setPhoneAttribution(String phoneAttribution) {
        this.phoneAttribution = phoneAttribution;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}