package lab02.cosc301;

import lab01.cosc301.Container;

public interface SearchableContainer extends Container {
	boolean isMember (Comparable object);
	void insert (Comparable object);
	void withdraw (Comparable obj);
	Comparable find (Comparable object);
}