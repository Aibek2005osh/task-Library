package task.dao.impl;

import task.dao.LibraryDao;
import task.models.Datebase;
import task.models.Library;

import java.util.List;

public class LibraryDaoImpl implements LibraryDao {

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        Datebase.libraryList.addAll(libraries);
        return Datebase.libraryList;
    }

    @Override
    public List<Library> getAllLibraries() {

        return Datebase.libraryList;
    }

    @Override
    public Library getLibraryById(Long id) {
        Library library1 ;

        for (Library library : Datebase.libraryList) {
            if (library.getId().equals(id)) {
                library1 = library;
                return library1;
            }
        }
        System.out.println("not fount library");
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (Library library1 : Datebase.libraryList) {
            if (library1.getId().equals(id)) {
                library1.setName(library.getName());
                library1.setAddress(library.getAddress());
                return library1;
            }

        }
        System.out.println("not fount library");

        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : Datebase.libraryList) {
            if (library.getId().equals(id)) {
                Datebase.libraryList.remove(library);
                return "success delete library";

            }
        }
        return "Not found library";
    }
}
