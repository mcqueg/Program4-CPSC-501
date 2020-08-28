//------------------------------------------------------------------
// Garrett McCue 
// 08/27/20
// SU2-CPSC-501-002
// Programming Fundamentals
// Program 4
//-------------------------------------------------------------------


// code from the given classes in lab7/8 

// This class encapsulates an int value as a linked node
public class LinkedNode {
	int x;            // The data value
	LinkedNode next;  // Reference to the next LinkedNode
	
	// Default constructor
	LinkedNode() {
		next = null;
	}
	
	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}
	
}