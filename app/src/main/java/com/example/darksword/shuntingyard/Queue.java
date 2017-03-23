package com.example.darksword.shuntingyard;

/**
 * Created by Dark Sword on 3/23/2017.
 */

public class Queue
{
    Node head;
    Node tail;
    public void addEnd(Queue list, Node node)
    {
        if(list.head == null)
        {
            list.head = node;
            list.tail = node;
        }
        else
        {
            list.tail.setNextNode(node);
            list.tail = node;
        }
    }
    public void addFront(Queue list, Node node)
    {
        if(list.head == null)
        {
            list.tail = node;
            list.head = node;
        }
        else
        {
            node.setNextNode(head);
            list.head = node;
        }
    }
    public Node removeEnd(Queue list)
    {
        Node temp = tail;
        Node runner = head;
        while (runner.getNextNode().getNextNode() != null)
            {
                runner = runner.getNextNode();
            }
        runner.setNextNode(null);
        this.tail = runner;
        return temp;
    }
    public Node removeFront (Queue list)
    {
        Node temp = this.head;
        this.head.setNextNode(this.head.getNextNode());
        return temp;
    }
}
