package com.company;

public class Driver {

    void run(){

        Customer c = new Customer("Marcus", "Moura", "marcus@moura.com");

        RentalStore rentalStore = new RentalStore("Rental Marcus");

        Movie harryPotter = new Movie("Harry Potter and the Deathly Hallows part 1", "2010", "fantasy");
        Movie avengers = new Movie("Avengers Infinity War", "2017", "Adventure");

        avengers.setAvailable(false);
        harryPotter.setAvailable(true);

        rentalStore.addMovieToCatalog(harryPotter);
        rentalStore.addMovieToCatalog(avengers);


        rentalStore.printCatalog();



    }
}
