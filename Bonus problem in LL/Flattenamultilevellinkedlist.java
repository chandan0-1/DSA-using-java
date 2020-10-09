public class Solution {

    public static void flattenListCorrect(Node hp) {
        if (hp==null){
            return;
        }

        Node tail=hp;
        Node temp=hp;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp;

        while(hp!=null){
            if (hp.down!=null){
                tail.next=hp.down;
                hp.down=null;
                while (tail.next!=null){
                    tail=tail.next;
                }
            }
            hp=hp.next;
        }

    }
}

