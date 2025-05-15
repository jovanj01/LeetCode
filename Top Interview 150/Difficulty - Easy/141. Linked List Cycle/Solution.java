class Solution{
    public static void main(String[] args){
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        ListNode tail = new ListNode(-4);
        node2.next = tail;
        tail.next = node1; 
        boolean result;
        // int position = 1;

        result = hasCycle(head);

        System.out.println("Rezultat: " + result);

    }

    public static boolean hasCycle(ListNode head){
        // Radi ali sporo i puno memorije: 5ms
        // if(head == null) return false;
        // ListNode headTemp = head;
        // Set<ListNode> set = new HashSet<>();
        
        // while(headTemp.next != null){
        //     if(set.contains(headTemp)){
        //         return true;
        //     }

        //     set.add(headTemp);

        //     headTemp = headTemp.next;
        // }

        // return false;


        //Floyd’s Cycle Detection Algorithm aka Tortoise and Hare
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    static class ListNode{
        int value;
        ListNode next;
    
        ListNode(int x) {
            value = x;
            next = null;
        }

        public int getValue() {
            return value;
        }
    }
}