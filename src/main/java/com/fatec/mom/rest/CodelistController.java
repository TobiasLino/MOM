package com.fatec.mom.rest;

import com.fatec.mom.domain.codelist.CodelistFacade;
import com.fatec.mom.domain.codelist.CodelistReturn;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codelist")
@AllArgsConstructor
public class CodelistController {

    private final CodelistFacade facade;

    @GetMapping("/get/{id}")
    public CodelistReturn getfullCodelistById(@PathVariable Long id) {
        return facade.getFullCodelist(id);
    }
}
