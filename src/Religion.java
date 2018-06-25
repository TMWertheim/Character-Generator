import java.util.Collections;
import java.util.Stack;

public class Religion {
	private String religious;
	private Stack<String> religion = new Stack<String>();

	public String getReligion() {
		religion.add("Theist");
		religion.add("Atheist");
		religion.add("Agnostic");
		religion.add("Gnostic");
		religion.add("Deist");

		Collections.shuffle(religion);
		religious = religion.get(0);
		return religious;
	}
}
