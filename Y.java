import java.util.Scanner;

public class Y{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("������Ӣ�ģ�");
	String str = input.nextLine();
        String[] strArr = str.split("\\s+|[,]");
        StringBuffer result = new StringBuffer();
        for(int i = strArr.length -1;i >=0; i--){
            result.append(strArr[i] + " ");
        }
        result.setCharAt(str.length()-3, ' ');
        System.out.println("�ߵ�˳���Ľ��Ϊ��"+result.toString());
}}