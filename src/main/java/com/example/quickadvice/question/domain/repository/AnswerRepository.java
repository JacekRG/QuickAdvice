package com.example.quickadvice.question.domain.repository;

import com.example.quickadvice.question.domain.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, UUID> {

	List<Answer> findByQuestionId(UUID questionId);
}
