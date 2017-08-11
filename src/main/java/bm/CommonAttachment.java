package bm;
public class CommonAttachment {
    /**
     * 附件名
     */
    private String fileName="";
    /**
     * 附件网络路径
     */
    private String fileUrl="";
    /**
     * 0:合同,1:其他,2:车辆证件图片,3:车辆图片,4:房产证件图片,5:房产图片,6:身份证,7:工作证,8:其他证书,9:信用认证,A:
     * 生成经营许可证,B:财务报表,C:公司章程,D:企业资质等级证明。
     */
    private String fileType="";

    /**
    */
    private String fileString="";
    /**
    
    */
    private String remark="";
    public String getFileName() {
        return fileName;
    }
    public String getFileString() {
        return fileString;
    }
    public String getFileType() {
        return fileType;
    }
    public String getFileUrl() {
        return fileUrl;
    }
    public String getRemark() {
        return remark;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setFileString(String fileString) {
        this.fileString = fileString;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}