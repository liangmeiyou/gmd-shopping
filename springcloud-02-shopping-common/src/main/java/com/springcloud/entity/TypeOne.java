package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * TYPE_ONE 表对应的实体类，用于保存表中一行一级类别信息
 * @author Administrator
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne {
	
	/**
	 * 类型一编号
	 */
    private Integer typeOneId;

    /**
	 * 类型一名称
	 */
    private String typeOneName;

    /**
	 *序号
	 */
    private Integer typeOneNum;

    /**
	 * 备注
	 */
    private String typeOneRemark;

    
}