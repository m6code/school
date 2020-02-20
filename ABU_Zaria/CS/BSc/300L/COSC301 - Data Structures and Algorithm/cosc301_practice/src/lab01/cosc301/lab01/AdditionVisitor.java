package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class AdditionVisitor extends AbstractVisitor {
	private int sum=0;
	
	public int getSum() {
		return sum;
	}
	
	public void visit(Object object) {
		int value = ((Integer) object).intValue();
		sum+=value;
	}
}
				