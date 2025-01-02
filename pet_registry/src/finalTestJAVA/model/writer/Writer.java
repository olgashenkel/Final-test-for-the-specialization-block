package finalTestJAVA.model.writer;

import java.io.Serializable;

public interface Writer {
    void save(Serializable serializable);
    Object read();
    void setFileName(String fileName);
}
