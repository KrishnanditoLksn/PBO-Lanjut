package PraktikkumGui_1.Modul9;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("sampleSatu.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeInt(987654321);
        dataOutputStream.writeLong(11111111L);
        dataOutputStream.writeFloat(22222222F);
        dataOutputStream.writeDouble(3333333D);
        dataOutputStream.writeChar('A');
        dataOutputStream.writeBoolean(true);

        dataOutputStream.close();

    }
}
