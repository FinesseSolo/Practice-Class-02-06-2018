import java.util.Scanner ;
public class CountyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);

System.out.println("Please Enter The County Name");

String CountyName = scanner.nextLine();

System.out.println("Please Enter Population");

String PopulationName = scanner.nextLine ();

System.out.println ("When was it Establsihed? ");

String CountyYearEstablished = scanner.nextLine();

System.out.println(" What is the land volume?");

String CountyLandVolume = scanner.nextLine();

County County1 = new County (CountyName,PopulationName,CountyYearEstablished, CountyLandVolume);

System.out.println (County1.CountyName + County1.PopulationName + County1.CountyYearEstablished + County1.CountyLandVolume);
	}

}
