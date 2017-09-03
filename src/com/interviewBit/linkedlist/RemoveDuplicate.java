package com.interviewBit.linkedlist;

import java.util.HashMap;

public class RemoveDuplicate {

	/**
	 * Given a sorted linked list, delete all duplicates such that each element
	 * appear only once.
	 * 
	 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
	 * 
	 * @param a
	 * @return
	 */
	static ListNode deleteDuplicates(ListNode a) {
		if (a == null) {
			return null;
		}
		ListNode first = a.next;
		ListNode second = a;
		while (first != null) {
			if (first.val == second.val) {
				second.next = first.next;
				first = first.next;
			} else {
				first = first.next;
				second = second.next;
			}
		}
		return a;
	}

	/**
	 * Given a sorted linked list, delete all nodes that have duplicate numbers,
	 * leaving only distinct numbers from the original list.
	 * 
	 * For example, Given 1->2->3->3->4->4->5, return 1->2->5.
	 * 
	 * Given 1->1->1->2->3, return 2->3.
	 * 
	 * @param a
	 * @return
	 */
	public static ListNode deleteDuplicates2(ListNode a) {
		if (a == null) {
			return null;
		}
		ListNode first = a.next;
		ListNode second = a;
		HashMap<Integer, Boolean> iMap = new HashMap<>();
		while (first != null) {
			if (first.val == second.val) {
				iMap.put(first.val, Boolean.TRUE);
				second.next = first.next;
				first = first.next;
			} else {
				first = first.next;
				second = second.next;
			}
		}
		ListNode helper = new ListNode(0);
		helper.next = a;
		ListNode p = helper;

		while (p.next != null) {
			if (iMap.containsKey(p.next.val)) {
				ListNode next = p.next;
				p.next = next.next;
			} else {
				p = p.next;
			}
		}

		return helper.next;
	}

	public static void main(String[] args) {
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(1);
		root1.next.next = new ListNode(2);
		root1.next.next.next = new ListNode(2);
		root1.next.next.next.next = new ListNode(3);
		root1.next.next.next.next.next = new ListNode(4);
		// 1 -> 2 -> 2
		ListNode root = deleteDuplicates2(root1);
		while (root != null) {
			System.out.println(root.val);
			root = root.next;
		}
	}
}
