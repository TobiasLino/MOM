package com.fatec.mom.domain.block;

import com.fatec.mom.domain.remarks.Remarks;
import com.fatec.mom.domain.section.Section;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class Block {

    @Id
    private Long id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "COD")
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "SECTION_ID")
    private Section section;

    @ManyToMany
    @JoinTable(name = "MOM_BLOCK_REMARK",
    joinColumns = @JoinColumn(name = "BLOCK_ID"),
    inverseJoinColumns = @JoinColumn(name = "REMARK_ID"))
    private List<Remarks> remarks;
}
