package com.meituan.foodmis;

import com.meituan.foodmis.element.SubPageFile;
import lombok.Data;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-12-19 11:22 AM
 * @Description: 整体页面
 */
@Data
public class PageFile {
    private String description;
    private List<SubPageFile> subPageFiles;
}
