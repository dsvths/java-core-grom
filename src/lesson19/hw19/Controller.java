package lesson19.hw19;

/**
 * Created by Savenko on 04.10.2017.
 */
public class Controller {

    public File put(Storage storage, File file) throws Exception{
        validate(storage, file);
        int index = 0;
        for (File file1 : storage.getFiles()){
            if (file1 == null){
                storage.getFiles()[index] = file;
                break;
            }
            index++;
        }
        return storage.getFiles()[index];
    }

    public void delete(Storage storage, File file) throws Exception{
        boolean isExist = false;
        for (File file1 : storage.getFiles()){
            if (file1 != null && file1.equals(file)){
                isExist = true;
                break;
            }
        }
        if (!isExist)
            throw new Exception("File does not exist in Storage ID: " + storage.getId() + ". Cant be deleted");
        int index = 0;
        for (File file1 : storage.getFiles()){
            if (file1 != null && file1.equals(file)){
                storage.getFiles()[index] = null;
            }
            index++;
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception{
        long sizeOfFilesFromStorage = 0;
        for (File fileFromStorage : storageFrom.getFiles()) {
            findById(storageTo, fileFromStorage.getId());
            checkFormat(storageTo, fileFromStorage.getFormat());

            sizeOfFilesFromStorage += fileFromStorage.getSize();
        }

        checkForFreePlace(storageTo, storageFrom.getFiles().length);
        checkStorageSize(storageTo, sizeOfFilesFromStorage);

        for (File fileFromStorage : storageFrom.getFiles()){
            if (fileFromStorage != null){
                delete(storageFrom, fileFromStorage);
                put(storageTo, fileFromStorage);
            }
        }
    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception{
        for (File fileFromStorage : storageFrom.getFiles()){
            if (fileFromStorage.getId() == id){
                put(storageTo, fileFromStorage);
                return;
            }
        }
    }

    private boolean validate(Storage storage, File file) throws Exception {
        findById(storage, file.getId());
        checkFormat(storage, file.getFormat());
        checkForFreePlace(storage);
        checkStorageSize(storage, file.getSize());

        return false;
    }

    private void checkStorageSize(Storage storage, long fileSize) throws Exception {
        long size = 0;
        for (File file : storage.getFiles()){
            if (file != null)
                size += file.getSize();
        }
        if (size + fileSize > storage.getStorageSize())
            throw new Exception("No free space in Storage ID: " + storage.getId());
    }

    private void checkForFreePlace(Storage storage) throws Exception {
        for (File file : storage.getFiles()) {
            if (file == null)
                return;
        }
        throw new Exception("No free place in Storage ID: " + storage.getId());
    }

    private void checkForFreePlace(Storage storage, int placeNeeded) throws Exception {
        int count = 0;
        for (File file : storage.getFiles()){
            if (file == null)
                count++;
        }
        if (count < placeNeeded)
            throw new Exception("No free place in Storage ID: " + storage.getId());
    }

    private void checkFormat(Storage storage, String fileFormat) throws Exception {
        for (String format : storage.getFormatsSupported()){
            if (format.equals(fileFormat))
                return;
        }
        throw new Exception(fileFormat + " is not supported in Storage ID " + storage.getId());
    }

    private File findById(Storage storage, long id) throws Exception{
        for (File file : storage.getFiles()){
            if (file != null && file.getId() == id)
                throw new Exception("File " + id + "already exist in Storage ID: " + storage.getId());
        }
        return null;
    }
}
