package com.kodlama.io.homework4.dataAccess.concretes;

import com.kodlama.io.homework4.dataAccess.abstracts.ProgLanguageRepository;
import com.kodlama.io.homework4.entities.concretes.ProgLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgLanguageRepository implements ProgLanguageRepository {
    List<ProgLanguage> progLanguages;

    public InMemoryProgLanguageRepository() {
        progLanguages = new ArrayList<ProgLanguage>();
        progLanguages.add(new ProgLanguage(1, "Python"));
        progLanguages.add(new ProgLanguage(2, "Java"));
        progLanguages.add(new ProgLanguage(3, "C#"));
        progLanguages.add(new ProgLanguage(4, "Angular"));
        progLanguages.add(new ProgLanguage(5, "React"));
    }

    @Override
    public List<ProgLanguage> getAll() {
        return progLanguages;
    }

    @Override
    public void save(ProgLanguage progLanguage) {
        progLanguages.add(progLanguage);
    }

    @Override
    public void update(int id, String name) throws Exception {
        int indexLanguageInList = findIndexLanguageInList(id);
        ProgLanguage progLang = progLanguages.get(indexLanguageInList);
        progLang.setName(name);
        // progLanguages.add(progLang);
    }

    @Override
    public void delete(int id) throws Exception {
        int memoryIndex = findIndexLanguageInList(id);
        progLanguages.remove(memoryIndex);
    }

    @Override
    public ProgLanguage getById(int id) throws Exception {
        int memoryIndex = findIndexLanguageInList(id);
        return progLanguages.get(memoryIndex);
    }

    public int findIndexLanguageInList(int id) throws Exception {
        int indexOfLanguageInList = -1;
        for (ProgLanguage language : progLanguages
        ) {
            if (id == language.getId())
                indexOfLanguageInList = progLanguages.indexOf(language);
        }
        if (indexOfLanguageInList != -1)
            return indexOfLanguageInList;
        else throw new Exception(id + " nolu Kayıt bulunamadı!!!");
    }
}
