package bm;
import java.util.ArrayList;
import java.util.List;

public class PersonalCommunicationData {
    /**
     * 订单号
     */
    private String orderId="";;
    /**
     * 通讯数据状态。0:查询完成,1:成功,2:失败,3:未查询。
     */
    private String communicationStatus="";;
    /**
     * 订单类型。0:通讯数据查询。
     */
    private String orderType="";;
    /**
     * 被查手机号码
     */
    private String checkedPhone="";;
    /**
     * 运营商类型。0:移动,1:联通,2:电信,3:虚拟。
     */
    private String phoneServiceProviders="";;
    /**
     * 入网时间
     */
    private String accessDate="";;
    /**
     * 实名认证
     */
    private String isRealNameAuth="";;
    /**
     * 认证身份证号
     */
    private String authIdcardNo="";;
    /**
     * 手机号
     */
    private String mobilePhone="";;
    /**
     * 登记邮箱
     */
    private String email="";;
    /**
     * 当前余额
     */
    private String balance="";;
    /**
     * 会员等级
     */
    private String level="";;
    /**
     * 积分值
     */
    private String integral="";;
    /**
     * 网龄
     */
    private String netAge="";;
    /**
     * 登记地址
     */
    private String address="";;
    /**
     * 最近通话时间
     */
    private String latelyUseDate="";;
    /**
     * 最早通话时间
     */
    private String earliestUseDate="";;
    /**
     * 结果备注
     */
    private String remark="";;
    /**
     * CallLog
     */
    private List<CallLog> callLog=new ArrayList<>();{
        callLog.add(new CallLog());
    }
    
    public String getAccessDate() {
        return accessDate;
    }
    public String getAddress() {
        return address;
    }
    public String getAuthIdcardNo() {
        return authIdcardNo;
    }
    public String getBalance() {
        return balance;
    }
    public List<CallLog> getCallLog() {
        return callLog;
    }
    public String getCheckedPhone() {
        return checkedPhone;
    }
    public String getCommunicationStatus() {
        return communicationStatus;
    }
    public String getEarliestUseDate() {
        return earliestUseDate;
    }
    public String getEmail() {
        return email;
    }
    public String getIntegral() {
        return integral;
    }
    public String getIsRealNameAuth() {
        return isRealNameAuth;
    }
    public String getLatelyUseDate() {
        return latelyUseDate;
    }
    public String getLevel() {
        return level;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getNetAge() {
        return netAge;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getOrderType() {
        return orderType;
    }
    public String getPhoneServiceProviders() {
        return phoneServiceProviders;
    }
    public String getRemark() {
        return remark;
    }
    public void setAccessDate(String accessDate) {
        this.accessDate = accessDate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAuthIdcardNo(String authIdcardNo) {
        this.authIdcardNo = authIdcardNo;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public void setCallLog(List<CallLog> callLog) {
        this.callLog = callLog;
    }
    public void setCheckedPhone(String checkedPhone) {
        this.checkedPhone = checkedPhone;
    }
    public void setCommunicationStatus(String communicationStatus) {
        this.communicationStatus = communicationStatus;
    }
    public void setEarliestUseDate(String earliestUseDate) {
        this.earliestUseDate = earliestUseDate;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIntegral(String integral) {
        this.integral = integral;
    }
    public void setIsRealNameAuth(String isRealNameAuth) {
        this.isRealNameAuth = isRealNameAuth;
    }
    public void setLatelyUseDate(String latelyUseDate) {
        this.latelyUseDate = latelyUseDate;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public void setNetAge(String netAge) {
        this.netAge = netAge;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public void setPhoneServiceProviders(String phoneServiceProviders) {
        this.phoneServiceProviders = phoneServiceProviders;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}