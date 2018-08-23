
public class MainRunnerPeople {

		public static void main(String [] args)
		{
			ManagePeople manage = new ManagePeople(); 
			manage.registerPerson("Vince", 25, "Trainee", false);
			manage.initialPeople();
			
			manage.printPeople();
			
			System.out.println("Can we find Gill?");
			System.out.println(manage.searchName("Gill"));	
		
			System.out.println("Is anybody aged ...");
			System.out.println(manage.searchAge(13));
			System.out.println(manage.searchAge(14));
			
		}
		
	
		
}
