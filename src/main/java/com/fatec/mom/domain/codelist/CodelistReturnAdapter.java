package com.fatec.mom.domain.codelist;

import com.fatec.mom.domain.block.Block;
import com.fatec.mom.domain.section.Section;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CodelistReturnAdapter {

    public CodelistReturn adapt(CodelistReturnAdapterContext context) {
        List<CodelistReturn.CodelistData> codelistData = new LinkedList<>();

        for (Block block : context.getBlocks()) {
            codelistData.add(adaptOneBlock(block));
        }

        return CodelistReturn.builder()
                .codelist(context.getCodelist().getName())
                .data(codelistData)
                .build();
    }

    private CodelistReturn.CodelistData adaptOneBlock(Block block) {
        CodelistReturn.CodelistData.CodelistDataBuilder builder = CodelistReturn.CodelistData.builder()
                .blockCode(String.valueOf(block.getCode()))
                .blockName(block.getName())
                .remarks(block.getRemarks().stream()
                        .map(remark -> remark.getId().toString())
                        .collect(Collectors.joining(", ")));

        Section section = block.getSection();
        if (section.isSubSection()) {
            builder.section(section.getSubSection().getName())
                    .subSection(section.getName());
        } else {
            builder.section(section.getName());
        }

        return builder.build();
    }
}
