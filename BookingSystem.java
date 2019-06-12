package facilities;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class booking {
	public static void main(String args[])throws Exception
	{
		long amount=0;
		String line;boolean ip=true;int i=1;
		Date time1;Date time2;long diff;
		
		List<String> values=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);		
		SimpleDateFormat fm=new SimpleDateFormat("HH:mm");
		fm.setLenient(false); //check if date is in the format YYYY-MM-DD
		Date d;
		//hashmap to store each input(converted to a list) with a key
		HashMap<Integer,List> total=new HashMap<Integer,List>();
				
		//specify the start and end of time slots
		Date morn=fm.parse("0"
				+ "9:00");
		Date noon=fm.parse("13:00");
		Date eve=fm.parse("18:00");
		Date night=fm.parse("22:00");

		try
		{
		while (ip==true)
		{
			i++;
			line=scanner.nextLine();
			values=Arrays.asList(line.split(",")); //convert input array to list
			
			/*check if list already exists in hashmap; if it does not, booking amount is calculated
			 * as zero. If it exists, calculate the time difference. If the time slot is between
			 * 9am to 1pm,booking amount is calculated as Rs. 200/hr. If the time slot is between
			 * 6pm to 10pm,booking amount is calculated as Rs. 300/hr. If the time slot is any 
			 * different,booking amount is calculated as Rs.100/hr. If facility is already booked
			 * for that slot, amount is calculated as zero.
			 */
			d=fm.parse(values.get(1));
			if (!total.containsValue(values))
			{
			total.put(i,values);
			time1=fm.parse(values.get(2));
			time2=fm.parse(values.get(3));
			
			//check if time is valid in 24-hour format.
			LocalTime.parse(values.get(2));
			LocalTime.parse(values.get(3));
			diff=Math.abs(TimeUnit.MILLISECONDS.toHours((time1.getTime()-time2.getTime())));		
			if (time1.compareTo(morn)>=0 && time2.compareTo(noon)<=0)
			{
				amount=diff*200;
			}
			else if (time1.compareTo(eve)>=0 && time2.compareTo(night)<=0)
			{
				amount=diff*300;
			}
			else
			{
				amount=diff*100;
			}
			}
			else
				amount=0;
			if (amount!=0)
				System.out.println("Booked, Rs." +amount);
			else
				System.out.println("Booking Failed, Already Booked");		
			if (scanner.hasNextLine())
				ip=true;
			else
				ip=false;
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}

