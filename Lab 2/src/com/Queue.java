package com;
import java.util.LinkedList;

public class Queue {
    public int maxLength;
    public boolean limit;
    LinkedList<Integer> list = new LinkedList<Integer>();

    public Queue(){
        this.limit = false;
    }
    public Queue(int maxLength){
        this.maxLength = maxLength;
        this.limit = true;
    }

    public boolean checkFull(){
        return !this.limit || (this.limit && this.list.size() < this.maxLength);
    }

    public void push(int value){
        if(this.checkFull()){
            this.list.push(value);
        }else{
            System.out.println("Queue is full.");
        }
    }

    public boolean checkEmpty(){
        return this.list.size() > 0;
    }

    public String pop(){
        if(checkEmpty()){
            return this.list.remove(list.size()-1).toString();
        }else{
            return "Queue is empty.";
        }
    }

    public static void main(String[] args){
        Queue q1 = new Queue();
        Queue q2 = new Queue(2);

        q1.push(1);
        q1.push(2);
        q1.push(3);
        System.out.println(q1.pop());

        q2.push(1);
        q2.push(2);
        q2.push(3);
        System.out.println(q2.pop());
    }
}
