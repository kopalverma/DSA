/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null && list2 != null) return list2;
        if(list1 != null && list2 == null) return list1;
        ArrayList<Integer> at = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null){
            at.add(temp1.val);
            temp1 = temp1.next;
        }
        // at.add(temp1.val);
        while(temp2 != null){
            at.add(temp2.val);
            temp2 = temp2.next;
        }
        // at.add(temp2.val);
        Collections.sort(at);
        ListNode list = new ListNode(at.get(0));
        ListNode curr = list;

        // list = at.get(0);
        for(int i=1 ; i<at.size() ; i++){
            curr.next = new ListNode(at.get(i));
            curr = curr.next;
        }
        // curr.next = null;
        return list;
    }
}