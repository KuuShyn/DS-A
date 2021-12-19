// 6.2
//King Aj C. Magalona 
public class Equal_and_Equivalent {
    public static int cardinality(int value[]){
        return value.length; 
    }
    
    public static boolean isEqual(int a[], int b[]){
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i])
            return false;
        }
        return true;
        
 
    }
    // King Aj C. Magalona
    public static boolean isEquivalent(int a[], int b[]){
        return a.length == b.length;
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
// King Aj C. Magalona
    public static void main(String[] args){
        // int a[] = {1, 3, 5, 7, 9};       
        // int b[] = {3, 5, 1, 9, 7};             
       
        // int a[] = {1, 3, 5, 7, 9};       
        // int b[] = {2, 4, 1, 9, 7};

        int a[] = {1, 3, 5, 7, 9};       
        int b[] = {3, 5, 1, 9};  //My Inputs

        bSort(a);
        bSort(b);
        
        System.out.println("Java Code\n");

        print("Set A \t\t\t:", a);
        print("\nSet B \t\t\t:", b);

        System.out.println("\n\nCardinality of A \t:" + cardinality(a));
        System.out.println("Cardinality of B \t:" + cardinality(b));      
        System.out.println("Equal Set \t\t: " + ToString(isEqual(a, b)));
        System.out.println("Equivalent Set \t\t: " + ToString(isEquivalent(a, b)));
        
        System.out.println("\nBy King Aj C. Magalona");

     
    }
}
// King Aj C. Magalona
