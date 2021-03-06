package io.zhijian.system.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hao
 * @since 2017-07-05
 */
@TableName("sys_role_resource")
public class RoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("role_id")
	private Long roleId;
	@TableField("resource_id")
	private Long resourceId;


	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "RoleResource{" +
			"roleId=" + roleId +
			", resourceId=" + resourceId +
			"}";
	}
}
