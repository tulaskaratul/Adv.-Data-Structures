class BinarySearchDemo
{  
	static Object[] a = { "AP", "KA", "MH", "MP", "OR", "TN", "UP", "WB"};  
	static Object key = "UP";  

	public static void main(String args[]) 
	{ 
		if( binarySearch() ) 
			System.out.println(key + " found in the list"); 
		else  
			System.out.println(key + " not found in the list");  
	} 
	static boolean binarySearch()  
	{  
		int c, mid, low = 0, high = a.length-1;  
		while( low <= high) 
		{ 
			mid = (low + high)/2; 
			c = ((Comparable)key).compareTo(a[mid]); 
			if( c < 0) high = mid-1;  
			else if( c > 0) low = mid+1;  
				else return true; 
		}  
		return false; 
	} 
} 
