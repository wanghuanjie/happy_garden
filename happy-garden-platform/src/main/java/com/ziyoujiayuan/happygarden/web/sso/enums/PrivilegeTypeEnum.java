package com.ziyoujiayuan.happygarden.web.sso.enums;

/**
 * 权限类型枚举
 * @Author wanghjbuf
 * @Date 2017年10月16日
 */
public enum PrivilegeTypeEnum {

	LEVEL_ONE(1),
	LEVEL_TWO(2),
	LEVEL_THREE(3);
	
	private Integer index; 
	   
	PrivilegeTypeEnum(Integer idx) { 
	   this.index = idx; 
	} 
	 
	public int getIndex() { 
	   return index; 
	} 
}
