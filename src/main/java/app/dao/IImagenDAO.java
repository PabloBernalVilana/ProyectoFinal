package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Imagen;

public interface IImagenDAO extends JpaRepository<Imagen, Long> {

}
