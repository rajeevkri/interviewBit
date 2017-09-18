package com.interviewBit.linkedlist;

public class DetectCycle {
	public ListNode detectCycle(ListNode a) {
        if(a==null) return null;
        
        ListNode slow = a, fast = a;
        
        try {
            do {
                fast = fast.next;
                fast = fast.next;
                slow = slow.next;
            } while(fast!=null && fast!=slow);
            
        } catch(Exception e){}
        
        if(slow==null || fast==null || slow!=fast)
            return null;
            
        slow = a;
        
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
