
import java.util.Collections;
import java.util.Stack;

class Sex {
	private String sex;
	private Stack<String> sexes = new Stack<String>();

	public String getSex() {
		sexes.add("Male");
		sexes.add("Female");

		Collections.shuffle(sexes);
		sex = sexes.get(0);
		return sex;
	}
}
