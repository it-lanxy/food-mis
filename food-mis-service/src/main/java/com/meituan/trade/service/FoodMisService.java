package com.meituan.trade.service;

import com.meituan.foodmis.PageFile;
import com.meituan.trade.factory.MicroServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author: lanxinyu@meituan.com  2018-12-17 4:04 PM
 * @Description:
 */
@Service
public class FoodMisService {
    @Autowired
    private MicroServiceFactory microServiceFactory;

    private static final String PIC_FORMAT = "/static/images/%s.png";

    public PageFile getPageFile() {
        return microServiceFactory.getPageFile();
    }

    public String getPicture(String bizCode) {
        return String.format(PIC_FORMAT, bizCode);
    }
}
