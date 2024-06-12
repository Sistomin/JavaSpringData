package ru.istomin.SpringHW5.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.istomin.SpringHW5.model.Issue;
import ru.istomin.SpringHW5.model.Reader;
import ru.istomin.SpringHW5.repository.IssueRepository;
import ru.istomin.SpringHW5.repository.ReaderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReaderService {

    private final ReaderRepository readerRepository;
    private final IssueRepository issueRepository;

    @Autowired
    public ReaderService(ReaderRepository readerRepository, IssueRepository issueRepository) {
        this.readerRepository = readerRepository;
        this.issueRepository = issueRepository;
    }

    // получить читателя по id
    public Reader getReaderById(Long id) {
        return readerRepository.findById(id).get();
    }

    //получить список всех читателей
    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    // создание читателя
    public Reader addReader(Reader reader) {
        return readerRepository.save(reader);
    }

    //обновление читателей
    @Transactional
    public Reader updateReaders(Long id, Reader reader) {
        Reader updateReader = readerRepository.findById(id).orElseThrow(()-> new RuntimeException("Reader not found"));
        updateReader.setName(reader.getName());
        return readerRepository.save(updateReader);
    }

    // удаление читателя
    public void deleteReader(Long id) {
        readerRepository.deleteById(id);
    }

    //получить список выдач по id читателя
    public List<Issue> getAllIssueByReaderId(Long id) {
        return issueRepository.getAllIssueByReaderId(id);
    }

}
