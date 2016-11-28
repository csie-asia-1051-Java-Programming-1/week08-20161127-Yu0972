package hw;
import java.util.Scanner;
/*
 * Topic: 隢神銝��� ��艘�撘�)�脰���脣�摮�����脣�摮�����脣��� 13 ��撓�鈭�脣��� 1101
 * Date: 2016/11/21
 * Author: 1050210XX �瘞豢�葦
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		System.out.println ( fun ( n ) ) ;
}
	public static String fun ( int n ) {
		String str = " " ;
		while ( n != 0 ) {
			str = n % 2 + str ;
			n = n / 2 ;
}
		return str ;
	}
}
