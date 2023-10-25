public class Main{
	public static void main(String[] args){
		Week days = Week.SUNDAY;

		switch(days){
		case SUNDAY:
			System.out.println("Go to church");
		   break;
		case MONDAY:
			System.out.println("Ready for reporting");
		   break;
		case TUESDAY:
			System.out.println("Practice tracing");
		   break;
		case WEDNESDAY:
			System.out.println("Deadline of Assignment");
		   break;
		case THURSDAY:
			System.out.println("Answer Module");
		   break;
		case FRIDAY:
			System.out.println("Buy book");
		   break;
		case SATURDAY:
			System.out.println("Do laundry");
		   break;
		}

	}
}