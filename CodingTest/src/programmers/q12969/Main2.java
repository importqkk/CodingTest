package programmers.q12969;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

// Lv.1 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		StringBuilder sb = new StringBuilder();
	    IntStream.range(0, a).forEach(s -> sb.append("*"));
	    IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
	}
}
