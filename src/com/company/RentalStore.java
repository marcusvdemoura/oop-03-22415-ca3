package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RentalStore implements Tasks {

    private String storeName;

    private ArrayList<Movie> movies = new ArrayList<>();

    private ArrayList<Customer> listOfCustomers = new ArrayList<>();

    private HashMap<String, String> availableMovies = new HashMap<>();

    private HashMap<String, String> rentedMovies = new HashMap<>();

    private WriteToFile writeToFile;

    private ReadFile readFile;




    public RentalStore(String storeName) {
        this.storeName = storeName;
        CreateFile listOfCustomersTXT = new CreateFile("ListCustomers");
        WriteToFile writeToFile = new WriteToFile("ListCustomers");
        CreateFile listOfMoviesTXT = new CreateFile("ListMovies");
        writeToFile = new WriteToFile("ListMovies");
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public void addMovieToCatalog(Movie m) {

        getListOfMovies().add(m);

        writeToFile = new WriteToFile(m, "ListMovies");


    }

    @Override
    public ArrayList<Customer> getListOfCustomers() {

        return listOfCustomers;

    }

    @Override
    public void addCustomerToList(Customer c) {

        getListOfCustomers().add(c);
        writeToFile = new WriteToFile(c, "ListCustomers");


    }

    @Override
    public HashMap<String, String> getMoviesAvailable() {
        HashMap<String, String> availableMovies = new HashMap<>();

        for (Movie movie : getListOfMovies()) {
            if (movie.isAvailable() == true)
                availableMovies.put(movie.getName(), movie.getGenre());

        }

        this.availableMovies = availableMovies;
        return availableMovies;
    }

    @Override
    public HashMap<String, String> getMoviesRented() {

        HashMap<String, String> moviesRented = new HashMap<>();

        for (Movie movie : getListOfMovies()) {
            if (movie.isAvailable() == false)
                moviesRented.put(movie.getName(), movie.getGenre());

        }

        this.rentedMovies = moviesRented;


        return rentedMovies;
    }

    @Override
    public ArrayList<Movie> getListOfMovies() {
        return movies;
    }

    void printCatalog() {

        System.out.println(getStoreName() + " catalog:\n");
        for (Movie movie : getListOfMovies()) {
            System.out.println(movie.toString() + "\n");
            System.out.println("-----------------------");
        }
    }

    void printMoviesRented(){

        HashMap<String, String> moviesRented = getMoviesRented();

        System.out.println("MOVIES RENTED:\n");

        for (Map.Entry<String, String> movie: moviesRented.entrySet()){
            System.out.println("Movie: "+movie.getKey() + "\n" + "Genre: " + movie.getValue());
            System.out.println("--------------------");
        }
    }

    public void printListCustomers() {

        readFile = new ReadFile("ListCustomers");


    }

}
