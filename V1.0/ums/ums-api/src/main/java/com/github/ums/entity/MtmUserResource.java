package com.github.ums.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/05/17
 */
@ApiModel(value = "com.github.entity.MtmUserResource")
@Data
public class MtmUserResource {
	@ApiModelProperty(value = "用户表主键，外键关联 t_ums_user.id", example = "0")
	private Long userId;

	@ApiModelProperty(value = "角色表主键，外键关联 t_ums_resource.id", example = "0")
	private Long resourceId;
}