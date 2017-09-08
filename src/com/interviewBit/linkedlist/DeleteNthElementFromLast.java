package com.interviewBit.linkedlist;

public class DeleteNthElementFromLast {

	static ListNode removeNthFromEnd(ListNode a, int b) {
		ListNode dummy = new ListNode(0);
	    dummy.next = a;
	    int length  = 0;
	    ListNode first = a;
	    while (first != null) {
	        length++;
	        first = first.next;
	    }
	    length -= b;
	    first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first.next = first.next.next;
	    return dummy.next;
	}
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		ListNode r = removeNthFromEnd(l, 1);
		while(r!= null) {
			System.out.println(r.val);
			r = r.next;
		}
	}
}
