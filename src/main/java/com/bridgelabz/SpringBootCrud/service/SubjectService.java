package com.bridgelabz.SpringBootCrud.service;

import com.bridgelabz.SpringBootCrud.bean.Subject;
import com.bridgelabz.SpringBootCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepo;
    public List<Subject> getAllSubject(){
        List<Subject> subjects = new ArrayList<>();
    subjectRepo.findAll().forEach(subjects::add);
    return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubjecct(String id, Subject subject) {
    subjectRepo.save(subject);

    }

    public void deleteSubject(String id) {
        subjectRepo.deleteById(id);

    }
}
