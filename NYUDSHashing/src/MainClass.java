import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String,String> words = new HashMap<String,String>();
		 File myfile = new File("src/data/war_peace.txt");
		 int cnt=0;int dups=0;int wordcnt=0;
		   Scanner input = new Scanner(myfile);
		    String buffarray[];
		    // while there is another line in the file , process it
		    while (input.hasNext()) {
		    String buffer = input.nextLine();
		    buffarray = buffer.split(" ");
		    for (int i =0; i<buffarray.length;i++){
		    	wordcnt++;
		    	if (words.get(buffarray[i]) == null) {
		    		words.put(buffarray[i], buffarray[i]);
		    		cnt++;
		    	} else {
		    		dups++;
		    	}
		    }
		     
		    }
		    System.out.println(cnt + "-" + dups+"-" + wordcnt);		
		    myfile = new File("src/data/janeeyre.txt");
		    input = new Scanner(myfile);
		    cnt=0; dups=0; wordcnt=0;
		    long currentTime1 = System.currentTimeMillis();
		    while (input.hasNext()) {
			    String buffer = input.nextLine();
			    buffarray = buffer.split(" ");
			    for (int i =0; i<buffarray.length;i++){
			    	wordcnt++;
			    	if (words.get(buffarray[i]) == null) {
			    		cnt++;
			    	} else {
			    		dups++;
			    	}
			    }
		    }
		    long currentTime2 = System.currentTimeMillis();
		    System.out.println(currentTime2-currentTime1);
			    System.out.println(cnt + "-" + dups+"-" + wordcnt);
	}
}
