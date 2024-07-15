

public class LinearSearch {
    public static void main(String args[]){ 
        int a []= {4,7,3,0,3,1};
        int item = 7;
        for(int i = 0;i<a.length;i++){
            if(a[i]==item){
                System.out.println(+item +" present at index " + i);
            }
        }

    }
    
}
