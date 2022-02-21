package com.fatec.mom.domain.codelist;

import com.fatec.mom.domain.block.Block;
import com.fatec.mom.domain.block.BlockService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CodelistFacade {

    private final CodelistService codelistService;
    private final BlockService blockService;

    private final CodelistReturnAdapter adapter;

    public CodelistReturn getFullCodelist(Long id) {
        final Codelist codelist = codelistService.findById(id);
        final List<Block> blocks = blockService.findByCodelist(codelist);

        return adapter.adapt(new CodelistReturnAdapterContext(codelist, blocks));
    }
}
