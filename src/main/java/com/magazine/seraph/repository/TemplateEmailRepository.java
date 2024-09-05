package com.magazine.seraph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magazine.seraph.model.TemplateEmail;

@Repository
public interface TemplateEmailRepository extends JpaRepository<TemplateEmail, Long> {
    TemplateEmail findByNome(String nome);
}
