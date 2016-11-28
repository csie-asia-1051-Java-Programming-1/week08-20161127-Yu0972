package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021045 郭毓呈
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		com com = new com ( ) ;
		int a = scn.nextInt ( ) ;
		char c = scn.next ( ).charAt ( 0 ) ;
		if ( c == '+' || c == '-' || c == '*' || c == '/' ) {
			int b = scn.nextInt ( ) ;
			System.out.println ( com.computer ( a , b , c ) ) ;
		}else{
			if ( c == '^' || c == '√' || c == '3') {
			System.out.println ( com.computer ( a , 0 , c ) ) ;
		}else{
			System.out.println ( "False" ) ;
			}
		}
	}
}

		class com {
	public static float computer ( int a , int b , char op ) {
		float num = 0 ;
		switch ( op ) {
		case '+' :
			num = a + b ;
			break ;
		case '-' :
			num = a - b ;
			break ;
		case '*' :
			num = a * b ;
			break ;
		case '/' :
			num = a / b ;
			break ;
		case '^' :
			num = ( float ) Math.pow ( a , 2 ) ;
			break ;
		case '3' :
			num = ( float ) Math.pow ( a , 3 ) ;
			break ;
		case '√' :
			num = ( float ) Math.sqrt ( a ) ;
			break ;
}
		return num ;
	}
}
