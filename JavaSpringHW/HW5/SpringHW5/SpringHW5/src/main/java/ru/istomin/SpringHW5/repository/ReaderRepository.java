package ru.istomin.SpringHW5.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.istomin.SpringHW5.model.Book;
import ru.istomin.SpringHW5.model.Issue;
import ru.istomin.SpringHW5.model.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface ReaderRepository extends JpaRepository<Reader,Long> {



}