package com.kodlama.io.homework4.business.concretes;

import com.kodlama.io.homework4.business.abstracts.ProgLanguageService;
import com.kodlama.io.homework4.dataAccess.abstracts.ProgLanguageRepository;
import com.kodlama.io.homework4.entities.concretes.ProgLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class ProgLanguageManager implements ProgLanguageService {

    private final ProgLanguageRepository progLanguageRepository;

    public ProgLanguageManager(ProgLanguageRepository progLanguageRepository) {
        this.progLanguageRepository = progLanguageRepository;
    }

    @Override
    public List<ProgLanguage> getAll() {

        return progLanguageRepository.getAll();
    }

    @Override
    public void save(ProgLanguage progLanguage) throws Exception {

        for (ProgLanguage language:progLanguageRepository.getAll()
             ) {
            if(language.getId()==(progLanguage.getId())){
                //  System.out.println("Aynı programlama dili kayıt edilemez!!!");
                throw new Exception("Farklı Id olmalıdır!!!");
            }
            if(language.getName().toLowerCase().equals(progLanguage.getName().toLowerCase()) || progLanguage.getName().equals(null) || progLanguage.getName()==""){
              //  System.out.println("Aynı programlama dili kayıt edilemez!!!");
                throw new Exception("Aynı programlama dili kayıt edilemez ve boş geçilemez!!!");
            }

        }

        progLanguageRepository.save(progLanguage);
    }

    @Override
    public void update(int id, String name) throws Exception {
        progLanguageRepository.update(id,name);
    }

    @Override
    public void delete(int id) throws Exception {
        progLanguageRepository.delete(id);
    }

    @Override
    public ProgLanguage getById(int id) throws Exception {
        return progLanguageRepository.getById(id);
    }
}
