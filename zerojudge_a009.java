package zerojudgeProject;

import java.util.Scanner;
public class zerojudge {

	static String inString ;
	static char[] ans;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			inString = scanner.nextLine();
			ans =encrypto(inString.toCharArray());
			System.out.println(ans);
			
		}
	}
	static char[] encrypto(char[] input)
	{
		int length=input.length;
		for(int i=0;i<length;i++)
			input[i]=(char) ((int)input[i]-7);
		return input;
	}
}
