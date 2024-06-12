package ru.istomin.SpringHW5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.istomin.SpringHW5.model.Book;
import ru.istomin.SpringHW5.model.Issue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {


    //получить список выдач по id читателя
    @Query("SELECT i FROM Issue i WHERE i.readerId = :id")
    List<Issue> getAllIssueByReaderId(Long id);


}
