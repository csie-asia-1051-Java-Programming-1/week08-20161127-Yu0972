package ex;
import java.util.Scanner;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021045 郭毓呈
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		float a = scn.nextFloat ( ) ;
		float b = scn.nextFloat ( ) ;
		float data [ ] [ ] = new float [ ( int ) a ] [ ( int ) b ] ;
		for ( int i = 0 ; i < a ; i ++ ) {
			for ( int j = 0 ; j < b ; j ++ ) {
				data [ i ] [ j ] = scn.nextInt ( ) ;
	}
}
		System.out.println ( var ( data , a , b ) ) ;
		System.out.println ( std ( data , a , b ) ) ;
}
	public static float var ( float data [ ] [ ] , float v1 , float v2 ) {
		float sum = 0 ;
		float a = 0 ;
		float b = 0 ;
		float c = 0 ;
		for ( int i = 0 ; i < v1 ; i ++ ) {
			for ( int j = 0 ; j < v2 ; j ++ ) {
				sum = sum + data [ i ] [ j ] ;
	}
}
		a = sum / ( v1 * v2 ) ;
		for ( int i = 0 ; i < v1 ; i++ ) {
			for ( int j = 0 ; j < v2 ; j ++ ) {
				b = b + ( data [ i ] [ j ] - a ) * ( data [ i ] [ j ] - a ) ;
	}
}
		c = b / ( v1 * v2 ) ;
		return c ;
}
		public static float std ( float data [ ] [ ] , float v1 , float v2 ) {
			float sum = 0 ;
			float a = 0 ;
			float b = 0 ;
			float c = 0 ;
			float d = 0 ;
			for ( int i = 0 ; i < v1 ; i ++ ) {
				for ( int j = 0 ; j < v2 ; j ++ ) {
					sum = sum + data [ i ] [ j ] ;			
	}
}
			a = sum / ( v1 * v2 ) ;
			for ( int i = 0 ; i < v1 ; i ++ ) {
				for ( int j = 0 ; j < v2 ; j ++ ) {
					b = b + ( data [ i ] [ j ] - a ) * ( data [ i ] [ j ] ) ;
	}
}
			c = b / ( v1 * v2 ) ;
			d = ( float ) Math.pow ( c , 1 / 2f ) ;
			return d ;
	}
}
