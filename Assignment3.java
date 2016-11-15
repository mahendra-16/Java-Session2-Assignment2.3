package session2;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfColumns = 1;
		for(int i = 1; i <= 9; i++){
			
			for(int j = 1; j <= noOfColumns; j++){
				System.out.print(j);
			}
			
			System.out.println();
			if(i < 5){
			    noOfColumns = noOfColumns + 1;
			} else{
				noOfColumns = noOfColumns - 1;
			}
		}

	}

}
