/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.cinema.filters;

import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.model.Movie;
import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro y jonathan
 */

@Service
public class filteringByGender implements filter {

    

    @Override
    public List<Movie> filtro(Cinema cinema, String date, String parametro)  throws filterException {
        List<Movie> pelis = new ArrayList();
        List<CinemaFunction> functions = cinema.getFunctions();
        for (CinemaFunction i : functions) {
            if (i.getMovie().getGenre().equals(parametro) ) {
                pelis.add(i.getMovie());
            }
        }
        return pelis;
    }

   

    
}
