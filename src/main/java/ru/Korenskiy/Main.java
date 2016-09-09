package ru.Korenskiy;

public class Main {
    public static void main( String[] args ) {
        String sourceFilename = args[0];
        String targetFilename = args[1];
        String sortMode = args[2];

        DataChecker dataChecker = new DataChecker(args);
        dataChecker.sortModeControl();
        dataChecker.sourceFileNameControl();
        dataChecker.targetFileNameControl();

        FileParser fileParser = new FileParser(sourceFilename);
        fileParser.takeFileStrings();
        fileParser.fileStringsParsing();
        Sorter sorter = new Sorter();
        Sort sort = new InsertionSort(fileParser.getStringsTargetArray(), sortMode);
        sorter.setSort(sort);
        sorter.executeSort();
        DataResults dataResults = new DataResults(targetFilename, sort.getSortedData());
        dataResults.buildDataResultsFile();
    }
}
