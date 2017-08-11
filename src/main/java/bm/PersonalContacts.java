package bm;
public class PersonalContacts {
    /**
     * 姓名
     */
    private String name="";;
    /**
     * 移动电话
     */
    private String mobilePhone="";;
    /**
     * 优先级。0:最低,1:低,2:中,3:高,4:最高。
     */
    private String contactsPriority="";;
    /**
     * 与客户关系
     */
    private String relationship="";;
    /**
    
    */
    private String remark="";;
    public String getContactsPriority() {
        return contactsPriority;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getName() {
        return name;
    }
    public String getRelationship() {
        return relationship;
    }
    public String getRemark() {
        return remark;
    }
    public void setContactsPriority(String contactsPriority) {
        this.contactsPriority = contactsPriority;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}