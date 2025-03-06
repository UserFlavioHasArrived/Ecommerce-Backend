package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.CategoryDTO;
import com.senai.ecommerce.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        return categoryRepository.findAll().stream().map(category 
                -> new CategoryDTO(category.getId(), category.getName())).toList();
    }
}
