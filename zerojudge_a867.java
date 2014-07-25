package zerojudgeProject;

import java.util.Scanner;
public class zerojudge {
	static char[][] map;
	static int height=15,width=30;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		String buffer;
		map = new char [height][width];
		while(scanner.hasNext()){
			
			for(int row =0;row<height;row++) {
				buffer=scanner.next();
				for(int col =0;col<width;col++) {
					map[row][col] = buffer.charAt(col);
				}
			}
			//showMap();
			countMine();
			showMap();
		}
		System.out.println("Hello");
	}
	static void showMap(){
		for(int row =0;row<height;row++) {
			for(int col =0;col<width;col++) {
				System.out.print(map[row][col]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	static void countMine(){
		int counter=0;
		for (int y = 0; y < width ; y++) {
			for (int x = 0; x < height; x++) {
				if(map[x][y]!='*'){
					if(x>0){ 
						if(map[x-1][y] =='*')
							counter++;
					}
					if(x < height-1){
						if(map[x+1][y] =='*')
							counter++;
					}
					if(y>0){
						if(map[x][y-1] =='*')
							counter++;	
					}
					if(y < width-1){
						if(map[x][y+1] =='*')
							counter++;	
					}
					if(x>0 && y>0){
						if(map[x-1][y-1] =='*')
							counter++;	
					}
					if(x>0 && y < width-1){
						if(map[x-1][y+1] =='*')
							counter++;
					}
					if((x < height-1) && y>0){
						if(map[x+1][y-1] =='*')
							counter++;
					}
					if((x < height-1) && y < width-1){
						if(map[x+1][y+1] =='*')
							counter++;
					}
					if(counter !=0)
						map[x][y] = Integer.toString(counter).charAt(0);
					counter = 0;
				}
			}
		}
	}
}
