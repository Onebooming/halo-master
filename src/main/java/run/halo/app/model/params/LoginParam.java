package run.halo.app.model.params;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Login param.
 *
 * @author johnniang
 * @date 3/28/19
 */
@Data
@ToString
public class LoginParam {

    @NotBlank(message = "用户名或邮箱不能为空")
    @Size(max = 255, message = "用户名或邮箱的字符长度不能超过 {max}")
    private String username;

    @NotBlank(message = "登陆密码不能为空")
    @Size(max = 100, message = "用户密码字符长度不能超过 {max}")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
