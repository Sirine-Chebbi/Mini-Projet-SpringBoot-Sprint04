package com.sirine.series.repos;

import com.sirine.series.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "g")
@CrossOrigin(origins = "http://localhost:4200/")
public interface GenreRepository extends JpaRepository<Genre, Long> {

	
}
