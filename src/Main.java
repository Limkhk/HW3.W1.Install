import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        fileCreator();
    }

    public static void fileCreator() {
        StringBuilder sb = new StringBuilder();

        String baseDirectory = "D:\\Курсы\\netology\\Games";
        // 1. В папке `Games` создайте несколько директорий: `src`, `res`, `savegames`, `temp`
        File dirSrc = new File(baseDirectory + "/src");
        File dirRes = new File(baseDirectory + "/res");
        File dirSG = new File(baseDirectory + "/savegames");
        File dirTemp = new File(baseDirectory + "/temp");
        if (dirSrc.mkdir()) {
            sb.append("Директория " + dirSrc + " создана успешно.\n");
        }
        if (dirRes.mkdir()) {
            sb.append("Директория " + dirRes + " создана успешно.\n");
        }
        if (dirSG.mkdir()) {
            sb.append("Директория " + dirSG + " создана успешно.\n");
        }
        if (dirTemp.mkdir()) {
            sb.append("Директория " + dirTemp + " создана успешно.\n");
        }
        // 2. В каталоге src создайте две директории: main, test
        File dirSrcMain = new File(dirSrc, "main");
        if (dirSrcMain.mkdir()) {
            sb.append("Директория " + dirSrcMain + " создана успешно.\n");
        }
        File dirSrcTest = new File(dirSrc, "test");
        if (dirSrcTest.mkdir()) {
            sb.append("Директория " + dirSrcTest + " создана успешно.\n");
        }
        // 3. В подкаталоге main создайте два файла: Main.java, Utils.java
        File fileMain = new File(dirSrcMain, "Main.java");
        File fileUtils = new File(dirSrcMain, "Utils.java");


        // 5. В директории temp создайте файл temp.txt.
        File fileTemp = new File(dirTemp, "temp.txt");
        try {
            if (fileMain.createNewFile()) {
                sb.append("Файл " + fileMain + " создан успешно.\n");
            }
            if (fileUtils.createNewFile()) {
                sb.append("Файл " + fileUtils + " создан успешно.\n");
            }
            if (fileTemp.createNewFile()) {
                sb.append("Файл " + fileTemp + " создан успешно.\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 4. В каталог res создайте три директории: drawables, vectors, icons.
        File dirResDraw = new File(dirRes, "drawables");
        File dirResVect = new File(dirRes, "vectors");
        File dirResIcon = new File(dirRes, "icons");
        if (dirResDraw.mkdir()) {
            sb.append("Файл " + dirResDraw + " создан успешно.\n");
        }
        if (dirResVect.mkdir()) {
            sb.append("Файл " + dirResVect + " создан успешно.\n");
        }
        if (dirResIcon.mkdir()) {
            sb.append("Файл " + dirResIcon + " создан успешно.\n");
        }
        String log = sb.toString();
        try (FileWriter writer = new FileWriter(fileTemp)){
            writer.write(log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}