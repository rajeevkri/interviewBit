package com.interviewBit.linkedlist;

/**
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative. For example: Given 1->2->3->4->5->NULL and k = 2 , return
 * 4->5->1->2->3->NULL .
 * 
 * @author rajeev singh
 *
 */
public class RotateList {
	public static ListNode rotateRight(ListNode a, int b) {
		if (a == null) {
			return a;
		}
		ListNode first = a;
		ListNode second = a;
		ListNode third = null;
		int n = 0;
		while(first != null) {
			first = first.next;
			n++;
		}
		b = b % n;
		if(b == 0) {
			return a;
		}
		first = a;
		for (int i = 1; i < b; i++) {
			if (first.next != null)
				first = first.next;
			else
				return a;
		}
		while (first.next != null) {
			first = first.next;
			third = second;
			second = second.next;
		}
		first.next = a;
		a = second;
		if (third != null)
			third.next = null;
		else
			a.next = null;
		return a;
	}

	public static void main(String[] args) {
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(2);
		root1.next.next = new ListNode(3);
		root1.next.next.next = new ListNode(4);
		root1.next.next.next.next = new ListNode(5);
		ListNode sumNode = rotateRight(root1, 50);
		while (sumNode != null) {
			System.out.println(sumNode.val);
			sumNode = sumNode.next;
		}
	}
}
