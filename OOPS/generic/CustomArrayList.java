package generic;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int size;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public int add(int num){
        if(isFull()){
            resize();
        }
        return data[size++] = num;
    }

    private void resize(){
        int[] newArr = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            newArr[i] = data[i];
        }
        data = newArr;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index out of bounds");
        }
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        size--;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArray [data=" + java.util.Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.add(100));
    }
}
