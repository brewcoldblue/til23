import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int tc = 1; tc <= T; tc++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st2.nextToken());
            int Y = Integer.parseInt(st2.nextToken());

            sb.append(X+Y+"\n");
        }
            System.out.println(sb);
        }
    }