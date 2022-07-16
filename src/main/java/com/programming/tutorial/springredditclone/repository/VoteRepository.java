package com.programming.tutorial.springredditclone.repository;

import com.programming.tutorial.springredditclone.model.Post;
import com.programming.tutorial.springredditclone.model.User;
import com.programming.tutorial.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
