package com.fatec.mom.domain.codelist;

import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder @AllArgsConstructor
@NoArgsConstructor
public class CodelistReturn {

    private String codelist;

    private List<CodelistData> data;

    @Getter
    @Setter
    @Builder @AllArgsConstructor
    @NoArgsConstructor
    public static class CodelistData {

        private String section;
        private String subSection;
        private String blockNumber;
        private String blockName;
        private String blockCode;
        private String remarks;

    }
}
