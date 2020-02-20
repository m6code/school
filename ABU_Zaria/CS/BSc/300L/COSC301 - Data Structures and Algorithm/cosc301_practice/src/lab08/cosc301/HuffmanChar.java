package lab08.cosc301;

public class HuffmanChar implements Comparable {
    protected char character;
    protected int frequency;
    

    public HuffmanChar(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    public HuffmanChar(char character) {
        this(character, 1);
    }

	public char getChar(){
		return character;
	}
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int compareTo(Object obj){
		HuffmanChar arg = (HuffmanChar) obj;
		return character - arg.character;
	}
	
	public boolean equals (Object obj){
		HuffmanChar arg = (HuffmanChar) obj;
		return character==arg.character;		
	}
	
	public String toString() {
        return  character + "\t" + frequency;
    }
}
