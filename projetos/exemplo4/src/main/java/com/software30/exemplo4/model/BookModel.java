package com.software30.exemplo4.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookModel {
    private Integer id;
    private String title;
    @Description("Descrição deve ter no máximo 20 palavras.")
    private String description;
    private String genre;
    private LocalDate dateOfPublication;
    private String author;
}
