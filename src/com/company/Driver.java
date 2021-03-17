package com.company;

public class Driver {

    void run(){

        Customer marcus = new Customer("Marcus", "Moura", "marcus@moura.com");
        Customer janis = new Customer("Janis", "Celmars", "janis@celmars.com");
        Customer eduardo = new Customer("Eduardo", "Fiori", "edu@fiori.com");
        Customer ines = new Customer("Ines", "Bruxinha", "ines@rastatabacanavara.com");

        RentalStore rentalStore = new RentalStore("Rental Marcus");

        rentalStore.addCustomerToList(marcus);
        rentalStore.addCustomerToList(janis);
        rentalStore.addCustomerToList(eduardo);
        rentalStore.addCustomerToList(ines);

        Movie harryPotter = new Movie("Harry Potter and the Deathly Hallows part 1", "2010", "fantasy");
        Movie avengers = new Movie("Avengers Infinity War", "2017", "Adventure");
        Movie capitanAmerica = new Movie("Capitan America", "2015", "Adventure");

        avengers.setAvailable(false);
        harryPotter.setAvailable(true);
        capitanAmerica.setAvailable(true);

        rentalStore.addMovieToCatalog(harryPotter);
        rentalStore.addMovieToCatalog(avengers);
        rentalStore.addMovieToCatalog(capitanAmerica);


        rentalStore.printCatalog();

        rentalStore.printListCustomers();



    }
}
