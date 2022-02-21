package com.fatec.mom.domain.codelist;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "MOM_CODELIST")
@SequenceGenerator(name = "SQ_MOM_CODELIST", sequenceName = "SQ_MOM_CODELIST", allocationSize = 1)
@Getter @Setter
@NoArgsConstructor
public class Codelist {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SQ_MOM_CODELIST", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String name;
}
