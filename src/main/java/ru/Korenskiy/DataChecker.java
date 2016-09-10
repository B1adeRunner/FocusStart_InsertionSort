package ru.Korenskiy;

public class DataChecker {
    private String sourceFileName;
    private String targetFileName;
    private String sortMode;

    public DataChecker(String[] data){
        if(data.length != 0) {
            sourceFileName = data[0];
            targetFileName = data[1];
            sortMode = data[2];
        } else {
            System.out.println("Вы не ввели необходимые данные для запуска программы:\n" +
                    "in.txt        имя исходного файла\n" +
                    "out.txt       имя вывода информации\n" +
                    "-a/-d         порядок соритровки, в возрастающем/убывающем порядке\n" +
                    "Пример команды для запуска:\njava -jar InsertionSort-1.0-SNAPSHOT.jar in.txt out.txt -a");
            Thread.currentThread().stop();
        }
    }

    public void targetFileNameControl() {
        if (targetFileName.equals("out.txt")) {

        } else {
            System.out.println("Вы ввели не верное имя файла вывода информации. Верное имя:\n out.txt");
            Thread.currentThread().stop();
        }
    }

    public void sourceFileNameControl(){
        if(sourceFileName.equals("in.txt")){

        } else {
            System.out.println("Вы ввели не верное имя исходного файла информации. Верное имя:\n in.txt");
            Thread.currentThread().stop();
        }
    }

    public void sortModeControl(){
        if((sortMode.equals("-a")) | (sortMode.equals("-d"))) {

        } else {
            System.out.println("Вы ввели не верное обозначение режима сортировки (на англ. яз):\n -a     в возрастающем порядке" +
                    "\n -d     в убывающем порядке");
            Thread.currentThread().stop();
        }
    }
}