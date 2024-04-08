package com.jacob.micro.dto;

import com.jacob.micro.model.PmsProductAttribute;
import com.jacob.micro.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 包含有分类下属性的dto
 * @Date: 2024/4/8 22:28
 * @Version: 1.0
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
