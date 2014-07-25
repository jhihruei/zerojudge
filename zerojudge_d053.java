package zerojudgeProject;

import java.util.Scanner;
public class zerojudge {
	static int sum=0;
	static int row,col;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			row = scanner.nextInt();
			col = scanner.nextInt();
			sum = row*col-1;
			System.out.printf("%d\n",sum);
		}
	}
}
