package ex;
import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021045 郭毓呈
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		int m = scn.nextInt ( ) ;
		System.out.print ( fun ( n , m ) ) ;
}
	public static int fun ( int x , int m ) {
		int sum = 0 ;
		int sum2 = 0 ;
		int y = 1 ;	
		while ( x > 0 ) {
		sum = x % m ;
		x = x / m ;
		sum2 = sum2 + ( sum * y ) ;
		y = y * 10 ;
}
		return sum2 ;
	}
}
