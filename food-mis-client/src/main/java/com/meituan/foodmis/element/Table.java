package com.meituan.foodmis.element;

import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-17 4:25 PM
 * @Description:
 */
@Data
public class Table {
    /**
     * 描述
     */
    private String description;
    /**
     * 列名
     */
    private Row columnNames;
    /**
     * 数据
     */
    private List<Row> data;
    /**
     * 是否分页
     */
    private boolean page;
    /**
     * 总量
     */
    private int total;
    /**
     * 当前页
     */
    private int currentPage;
    /**
     * 页内容
     */
    private int pageSize;
}
