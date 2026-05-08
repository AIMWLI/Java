package com.songj;

/**
 * MaxHeap
 */
public class MaxHeap {
    public static void main(String[] args) {
    }
        //构建大根堆：将array看成完全二叉树的顺序存储结构
private int[] buildMaxHeap(int[] array){
    //从最后一个节点array.length-1的父节点（array.length-1-1）/2开始，直到根节点0，反复调整堆
    for(int i=(array.length-2)/2;i>=0;i--){ 
        adjustDownToUp(array, i,array.length);
    }
    return array;
    }
private void adjustDownToUp(int[] array, int i, int length) {

}
}