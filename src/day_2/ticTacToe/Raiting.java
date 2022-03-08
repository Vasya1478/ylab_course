package day_2.ticTacToe;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Raiting {
    public void write(Player player, int text) throws IOException {

        try {
            BufferedOutputStream fos = new BufferedOutputStream(
                        new FileOutputStream(Paths.get("").toAbsolutePath().toString() +
                        "/raiting.txt"));
            String byteText = player.getName() + " " + text;
            byte[] buffer = byteText.getBytes();

            fos.write(buffer);
            fos.flush();
            fos.close();

            System.out.println("Файл записан");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void read() {
        try(
                FileInputStream fin = new FileInputStream(Paths.get("").toAbsolutePath().toString() +
                "/raiting.txt"))
        {
            Map<String, String> hashmap = new HashMap<String, String>();

            byte[] buffer = new byte[fin.available()];

            fin.read(buffer, 0, fin.available());

            System.out.println("File data:");


            char[] charBuf = new char[buffer.length];
            char[] charBuf2 = new char[3];
            char mark = ' ';
            for(int i=0, j = 0; i<buffer.length;i++){

                if (mark != 'X') {
                    charBuf[i] = (char)buffer[i];
                    if (charBuf[i] == ' ')
                        mark = 'X';
                } else {
//                    for (int j = 0; j < charBuf2.length; j++) {
                        charBuf2[j] = (char)buffer[i];
                        j++;
//                    }
                }
            }
            String key = String.valueOf(charBuf);
            String value = String.valueOf(charBuf2);
            hashmap.put(key, value);

            for (Map.Entry<String, String> entry: hashmap.entrySet())
                System.out.println(entry.getKey() + " = " + entry.getValue());


        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
