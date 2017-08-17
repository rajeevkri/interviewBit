package com.interviewBit.linkedlist;

import java.math.BigInteger;

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode a, ListNode b) {
	    ListNode x = a;
	    ListNode y = b;
	    BigInteger i = BigInteger.ZERO, j = BigInteger.ZERO;
	    BigInteger p = BigInteger.ONE;
	    while(x != null) {
	        i = i.add(p.multiply(BigInteger.valueOf(x.val))) ;
	        p = p.multiply(BigInteger.valueOf(10)) ;
	        x = x.next;
	    }
	    BigInteger q = BigInteger.ONE;
	    while(y != null) {
	    		j = j.add(q.multiply(BigInteger.valueOf(y.val))) ;
	        q = q.multiply(BigInteger.valueOf(10)) ;
	        y = y.next;
	    }
	    BigInteger k= i.add(j);
	    
	    ListNode root = null;
	    ListNode current = null;
	    while(! k.equals(BigInteger.ZERO)) {
	    		BigInteger r = k.remainder(BigInteger.valueOf(10)) ;
	    		k = k.divide(BigInteger.valueOf(10));
	    		ListNode node = new ListNode(Integer.valueOf(String.valueOf(r)));
	    		
	    		if(root == null ) {
	    			root = node;
	    			current = root;
	    		} else {
	    			current.next = node;
	    			current = current.next;
	    		}
	    		
	    }
	    return root;
	}
	public static void main(String[] args) {
		ListNode root1 = new ListNode(9);
		root1.next = new ListNode(9);
		root1.next.next = new ListNode(1);
		ListNode root2 = new ListNode(1);
		ListNode sumNode = addTwoNumbers(root1, root2);
		
	}
	
	ListNode addTwoLists(ListNode a, ListNode b) {
		ListNode res = null; 
		ListNode prev = null;
		ListNode temp = null;
        int carry = 0, sum;
 
        while (a != null || b != null) 
        {
            sum = carry + (a != null ? a.val : 0)
                    + (b != null ? b.val : 0);
 
            carry = (sum >= 10) ? 1 : 0;
 
            sum = sum % 10;
 
            temp = new ListNode(sum);
 
            if (res == null) {
                res = temp;
            } else 
            {
                prev.next = temp;
            }
 
            prev = temp;
 
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
 
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
 
        return res;
    }
}
