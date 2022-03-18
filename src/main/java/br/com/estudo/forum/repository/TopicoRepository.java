package br.com.estudo.forum.repository;

import br.com.estudo.forum.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}