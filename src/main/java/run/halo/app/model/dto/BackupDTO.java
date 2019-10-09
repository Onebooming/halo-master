package run.halo.app.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ryanwang
 * @date 2019-05-25
 */
@Data
public class BackupDTO {

    private String fileName;

    private Date createTime;

    private String fileSize;

    private String fileType;

    private String type;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
