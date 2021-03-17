package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public interface Tasks {

    void addMovieToCatalog(Movie m);

    ArrayList<Customer> getListOfCustomers();

    void addCustomerToList(Customer c);

    HashMap<String, String> getMoviesAvailable();

    HashMap<String, String> getMoviesRented();

    ArrayList<Movie> getListOfMovies();


}
