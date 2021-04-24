package pegawai;

//membuat class abstract sortable
public abstract class Sortable {
	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a) {
		
		
	    for (int gap = a.length/2; gap > 0; gap /= 2)
	    {
	    	
	        for (int i = gap; i < a.length; i += 1)
	        {
	        	Sortable temp = a[i];
	            int j;           
	            for (j = i; j >= gap && (a[j - gap].compare(temp) == -1); j -= gap)
	                a[j] = a[j - gap];
	              
	        
	            a[j] = temp;
	        }
	    }
	}
}
