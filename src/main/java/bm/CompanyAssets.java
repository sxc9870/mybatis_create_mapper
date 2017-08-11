package bm;
public class CompanyAssets {
    /**
     * 资产类别
     */
    private String assetsType="";;
    /**
     * 名称
     */
    private String name="";;
    /**
     * 价值
     */
    private String value="";;
    /**
    
    */
    private String remark="";;
    public String getAssetsType() {
        return assetsType;
    }
    public String getName() {
        return name;
    }
    public String getRemark() {
        return remark;
    }
    public String getValue() {
        return value;
    }
    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setValue(String value) {
        this.value = value;
    }
}