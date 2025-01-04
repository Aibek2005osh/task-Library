package task.dao.impl;

import task.dao.ReaderDao;
import task.models.Datebase;
import task.models.Library;
import task.models.Reader;

import java.util.List;

public class ReaderDaoImpl implements ReaderDao {
    @Override
    public void saveReader(Reader reader) {
        Datebase.readers.add(reader);

    }

    @Override
    public List<Reader> getAllReaders() {
        return Datebase.readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader : Datebase.readers) {
            if (reader.getId().equals(id)) {
                return reader;
            }


        }
        System.out.println("not find reader");
        return null;

    }

    @Override
    public Reader updateReader(Long id, Reader reader) {

        for (Reader reader1 : Datebase.readers) {
            if (reader1.getId().equals(id)) {
                reader1.setFullName(reader.getFullName());
                reader1.setEmail(reader.getEmail());
                reader1.setPhoneNumber(reader.getPhoneNumber());
                reader1.setGender(reader.getGender());
                System.out.println("success");
                return reader1;

            }

        }
        System.out.println("not find reader");
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        Reader readerById = getReaderById(readerId);
        if (readerById == null) {
            System.out.println("not find reader");
            return;
        }
        for (Library library : Datebase.libraryList) {
            if (library.getId().equals(libraryId)) {
                library.getReaders().add(readerById);

                return;
            }

        }

    }
}
