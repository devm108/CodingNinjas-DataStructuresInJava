package Assignments;

import java.util.Scanner;

public class EvenAfterOdd {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		if (head==null) {
			return null;
		}
		int flageven=0, flagodd=0;
		LinkedListNode<Integer> oddstart=null;
		LinkedListNode<Integer> oddend=null;
		LinkedListNode<Integer> evenstart=null;
		LinkedListNode<Integer> evenend=null;
		LinkedListNode<Integer> temp=head;
		while (temp != null) {
			if(temp.data%2!=0){
                if(oddstart==null){
                    oddstart=temp;
                    oddend=oddstart;
                }else{
                    oddend.next=temp;
                    oddend=temp;
                }
                flagodd++;
            }else{
                if(evenstart==null){
                    evenstart=temp;
                    evenend=evenstart;
                }else{
                    evenend.next=temp;
                    evenend=temp;
                }
                flageven++;
            }
			temp=temp.next;
		}
		if(flageven!=0 && flagodd!=0){
	         
            oddend.next=evenstart;
            evenend.next=null;
            head=oddstart;
           
        }else{
        	return head;
        }
		return head;
	}
	
	private static Scanner s = new Scanner(System.in);
	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(EvenAfterOdd.sortEvenOdd(input()));

	}

}
