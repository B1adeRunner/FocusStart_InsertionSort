package ru.Korenskiy;

class Sorter {
    public Sorter(){

    }

    private Sort sort;

    public void setSort(Sort concreteSort){
        sort = concreteSort;
    }

    public void executeSort(){
        sort.startSorting();
    }
}
