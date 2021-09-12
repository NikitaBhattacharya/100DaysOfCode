package com.amadeus.learnings;

import java.util.HashSet;

public class RemoveLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node
{
    int data;
    Node next;
}

class SolutionRemoveLoop
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node prev = null;
        Node curr = head;
        HashSet<Node> hs = new HashSet<Node>();
        while(null != curr) {
            if(hs.contains(curr)) {
                prev.next = null;
                break;
            }
            hs.add(curr);
            prev =  curr;
            curr = prev.next;
        }
    }
}