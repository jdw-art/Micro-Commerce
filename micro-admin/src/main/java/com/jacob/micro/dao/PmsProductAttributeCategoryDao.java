package com.jacob.micro.dao;

import com.jacob.micro.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 自定义商品属性分类Dao
 * @Date: 2024/4/8 22:29
 * @Version: 1.0
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
