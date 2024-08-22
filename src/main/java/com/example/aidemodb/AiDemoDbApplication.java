package com.example.aidemodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class AiDemoDbApplication {
	
	private final PdfDocument pdfDocument;

    public static void main(String[] args) {
        SpringApplication.run(AiDemoDbApplication.class, args);
    }
    
    @Autowired
    public AiDemoDbApplication(PdfDocument pdfDocument) {
        this.pdfDocument=pdfDocument;
    }
 

}
