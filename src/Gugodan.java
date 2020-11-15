
import java.util.Scanner;

public class Gugodan {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("모든 구구단 출력");
		//int value = scan.nextInt();
		int[] Array = new int[9];
		
//		//값 저장
//		for(int i=0; i<Array.length; i++)
//		{
//			Array[i] = value * (i+1);
//		}
//		//값 출력
//		for(int i=0; i<Array.length; i++)
//		{
//			System.out.println(Array[i]);
//		}
		
		for(int i=2; i<10; i++)
		{
			System.out.println(i + "단");
			
			for(int j=0; j<9; j++)
			{
				Array[j] = i * (j+1);
				System.out.println(Array[j]);
				
			}
		}
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("출력할 단을 고르세요.");
//	    int number = scan.nextInt();
//	    if(0<number && number<10)
//	    {
//	    	System.out.println(number+"단");
//		    int i = 1;
//		    while(i<=9)
//		    {
//		    	System.out.println(number * i);
//		    	i++;
//		    }
//		    System.out.println("출력할 단을 고르세요.");
//		    number = scan.nextInt();
//		    System.out.println(number+"단");
//		    for( i=1; i<10; i++)
//		    {
//		    	System.out.println(number * i);
//		    }
//	    }
//	    else
//	    {
//	    	System.out.println("1~9까지의 숫자를 넣어주세요.");
//	    }
	}
}

