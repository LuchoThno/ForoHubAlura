package com.AluraChallenger.ForoHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository<Topic> extends JpaRepository<Topic, Long> {
}