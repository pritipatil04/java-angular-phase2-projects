package com.microservice1.api;

import com.microservice1.model.Movie;
import com.microservice1.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        Movie movie = movieService.read(id);
        log.info("Returned movie with id: {}", id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.create(movie);
        log.info("Created movie with id: {}", createdMovie.getId());
        return ResponseEntity.ok(createdMovie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        movieService.update(id, movie);
        log.info("Updated movie with id: {}", id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.delete(id);
        log.info("Deleted movie with id: {}", id);
        return ResponseEntity.ok().build();
    }
}
