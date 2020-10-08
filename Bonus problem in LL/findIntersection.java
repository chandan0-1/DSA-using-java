public class solution {
    public static int le(ListNode<Integer> head){
        if (head==null){
            return 0;
        }
        return 1+le(head.next);
    }
	public static int changelist(ListNode<Integer> h1,ListNode<Integer> h2) {
	int l1=le(h1);
        int l2=le(h2);
        int c=Math.abs(l1-l2);
        if (l1>l2){
            while(c>0){
                h1=h1.next;
                c--;
            }
        }
        else{
            while(c>0){
                h2=h2.next;
                c--;
            }
        }
        while (h1!=null){
            if (h1.data==h2.data){
                return h1.data;
            }
            h1=h1.next;
            h2=h2.next;
        }
        return -1;
	}

}

