package instgram;

public interface Instagram {
	
		public static void Welcome(String a)
		{
			System.out.println("Welcome "+a+" In Instagram");
		}
		void post(String text);
		void Comment(String s,String name);
		void Message(String Name,String text);
		void Story(String type);

	}

