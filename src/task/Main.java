package task;


import task.enums.Ganre;
import task.enums.Gender;
import task.models.Book;
import task.models.Library;
import task.models.Reader;
import task.service.BookService;
import task.service.LibraryService;
import task.service.ReaderService;
import task.service.impl.BookServiceImpl;
import task.service.impl.LibraryServiceImpl;
import task.service.impl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static LibraryService libraryService = new LibraryServiceImpl();
    static BookService bookService = new BookServiceImpl();
    static ReaderService readerService = new ReaderServiceImpl();
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    PRESS TO 1. LIBRARY
                    PRESS TO 2. READER
                    PRESS TO 3. BOOK
                    PRESS TO 4. EXIT
                    """);
            System.out.print("comanda : ");
            int com = scannerInt.nextInt();

            switch (com) {
                case 1 -> {
                    System.out.println("""
                            PRESS TO -> 1. ADD LIBRARY
                            PRESS TO -> 2. DET ALL LIBRARY
                            PRESS TO -> 3. DET BY ID LIBRARY
                            PRESS TO -> 4. UPDATE LIBRARY
                            PRESS TO -> 5. DELETE LIBRARY
                            PRESS TO -> 6. EXIT
                            
                            """);
                    System.out.print("comanda : ");
                    int command = scannerInt.nextInt();
                    switch (command) {
                        case 1 -> System.out.println(libraryService.saveLibrary(saveLib()));

                        case 2 -> System.out.println(libraryService.getAllLibraries());

                        case 3 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(libraryService.getLibraryById(id));
                        }
                        case 4 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(libraryService.updateLibrary(id, saveLib2()));

                        }
                        case 5 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(libraryService.deleteLibrary(id));

                        }
                        case 6 -> {
                            return;
                        }

                        default -> System.out.println("INVALID COMMAND");
                    }

                }
                case 2 -> {
                    System.out.println("""
                            PRESS TO -> 1. ADD READER
                            PRESS TO -> 2. DET ALL READER
                            PRESS TO -> 3. DET BY ID READER
                            PRESS TO -> 4. UPDATE READER
                            PRESS TO -> 5. ASSIGN READER TO LIBRARY
                            PRESS TO -> 6. EXIT
                            
                            """);
                    System.out.print("comanda : ");
                    int command = scannerInt.nextInt();
                    switch (command) {
                        case 1 ->
                            readerService.saveReader(saveRea3());


                        case 2 -> System.out.println(readerService.getAllReaders());

                        case 3 -> {
                            System.out.println("ID READER : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(readerService.getReaderById(id));
                        }
                        case 4 -> {
                            System.out.println("ID READER : ");
                            Long id = scannerInt.nextLong();
                            readerService.updateReader(id, saveRea3());
                        }
                        case 5 -> {
                            System.out.println("ID READER : ");
                            Long id1 = scannerInt.nextLong();
                            System.out.println("ID LIBRARY : ");
                            Long id2 = scannerInt.nextLong();
                            readerService.assignReaderToLibrary(id1, id2);
                        }
                        case 6 -> {
                            return;
                        }

                        default -> System.out.println("INVALID COMMAND");
                    }

                }
                case 3 -> {
                    System.out.println("""
                            PRESS TO -> 1. ADD BOOK BY ID LIBRARY :
                            PRESS TO -> 2. DET ALL BOOK BY ID LIBRARY :
                            PRESS TO -> 3. DET ALL BOOK BY ID LIBRARY :
                            PRESS TO -> 4. DELETE BOOK BY ID LIBRARY :
                            PRESS TO -> 5. CLEAR BOOK BY ID LIBRARY :
                            PRESS TO -> 6. EXIT
                            
                            """);
                    System.out.print("comanda : ");
                    int command = scannerInt.nextInt();
                    switch (command) {
                        case 1 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(bookService.saveBook(id, saveBook()));
                        }
                        case 2 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.println(bookService.getAllBooks(id));
                        }
                        case 3 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.print("ID BOOK");
                            Long id1 = scannerInt.nextLong();
                            System.out.println(bookService.getBookById(id, id1));
                        }
                        case 4 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            System.out.print("ID BOOK");
                            Long id1 = scannerInt.nextLong();
                            System.out.println(bookService.deleteBook(id, id1));

                        }
                        case 5 -> {
                            System.out.print("ID LIBRARY : ");
                            Long id = scannerInt.nextLong();
                            bookService.clearBooksByLibraryId(id);
                        }
                        case 6 -> {
                            return;
                        }

                        default -> System.out.println("INVALID COMMAND");
                    }
                }
                case 4 -> {return;}
                default -> System.out.println("INVALID COMMAND");
            }
        }


    }

    public static List<Library> saveLib() {
        System.out.print("kancha librery koshosuz : ");
        List<Library> libraries = new ArrayList<>();
        int a = scannerInt.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("LIBRARY NAME : ");
            String name = scannerStr.next();
            System.out.print("LIBRARY ADDRESS : ");
            String address = scannerStr.next();


            Library library = new Library(name, address, new ArrayList<>(), new ArrayList<>());
            libraries.add(library);
        }
        return libraries;
    }

    public static Library saveLib2() {
        System.out.print("LIBRARY NAME : ");
        String name = scannerStr.next();
        System.out.print("LIBRARY ADDRESS : ");
        String address = scannerStr.next();
        return new Library(name, address, new ArrayList<>(), new ArrayList<>());
    }

    public static Reader saveRea3() {
        System.out.print("READER FULLNAME : ");
        String name = scannerStr.next();
        System.out.print("READER EMAIL : ");
        String email = scannerStr.next();
        System.out.print("READER PHONENUMBER : ");
        String phonenumber = scannerStr.next();
        System.out.println("! GENDER 1 | MALE ||| 2 | FEMALE");
        System.out.print("READER GENDER : ");
        String gender = scannerStr.next().toLowerCase();
        Gender gender1 = null;
        switch (gender) {
            case "male", "1" -> gender1 = Gender.MALE;

            case "female", "2" -> gender1 = Gender.FEMALE;

            default -> System.out.println("ERROR");

        }
        return new Reader(name, email, phonenumber, gender1);
    }

    public static Book saveBook() {
        System.out.print("BOOK NAME : ");
        String name = scannerStr.next();
        System.out.print("BOOK AUTHOR : ");
        String author = scannerStr.next();
        Ganre ganre = null;
        System.out.println("""
                 PRESS TO 1. -> ФАНТАСТИКА,  // FANTASY
                 PRESS TO 2. -> ТАРЫХ,       // HISTORY
                 PRESS TO 3. -> РОМАН,       // ROMANCE
                 PRESS TO 4. -> УЖАС,        // HORROR
                """);
        System.out.println("comanda : ");
        int command = scannerInt.nextInt();
        switch (command) {
            case 1 -> ganre = Ganre.FANTASY;
            case 2 -> ganre = Ganre.HISTORY;
            case 3 -> ganre = Ganre.ROMANCE;
            case 4 -> ganre = Ganre.HORROR;
            default -> System.out.println("ERROR");

        }

        return new Book(name, author, ganre);
    }


}


