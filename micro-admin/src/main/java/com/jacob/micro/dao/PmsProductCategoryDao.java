package com.jacob.micro.dao;

import com.jacob.micro.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品分类自定义Dao
 * @Date: 2024/4/1 22:14
 * @Version: 1.0
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
