package CoreJava;

public class test {
    public static void main(String[] args) {
        int ans=0;
        boolean flag=false;
int[] nums= new int[]{1,3,5,6};
int target=7;
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                flag=true;

            ans=i;
                break;
            }

    }
        if(flag==false)
            ans = target-(nums.length-1);
        System.out.println(ans);
}}
