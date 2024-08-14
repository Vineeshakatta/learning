package basic;

public class AddTwoNumbers {
	
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Number = listNodeToNumber(l1);
        int l2Number = listNodeToNumber(l2);
        int sum = l1Number + l2Number;
        return numberToListNode(sum);
    }

    public ListNode numberToListNode(int sum) {
        ListNode n = new ListNode(0);
        String str = String.valueOf(sum);
        for(int i=0; i<str.length(); i++) {
            n.next = new ListNode(str.charAt(i));
            n = n.next;
        }
        return n;
    }

    public int listNodeToNumber(ListNode list) {
        if(list==null) {
            return 0;
        }
        ListNode temp = list;
        String num = "";
        while(temp!=null) {
            num = temp.val + num;
            temp = temp.next;
        }

        return Integer.parseInt(num);
    }

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
