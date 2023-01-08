package org.example.observables;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Book book = new Book("Goosebumps","Fiction","Mr.X",275.75,"OutOfStock");
        EndUser u1 = new EndUser("amith",book);
        EndUser u2 = new EndUser("ramesh",book);
        EndUser u3 = new EndUser("jojo",book);

        System.out.println("Book current status : "+book.getInStock());

        book.setInStock("InStock");



    }
}
