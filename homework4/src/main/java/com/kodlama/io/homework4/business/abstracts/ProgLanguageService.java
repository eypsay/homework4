package com.kodlama.io.homework4.business.abstracts;

import com.kodlama.io.homework4.entities.concretes.ProgLanguage;

import java.util.List;

public interface ProgLanguageService {
    List<ProgLanguage> getAll();
    void save(ProgLanguage progLanguage) throws Exception;
    void update(int id, String name) throws Exception;
    void delete(int id) throws Exception;
    ProgLanguage getById(int id) throws Exception;
}
