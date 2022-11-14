package kz.market.yeetcross.service.impl;

import kz.market.yeetcross.entity.Category;
import kz.market.yeetcross.repository.CategoryRepository;
import kz.market.yeetcross.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }
}
