package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Video;

public interface IVideoDAO extends JpaRepository<Video, Long> {

}
