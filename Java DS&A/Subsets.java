//King AJ Magalona 
public class Subsets {
   
    public static int cardinality(int[] value){
        return value.length; 
    }
    //King Aj Magalona

    public static boolean isSubset(int[] a, int[] b){
        int i = 0;
        int j = 0;
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < a.length; j++)
                if (b[i] == a[j])
                    break;  
            
            if (j == a.length)
                return false;
        }
         
        return true;
    }  
    
// King Aj C. Magalona 
    public static boolean isProperSubset(int[] a, int[] b){
       if(isSubset(a, b))
           if(a.length != b.length)
                return true;
          
       return false;
    }
    public static void bSort(int value[])
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < value.length - 1; i++)
        {
            swapped = false;
            for (j = 0; j < value.length - i - 1; j++)
            {
                if (value[j] > value[j + 1])
                {
                    temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }
    public static void print(String str, int value[]) {  
        System.out.print(str); 
        System.out.print('{');

        for (int i = 0; i < value.length; i++){
            System.out.print(value[i]);
            if (i != value.length - 1) 
                System.out.print(", ");
            else 
                System.out.print('}');            
        }        
    }

    public static String ToString(boolean b){
        return b ? "True" : "False";
    }
    public static void main(String [] args){
        // int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        // int[] b = {1, 2, 5, 7};
        

        // int[] a = {2, 4, 6};
        // int[] b = {2, 4, 6};

        int[] a = {1, 2, 3, 4, 5}; 
        int[] b = {1, 2, 6};     //My Inputs

        // int[] a = {1, 5, 6, 4, 9, 2, 0};
        // int[] b = {5, 4, 9, 6, 2};  //My Inputs

        bSort(a);
        bSort(b);

        System.out.println("Java Code\n");

        print("Set A \t\t\t\t:", a);
        print("\nSet B \t\t\t\t:", b);

        System.out.println("\n\nCardinality of A \t\t:" + cardinality(a));
        System.out.println("Cardinality of B \t\t:" + cardinality(b));
        System.out.println("B is a subset of A \t\t: " + ToString(isSubset(a, b)));
        System.out.println("B is a proper subset of A \t: " + ToString(isProperSubset(a, b)));

        System.out.println("King Aj C. Magalona");
    }

}
//King Aj Magalona


