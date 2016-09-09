package ru.Korenskiy;

public class InsertionSort implements Sort {
    private char[][] stringsTargetArray;
    private String sortMode;

    public InsertionSort(char[][] stringsTargetArray, String sortMode){
        this.stringsTargetArray = stringsTargetArray;
        this.sortMode = sortMode;
    }

    public void startSorting() {
        char[] tmp = null;
        int k = 0;
        for(int i = 1; i < stringsTargetArray.length; i++) {
            for(int j=i; j>0; j--) {
                while(stringsTargetArray[j][k] == stringsTargetArray[j-1][k]) {
                    k++;
                    if (stringsTargetArray[j].length-1 < k || stringsTargetArray[j-1].length-1 < k) break;
                }
                switch (sortMode){
                    case "-a": swapElementsInAscendingOrder(j, k, tmp); break;
                    case "-d": swapElementsInDescendingOrder(j, k, tmp); break;
                }
                k = 0;
            }
        }
        for(int u = 0; u < stringsTargetArray.length; u++)
            System.out.println(stringsTargetArray[u]);
    }

    public void swapElementsInAscendingOrder(int j, int k, char[] tmp){
        if ((stringsTargetArray[j].length-1 >= k & stringsTargetArray[j-1].length-1 >= k) &&
                (stringsTargetArray[j][k] < stringsTargetArray[j-1][k])) {
            tmp = stringsTargetArray[j - 1];
            stringsTargetArray[j - 1] = stringsTargetArray[j];
            stringsTargetArray[j] = tmp;
        }
    }

    public void swapElementsInDescendingOrder(int j, int k, char[] tmp){
        if ((stringsTargetArray[j].length-1 >= k & stringsTargetArray[j-1].length-1 >= k) &&
                (stringsTargetArray[j][k] > stringsTargetArray[j-1][k])) {
            tmp = stringsTargetArray[j - 1];
            stringsTargetArray[j - 1] = stringsTargetArray[j];
            stringsTargetArray[j] = tmp;
        }
    }

    public char[][] getSortedData(){
        return stringsTargetArray;
    }
}
