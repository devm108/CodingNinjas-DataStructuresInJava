package Assignments;

import java.util.Scanner;

public class AppendLastN {
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
		LinkedListNode<Integer> temp= null;
		LinkedListNode<Integer> end= null;
		int len=1;
		end=root;
		while (end.next != null) {
			len++;
			end= end.next;
		}
		int i=1;
		temp=root;
		while(i<len-n){
	        i++;
	        temp=temp.next;
	      }
	      end.next=root;
	      root=temp.next;
	      temp.next=null;
	      return root;
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
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(AppendLastN.append(input(), s.nextInt()));
	}

}
