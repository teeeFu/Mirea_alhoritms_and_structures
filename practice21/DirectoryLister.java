package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister{
    public static void listFirstFiveFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Ошибка чтения каталога.");
            return;
        }

        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            fileNames.add(file.getName());
        }

        System.out.println("Первые 5 элементов каталога:");
        for (int i = 0; i < Math.min(5, fileNames.size()); i++) {
            System.out.println(fileNames.get(i));
        }
    }

    public static void main(String[] args) {
        listFirstFiveFiles("/Users/aleksandrsolodovcenko/Library/Mobile Documents/com~apple~TextEdit/Documents/txt22.rtf");
    }
}
