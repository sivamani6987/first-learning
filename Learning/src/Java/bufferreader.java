package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter 1st number : ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("enter the 2nd num : ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("sum of : "+(x+y));
	}

}
