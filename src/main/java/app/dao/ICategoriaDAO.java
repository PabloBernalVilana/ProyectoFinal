package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Categoria;

public interface ICategoriaDAO extends JpaRepository<Categoria, Long>{

}
