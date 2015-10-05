import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;

public class RandomInput {
	static final String OUTPUT_PATH = "/Users/namdy/Documents/2015_FALL/ALGORITHM/hw2/RandomInput/output.txt";
	private static PrintWriter pw;
	
	public static class Coordinate {
		int x = 0;
		int y = 0;
		
		Coordinate(int a, int b){
			this.x = a;
			this.y = b;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		pw = new PrintWriter(RandomInput.OUTPUT_PATH);
		Random random = new Random();
		
		TreeSet<Integer> pts_array_x = new TreeSet<Integer>();
		TreeSet<Integer> pts_array_y = new TreeSet<Integer>();
		
		int size;
		
		for(int i=0; i<10; i++){
			pts_array_x.add(random.nextInt(10)+1);
			pts_array_y.add(random.nextInt(10)+1);
		};
		
		System.out.println(pts_array_x.size() + ", " + pts_array_y.size());
		
		size = pts_array_x.size();
		if(pts_array_y.size() < size)
			size = pts_array_y.size();
		pw.println(size);
		
		Iterator<Integer> iterator_x = pts_array_x.iterator();
		Iterator<Integer> iterator_y = pts_array_y.iterator();
		while (iterator_x.hasNext() && iterator_y.hasNext()){
			pw.println((int)iterator_x.next() + " " + (int)iterator_y.next());
		}
//	    
	    pw.close();
	}

}
