package com.meituan.trade.factory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.meituan.foodmis.PageFile;
import com.meituan.foodmis.element.Cell;
import com.meituan.foodmis.element.FieldType;
import com.meituan.foodmis.element.Item;
import com.meituan.foodmis.element.ManualRequest;
import com.meituan.foodmis.element.Row;
import com.meituan.foodmis.element.SearchBar;
import com.meituan.foodmis.element.SubPageFile;
import com.meituan.foodmis.element.Table;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: lanxinyu@meituan.com  2018-12-19 11:43 AM
 * @Description:
 */
@Service
public class MicroServiceFactory {



    public PageFile getPageFile() {
        return mockPageFile();
    }



    private PageFile mockPageFile() {
        Item item = new Item();
        item.setDescription("买单订单详情");
        item.setSubItems(mockItems());
        Table table = new Table();
        table.setColumnNames(mockColumnName());
        table.setData(mockData());
        table.setDescription("非分页订单数据");
        table.setPage(false);
        SearchBar searchBar = new SearchBar();
        searchBar.setSearchTerms(mockSearchBar());
        searchBar.setDescription("买单订单查询栏");
        SubPageFile subPageFile = new SubPageFile();
        subPageFile.setDescription("买单订单");
        subPageFile.setSearchBars(Lists.newArrayList(searchBar));
        subPageFile.setTables(Lists.newArrayList(table));
        subPageFile.setItems(Lists.newArrayList(item));
        PageFile pageFile = new PageFile();
        pageFile.setDescription("买单侧");
        pageFile.setSubPageFiles(Lists.newArrayList(subPageFile, subPageFile));
        return pageFile;
    }

    private List<Cell> mockItems() {
        Cell c0 = new Cell("订单号", FieldType.URL, "18020009999").setUrl("/maidan/orderdetail:18020009999");
        Cell c1 = new Cell("用户名", FieldType.COMMON, "张三");
        Cell c2 = new Cell("手机号", FieldType.URL, "13020079696").setUrl("/maidan/phone:13020079696");;
        return Lists.newArrayList(c0, c1, c2);
    }

    private List<Cell> mockSearchBar() {
        Cell c0 = new Cell("orderId", FieldType.TEXT, "订单号", "请输入订单号");
        Cell c1 = new Cell("userName", FieldType.TEXT, "用户名", "请输入用户名");
        Cell c2 = new Cell("phone", FieldType.TEXT, "手机号", "请输入手机号");
        Cell c3 = new Cell("beginTime", FieldType.DATE, "开始日期", "请输入开始日期");
        Cell c4 = new Cell("endTime", FieldType.DATE, "结束日期", "请输入结束日期");
        Map<String, String> enumKV = Maps.newHashMap();
        enumKV.put("1", "男");
        enumKV.put("2", "女");
        Cell c5 = new Cell("sex", FieldType.ENUM, "性别","请选择性别", enumKV);

        Cell c6 = new Cell(ManualRequest.BIZ_CODE, FieldType.HIDE, "maidan", "业务方标识");
        Cell c7 = new Cell(ManualRequest.BIZ_GOAL, FieldType.HIDE, "orderlist", "业务方目的");
        return Lists.newArrayList(c0, c1, c2, c3, c4, c5, c6, c7);
    }

    private Row mockColumnName() {
        Row r0 = new Row();
        Cell c0 = new Cell("orderId", FieldType.COLUMN_NAME, "订单号");
        Cell c1 = new Cell("userName", FieldType.COLUMN_NAME, "用户名");
        Cell c2 = new Cell("phone", FieldType.COLUMN_NAME, "手机号");
        r0.setCells(Lists.newArrayList(c0, c1, c2));
        return r0;
    }

    public List<Row> mockData() {
        Row r0 = new Row();
        Cell c0 = new Cell("orderId", FieldType.URL, "180xxxx5750").setUrl("/maidan/orderdetail:18020005750");
        Cell c1 = new Cell("userName", FieldType.COMMON, "张三");
        Cell c2 = new Cell("phone", FieldType.COMMON, "130xxxx2000");
        r0.setCells(Lists.newArrayList(c0, c1, c2));

        Row r1 = new Row();
        Cell c3 = new Cell("orderId", FieldType.URL, "180xxxx5751").setUrl("/maidan/orderdetail:18020005751");
        Cell c4 = new Cell("userName", FieldType.COMMON, "李四");
        Cell c5 = new Cell("phone", FieldType.COMMON, "130xxxx2001");
        r1.setCells(Lists.newArrayList(c3, c4, c5));

        Row r2 = new Row();
        Cell c6 = new Cell("orderId", FieldType.URL, "180xxxx5752").setUrl("/maidan/orderdetail:18020005752");
        Cell c7 = new Cell("userName", FieldType.COMMON, "王五");
        Cell c8 = new Cell("phone", FieldType.COMMON, "130xxxx2002");
        r2.setCells(Lists.newArrayList(c6, c7, c8));
        return Lists.newArrayList(r0,r1, r2);
    }
}
