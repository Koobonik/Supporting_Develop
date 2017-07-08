package project;

public class Ten_Array{
	static void randomNumber(){
		int[] a = new int[10];
		int min=100;
		for(int i=0; i<a.length; i++){
			a[i]=(int) (Math.random()*100 )+1;//임의의 수 대입
			min=a[i];//최저변수에 값 대입
			System.out.print(a[i]+" ");//임의의 수 출력
		}
		for(int i=0; i<a.length; i++){
			if(min==100)
			{
				min=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("최저값은 "+min+" 입니다.");
		
	}
	
}