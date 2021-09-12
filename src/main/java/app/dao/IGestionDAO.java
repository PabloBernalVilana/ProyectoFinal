package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Gestion;

public interface IGestionDAO extends JpaRepository<Gestion, Long> {

}
