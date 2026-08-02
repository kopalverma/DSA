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
    // public int size(ListNode[] list){
    //     if(list[0] == null) return 0;
    //     int k = 0;
    //     while(list != null){
    //         k++;
    //         list = list.next;
    //     }
    //     return k;
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> at = new ArrayList<>();
        int k = lists.length;
        for(int i = 0 ; i<k ; i++){
            while(lists[i] != null){
                at.add(lists[i].val);
                lists[i] = lists[i].next;
            }
            // lists = lists.next;
        }
        Collections.sort(at);
        ListNode l = new ListNode();
        ListNode dum = l;
        for(int j = 0 ; j<at.size() ; j++){
            l.next = new ListNode(at.get(j));
            l = l.next;
        }
        return dum.next;
    }
}