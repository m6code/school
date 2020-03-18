package lab04.cosc301.lab04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import lab04.cosc301.StackAsLinkedList;

public class EvalPostFix {

    public static void main(String[] args) {
        //BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Scanner stdin = new Scanner(System.in);
        StackAsLinkedList list = new StackAsLinkedList();
        
        
        System.out.println("Please Enter the Expression ");
        String exp = stdin.nextLine();
        StringTokenizer token = new StringTokenizer(exp, " +-/*%", true);
        int result = 0;
        
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '+') {
               int f = (int)list.pop();
               int s = (int)list.pop();
               result = f + s;
               list.push(result);
            }else{
                list.push(exp.charAt(i));
            }
        }
        
        System.out.println(list);
        

    }
}
