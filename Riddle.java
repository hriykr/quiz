
import java.util.Scanner;

public class Riddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//　printnl=ディスプレイに表示＋改行
		System.out.println("パンはパンでも食べられないパンは？");
		System.out.println("（１）あんぱん");
		System.out.println("（２）食パン");
		System.out.println("（３）フライパン");
		System.out.println("（４）メロンパン");
		System.out.print("[6]答えを番号で入力し、改行を押してください。");
		
		//Scanner in これは、コンソールに書き込まれた文字を読み込む。
		Scanner in = new Scanner(System.in);
		int Answer = in.nextInt();
		
		if(Answer==3) {
		System.out.println("\n\n正解！");
		}
		else {
		System.out.println("\n\n残念不正解！");
		}
		
		in.close();
	}

}
