package run.halo.app.model.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * User password param.
 *
 * @author johnniang
 * @date 3/26/19
 */
@Data
public class PasswordParam {

    @NotBlank(message = "旧密码不能为空")
    @Size(max = 100, message = "密码的字符长度不能超过 {max}")
    private String oldPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @NotBlank(message = "新密码不能为空")
    @Size(max = 100, message = "密码的字符长度不能超过 {max}")
    private String newPassword;

}
