package core;

public class Node {
    private int val;
    public Node(int _val){
        this.val = _val;
    }
    public int get(){
        return this.val;
    }

    public int set(int incomingVal){
        this.val = incomingVal;
        return this.val;
    }

}
