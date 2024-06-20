package model.writer;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Writable {
    public FileHandler() {
    }

    public boolean save(Serializable serializable, String filePath) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

            boolean var4;
            try {
                objectOutputStream.writeObject(serializable);
                var4 = true;
            } catch (Throwable var7) {
                try {
                    objectOutputStream.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            objectOutputStream.close();
            return var4;
        } catch (Exception var8) {
            Exception e = var8;
            e.printStackTrace();
            return false;
        }
    }

    public Object read(String filePath) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

            Object var3;
            try {
                var3 = objectInputStream.readObject();
            } catch (Throwable var6) {
                try {
                    objectInputStream.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            objectInputStream.close();
            return var3;
        } catch (Exception var7) {
            Exception e = var7;
            e.printStackTrace();
            return null;
        }
    }
}
