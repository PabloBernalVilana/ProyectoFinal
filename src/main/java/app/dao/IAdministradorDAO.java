package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Administrador;

public interface IAdministradorDAO extends JpaRepository<Administrador, Long>{

}
