package com.meituan.foodmis.element;

import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-19 10:24 AM
 * @Description: H5搜索栏
 */
@Data
public class SearchBar {
    private String description;
    private List<Cell> searchTerms;
}
