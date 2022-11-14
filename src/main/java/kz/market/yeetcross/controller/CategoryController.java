package kz.market.yeetcross.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import kz.market.yeetcross.entity.Category;
import kz.market.yeetcross.repository.CategoryRepository;
import kz.market.yeetcross.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/category/api")
@Tag(name = "Category Controller", description = "Category management resource")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryService categoryService, CategoryRepository categoryRepository) {
        this.categoryService = categoryService;
        this.categoryRepository = categoryRepository;
    }

    @PostMapping
    public ResponseEntity<Category> addCategory(Category category) {
        return new ResponseEntity<>(categoryService.addCategory(category), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

}
