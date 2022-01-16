import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.*;



public class vaccine {
	public static void main(String [] args)throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		String currentdate = df.format(c.getTime());
		
		System.out.println("Date now: "+ currentdate.toString() );
		
		String startDate = "2564-June-1";
		System.out.println("StartDate " +startDate);
		String endDate = "2564-August-31"; 	
		System.out.println("EndDate " +endDate);
		
				
		Scanner input = new Scanner(System.in);
		System.out.println("Insert Your Gender: " );
		String gender = input.next();
		System.out.println("Insert Your Birthday: " );
		String birthday = input.next();
		c.setTime(df.parse(birthday));
		c.add(Calendar.DATE,0);
		//System.out.println("Gendar: " +gender);
		//System.out.println("Date of Birth "+birthday);

		int age = c1.get(Calendar.YEAR ) - c.get(Calendar.YEAR );
			--age;
		int ageMonth = c.get(Calendar.MONTH ) - c1.get(Calendar.MONTH);
		int ageDay = c1.get(Calendar.DATE ) - c.get(Calendar.DATE);
			
		//System.out.println("Your Age is: "+age+ " ปี "+ageMonth +" เดือน " +ageDay+" วัน");
		
		if (age >=65){
		
			System.out.println("Y\n"+"Service Start Date\t"+ startDate+"\nService End Date\t" + endDate);
		}
		else if(ageMonth < ageMonth(6) && age <= age(2)){
			System.out.println("Y\n"+"Service Start Date\t"+ startDate+"\nService End Date\t" + endDate);
		}
		else 
				System.out.println("N\n"+"Service Start Date\t"+"NULL"+"\nService End Date\t"+"NULL.");
		
		
			
		
	}

	private static int age(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int ageMonth(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
