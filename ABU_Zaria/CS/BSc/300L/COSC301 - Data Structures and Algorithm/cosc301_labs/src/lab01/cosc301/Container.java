package lab01.cosc301;

public interface Container {
	int getCount ();
	boolean isEmpty ();
	boolean isFull ();
	void purge ();
	void accept (Visitor visitor);
	Iterator iterator ();
}