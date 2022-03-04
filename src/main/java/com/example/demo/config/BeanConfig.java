package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.model.University;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeanConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRe, UniversityRepository universityRe) {
        return args -> {
            University universityVilnius = new University(1L, "Vilnius University", "9 Saulėtekio Ave., Building III, Room 713A");
            universityRe.save(universityVilnius);
            University universityKaunas = new University(2L, "Kaunas University of Technology", "K. Donelaičio St. 73, 44249 Kaunas, Lithuania");
            universityRe.save(universityKaunas);

            studentRe.saveAll(Arrays.asList(
                new Student("Michael", "Bell", "https://bootdey.com/img/Content/avatar/avatar4.png", universityVilnius),
                new Student("Katherine", "Manning", "https://bootdey.com/img/Content/avatar/avatar5.png", universityVilnius),
                new Student("Trevor", "King", "https://bootdey.com/img/Content/avatar/avatar6.png", universityVilnius),
                new Student("Kylie", "North", "https://bootdey.com/img/Content/avatar/avatar7.png", universityKaunas),
                new Student("Rachel", "Terry", "https://bootdey.com/img/Content/avatar/avatar8.png", universityKaunas),
                new Student("Rebecca", "Robertson", "https://bootdey.com/img/Content/avatar/avatar1.png", universityKaunas)

            ));
        };
    }
}
