package homework5;


import java.io.*;
// Вывод содержимого файла
public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b = 0;

        try {
            fis = new FileInputStream( "src/main/resources/test.csv" );
            isr = new InputStreamReader( fis, "UTF-8" );
            while ((b = fis.read()) != -1) {
                System.out.print( (char) b );
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
