
class Solution {
    public static boolean palinArray(int[] arr) {
       
        for(int num:arr){
            String s=String.valueOf(num);
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        
    return true;
}
}
