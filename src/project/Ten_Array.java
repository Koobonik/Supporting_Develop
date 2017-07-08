package project;
import java.util.Scanner;
public class Ten_Array{
	static void randomNumber(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 배열을 만드실 건가요?");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i]=(int) (Math.random()*100 )+1;//임의의 수 대입
			System.out.print(a[i]+" ");//임의의 수 출력
		}
		int min=a[0];
		int max=a[0];
		int all=0;
		for(int i=0; i<a.length; i++){//최저 최대값 대입
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
			all=all+a[i];
		}
		System.out.println("최저값은 "+min+" 입니다.");
		System.out.println("최대값은 "+max+" 입니다.");
		System.out.println("평균값은 "+all/n+" 입니다.");
	}
	
}