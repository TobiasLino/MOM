package com.fatec.mom.domain.block;

import com.fatec.mom.domain.codelist.Codelist;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlockService {

    private final BlockRepository repository;

    public Block findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Block Not exists"));
    }

    public List<Block> findByCodelist(Codelist codelist) {
        return repository.findByCodelistId(codelist.getId());
    }
}
