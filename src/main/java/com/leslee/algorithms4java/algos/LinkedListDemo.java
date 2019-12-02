package com.leslee.algorithms4java.algos;

/**
 * @description:
 * @author: Leslee
 * @create: 2019-11-08 10:29
 **/
public class LinkedListDemo {
    class Node<E>{
        E items;
        Node<E> next;
        Node(E element){
            this.items = element;
            this.next = null;
        }
        Node<E> head = null;
        Node<E> tail = null;
    }

    public void demo(){
        Node head = new Node<String>("asa");
        Node tail = new Node(null);
        tail = head;
        //append node
        tail.next = new Node("ds");
        tail = tail.next;
        //顺序遍历
        Node<String> cur = head;
        while (cur!=null){
            System.out.println(cur.items);
            cur = cur.next;
        }
    }
    public void RevList(Node<String> head){
        if(head!=null){
            RevList(head.next);
        }
    }
    //反转链表
    public Node<String> reverseList(Node<String> head){
        if (head==null){
            return null;
        }
        Node<String> nodeRes = null;
        Node<String> nodePre = null;
        Node<String> cur = head;
        while (cur!=null){
            Node<String> nodeNext = cur.next;
            if (nodeNext==null){
                nodeRes =cur;
            }

            cur.next = nodePre;
            nodePre = cur;
            cur = nodeNext;
        }
        return nodeRes;
    }
}
