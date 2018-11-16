package com.ziyoujiayuan.happygarden.web.sso.pojo;

import com.ziyoujiayuan.happygarden.web.sso.enums.PrivilegeTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * 权限基础表
 * @Author wanghjbuf
 * @Date 2017年10月19日
 */
@SuppressWarnings("serial")
@Data
public class PrivilegeBasicInfo implements Serializable{

	private String privilegeName;
	private String privilegeAlias;
	private int type;
	private Set<PrivilegeBasicInfo> childs;
	
	public boolean hasChilds() {
		if (this.type == PrivilegeTypeEnum.LEVEL_ONE.getIndex()) {
			return true;
		} else if (this.type == PrivilegeTypeEnum.LEVEL_TWO.getIndex()) {
			return true;
		} else if (this.type == PrivilegeTypeEnum.LEVEL_THREE.getIndex()){
			return false;
		} else {
			return false;
		}
	}
}
