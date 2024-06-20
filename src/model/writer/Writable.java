package model.writer;

import java.io.Serializable;

public interface Writable {
    boolean save(Serializable var1, String var2);

    Object read(String var1);
}
