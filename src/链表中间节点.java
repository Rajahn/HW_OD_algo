import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 链表中间节点 {
    static class ListNode{
        public int val;
        public int next;
        public ListNode(int val,int next){
            this.val=val;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] headline=sc.nextLine().split(" ");
        int head_addr=Integer.valueOf(headline[0]);
        int count=Integer.valueOf(headline[1]);
        HashMap<Integer,ListNode>node_info=new HashMap<>(); //addr listnode
        for(int i=0;i<count;i++){
            String[]node=sc.nextLine().split(" ");
            int addr=Integer.valueOf(node[0]);
            int val=Integer.valueOf(node[1]);
            int next=Integer.valueOf(node[2]);
            ListNode temp=new ListNode(val,next);
            node_info.put(addr,temp);
        }
        int size=1,cur=0;
        ListNode head=node_info.get(head_addr);
        ListNode curNode=head;
        //判断所有节点里，究竟有多少构成了链表，有多少是冗余的
        while(curNode.next!=-1){
            size++;
            curNode=node_info.get(curNode.next);
        }

        while (head.next!=-1){
            if(cur==(size/2)) System.out.println(head.val);
            head=node_info.get(head.next);
            cur++;
        }

    }
}

