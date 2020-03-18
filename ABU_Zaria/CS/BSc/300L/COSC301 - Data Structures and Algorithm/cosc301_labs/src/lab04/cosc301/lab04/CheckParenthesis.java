package lab04.cosc301.lab04;

import java.util.Scanner;
import lab04.cosc301.StackAsLinkedList;

public class CheckParenthesis {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        StackAsLinkedList list = new StackAsLinkedList();

        System.out.println("Please Enter the Expression (with no spaces between)");
        String exp = stdin.next();
//        
//        System.out.println(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                list.push(i);
                //System.out.println("Pushing");
            } else if (exp.charAt(i) == ')' && !list.isEmpty()) {
                    list.pop();
                //System.out.println("Poping");
            } else {
                if(exp.length() == 0){
                    System.out.println("Please enter an expression");
                }else if( exp.length() == 1 && exp.charAt(i) == ')'){
                    System.out.println("Not Correct");
                    return ;
                }
            }
            
        }
        
        if (list.isEmpty()) {
                System.out.println("Correct");
            } else {
                System.out.println("Not Correct");
            }
        
        
        

    }

}
