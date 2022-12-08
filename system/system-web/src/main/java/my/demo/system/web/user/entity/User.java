package my.demo.system.web.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import my.demo.system.web.user.entity.serializer.MobileSerializer;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("zh_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
//    @ExcelProperty("用户名")
    private String account;

    /**
     * 手机号
     */
//    @ExcelProperty("手机号")
    @JsonSerialize(using = MobileSerializer.class)
    private String mobile;

    /**
     * 邮箱
     */
//    @ExcelProperty("邮箱")
    private String email;

    /**
     * 密码
     */
    @JsonIgnore
//    @ExcelIgnore
    private String password;

    /**
     * 角色
     */
    @JsonIgnore
//    @ExcelIgnore
    private String role;

    /**
     * 权限
     */
    @JsonIgnore
//    @ExcelIgnore
    private String perms;

    /**
     * 姓名
     */
//    @ExcelProperty(value = "姓名", index = 2)
    private String name;

    /**
     * 头像图片ID
     */
//    @ExcelIgnore
    private Integer avatarImgId;

    /**
     * 最后登录时间
     */
//    @ExcelProperty(value = "最后登录时间", index = 8, converter = UnixTime2DateConverter.class)
    private Integer lastLoginTime;

    /**
     * 最后登录IP
     */
//    @ExcelProperty("最后登录IP")
    private String lastLoginIp;

    /**
     * 用户状态
     */
//    @ExcelProperty(value = "用户状态", converter = IntStatusConverter.class)
    private Integer status;

    //    @ExcelProperty(value = "创建时间", index = 9, converter = UnixTime2DateConverter.class)
    private Integer createTime;

    private Boolean isDelete;


}
