package com.bl;

public class MyBinaryTree <K extends Comparable<K>>{
    private MyBinaryNode root;


    public void add(K key){
        this.root=this.addRecursively(root, key);

    }

    private MyBinaryNode addRecursively(MyBinaryNode<K> current, K key) {
        if( current == null )
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult == 0) {
            return current;
        }
        if(compareResult < 0){
            current.left=addRecursively(current.left, key);
        }else {
            current.left=addRecursively(current.left, key);
        }
        return current;
    }
    public int getSize(){
        return this.getSizeRecursively(root);
        
    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left)+ this.getSizeRecursively(current.right);
    }

}
