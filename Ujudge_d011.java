package zerojudgeProject;

import java.util.Scanner;
public class zerojudge {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		String buffer;
		String[] compare;
		while(scanner.hasNext()){
			buffer = scanner.nextLine();
			compare = buffer.split(" ");
			if(compare[0].equals(compare[1]))
				System.out.println("Yes");
			else
				System.out.println("No");
			//System.out.println(buffer);
		}
		//System.out.println("Hello");
	}
}
