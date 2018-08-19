package suanshubiaodashi;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class test {
	LinkedList<String> list=new LinkedList<>();
public   void cunchushuju(){
	System.out.println("请输入算数表达式： ");
	Scanner scanner=new Scanner(System.in);
	String result=scanner.next();
 for(int i=0;i<result.length();i++){
	 String t=result.substring(i, i+1);
	 list.add(t); 
 }
 
}

}
