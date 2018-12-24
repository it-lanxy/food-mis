package com.meituan.foodmis.element;

import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-19 1:50 PM
 * @Description:
 */
@Data
public class Item {
    /**
     * 描述
     */
    private String description;
    private List<Cell> subItems;
}
