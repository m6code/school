package lab08.cosc301;

public class HuffmanNode extends HuffmanChar {

	public String code;

	public HuffmanNode(char character, int frequency) {
        super(character, frequency);
    }

	public HuffmanNode(char character) {
        this(character, 1);
    }

	public HuffmanNode(int frequency) {
        this((char) 1, frequency);
    }

	public HuffmanNode(HuffmanChar object) {
		this(object.getChar(), object.getFrequency());
	}

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int compareTo (Object object) {
		HuffmanNode arg = (HuffmanNode) object;
		if (frequency < arg.frequency)
			return -1;
		else if (frequency > arg.frequency)
			return +1;
		else
			return 0;
    }
	
    public String toString() {
        return character + "\t" + frequency + "\t" + code;
    }
}