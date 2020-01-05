package ReserveStringCharacter;

public class DeleteDuplicateValue {
      public static void removeDuplicates(Node head) {
				if (null == head) {
					System.out.println("Linked list is empty");
					return;
				}
				Node nextNode = null;
				while (head.next != null) {
					
					if (head.data == head.next.data) {
						nextNode = head.next.next;
						head.next = null;
						head.next = nextNode;
					} else {
						
						head = head.next;
					}
				}
			}

			public static void insert(Node head, int data) {
				while (head.next != null)
					head = head.next;
				head.next = new Node(data);
			}

			public static void print(Node head) {
				while (head != null) {
					System.out.printf("%d ", head.data);
					head = head.next;
				}
				System.out.println("");
			}
		
}
