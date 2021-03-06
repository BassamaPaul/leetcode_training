/**
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode swapPairs(ListNode head) {
      if (head == null || head.next == null) 
          return head;
      ListNode current = head;
      int temp;
      while (current != null && current.next != null) {
          temp = current.val;
          current.val = current.next.val;
          current.next.val = temp;
          if (current.next.next != null)
              current = current.next.next;
          else current = null;
      }
      return head;
  }
}
