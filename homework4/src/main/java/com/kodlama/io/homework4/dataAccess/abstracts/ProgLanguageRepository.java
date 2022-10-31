package com.kodlama.io.homework4.dataAccess.abstracts;

import com.kodlama.io.homework4.entities.concretes.ProgLanguage;

import java.util.List;

public interface ProgLanguageRepository {
    List<ProgLanguage> getAll();
    void save(ProgLanguage progLanguage);
    void update(int id, String name) throws Exception;
    void delete(int id) throws Exception;
    ProgLanguage getById(int id) throws Exception;
}
