import java.util.Scanner;
import java.io.*;

public class T{
    public static void main(String[] args){
	int[]a = null;
	Scanner input = new Scanner(System.in);
	int len=0;
	System.out.print("请输入数组的长度：");
	try{
	    len = Integer.parseInt(input.nextLine());
	}catch(Exception e){
	
	}
	
	a = new int[len];
	System.out.println("a.length ="+a.length);
	
	for(int i=0;i<a.length;i++){
	    System.out.print("请输入数值：");
	    a[i] = input.nextInt();
	}
	
	System.out.println();
	System.out.print("该数组为：");
	for(int i=0;i<a.length;i++){
	    
	    System.out.print(a[i] + " ");
	}
	
	
	int sum = 0,max = 0;
	for(int i=0;i<a.length;i++){
	    sum = 0;
	    for(int j=i;j<a.length;++j){
		sum += a[j];
		if(sum>max)
		    max = sum;
	    }
	}
	
	System.out.println();
	System.out.println("该数组之和的最大值为 "+max);

    }
    
    
}