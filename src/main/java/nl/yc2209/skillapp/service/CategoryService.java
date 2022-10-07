package nl.yc2209.skillapp.service;

import nl.yc2209.skillapp.models.Category;
import nl.yc2209.skillapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {this.categoryRepository = categoryRepository;}

    public List<Category> getAllCategory() {return categoryRepository.findAll();}
}
