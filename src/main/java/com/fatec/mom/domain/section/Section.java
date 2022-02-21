package com.fatec.mom.domain.section;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fatec.mom.domain.codelist.Codelist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MOM_SECTION")
@SequenceGenerator(name = "SQ_MOM_SECTION", sequenceName = "SQ_MOM_SECTION", allocationSize = 1)
@Getter @Setter
@NoArgsConstructor
public class Section {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "SQ_MOM_SECTION", strategy =  GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "SUB_SECTION")
    private Section subSection;

    @ManyToOne
    @JoinColumn(name = "CODELIST")
    private Codelist codelist;

    public boolean isSubSection() {
        return subSection != null;
    }
}
