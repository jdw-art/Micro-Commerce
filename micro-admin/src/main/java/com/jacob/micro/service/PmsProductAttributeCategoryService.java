package com.jacob.micro.service;

import com.jacob.micro.dto.PmsProductAttributeCategoryItem;
import com.jacob.micro.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品属性分类Service
 * @Date: 2024/4/8 22:27
 * @Version: 1.0
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 创建属性分类
     */
    int create(String name);

    /**
     * 修改属性分类
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     */
    int delete(Long id);

    /**
     * 获取属性分类详情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页查询属性分类
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 获取包含属性的属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
