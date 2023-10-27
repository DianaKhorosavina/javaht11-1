package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    Movies film1 = new Movies("Бладшот", "Боевик");
    Movies film2 = new Movies("Вперед", "Мультфильм");
    Movies film3 = new Movies("Отель Белград", "Комедия");
    Movies film4 = new Movies("Джентльмены", "Боевик");
    Movies film5 = new Movies("Человек-невидимка", "Ужасы");
    Movies film6 = new Movies("Тролли.Мировой тур", "Мультфильм");
    Movies film7 = new Movies("Номер один", "Комедия");


    @Test
    public void shouldStayEmpty() {
        MovieManager manager = new MovieManager();


        Movies[] expected = {};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldHaveDefault5Movie() {
        MovieManager manager = new MovieManager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movies[] expected = {film1, film2, film3, film4, film5};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLessThen5Movie() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);


        Movies[] expected = {film1, film2};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd5Movie() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movies[] expected = {film1, film2, film3, film4, film5};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThen5Movie() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Movies[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromDefault5Movies() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movies[] expected = {film5, film4, film3, film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromNumberOfMoviesSameTheLimit() {
        MovieManager manager = new MovieManager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movies[] expected = {film5, film4, film3, film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromMoreThen5() {
        MovieManager manager = new MovieManager(7);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        Movies[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromLessThen5() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);


        Movies[] expected = {film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromLessThenLimit() {
        MovieManager manager = new MovieManager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);


        Movies[] expected = {film3, film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTheLasOneFromMoreThenLimit() {
        MovieManager manager = new MovieManager(4);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movies[] expected = {film5, film4, film3, film2};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

