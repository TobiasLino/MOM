package com.fatec.mom.domain.codelist;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CodelistService {

    private final CodelistRepository repository;

    public Codelist findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Empty codelist"));
    }
}
