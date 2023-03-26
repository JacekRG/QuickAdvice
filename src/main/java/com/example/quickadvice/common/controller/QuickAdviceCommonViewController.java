package com.example.quickadvice.common.controller;

import com.example.quickadvice.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;

public abstract class QuickAdviceCommonViewController {

	@Autowired
	protected CategoryService categoryService;

	protected void addGlobalAttributes(Model model) {
		model.addAttribute("categories", categoryService.getCategories(
				PageRequest.of(0, 10, Sort.by("name").ascending())
		));
	}
}
