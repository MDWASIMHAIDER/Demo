package com.nt.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindYTHirdLargestElementInArray {

	public static void main(String[] args) {
		int [] element= {6,8,1,9,2,1,10};
		int largest=0;
		int third=0;
		int [] thirdLargest=new int[element.length];
		Set<Integer>set=new HashSet();
		List<Set<Integer>>list=new ArrayList(set);
		int count=0;
		for(int i=0;i<element.length;i++) {
			if(largest<element[i]) {
				largest=element[i];
				System.out.println(largest);
				thirdLargest[i]=largest;
				/*if(largest>thirdLargest[i]) {
					thirdLargest[i]=largest;
				}*/
				
			}
			
				set.add(largest);
			
			//res[i]=largest;
		}
		System.out.println(set);
		System.out.println(thirdLargest[0]+" "+thirdLargest[1]+" "+thirdLargest[2]+" "+thirdLargest[3]);
	}

}
