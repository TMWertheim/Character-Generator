import java.util.Collections;
import java.util.Stack;

public class Ethnicity {
	private Stack<String> Ethnics = new Stack<String>();
	private String ethn;

	public String getEthnicity() {
		Ethnics.add("Native");
		Ethnics.add("Latino");
		Ethnics.add("Caucasian");
		Ethnics.add("African");
		Ethnics.add("Middle Eastern");
		Ethnics.add("Asian");

		Collections.shuffle(Ethnics);
		ethn = Ethnics.get(0);
		return ethn;
	}
}
