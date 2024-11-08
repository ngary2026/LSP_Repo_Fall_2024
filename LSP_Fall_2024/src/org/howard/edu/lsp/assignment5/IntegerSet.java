package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers with various set operations.
 */
public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

    /**
     * Constructor that initializes the set with an existing list of integers.
     * 
     * @param set the ArrayList of integers to initialize the set with
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	 /**
     * Clears the internal representation of the set. 5 pts.
     */
	public void clear() {
		set.clear();
	};


    /**
     * Returns the length of the set. 5 pts.
     * 
     * @return the number of elements in the set
     */
	public int length() {
		return set.size(); // returns the length
	}; 

	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class. 10 pts.
	 * 
	 * @param o the object to compare with
     * @return true if the two sets are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof IntegerSet) {
			IntegerSet secondSet = (IntegerSet) o;
			return this.set.containsAll(secondSet.set) && secondSet.set.containsAll(this.set);
		}
		return false;
	}; 
	
	/**
	 * Returns true if the set contains the value, otherwise false. 5 pts.
	 * 
	 * @param value the value to check for
     * @return true if the set contains the value, false otherwise
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	/** Returns the largest item in the set. 5 pts.
	 * 
	 * @return the largest integer in the set
	 * @throws RuntimeException if the set is empty
	 */
	public int largest() {
		if (set.isEmpty()) {
			throw new RuntimeException("Set empty");
		}
		int max = set.get(0);
		for (int num : set) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}; 
	
	/**
     * Returns the smallest item in the set. 5 pts.
     * 
     * @return the smallest integer in the set
     * @throws RuntimeException if the set is empty
     */
	public int smallest()  {
		if (set.isEmpty()) {
			throw new RuntimeException("Set empty");
		}
		int min = set.get(0);
		for (int num : set){
			if(num < min) {
				min = num;
			}
		}
		return min;
	};
	
	/**
     * Adds an item to the set if it is not already present. 5 pts.
     * 
     * @param item the integer to add to the set
     */
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}; 
	
	/** Removes an item from the set or does nothing if not there. 5 pts.
	 * 
	 * @param item the integer to remove from the set
	 */
	public void remove(int item) {
		if(!set.contains(item)) {
			set.remove((Integer) item);
		}
	}; 
	
	/** Set union. 11 pts.
	 * 
	 * @param intSetb the IntegerSet to union with
	 */
	public List<Integer> union(IntegerSet intSetb) {
		List<Integer> unionArr = new ArrayList<>();
		for(int num: intSetb.set) {
			if(!this.set.contains(num)) {
				unionArr.add(num);
			}
		}
		return unionArr;
	};
	
	/** Set intersection, all elements in s1 and s2. 12 pts.
	 * 
	 * @param intSetb the IntegerSet to intersect with
     * @return a list of integers that are in both sets
	 */
	public List<Integer> intersect(IntegerSet intSetb) {
		List<Integer> intersectArr = new ArrayList<>();
		for (int num: this.set) {
			if(intSetb.contains(num)) {
				intersectArr.add(num);
			}
		}
		return intersectArr;
	}; 
	
	/** Set difference, i.e., s1 –s2. 12 pts.
	 * 
	 * @param intSetb the IntegerSet to subtract from this set
	 */
	public void diff(IntegerSet intSetb) {
		set.removeIf(intSetb::contains);
	}; // set difference, i.e. s1 - s2
	
	/** Set complement, all elements not in s1. 11 pts.
	 * 
	 * @param intSetb the IntegerSet to compute the complement against
	 */
	public void complement(IntegerSet intSetb) {
		this.set.clear();
		for (int num : intSetb.set) {
			if (!this.set.contains(num)) {
				this.set.add(num);
			}
		}
	}
	
	/** Returns true if the set is empty, false otherwise. 5 pts.
	 * 
	 * @return true if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}; 
	
	/** Return String representation of your set.  
	 * This overrides the equal method from the Object class. 5 pts.
	 *  
	 *  @return String representation of your set
	 */
	@Override
	public String toString() {
		return set.toString();
	};
}
