import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String[] myArray= {"man", "way", "lunchroom", "soup", "arm", "power","limit","class","sheet","month","quicksand","dog",
		"grade","airplane","things","trip","cows","bikes","flame", "children","soap","discovery","jail",
		"rabbit","pickle","island","gold","girl","celery","vein","hour","word","silver","wrist","cat","back"};


		Random random = new Random();
		
		
		
		int index = 0;
		
		for(int i=0; i< myArray.length-1; i++){
			
			index=random.nextInt(36)+1;
		System.out.println(myArray[index]);
		}
		
	}

}
