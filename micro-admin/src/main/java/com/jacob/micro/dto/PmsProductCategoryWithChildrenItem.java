package com.jacob.micro.dto;

import com.jacob.micro.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 带有子分类的商品类别
 * @Date: 2024/4/1 22:11
 * @Version: 1.0
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @Getter
    @Setter
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}
