package week10.labTask;

import week10.BinaryHeap;

public class HeapSort {

    public static <Data extends Comparable<Data>> void sort(Data[] elements) {
        BinaryHeap<Data> heap = new BinaryHeap<>();
        for (Data element : elements) {
            heap.insert(element);
        }
        for (int i = elements.length - 1; i >= 0; i--) {
            elements[i] = heap.delMax();
        }
    }
}