package homework5;

import java.io.*;
// запись в файл и создание нового файла
public class WriteIntoFile {

    public static void main(String[] args) {

        FileWriter fr = null;
        String str = " New";
        File file = new File( "src/main/resources/test02.csv" ); // Создание нового файла
        {
            try {
                 fr =new FileWriter( file, true ); // Вместо file путь  "src/main/resources/test02.csv"
               fr.write(str  );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
         }
}
