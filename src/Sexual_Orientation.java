import java.util.Collections;
import java.util.Stack;

public class Sexual_Orientation {
	private String orien;
	private final Stack<String> sexuality = new Stack<>();

	public String getOrientation() {
		sexuality.add("Heterosexual");
		sexuality.add("Homosexual");
		sexuality.add("Bisexual");
		sexuality.add("Asexual");
		sexuality.add("Pansexual");
		sexuality.add("Demisexual");

		Collections.shuffle(sexuality);
		orien = sexuality.get(0);
		return orien;
	}
}
