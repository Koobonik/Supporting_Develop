package project;

public class Ten_Array{
	static void randomNumber(){
		int[] a = new int[10];
		int min=100;
		int max=0;
		for(int i=0; i<a.length; i++){
			a[i]=(int) (Math.random()*100 )+1;//임의의 수 대입
			System.out.print(a[i]+" ");//임의의 수 출력
		}
		for(int i=0; i<a.length; i++){//최저 최대값 대입
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println("최저값은 "+min+" 입니다.");
		System.out.println("최대값은 "+max+" 입니다.");
		
	}
	
}