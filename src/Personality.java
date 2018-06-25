import java.util.Collections;
import java.util.Stack;

public class Personality {
	private String personality, stat;
	private Stack<String> personalities = new Stack<String>();

	public String getPersonality() {
		personalities.add("Healer");
		personalities.add("Counselor");
		personalities.add("Mastermind");
		personalities.add("Architect");
		personalities.add("Protector");
		personalities.add("Composer");
		personalities.add("Inspector");
		personalities.add("Craftsman");
		personalities.add("Teacher");
		personalities.add("Champion");
		personalities.add("Commander");
		personalities.add("Visionary");
		personalities.add("Provider");
		personalities.add("Performer");
		personalities.add("Supervisor");
		personalities.add("Dynamo");

		Collections.shuffle(personalities);
		personality = personalities.get(0);
		return personality;
	}

	public String getStat() {
		switch (personality) {
		case "Healer":
			stat = "INFP";
			break;
		case "Counselor":
			stat = "INFJ";
			break;
		case "Mastermind":
			stat = "INTJ";
			break;
		case "Architect":
			stat = "INTP";
			break;
		case "Protector":
			stat = "ISFJ";
			break;
		case "Composer":
			stat = "ISFP";
			break;
		case "Inspector":
			stat = "ISTJ";
			break;
		case "Craftsman":
			stat = "ISTP";
			break;
		case "Teacher":
			stat = "ENFJ";
			break;
		case "Champion":
			stat = "ENFP";
			break;
		case "Commander":
			stat = "ENTJ";
			break;
		case "Visionary":
			stat = "ENTP";
			break;
		case "Provider":
			stat = "ESFJ";
			break;
		case "Performer":
			stat = "ESFP";
			break;
		case "Supervisor":
			stat = "ESTJ";
			break;
		case "Dynamo":
			stat = "ESTP";
			break;
		}
		return stat;
	}
}
