package com.fatec.mom.domain.codelist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CodelistRepository extends JpaRepository<Codelist, Long> {

    @Override
    Optional<Codelist> findById(Long aLong);

    Optional<Codelist> findByName(String nome);
}
