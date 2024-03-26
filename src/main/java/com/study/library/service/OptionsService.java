package com.study.library.service;

import com.study.library.entity.BookType;
import com.study.library.entity.Category;
import com.study.library.repository.OptionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsService {

    @Autowired
    private OptionsMapper optionsMapper;

    public List<BookType> getAllBookTypes() {
        return optionsMapper.getAllBookTypes();
    } //거를거 없이 그대로 스쳐지나감.

    public List<Category> getAllCategories() {
        return optionsMapper.getAllCategories();
    }
}
