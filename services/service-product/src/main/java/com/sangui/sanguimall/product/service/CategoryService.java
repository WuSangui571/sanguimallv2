package com.sangui.sanguimall.product.service;


import com.sangui.sanguimall.product.model.PmsCategory;

import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description:
 * @Version: 1.0
 */
public interface CategoryService {
    List<PmsCategory> getCategoryListTree();
}
