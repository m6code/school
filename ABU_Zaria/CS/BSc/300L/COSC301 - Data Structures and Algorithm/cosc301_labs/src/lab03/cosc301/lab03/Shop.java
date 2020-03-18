package lab03.cosc301.lab03;

import lab03.cosc301.MySearchableContainer2;

class Shop implements Comparable{
	private String name;
	private MySearchableContainer2 itemContainer;
	
	public Shop(String name, MySearchableContainer2 itemContainer){
		this.name = name;
		this.itemContainer = itemContainer;
	}
	
	public Shop(String name){
		this(name, null);
	}
	
	public String getName(){
		return name;
	}
	
	public MySearchableContainer2 getItemContainer(){
		return itemContainer;
	}
	
	public void modifyItemContainer(MySearchableContainer2 modifiedContainer){
		itemContainer = modifiedContainer;
	}
	
	public int compareTo(Object object){
		Shop shop = (Shop) object;
		return this.name.compareTo(shop.name);
	}
	
	public boolean equals(Object object){
		Shop shop = (Shop) object;
		return this.name.compareTo(shop.name)== 0;
	}
	
	public String toString(){
		return "{ " + name + ", " + itemContainer + " }";
	}
}