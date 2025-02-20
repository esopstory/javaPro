package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오전 7:41:36
 * @subject 
 * @content
 */
public class Test01 {

	public static void main(String[] args) {
		/*// 가로
		int d = 2, i = 1;
		while (d<=9) {
			if(d==3) {
				d++;
				continue;
			}
			System.out.printf("[%d단] : ", d);
			i = 1;
			while (i<=9) {
				System.out.printf("%d*%d=%2d ", d, i, d*i);
				i++;
			} // while
			System.out.println();
			d++;
		} // while d
		*/
		
		/*// 세로*/
		int d = 2, i = 1;
		System.out.println("-".repeat(54));
	    while (d<=9) {
	    	if( d==3) {
				d++;
				continue;
			}
	    	System.out.printf(" [%d단]\t", d);
			d++;
		} // while
	    System.out.println();
	    System.out.println("-".repeat(54));
		while (i<=9) {
			d = 2;
			while (d<=9) {
				if( d==3) {
					d++;
					continue;
				}
				System.out.printf("%d*%d=%2d\t", d, i, d*i);
				d++;
			} // while
			System.out.println();
			i++;
		} // while d
		System.out.println("-".repeat(54));

	} // main

} // class
