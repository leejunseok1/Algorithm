import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int king = 1;
    int queen = 1;
    int look = 2;
    int bisup = 2;
    int night = 2;
    int fon = 8;

    StringTokenizer st = new StringTokenizer(br.readLine() , " ");

    king = king - Integer.parseInt(st.nextToken());
    queen = queen - Integer.parseInt(st.nextToken());
    look = look - Integer.parseInt(st.nextToken());
    bisup = bisup - Integer.parseInt(st.nextToken());
    night = night - Integer.parseInt(st.nextToken());
    fon = fon - Integer.parseInt(st.nextToken());

    System.out.print(king + " ");
    System.out.print(queen + " ");
    System.out.print(look + " ");
    System.out.print(bisup + " ");
    System.out.print(night + " ");
    System.out.print(fon + " ");

  }
}