package instgram;

public class InstaDriver {
	public static void main(String[] args) {
		Instagram a1= new InstImp1("Dnyaneshwar", 1234, "mauli@123.email.com");
		a1.post("Life is Boring");
		a1.Comment("How", "Vinod");
		a1.Message("Vinod","How are you");
		a1.Story("I am Alone in My word");
		a1.Message("Vinod", "How");
	}

	
}
