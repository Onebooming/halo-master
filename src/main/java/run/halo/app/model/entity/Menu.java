package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * Menu entity
 *
 * @author ryanwang
 * @date : 2019-03-12
 */
@Data
@Entity
@Table(name = "menus")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Menu name.
     */
    @Column(name = "name", columnDefinition = "varchar(50) not null")
    private String name;

    /**
     * Menu access url.
     */
    @Column(name = "url", columnDefinition = "varchar(1023) not null")
    private String url;

    /**
     * Sort.
     */
    @Column(name = "priority", columnDefinition = "int default 0")
    private Integer priority;

    /**
     * Page opening method
     */
    @Column(name = "target", columnDefinition = "varchar(20) default '_self'")
    private String target;

    /**
     * Menu icon,Template support required.
     */
    @Column(name = "icon", columnDefinition = "varchar(50) default ''")
    private String icon;

    /**
     * Parent menu.
     */
    @Column(name = "parent_id", columnDefinition = "int default 0")
    private Integer parentId;

    /**
     * Menu team name.
     */
    @Column(name = "team", columnDefinition = "varchar(255) default ''")
    private String team;

    @Override
    public void prePersist() {
        super.prePersist();

        id = null;

        if (priority == null) {
            priority = 0;
        }

        if (target == null) {
            target = "_self";
        }

        if (icon == null) {
            icon = "";
        }

        if (parentId == null) {
            parentId = 0;
        }

        if(team == null){
            team = "";
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
