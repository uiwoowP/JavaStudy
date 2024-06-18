package array;

public class ThreeDimension_Calendar {
	
	public static void main(String[] args) {
		
		int[][][] date = new int [12][5][7];
		
		for(int i = 0; i < date.length; i++) {
			int num = 1;
			System.out.println("\t\t\t" + (i+1) + "월");
			for (int j = 0; j < date[j].length; j++) {
				for (int k = 0; k < date[k][j].length; k++) {
					date[i][j][k] = num++;
					
					if (i + 1 < 8) {
						if((i+1) % 2 == 1) {
							if(num > 32) continue;
						}
						else if((i+1) % 2 == 0) {
							if(num > 31) continue;
						}
						else if ((i+1) == 2) {
							if(num > 29) continue;
						}
					}
					
					else {
						if ((i + 1) % 2 == 0) {
							if (num > 32) continue;
						}
						else if (num > 31) continue;
					}
					System.out.print(date[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			num = 1;
		}
		
	}

}
