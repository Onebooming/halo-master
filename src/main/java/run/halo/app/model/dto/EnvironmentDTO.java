package run.halo.app.model.dto;

import lombok.Data;
import run.halo.app.model.enums.Mode;

/**
 * Theme controller.
 *
 * @author ryanwang
 * @date : 2019/5/4
 */
@Data
public class EnvironmentDTO {

    private String database;

    private long startTime;

    private String version;

    private Mode mode;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
