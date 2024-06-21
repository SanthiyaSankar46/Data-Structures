package singlylinkedlist;

public class SinglyLinkedList {    

Node head=null;
Node tail=null;
public void addnewnode(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		tail=newnode;
	}
	if(head!=null) {
		tail.next=newnode;
		tail=newnode;
	}
}
public void display() {
	Node curr=head;
	if(head==null) {
		System.out.println("list is empty");
	}
	else {
		System.out.println("The Elements added are:");
	while(curr!=null) {
		
		System.out.print(curr.data +" ");
		curr=curr.next;
	}
	System.out.println();
}}

public static void main(String[] args) {
	SinglyLinkedList sl=new SinglyLinkedList();
	sl.addnewnode(1);
	sl.addnewnode(2);
	sl.addnewnode(3);
	sl.addnewnode(4);
	sl.display();
	
}




}    
  