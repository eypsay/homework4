package com.kodlama.io.homework4.webApi.controllers;

import com.kodlama.io.homework4.business.abstracts.ProgLanguageService;
import com.kodlama.io.homework4.entities.concretes.ProgLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proglang")
public class ProgLanguagesController {

    private final ProgLanguageService progLanguageService;

    public ProgLanguagesController(ProgLanguageService progLanguageService) {
        this.progLanguageService = progLanguageService;
    }


    @GetMapping("/getall")
    public List<ProgLanguage> getAll() {
        return progLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgLanguage getById(@PathVariable int id) throws Exception {
        return progLanguageService.getById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody ProgLanguage progLanguage) throws Exception {
        progLanguageService.save(progLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception {
        progLanguageService.delete(id);
    }

    @PostMapping("/update/{id}/{name}")
    public void update(@PathVariable int id, @PathVariable String name) throws Exception {
        progLanguageService.update(id, name);
    }


}
