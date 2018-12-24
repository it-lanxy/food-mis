package com.meituan.foodmis.element;

import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-19 11:12 AM
 * @Description: 子页面
 */
@Data
public class SubPageFile {
    private String description;
    /**
     * 搜索栏
     */
    private List<SearchBar> searchBars;
    /**
     * 表单
     */
    private List<Table> tables;
    /**
     * 子项组 集合
     */
    private List<Item> items;
}
