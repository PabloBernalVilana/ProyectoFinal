package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Documento;

public interface IDocumentoDAO extends JpaRepository<Documento, Long> {

}
