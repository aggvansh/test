package Java_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Java_stream_coding {
	
	//Count the number starting with alphabet A in list
	@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	@Test
	public void streamFilter() 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase());
	}
	
	
	
	
	
	
	
	
	
	
}
