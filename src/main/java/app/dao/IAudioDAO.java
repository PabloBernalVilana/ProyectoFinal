package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Audio;

public interface IAudioDAO extends JpaRepository<Audio, Long>{

}
