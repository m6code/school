package lab03.cosc301.lab03;

import java.util.Scanner;
import lab03.cosc301.MyLinkedList;
import lab03.cosc301.MySearchableContainer2;

public class TestShops {

    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        MyLinkedList shoplist = new MyLinkedList();
        int choice;
        String shopName, itemName;

        initializeList(shoplist);

        do {
            showMenu();
            choice = getChoice();

            switch (choice) {
                case 1:
                    System.out.println("Enter the shop name");
                    shopName = stdin.nextLine();
                    System.out.println("Enter the item name");
                    itemName = stdin.nextLine();
                    buyItem(itemName, shopName, shoplist);
                    break;

                case 2:
                    displayShops(shoplist);
                    break;
            }

        } while (choice != 3);
    }

    static int getChoice() {
        int choice;
        do {
            System.out.print("\nYour choice? : ");
            choice = stdin.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }

    static void showMenu() {
        System.out.println("\n***************************");
        System.out.println("1.  Buy an item");
        System.out.println("2.  Display all shops");
        System.out.println("3.  Quit");
    }

    static void initializeList(MyLinkedList shoplist) {
        // to be completed by students
        Item pen = new Item("Pen", 20, 55);
        Item book = new Item("Book", 100, 20);
        Item softDrink = new Item("Coke", 34, 15);
        Item pencil = new Item("Pencil", 10, 5);
        Item planShit = new Item("Planshit", 22, 10);
        Item garus = new Item("Garus", 20, 55);

        MySearchableContainer2 con1 = new MySearchableContainer2();
        MySearchableContainer2 con2 = new MySearchableContainer2();
        MySearchableContainer2 con3 = new MySearchableContainer2();

        con1.insert(pen);
        con1.insert(book);

        con2.insert(garus);
        con2.insert(softDrink);

        con3.insert(pencil);
        con3.insert(planShit);

        Shop manus = new Shop("Manus Enterprise", con1);
        Shop dala = new Shop("Dala", con2);
        Shop magret = new Shop("Margeret", con3);
        
        shoplist.append(manus);
        shoplist.append(dala);
        shoplist.append(magret);

    }

    public static void buyItem(String itemName, String shopName, MyLinkedList shoplist) {
        // to be completed by students
        System.out.println("Enter the name of the shop");
        shopName = stdin.next();
        
        Shop shop = new Shop(shopName);
        
        System.out.println("Enter the name of the item");
        
        itemName = stdin.next();
        Item item = new Item(itemName);
        
//        if(shop.)
        
        

    }

    public static void displayShops(MyLinkedList shoplist) {
        // to be completed by students
        //initializeList(shoplist);
        System.out.println(shoplist);

    }
}
