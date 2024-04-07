package com.jacob.micro.dao;

import com.jacob.micro.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 自定义商品属性Dao
 * @Date: 2024/4/7 22:17
 * @Version: 1.0
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
