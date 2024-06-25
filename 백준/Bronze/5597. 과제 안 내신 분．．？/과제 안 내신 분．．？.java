import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean[] arr = new boolean[31];
    
    for (int i = 0; i < 28; i++){
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      arr[A] = true;
    }
    
    for (int i = 1; i< arr.length; i++){
      if(arr[i] != true){
        System.out.println(i);
      }
    }
    
    br.close();
  }

}