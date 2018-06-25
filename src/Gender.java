import java.util.Collections;
import java.util.Stack;

public class Gender {
	private String gender;
	private Stack<String> genders = new Stack<String>();

	public String getGender() {
		genders.add("Androgynous");
		genders.add("Agender");
		genders.add("Neutrois");
		genders.add("Bigender");
		genders.add("Cisgender");
		genders.add("Gender Fluid");
		genders.add("Transgender");
		genders.add("Pangender");
		genders.add("Queer Heterosexual");
		genders.add("Transsexual");
		genders.add("Trigender");

		Collections.shuffle(genders);
		gender = genders.get(0);
		return gender;
	}

}
