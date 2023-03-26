package com.example.quickadvice.question.service;

import com.example.quickadvice.question.domain.model.Answer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class AnswerService {

    public List<Answer> getAnswers(UUID questionId) {
        return Arrays.asList(
                new Answer("Answer 1"),
                new Answer("Answer 2")
        );
    }

    public Answer getAnswer(UUID id) {
        return new Answer("Answer");
    }

    public Answer createAnswer(UUID questionId, Answer answer) {
        answer.setId(UUID.randomUUID());
        return answer;
    }

    public Answer updateAnswer(UUID id, Answer answer) {
        return answer;
    }

    public void deleteAnswer(UUID id) {
    }
}
