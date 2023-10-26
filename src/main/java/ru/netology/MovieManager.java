package ru.netology;

public class MovieManager {

    private Movies[] movies = new Movies[0];
    private int limit;


    public MovieManager() {
        this.limit = 5;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }


    public void add(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        Movies[] tmp = new Movies[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }


}


