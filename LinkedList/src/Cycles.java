public class Cycles {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode cur = slow;
                int len = 0;
                do {
                    cur = cur.next;
                    len++;
                }while(cur != slow);
                return len;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while(length > 0) {
            s = s.next;
            length--;
        }
        while(f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public ListNode detectCycle2(ListNode head) {
        boolean cycle = false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return null;
        }
        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int n) {
        int ans = 0;
        while(n > 0) {
            int r = n % 10;
            ans += r * r;
            n = n / 10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        for(int i = 0; current != null && i < left-1; i++) {
            previous = current;
            current = current.next;
        }
        ListNode last = previous;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; current != null &&  i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }
        if(last != null) {
            last.next = previous;
        }
        else {
            head = previous;
        }
        newEnd.next = current;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        ListNode secHead = reverseList(mid);

        while(head != null && secHead != null) {
            if(head.val != secHead.val) {
                return false;
            }
            head = head.next;
            secHead = secHead.next;
        }
        return true;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        while(hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) {
            hf.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;

        int group_count = 0;
        ListNode temp_head = head;
        while(temp_head != null){
            group_count++;
            temp_head = temp_head.next;
        }
        group_count /= k;

        while(group_count-- > 0) {
            ListNode last = prev;
            ListNode newHead = cur;
            ListNode next = cur.next;

            for(int i = 0; cur != null && i < k; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }
            newHead.next = cur;
            prev = newHead;
        }
        return head;
    }

    public ListNode alternateReverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;

        int group_count = 0;
        ListNode temp_head = head;
        while(temp_head != null){
            group_count++;
            temp_head = temp_head.next;
        }
        group_count /= k;

        while(group_count-- > 0) {
            ListNode last = prev;
            ListNode newHead = cur;
            ListNode next = cur.next;

            for(int i = 0; cur != null && i < k; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }
            newHead.next = cur;
            for (int i = 0; cur != null && i < k; i++) {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last. next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for(int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode odd_head = head;
        ListNode even_head = head.next;

        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = even_head;
        return head;
    }

    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode next = slow.next;
        while (slow != null) {
            slow.next = prev;
            prev = slow;
            slow = next;
            if (next != null) {
                next = next.next;
            }
        }
        int maxi = 0;
        while (prev != null) {
            maxi = Math.max(prev.val + head.val, maxi);
            prev = prev.next;
            head = head.next;
        }
        return maxi;
    }
}
