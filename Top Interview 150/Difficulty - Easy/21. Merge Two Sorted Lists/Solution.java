class Solution {
    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Pravimo drugu listu: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Spajanje listi
        ListNode mergedHead = mergeTwoLists(list1, list2);

        String res = "";

        for (int i = 0; i < 6; i++) {
            res += mergedHead.val;
            mergedHead = mergedHead.next;
        }

        System.out.println("Yayy: " + res);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                currentNode.next = list1;
                list1 = list1.next;
            }else{
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;

        }

        if(list1 != null) {
            currentNode.next = list1;
            // list1 = list1.next;
        }

        if(list2 != null) {
            currentNode.next = list2;
            // list2 = list2.next;
        }

        return tempNode.next;
    }

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
