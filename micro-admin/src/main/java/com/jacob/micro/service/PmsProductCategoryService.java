package com.jacob.micro.service;

import com.jacob.micro.dto.PmsProductCategoryParam;
import com.jacob.micro.dto.PmsProductCategoryWithChildrenItem;
import com.jacob.micro.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品分类Service
 * @Date: 2024/4/1 22:10
 * @Version: 1.0
 */
public interface PmsProductCategoryService {
    /**
     * 创建商品分类
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 修改商品分类
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 分页获取商品分类
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 删除商品分类
     */
    int delete(Long id);

    /**
     * 根据ID获取商品分类
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改导航状态
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以层级形式获取商品分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
