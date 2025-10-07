package com.sangui.sanguimall.product.service.impl;


import com.sangui.sanguimall.product.mapper.PmsCategoryMapper;
import com.sangui.sanguimall.product.model.PmsCategory;
import com.sangui.sanguimall.product.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description:
 * @Version: 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    PmsCategoryMapper categoryMapper;

    @Override
    public List<PmsCategory> getCategoryListTree() {
        // Step 1: 查询所有分类
        List<PmsCategory> pmsCategoryList = categoryMapper.selectAll();
        if (pmsCategoryList == null || pmsCategoryList.isEmpty()) {
            return new ArrayList<>(); // 返回空列表以处理空数据
        }

        // Step 2: 将查询到的 List 组装成树形结构
        // Step 2.1: 创建 Map，便于 O(1) 查找
        Map<Long, PmsCategory> categoryMap = new HashMap<>();
        for (PmsCategory category : pmsCategoryList) {
            // 确保 childCategory 不为 null
            if (category.getChildCategory() == null) {
                category.setChildCategory(new ArrayList<>());
            }
            categoryMap.put(category.getCatId(), category);
        }

        // Step 2.2: 收集根节点列表
        List<PmsCategory> rootCategories = new ArrayList<>();

        // Step 2.3: 遍历所有类别，建立父子关系
        for (PmsCategory category : pmsCategoryList) {
            Long parentCid = category.getParentCid();
            if (parentCid == null || parentCid == 0) {
                // 是根节点，添加到根列表
                rootCategories.add(category);
            } else {
                // 找到父节点，并添加到其 childCategory
                PmsCategory parent = categoryMap.get(parentCid);
                if (parent != null) {
                    // 确保父节点的 childCategory 不为 null
                    if (parent.getChildCategory() == null) {
                        parent.setChildCategory(new ArrayList<>());
                    }
                    parent.getChildCategory().add(category);
                } else {
                    // 记录日志，父节点不存在
                    System.out.println("Warning: Parent not found for catId " + category.getCatId());
                }
            }
        }

        // Step 2.4: 对子列表按 sort 属性升序排序
        for (PmsCategory root : rootCategories) {
            sortChildren(root);
        }


        return rootCategories;
    }

    // 递归排序子节点，按 sort 属性升序
    private void sortChildren(PmsCategory category) {
        if (category.getChildCategory() != null) {
            // 按 sort 升序排序，sort 为 null 的放最后
            category.getChildCategory().sort(
                    Comparator.comparing(PmsCategory::getSort, Comparator.nullsLast(Comparator.naturalOrder()))
            );
            // 递归排序子节点的子节点
            for (PmsCategory child : category.getChildCategory()) {
                sortChildren(child);
            }
        }
    }
}
