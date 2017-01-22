package com.kidsclub.repository;

import com.kidsclub.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackDao extends JpaRepository<Feedback, Long> {
}
