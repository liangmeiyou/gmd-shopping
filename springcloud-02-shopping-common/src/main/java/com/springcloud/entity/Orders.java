package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
public class Orders implements java.io.Serializable{
   
	private static final long serialVersionUID = -7062202476855677873L;

	/**
	 * 订单编号
	 */
	private Integer orderId;

    private Users user;

    private String receiverName;

    private String receiverTel;

    private String receiverAddr;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;

    private Double orderTotal;

    private Integer orderStatus;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;
    
    /**
     * 查询条件：起始年月
     */
    private String startMonth;
    
    /**
     * 查询条件：终止年月
     */
    
    private String endMonth;
    
    /**
     * 统计结果的年月
     */
    
    private String orderMonth;
    
    /**
     * 统计结果的销售额
     */
    
    private Double orderPrice;
    

   
}