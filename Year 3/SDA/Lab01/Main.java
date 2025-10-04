public class Main {
    public static void main(String[] args) {
        // Create and persist a customer
        Customer customer1 = new Customer("Customer1");
        customer1.persist();

        // Create and persist movies
        Movie movie1 = new Movie("Movie1", Movie.REGULAR);
        movie1.persist();

        Movie movie2 = new Movie("Movie2", Movie.NEW_RELEASE);
        movie2.persist();

        // Create rentals
        Tape tape1 = new Tape("Tape1", movie1);
        Rental rental1 = new Rental(tape1, 3);
        customer1.addRental(rental1);

        Tape tape2 = new Tape("Tape2", movie2);
        Rental rental2 = new Rental(tape2, 2);
        customer1.addRental(rental2);

        // Generate and display statement for the customer
        String statement = customer1.statement();
        System.out.println(statement);
    }
}

