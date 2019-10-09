package run.halo.app.model.vo;

import lombok.Data;
import lombok.ToString;
import run.halo.app.model.dto.MenuDTO;

import java.util.List;

/**
 * Menu team vo.
 *
 * @author ryanwang
 * @date : 2019/8/28
 */
@Data
@ToString
public class MenuTeamVO {

    private String team;

    private List<MenuDTO> menus;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<MenuDTO> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuDTO> menus) {
        this.menus = menus;
    }
}
