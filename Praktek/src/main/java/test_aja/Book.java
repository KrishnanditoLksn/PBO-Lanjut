package test_aja;

import java.util.ArrayList;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

 class LibrarySimulation {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Menambahkan buku ke daftar buku
        books.add(new Book("Buku A"));
        books.add(new Book("Buku B"));
        books.add(new Book("Buku C"));

        // Peminjaman buku
        Book borrowedBook = books.remove(0);

        System.out.println("minjem" + borrowedBook.getTitle());
        // Pengembalian buku
        books.add(borrowedBook);

        // Menampilkan status buku
        System.out.println("Daftar buku:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}