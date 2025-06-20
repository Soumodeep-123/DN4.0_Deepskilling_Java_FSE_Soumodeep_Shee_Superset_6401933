//package practise.Algorithms_Data Structures.Exercise 6_Library Management System;
import java.util.*;

class book{
    int bookId;
    String title;
    String author;

    public book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + title + ", Author: " + author);
    }
}

public class library_management {

    public static book linearsearch(book b[], String title) {
        for(int i =0; i< b.length; i++){
            if(b[i].title.equalsIgnoreCase(title)) {
                return b[i];
            }
        }
        return null;

    }

    public static book binarySearch(book[] b, String title) {
        int low = 0, high = b.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = title.compareToIgnoreCase(b[mid].title);

            if (cmp == 0)
                return b[mid];
            else if (cmp > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String args[]) {
        book b[] = {
            new book(1, "Wings of Fire", "A.P.J. Abdul Kalam"),
            new book(2, "Pather Panchali", "Bibhutibhushan Bandopadhyay"),
            new book(3, "Feluda Series", "Satyajit Ray"),
            new book(4, "The Catcher in the Rye", "J.D. Salinger")
        };

        for (int i = 0; i < b.length; i++) {
            System.out.println("ID: " + b[i].bookId + ", Title: " + b[i].title + ", Author: " + b[i].author);
        }

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter book title to search: ");
        String title = sc.nextLine();

        System.out.println("Linear Search ");
        book result1 = linearsearch(b, title);
        if (result1 != null) {
            System.out.print("Book found: ");
            result1.print();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println(" Binary Search ");

        
        Arrays.sort(b, (b1, b2) -> b1.title.compareToIgnoreCase(b2.title));
        book result2 = binarySearch(b, title);
        if (result2 != null) {
            System.out.print("Book found: ");
            result2.print();
        } else {
            System.out.println("Book not found.");
        }

    }
}
