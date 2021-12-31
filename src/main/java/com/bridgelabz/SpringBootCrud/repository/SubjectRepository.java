package com.bridgelabz.SpringBootCrud.repository;

import com.bridgelabz.SpringBootCrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {
}
