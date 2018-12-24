package com.meituan.trade.constant;

/**
 * @author: lanxinyu@meituan.com  2018-12-17 8:41 PM
 * @Description:
 */
public enum Target {
    ORDER_LIST("orderlist");

    private String target;
    Target(String target) {
        this.target = target;
    }
}
