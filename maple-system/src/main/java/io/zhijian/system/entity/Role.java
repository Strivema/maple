package io.zhijian.system.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.zhijian.base.entity.BaseEntity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Hao
 * @since 2017-07-05
 */
@TableName("sys_role")
public class Role extends BaseEntity  implements Serializable {

    /*** 角色编码     */
    private String code;

    /*** 角色名称     */
    private String name;

    /*** 描述     */
    private String description;

    /**
     * 是否固定， 0默认为不固定，1=固定；固定就不能再去修改了
     */
    @TableField("is_fixed")
    private Integer isFixed;

    /**
     * 状态：0=启用，1=禁用
     */
    private Integer status;

    public Role() {
    }

    public Role(Long id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Integer isFixed) {
        this.isFixed = isFixed;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
