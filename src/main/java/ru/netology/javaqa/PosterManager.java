package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PosterManager {

    private String[] films = new String[0];
    private int limitNumberOfFilms = 10;

    public PosterManager(int limitNumberOfFilms) {
        this.limitNumberOfFilms = limitNumberOfFilms;
    }


    public void addFilm(String filmsAdd) {
        int length = films.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = films[i];
        }
        tmp[length - 1] = filmsAdd;
        films = tmp;
    }

    public void findLastFilms() {
        int resultLength = films.length;
        if (resultLength > limitNumberOfFilms) {
            resultLength = limitNumberOfFilms;
        }
        String[] tmp = new String[resultLength];
        int index = films.length - 1;
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[index - i];
        }
        films = tmp;
    }

    public String[] findAllFilms() {

        return films;
    }

}