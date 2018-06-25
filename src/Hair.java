import java.util.Collections;
import java.util.Stack;

public class Hair {
	private String primaryh, secondaryh;
	private Stack<String> hairs = new Stack<String>();
	private Stack<String> sech = new Stack<String>();

	public String getHair() {
		hairs.add("Blond");
		hairs.add("Red");
		hairs.add("Brown");
		hairs.add("Black");
		hairs.add("Gray");
		hairs.add("White");

		Collections.shuffle(hairs);
		primaryh = hairs.get(0);
		return primaryh;
	}

	public String getStat() {
		switch (primaryh) {
		case "Blond":
			sech.add("Ash");
			sech.add("Bronze");
			sech.add("Flaxen");
			sech.add("Ginger");
			sech.add("Golden");
			sech.add("Honey");
			sech.add("Platinum");
			sech.add("Tawny");
			sech.add("Wheaten");
			break;
		case "Red":
			sech.add("Auburn");
			sech.add("Copper");
			sech.add("Flaming");
			sech.add("Strawberry Blond");
			break;
		case "Brown":
			sech.add("Ginger");
			sech.add("Sandy");
			sech.add("Chestnut");
			sech.add("Russet");
			sech.add("Sable");
			sech.add("Sorrel");
			break;
		case "Black":
			sech.add("Jet");
			sech.add("Sooty");
			break;
		case "Gray":
			sech.add("Ash");
			sech.add("Iron");
			sech.add("Salt and Pepper");
			sech.add("Silver");
			sech.add("Steel");
			break;
		case "White":
			sech.add("Pearl");
			sech.add("Snow");
			break;
		}
		Collections.shuffle(sech);
		secondaryh = sech.get(0);
		return (secondaryh);
	}
}
