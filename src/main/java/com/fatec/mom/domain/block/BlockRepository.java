package com.fatec.mom.domain.block;

import com.fatec.mom.domain.codelist.Codelist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {

    @Override
    Optional<Block> findById(Long aLong);

    @Query(value = "select * from MOM_BLOCK b\n" +
            "join MOM_SECTION s on b.section_id = s.id\n" +
            "where s.codelist = :codelist_id", nativeQuery = true)
    List<Block> findByCodelistId(@Param("codelist_id") Long id);
}
