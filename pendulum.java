import java.util.*;
import java.lang.*;
import java.io.*;

class pendulum {
	public static void main (String[] args) throws IOException {
		int tc;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tc = Integer.parseInt(br.readLine());
		while(tc>0){
		    int n;
		    n = Integer.parseInt(br.readLine());
		    
		    
		    int[] arr = new int[n];
		    String[] nums = (br.readLine()).trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        arr[i] = Integer.parseInt(nums[i]);
		    }
		    
		
		    
		    
		    for(int i=0;i<n;i++){
		        int min=i;
		        for(int j=i+1;j<n;j++){
		            if(arr[min]>arr[j])
		                min=j;
		        }
		        int temp = arr[min];
		        arr[min] = arr[i];
		        arr[i] = temp;
		    }
		    
		    
		    int i=1,j=1;
		    int mid=(n-1)/2;
		    int narr[] = new int[n];
		    narr[mid] = arr[0];
		    for(i=1;i<=mid;i++){
		        narr[mid+i] = arr[j++];
		        narr[mid-i] = arr[j++];
		    }
		    if(n%2==0)
		        narr[mid+i] = arr[j++];
		    
		   
		    StringBuffer sb = new StringBuffer();
		    for(int num:narr)
		        sb.append(num+" ");
		    System.out.println(sb);
		    tc--;
		}
	}
}