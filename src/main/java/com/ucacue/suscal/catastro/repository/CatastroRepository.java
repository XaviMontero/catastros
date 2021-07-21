package com.ucacue.suscal.catastro.repository;

import com.ucacue.suscal.catastro.entity.Catastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatastroRepository extends JpaRepository<Catastro, String> {
}
