package com.fatec.mom.domain.remarks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "MOM_REMARKS")
@SequenceGenerator(name = "SQ_MOM_REMARKS", sequenceName = "SQ_MOM_REMARKS", allocationSize = 1)
@Getter @AllArgsConstructor @NoArgsConstructor
public class Remarks {

    @Id
    @GeneratedValue(generator = "SQ_MOM_REMARKS", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String name;
}
