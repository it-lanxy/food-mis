package com.meituan.foodmis.element;

import lombok.Data;

import java.util.Date;

/**
 * @author: lanxinyu@meituan.com  2018-12-17 4:08 PM
 * @Description: 请求手册
 */
@Data
public class ManualRequest {
    public static final String BIZ_CODE = "bizCode";
    public static final String BIZ_GOAL = "bizGoal";
    /**
     * 业务标识
     */
    private String bizCode;
    /**
     * 业务目标
     */
    private String bizGoal;

    /**
     * 查询条件
     */
    private String orderId;
    private String phone;
    private String userName;
    private Date beginTime;
    private Date endTime;
    private Integer sex;
}
