package com.example.StudentProject;

import com.example.StudentProject.model.Student;
import com.example.StudentProject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final StudentRepository repo;

    public DataLoader(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        repo.save(new Student("Ankit", 40, "Male", "Andy"));
        repo.save(new Student("Priya", 25, "Female", "Ravi"));
    }
}
