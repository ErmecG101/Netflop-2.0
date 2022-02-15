package com.netflop.repository;

import com.netflop.model.Resenha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResenhaRepository extends JpaRepository<Resenha, Long> {
}
