package ru.Korenskiy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
    private char[][] stringsTargetArray;
    private String fileName;
    private List<String> fileStrings;

    public FileParser(String fileName) {
        this.fileName = fileName;
    }

    public void takeFileStrings() {
        fileStrings = new ArrayList<String>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                fileStrings.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Указанный файл (" + fileName + ") не найден. "
                    + "Файл должен находиться в каталоге запуска программы." +
                    " Проверьте правильность расположения файла и попытайтесь запустить программу снова.");
        }
    }

    public void fileStringsParsing() {
        stringsTargetArray = new char[fileStrings.size()][];
        for(int i=0; i<fileStrings.size(); i++){
            stringsTargetArray[i] = new char[fileStrings.get(i).length()];
            stringsTargetArray[i] = fileStrings.get(i).toCharArray();
        }
    }

    public char[][] getStringsTargetArray(){
        return stringsTargetArray;
    }
}


