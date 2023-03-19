package com.example.quickadvice.question.controller;

import com.example.quickadvice.question.domain.Question;
import com.example.quickadvice.question.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    List<Question> getQuestions(){
    return questionService.getQuesions();
    }

    @GetMapping("/test")
    String test(@RequestParam String value){
        return questionService.test(value);
    }
}
