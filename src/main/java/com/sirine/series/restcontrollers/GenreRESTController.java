package com.sirine.series.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sirine.series.entities.Genre;
import com.sirine.series.entities.Serie;
import com.sirine.series.repos.GenreRepository;
import com.sirine.series.service.SerieService;

@RestController
@RequestMapping("/g")
@CrossOrigin("*")
public class GenreRESTController {
	
	@Autowired
	GenreRepository genreRepository;
	
	@Autowired
	SerieService serieService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenres()
	{
		return genreRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
		return genreRepository.findById(id).get();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void createGenre(@RequestBody Genre genre) {
		genreRepository.save(genre);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteGenre(@PathVariable("id") Long id) {
		genreRepository.deleteById(id);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.POST)
	public void updateGenre(@RequestBody Genre g) {
		genreRepository.save(g	);
		
	}
}
