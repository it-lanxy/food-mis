package com.meituan.foodmis.element;

import lombok.Data;

import java.util.Map;

/**
 * @author: lanxinyu@meituan.com  2018-12-17 2:14 PM
 * @Description: 单个模型
 */
@Data
public class Cell {

    private String key;
    private String value;
    private FieldType fieldType;
    private String placeholder;
    private Map<String, String> enumKV;
    /**
     * 资源 /bizcode/bizgoal:data
     */
    private String url;

    public Cell(String key, FieldType fieldType, String value) {
        this.key = key;
        this.fieldType = fieldType;
        this.value = value;
    }

    /**
     * 查询导航栏
     * @param key
     * @param fieldType
     * @param value
     * @param placeholder
     */
    public Cell(String key, FieldType fieldType, String value, String placeholder) {
        this.key = key;
        this.fieldType = fieldType;
        this.value = value;
        this.placeholder = placeholder;
    }

    public Cell(String key, FieldType fieldType, String value, String placeholder, Map<String, String> enumKV) {
        this.key = key;
        this.fieldType = fieldType;
        this.value = value;
        this.placeholder = placeholder;
        this.enumKV = enumKV;
    }

    public Cell setUrl(String url) {
        this.url = url;
        return this;
    }
}
