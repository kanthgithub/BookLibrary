package booklibrary.service;

import org.springframework.stereotype.Component;

@Component
public class BookRecommenderService {

    public String getBooksForRecommendation(){
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }

}
