package com.company;

public class Movie {

    private String name;
    private String yearRelease;
    private String genre;
    private boolean isAvailable;


    public Movie(String name, String yearRelease, String genre) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.genre = genre;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public String getGenre() {
        return genre;
    }

    void setAvailable(boolean available) {

        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString(){
        return "Movie: " + getName() + "\nYear of Release: "+ getYearRelease() + "\nGenre: " + getGenre();
    }
}
