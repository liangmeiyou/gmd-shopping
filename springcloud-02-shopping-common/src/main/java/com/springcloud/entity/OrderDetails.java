package com.springcloud.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Administrator
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails implements java.io.Serializable {
    
	private static final long serialVersionUID = -3288418379990100414L;

	private Integer orderDetailId;

    private Integer orderId;

    private Integer goodsId;

    private String goodsName;

    private Double goodsFinalPrice;

    private Integer goodsFinalNum;

  
}