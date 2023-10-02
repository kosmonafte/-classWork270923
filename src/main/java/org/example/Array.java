package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Array<T> {
    T[] array;
    public Array(){
        this.array = (T[]) new Object[0];
    }
    public void addItem(T item) {
        T[] nArray = (T[]) new Object[this.array.length+1];
        //System.out.println(this.array.length + " " + nArray.length);
        System.arraycopy(this.array, 0, nArray, 0, this.array.length);
        nArray[nArray.length-1] = item;
        this.array = nArray;
    }

    public void fillArray(iRandom<T> iRandom){
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = iRandom.random();
        }
    }

    public T searchMaxItem(Comparator<T> comparator){
        T res = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (comparator.compare(res, this.array[i]) > 0) {
                res = this.array[i];
            }
        }
        return res;
    }

    public T searchMinItem(Comparator<T> comparator){
        T res = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (comparator.compare(res, this.array[i]) < 0) {
                res = this.array[i];
            }
        }
        return res;
    }

    public int searchMedium(iMedium<T> imedium){
        int sum = 0;
        for (int i = 0; i < this.array.length; i++){
            sum += imedium.medium(this.array[i]);
        }
        return sum/this.array.length;
    }

    public void sortArray(Comparator<T> comparator) {
        Arrays.sort(this.array, comparator);
    }

    public int binarySearch(T item , Comparator<T> comparator) {
        int index = Arrays.binarySearch(this.array, item, comparator);
        return index;
    }

    @Override
    public String toString() {
        String str = new String();
        for (T item:this.array) {
            str += item + " ";
        }
        return str;
    }
}
