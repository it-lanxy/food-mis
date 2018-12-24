package com.meituan.foodmis.element;

import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-17 4:14 PM
 * @Description: 只有列表、分页有 Row
 */
@Data
public class Row {
    private List<Cell> cells;
}
