package app.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import app.dto.Contenido;

public interface IContenidoDAO extends JpaRepository<Contenido, Integer> {

}
