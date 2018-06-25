import java.util.Collections;
import java.util.Stack;

public class Eyes {
	private String primarye, secondarye;
	private Stack<String> eyes = new Stack<String>();
	private Stack<String> sece = new Stack<String>();

	public String getEyes() {
		eyes.add("Black");
		eyes.add("Blue");
		eyes.add("Brown");
		eyes.add("Gray");
		eyes.add("Green");
		eyes.add("Violet");

		Collections.shuffle(eyes);
		primarye = eyes.get(0);
		return primarye;
	}

	public String getStat() {
		switch (primarye) {
		case "Black":
			sece.add("Anthracite");
			sece.add("Coal");
			sece.add("Ebony");
			sece.add("Jet");
			sece.add("Midnight");
			sece.add("Obsidian");
			sece.add("Pitch");
			sece.add("Sloe-Eyed");
			sece.add("Smoky");
			sece.add("Soot");
			sece.add("Velvety");
			break;
		case "Blue":
			sece.add("Aquamarine");
			sece.add("Arctic");
			sece.add("Baby");
			sece.add("China");
			sece.add("Cornflower");
			sece.add("Crystal");
			sece.add("Denim");
			sece.add("Electric");
			sece.add("Forget-Me-Not");
			sece.add("Gunmetal");
			sece.add("Ice");
			sece.add("Indigo");
			sece.add("Lasor-Beam");
			sece.add("Sapphire");
			sece.add("Sky");
			sece.add("Steel");
			break;
		case "Brown":
			sece.add("Amber");
			sece.add("Brandy");
			sece.add("Champagne");
			sece.add("Chestnut");
			sece.add("Chocolate");
			sece.add("Cognac");
			sece.add("Doe-Eyed");
			sece.add("Golden");
			sece.add("Nut");
			sece.add("Russet");
			sece.add("Soft");
			sece.add("Tawny");
			sece.add("Topaz");
			sece.add("Velvety");
			sece.add("Walnut");
			sece.add("Whiskey");
			break;
		case "Gray":
			sece.add("Charcoal");
			sece.add("Cloud");
			sece.add("Graphite");
			sece.add("Gunmetal");
			sece.add("Silver");
			sece.add("Slate");
			sece.add("Smoky");
			sece.add("Steel");
			sece.add("Storm");
			break;
		case "Green":
			sece.add("Bottle");
			sece.add("Cat's Eye");
			sece.add("Chartreuse");
			sece.add("Emerald");
			sece.add("Forest");
			sece.add("Grass");
			sece.add("Jade");
			sece.add("Leaf");
			sece.add("Sea");
			break;
		case "Violet":
			sece.add("Amethyst");
			sece.add("Hyacinth");
			sece.add("Ultramarine");
			break;
		}
		Collections.shuffle(sece);
		secondarye = sece.get(0);
		return (secondarye);
	}
}
