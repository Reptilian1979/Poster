package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void addFilm() {
        PosterManager posterManager = new PosterManager();


        String[] oldPoster = new String[]{"Matrix", "Terminator", "Groundhog day"};
        posterManager.setFilms(oldPoster);
        String addNewFilm = "Home Alone";
        posterManager.addFilm(addNewFilm);
        String[] expected = new String[]{"Matrix", "Terminator", "Groundhog day", "Home Alone"};
        String[] actual = posterManager.getFilms();


        assertArrayEquals(expected, actual);
    }


    @Test
    void findLastFilmsUnderLimitOfFilmsNumber() {
        PosterManager posterManager = new PosterManager(3);


        String[] oldPoster = new String[]{"Matrix", "Terminator", "Groundhog day", "Home Alone", "Брат-2"};
        posterManager.setFilms(oldPoster);
        posterManager.findLastFilms();
        String[] expected = new String[]{"Брат-2", "Home Alone", "Groundhog day"};
        String[] actual = posterManager.getFilms();


        assertArrayEquals(expected, actual);

    }

    @Test
    void findLastFilmsOverLimitOfFilmsNumber() {
        PosterManager posterManager = new PosterManager(3);


        String[] oldPoster = new String[]{"Matrix", "Terminator", "Groundhog day"};
        posterManager.setFilms(oldPoster);
        posterManager.findLastFilms();
        String[] expected = new String[]{"Groundhog day", "Terminator", "Matrix"};
        String[] actual = posterManager.getFilms();


        assertArrayEquals(expected, actual);

    }

    @Test
    void findAllFilms() {
        PosterManager posterManager = new PosterManager();


        String[] oldPoster = new String[]{"Matrix", "Terminator", "Groundhog day", "Home Alone"};
        posterManager.setFilms(oldPoster);
        posterManager.findAllFilms();
        String[] expected = new String[]{"Matrix", "Terminator", "Groundhog day", "Home Alone"};
        String[] actual = posterManager.getFilms();


        assertArrayEquals(expected, actual);

    }
}