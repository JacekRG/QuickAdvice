package com.example.quickadvice.category.controller;

import com.example.quickadvice.category.domain.model.Category;
import com.example.quickadvice.category.service.CategoryService;
import com.example.quickadvice.question.domain.model.Question;
import com.example.quickadvice.question.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/categories")
public class CategoryViewController {

	private final CategoryService categoryService;
	private final QuestionService questionService;

	public CategoryViewController(CategoryService categoryService, QuestionService questionService) {
		this.categoryService = categoryService;
		this.questionService = questionService;
	}

	@GetMapping("{id}")
	public String singleView(@PathVariable UUID id, Model model){
		Category category = categoryService.getCategory(id);
		List<Question> questions = questionService.findAllByCategoryId(id);

		model.addAttribute("category", category);
		model.addAttribute("questions", questions);

		return "category/single";
	}
}
