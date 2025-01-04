package task.service.impl;

import task.dao.impl.ReaderDaoImpl;
import task.models.Reader;
import task.service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    ReaderDaoImpl readerDao = new ReaderDaoImpl();
    @Override
    public void saveReader(Reader reader) {
        readerDao.saveReader(reader);

    }

    @Override
    public List<Reader> getAllReaders() {
        return readerDao.getAllReaders();
    }

    @Override
    public Reader getReaderById(Long id) {
        return readerDao.getReaderById(id);
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        return readerDao.updateReader(id, reader);
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        readerDao.assignReaderToLibrary(readerId, libraryId);

    }
}
