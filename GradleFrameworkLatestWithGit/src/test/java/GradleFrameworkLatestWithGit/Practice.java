package GradleFrameworkLatestWithGit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
	
	class result{
		int min;
		int max;
		
		
	}
	
	
	
	public  result getMinMax(int arr[], int arr_size)
	{
		result res=new result();
		res.min=arr[0];
		res.max=arr[0];
		if(arr_size==1) {
			res.min=arr[0];
			res.max=arr[0];
		}
		else {
			for(int i=0;i<arr.length;i++) {
				//minimum
				
				if(res.min>arr[i]) {
					res.min=arr[i];
				}
			
				}
			//maximum
			for(int i=0;i<arr.length;i++) {
				if(res.max<arr[i]) {
					res.max=arr[i];
				}
			}
			
			
			
			
		}
		
		return res;
		
	}
		
	
	
    
 
    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1,3000, 330 };
        int arr_size = 6;
Practice gfg=new Practice();
        result res=gfg.getMinMax(arr, arr_size);
        
        System.out.println("Minimum Value is "+res.min);
        System.out.println("Maximum Value is "+res.max);
       
// 
    }
}

