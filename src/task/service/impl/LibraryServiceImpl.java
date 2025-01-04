package task.service.impl;

import task.dao.impl.LibraryDaoImpl;
import task.models.Library;
import task.service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    LibraryDaoImpl libraryDao = new LibraryDaoImpl();
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        return libraryDao.saveLibrary(libraries);
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryDao.getAllLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
        return libraryDao.getLibraryById(id);
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        return libraryDao.updateLibrary(id, library);
    }

    @Override
    public String deleteLibrary(Long id) {
        return libraryDao.deleteLibrary(id);
    }
}
