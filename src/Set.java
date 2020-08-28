//------------------------------------------------------------------
// Garrett McCue 
// 08/27/20
// SU2-CPSC-501-002
// Programming Fundamentals
// Program 4
//-------------------------------------------------------------------
public class Set {
	LinkedNode head;

	// constructor for an empty set
	public Set() {
		head = null;

	}

	// adds the integer x to the collection.
	// The resulting collection should not contain any duplicate values.
	void add(int x) {

		if (!exists(x)) { // if x is not in the list

			// make new node with x as the data
			LinkedNode node = new LinkedNode(x);
			node.next = head;
			head = node;

		}

	}

	// deletes the integer x from the set.
	// uses tempSet to store then calls add() to move them back
	void delete(int x) {
		// creates an empty set
		Set tempSet = new Set();

		// duplicates node
		LinkedNode node = head;

		// moves all values into the tempSet execpt the one to be deleted
		while (node != null) {
			if (node.x != x) {
				tempSet.add(node.x);

			}

			node = node.next; // reassigns node

		}

		node = tempSet.head;
		head = null;

		// moves all back into set and returns them back to the original order
		while (node != null) {
			add(node.x);
			node = node.next;
		}

	}

	// returns true if the integer x exists in the set and false otherwise.
	public boolean exists(int x) {
		
		LinkedNode node = head;
		
		while(node != null) {
			if (node.x == x) {
				return true;
			}
			node = node.next;
		}
		
		return node != null && node.x ==x;

	}

	// returns a string representing the set as a space separated list.
	public String toString() {
		String str = "";
		LinkedNode node = head;
		
		while(node != null) {
			str += node.x;
			str += " ";
			node = node.next;
		}

		return str;

	}
}
