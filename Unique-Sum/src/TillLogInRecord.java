
public class TillLogInRecord {

	public void logIns() {

		// prints out only the unique employee numbers who have used the till that day
		int tillLogIn1 = 5;
		int tillLogIn2 = 7;
		int tillLogIn3 = 5;
		

		System.out.println("The employees with the following IDs have used the till today:\n==============================================================\n"+ tillLogIn1);

		if (tillLogIn1 != tillLogIn2) {
			System.out.println(tillLogIn2);

		}
		if (tillLogIn3 != (tillLogIn2 & tillLogIn3)) {
			System.out.println(tillLogIn3);

		

	}

}
}