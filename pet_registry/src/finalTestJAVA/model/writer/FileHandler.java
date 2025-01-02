package finalTestJAVA.model.writer;

import java.io.*;

public class FileHandler implements Writer {

    private String fileName = "src\\finalTestJAVA\\model\\writer\\fileAnimals.txt";



    public void save(Serializable serializable) {
        // метод сохранения состояния программы (процесс записи состояния объекта в поток - сериализация)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(serializable);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public Object read() {
        // метод восстановления состояния программы (процесс восстановления состояния объекта из потока - десериализация)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
            return ois.readObject();
        } catch (Exception e) {
            System.out.println("Ошибка восстановления. Возможно файл поврежден или удален.");
            return null;
        }
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
