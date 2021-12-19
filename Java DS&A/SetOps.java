/*Version 2.0 Charot hahhaa
    ChangeLog:
        *Fixed some bugs Intersect, Difference and symmetric difference does not handle duplicates
        
    
    phew hehehe
*/

//King Aj Magalona - BSCS
public class SetOps {
    public static int[] extractDifference(int a[], int b[]){
        int temp[] = new int[a.length + b.length];
        //King Aj Magalona BSCS
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            
            if (a[i] < b[j]) {
                temp[count] = a[i];
                i++;
                count++;
            }
            else if (b[j] < a[i]) {
                // temp[count] = b[j];
                j++;
                // count++;
            }
 
           
            else {
                i++;
                j++;
            }
        }
        while (i < a.length) {
            temp[count] = a[i];
            i++;
            count++;
        }
        // while (j < b.length) {
        //     temp[count] = b[j];
            
        //     j++;
        //     count++;
        // }

        int hold[] = new int[count];
        for(i = 0; i < count; i++)
            hold[i] = temp[i];
        return hold;
    }
    //King Aj Magalona - BSCS

    public static int[] extractSymDiff(int a[], int b[]){
        int temp[] = new int[a.length + b.length];
        
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            
            if (a[i] < b[j]) {
                temp[count] = a[i];
                i++;
                count++;
            }
            else if (b[j] < a[i]) {
                temp[count] = b[j];
                j++;
                count++;
            }
           
            else {
                // temp[count] = a[i];
                i++;
                j++;
                // count++;
            }
        }
        while (i < a.length) {
            temp[count] = a[i];
            i++;
            count++;
        }
        while (j < b.length) {
            temp[count] = b[j];            
            j++;
            count++;
        }

        int hold[] = new int[count];
        for(i = 0; i < count; i++)
            hold[i] = temp[i];
        return hold;
    }//King Aj Magalona - BSCS

    public static int[] extractIntersect(int a[], int b[]){      
        int temp[] = new int[a.length + b.length];

        int i = 0, j = 0, count = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]) i++;

            else if(a[i] > b[j]) j++;

            else{
                temp[count] = a[i];
                i++;
                j++;
                count++;
            }
//King Aj Magalona - BSCS
        }
        int hold[] = new int[count];
        for(i = 0; i < count; i++)
            hold[i] = temp[i];

        return hold;
    }

    public static int[] iSort(int value[])
    {
       for(int i = 0; i < value.length; i++){
           int hold = value[i];
           int j = i - 1;

           while(j >= 0 && value[j] > hold){
               value[j + 1] = value[j];
               j--;
           }
           value[j + 1] = hold;
       }
        
        return value;
    }  

    public static int[] distinct(int value[]){
        int temp = 0;
        if(value.length == 0 || value.length == 1)
            return value;        

        for(int i = 0; i < value.length - 1; i ++){
            if(value[i] != value[i + 1]){
                value[temp++] = value[i];
            }
        }
        value[temp++] = value[value.length - 1];

        int hold[] = new int[temp];
        for (int z = 0; z < hold.length; z++)
            hold[z] = value[z];

        return hold;
    }
//King Aj Magalona - BSCS
    public static int[] merge(int a[], int b[]){
        int hold[] = new int[a.length + b.length];
        int temp = 0;

        for(int i : a) 
        hold[temp++] = i;

        for(int j : b) 
        hold[temp++] = j;
        
        return hold;
    }
    //Fixed some bugs
    public static int[] sysmmetricDifference(int a[], int b[]){
        int sA[] = iSort(a);
        int dA[] = distinct(sA);

        int sB[] = iSort(b);
        int dB[] = distinct(sB);
       
        return extractSymDiff(dA, dB);
    }
    //Fixed some bugs
    public static int[] difference(int a[], int b[]){
        int sA[] = iSort(a);
        int dA[] = distinct(sA);
        
        int sB[] = iSort(b);
        int dB[] = distinct(sB);

        return extractDifference(dA, dB);
    }
//King Aj Magalona - BSCS  
    public static int[] intersect(int a[], int b[]){  
        int sA[] = iSort(a);
        int dA[] = distinct(sA);
        
        int sB[] = iSort(b);
        int dB[] = distinct(sB);      
        return extractIntersect(dA, dB);
    }

    public static int[] union(int a[], int b[]){
        int m[] = merge(a, b);
        int sM[] = iSort(m);        
        return distinct(sM);
    }

    public static int[] unionAll(int a[], int b[]){
       return merge(a, b);
    }
    //King Aj Magalona - BSCS
    
    public static void printf(String str, int value[]) {  
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
    //I do not like typing "System.out"
    public static void printf(String str){
        System.out.print(str);
    }
    //King Aj Magalona - BSCS   
    public static void main(String[] args){
        // int a[] = {1, 5, 6, 7, 8, 3, 0};
        // int b[] = {5, 4, 9, 6, 2, 0};    //Testing Sets

        // int a[] = {1, 5, 6, 4, 9, 2, 0};
        // int b[] = {0, 1, 2, -3, 4, 5, 6};   //Testing Sets 
        
        int a[] = {5, 4, 3, 7, 7, 5, 9};
        int b[] = {4, 2, 2, 4, 1, 8, 6, 7}; //Testing Sets

        // 👍👍👍👍👍 - Unicode thumbs up \uD83D\uDC4D
        printf("\uD83D\uDC4D \033[32mKing Aj Magalona - 1st year BSCS\033[0m \uD83D\uDC4D \n\n");

        printf("set A \t\t\t\t\t: ", a);
        printf("\nset B \t\t\t\t\t: ", b);
       
        printf("\n\nUnionAll of A and B \t\t\t: ", unionAll(a, b));
        printf("\nUnion of A and B \t\t\t: ", union(a, b));        
        printf("\nIntersect of A and B \t\t\t: ", intersect(a, b));
        printf("\nDifference of A and B \t\t\t: ", difference(a, b));
        printf("\nSymmetric Difference of A and B \t: ", sysmmetricDifference(a, b));
        
        printf(" \n\n👍 No built-in or third party packages/functions used like hashset, arraylist, arrayS.. yeeh -\033[32m King Aj Magalona - 1st year BSCS\033[0m 👍");
        //Type 'chcp 65001' in terminal/console run again if you're using vscode and if emojis doesn't show
    }   //emojis should show in other IDEs
    
    //King Aj Magalona - BSCS
}