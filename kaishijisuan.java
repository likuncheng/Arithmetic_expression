package suanshubiaodashi;

import java.util.LinkedList;
import java.util.Stack;

public class kaishijisuan {
test t=new test();
Stack<Double> list1=new Stack<>();
Stack<String> list2=new Stack<>();
LinkedList<String> mediumlist=new LinkedList<>();
LinkedList<String> copymediumlist=new LinkedList<>();
LinkedList<String> minmediumlist=new LinkedList<>();
LinkedList<Double> dashulist=new LinkedList<>();
int index=0;
public void fenlei(){
	t.cunchushuju();
//==================大数线性表=====================
	for(int i=0;i<t.list.size();i++){
		if(t.list.get(i).equals("+")||t.list.get(i).equals("-")||t.list.get(i).equals("*")||t.list.get(i).equals("/")
				||t.list.get(i).equals("(")||t.list.get(i).equals(")")){
			mediumlist.add("I");
		}
		else
			mediumlist.add(t.list.get(i));
	}
	for(int i=0;i<mediumlist.size();i++){
	if(mediumlist.get(0).equals("I")){
		mediumlist.remove(0);
		i=-1;
	}
	}
	System.out.println("mediumlist:"+mediumlist);
	copymediumlist=(LinkedList<String>)mediumlist.clone();
	
	for(int i=0;i<mediumlist.size();i++){
		double sum=0;
		if(mediumlist.get(i).equals("I")){
			for(int w=0;w<=i;w++){
				mediumlist.remove(0);			
			}
	for(int q=0;q<minmediumlist.size();q++){	
	    sum=Double.valueOf(minmediumlist.remove(q))*Math.pow(10,minmediumlist.size())+sum;	 
	    q=-1;
	}
	dashulist.add(sum);
	i=-1;
		}
		else{
			minmediumlist.add(mediumlist.get(i));
		}		
	}

	
	double summ=0;
		for(int q=0;q<mediumlist.size();q++){
		    summ=Double.valueOf(mediumlist.remove(q))*Math.pow(10,mediumlist.size())+summ;
		    q=-1;
		}
    dashulist.add(summ);
	System.out.println("dashulist:"+dashulist);
	System.out.println("mediumlist:"+mediumlist);
	for(int i=0;i<copymediumlist.size();i++){
		if(copymediumlist.get(0).equals("I")){
			copymediumlist.remove(0);
			i=-1;
		}
		}
	System.out.println("copymediumlist:"+copymediumlist);
	for(int i=0;i<dashulist.size();i++){
		if(dashulist.get(i).equals(0.0)){
			dashulist.remove(i);
			i=-1;
		}
		
	}
	System.out.println("dashulist:"+dashulist);
//==============================================================================================
	while(t.list.size()>0){
		String aa=t.list.removeFirst();
		System.out.print(aa);
			
		if(aa.equals("(")){
			list2.push(aa);
			index++;
		}
		if(!aa.equals("+")&&!aa.equals("-")&&!aa.equals("*")&&!aa.equals("/")&&!aa.equals("(")&&!aa.equals(")")){
			for(int i=0;i<copymediumlist.size();i++){
				if(copymediumlist.get(0).equals("I")){
					copymediumlist.remove(0);
					i=-1;
				}
				}
			for(int i=0;i<dashulist.size();i++){
				if(dashulist.get(i).equals(0.0)){
					dashulist.remove(i);
					i=-1;
				}
				
			}
			index++;
		list1.push(dashulist.remove(0));
		System.out.println("list1:"+list1+" ");
		if(copymediumlist.contains("I")){
			int bb=copymediumlist.indexOf("I");
			for(int i=0;i<bb-1;i++){
				t.list.removeFirst();
				System.out.println("list:"+t.list+" ");
			}
			for(int i=0;i<bb+1;i++){
				copymediumlist.remove(0);
				System.out.println(copymediumlist);
			}
		}
		else{
			int cc=copymediumlist.size();
			for(int i=0;i<cc-1;i++){
				t.list.removeFirst();
				System.out.println("list:"+t.list+" ");
			}
			for(int i=0;i<cc;i++){
				copymediumlist.remove(0);
				System.out.println(copymediumlist);
				
			}
		}
		}
		if(aa.equals("+")||aa.equals("-")){
			index++;
			for(int i=0;i<list2.size();i++){
			         if(list2.peek().equals("+")||list2.peek().equals("-")||list2.peek().equals("*")||list2.peek().equals("/")){
				         double a=list1.pop();
				         double b=list1.pop();			         
				         if(list2.peek().equals("+")){
				        	 double result=a+b;
				        	 list1.push(result);
				         }
				         if(list2.peek().equals("-")){
				        	 double result=b-a;
				        	 list1.push(result);
				         }
				         if(list2.peek().equals("*")){
				        	 double result=a*b;
				        	 list1.push(result);
				         }
				         if(list2.peek().equals("/")){
				        	 double result=b/a;
				        	 list1.push(result);
				         }
				         String s=list2.pop();//================
			              i=-1;
			         }
			         
			         }
		   list2.push(aa);
		}
if(aa.equals("*")||aa.equals("/")){
	index++;
	for(int i=0;i<list2.size();i++){
        if(list2.peek().equals("*")||list2.peek().equals("/")){
	         double a=list1.pop();
	         double b=list1.pop();         
	         if(list2.peek().equals("*")){
	        	 double result=a*b;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("/")){
	        	 double result=b/a;
	        	 list1.push(result);
	         }
	         String s=list2.pop();
	         i=-1;
         }       
        }
	list2.push(aa);
}
if(aa.equals(")")){
	index++;
	for(int i=0;i<list2.size();i++){
        if(list2.peek().equals("+")||list2.peek().equals("-")||list2.peek().equals("*")||list2.peek().equals("/")){
	         double a=list1.pop();
	         double b=list1.pop();	      
	         if(list2.peek().equals("+")){
	        	 double result=a+b;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("-")){
	        	 double result=b-a;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("*")){
	        	 double result=a*b;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("/")){
	        	 double result=b/a;
	        	 list1.push(result);
	         }
	         String s=list2.pop();
	         i=-1;
         }       
        }
	if(list2.peek().equals("(")){
		list2.pop();
	}
}		
	}
	System.out.println();
	//display();
}


//======================结果============================
public void jieguo(){
	System.out.println("出结果啦！");
	display();
	for(int i=0;i<list2.size();i++){
        if(list2.peek().equals("+")||list2.peek().equals("-")||list2.peek().equals("*")||list2.peek().equals("/")){
	         double a=list1.pop();
	         double b=list1.pop();	         
	         if(list2.peek().equals("+")){
	        	 double result=a+b;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("-")){
	        	 double result=b-a;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("*")){
	        	 double result=a*b;
	        	 list1.push(result);
	         }
	         if(list2.peek().equals("/")){
	        	 double result=b/a;
	        	 list1.push(result);
	         }
	         String s=list2.pop();
	         i=-1;
         }
	} 
	System.out.println("答案是："+list1.pop());
}
public void display(){
	for(String e:list2){
		System.out.print(e+" ");
	}
	System.out.println();
	for(Double e:list1){
		System.out.print(e+" ");
	}
	System.out.println();
}

}
