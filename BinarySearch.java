

public class BinarySearch {
    public static void main(String args[]){
        int a[]={1,3,4,5,6,7,8,9,10,14,15,17};
        int itm_search=15;
        int li=0;
        int hi=a.length-1;
        int mi = (li+hi)/2;
        while(li<=hi)
        {
            if(a[mi]==itm_search)
        {
            System.out.println("element found at index" +mi);
            break;
        }
        else if(a[mi]<itm_search){
            li=mi+1;
        }
        else {
            hi=mi-1;
        }
        mi=(li+hi)/2;
    }
    if(li>hi){
        System.out.println("element not found");
    }
    }
    
}
