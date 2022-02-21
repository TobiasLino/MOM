package com.fatec.mom.domain.codelist;

import com.fatec.mom.domain.block.Block;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class CodelistReturnAdapterContext {

    private Codelist codelist;

    private List<Block> blocks;
}
