
import java.util.Collections;
import java.util.Stack;

public class Species {

	private final Stack<String> species = new Stack<>();
	private String creature;

	public String getSpecies() {
		species.add("Werewolf");
		species.add("Vampire");
		species.add("Human");
		species.add("Ghost");
		species.add("Ghoul");
		species.add("Dragon");
		species.add("Genie");
		species.add("Angel");
		species.add("Demon");
		species.add("Elf");
		species.add("Dark Elf");
		species.add("Fairy");
		species.add("Neko");
		species.add("Kitsune");
		species.add("Elemental");
		species.add("Leprechaun");
		species.add("Mermaid");
		species.add("Mage");
		species.add("Nymph");
		species.add("Satyr");
		species.add("Shapeshifter");

		Collections.shuffle(species);
		creature = species.get(0);
		return creature;
	}
}
