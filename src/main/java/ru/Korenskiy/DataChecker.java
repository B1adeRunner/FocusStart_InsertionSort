package ru.Korenskiy;

public class DataChecker {
    private String[] data;

    public DataChecker(String[] data){
        this.data = data;
    }

    public void targetFileNameControl() {
        if (data[1].equals("out.txt")) {

        } else {
            System.out.println("Вы ввели не верное имя файла вывода информации. Верное имя:\n out.txt");
            Thread.currentThread().stop();
        }
    }

    public void sourceFileNameControl(){
        if(data[0].equals("in.txt")){

        } else {
            System.out.println("Вы ввели не верное имя исходного файла информации. Верное имя:\n in.txt");
            Thread.currentThread().stop();
        }
    }

    public void sortModeControl(){
        if((data[2].equals("-a")) | (data[2].equals("-d"))) {

        } else {
            System.out.println("Вы ввели не верное обозначение режима сортировки (на англ. яз):\n -a     в возрастающем порядке" +
                    "\n -d     в убывающем порядке");
            Thread.currentThread().stop();
        }
    }

    public void informationCompletenessControl(){
        if(data.length != 3) {
            System.out.println("Вы ввели неверные данные для запуска программы:\n" +
                    "in.txt        имя исходного файла\n" +
                    "out.txt       имя вывода информации\n" +
                    "-a/-d         порядок соритровки, в возрастающем/убывающем порядке\n" +
                    "Пример команды для запуска:\njava -jar InsertionSort-1.0-SNAPSHOT.jar in.txt out.txt -a");
            Thread.currentThread().stop();
        }
    }
}