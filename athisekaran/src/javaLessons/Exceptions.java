package javaLessons;



//public class Exceptions extends Object implements Serializable, Colonizable  { // multiple interfaces can be implemented by using commas in between
//private int a;


//static {
	//System.out.println("asd");           // cannot execute in eclipse but using command prompt and by java class path we can excute this to print the statement without main method
//}

//public void met()

public class Exceptions
{
	//int b = this.a;


	public static void main(String[] args) {

		int a = 5, b = 0, c;

		String s = "Athithya";

		try

		{
			System.out.println(c = a / b); // exception suspected statement in try

			try {
				System.out.println(s.charAt(11));
				
			}

			catch (NumberFormatException e) {
				// e.printStackTrace(); // detailed explantion of exceptions
				// e.getMessage();
				System.out.println("String Index Exception"); // Solution for the error handling

			}

			// ???????????????

			catch (Exception e) {
				// e.printStackTrace(); // detailed explantion of exceptions
				// e.getMessage();
				System.out.println("Exception"); // Solution for the error handling

			}

			catch (Throwable e) {
				// e.printStackTrace(); // detailed explantion of exceptions
				// e.getMessage();
				System.out.println("SuperClass"); // Solution for the error handling

			}

			finally {
				System.out.println(" String Progrm executed"); // default statement to print whether exception is
																// handled or not
			}
		} catch (ArithmeticException f) {

			System.out.println("Not to divide by 0"); // Solution for the error handling
		}

		// catch(Exception e)
		// {

		// System.out.println("Exception e"); // Solution for the error handling

		// }

		finally {
			System.out.println("Progrm executed"); // default statement to print whether exception is handled or not
		}

		// System.out.println(c=a+b);
	}

}
