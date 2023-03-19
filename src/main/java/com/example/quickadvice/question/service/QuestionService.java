package com.example.quickadvice.question.service;

import com.example.quickadvice.IdeasConfiguration;
import com.example.quickadvice.question.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {

    private final IdeasConfiguration ideasConfiguration;

    public QuestionService(IdeasConfiguration ideasConfiguration) {
        this.ideasConfiguration = ideasConfiguration;
    }

    public List<Question> getQuesions() {
        return Arrays.asList(
                new Question("Question 1"),
                new Question("Question 2")
        );
    }

    public String test(String value) {
        return String.format("Hello %s %s", ideasConfiguration.getName(), value);
    }
}
