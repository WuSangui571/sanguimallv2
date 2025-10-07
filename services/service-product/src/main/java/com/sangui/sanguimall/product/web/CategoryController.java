package com.sangui.sanguimall.product.web;


import com.sangui.sanguimall.product.service.CategoryService;
import com.sangui.sanguimall.result.R;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-10-06
 * @Description: CategoryController
 * @Version: 1.0
 */
@RestController
public class CategoryController {
    @Resource
    CategoryService categoryService;

    @GetMapping("/category/list/tree")
    public R getCateGoryListTree(){
        return R.ok(categoryService.getCategoryListTree());
    }
}
