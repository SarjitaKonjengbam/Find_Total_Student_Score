package com.demo.txt_json;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		/*System.out.println("Enter the length");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] correct=new String[n];
		String[] student=new String[n];
		System.out.println("Enter correct answer");
		for(int i=0;i<n;i++)
		{
			correct[i]=s.next();
		}
		System.out.println("Enter student answer");
		for(int i=0;i<n;i++)
		{
			student[i]=s.next();
		}*/
		
		
		String[] correct= {"a","b","c","d"};
		String[] student= {"b","","c","d"};
		System.out.println("result="+find(correct,student));
	}
	
	public static int find(String[] corr,String[] stud)
	{
		int sum=0;
		for(int i=0,j=0;i<corr.length & j<stud.length;i++,j++)
		{		
			if(stud[j].equals("") || stud[j].isEmpty())
			{
				sum=sum+0;
			}
			else if(corr[i].equals(stud[j]))
				{
					sum=sum+4;
				}                
				 
				else if(corr[i]!=stud[j] &&  !stud[j].isEmpty() )
				{
					sum=sum-1;
				}
				
			}
		
		return sum;
	}
	

}
