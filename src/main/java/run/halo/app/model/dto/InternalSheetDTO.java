package run.halo.app.model.dto;

import lombok.Data;

/**
 * Theme controller.
 *
 * @author ryanwang
 * @date : 2019/5/4
 */
@Data
public class InternalSheetDTO {

    private Integer id;

    private String title;

    private String url;

    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
