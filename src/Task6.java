public class Task6 {
    public static int findNumDegree(int num,int deg){
        //Return 1 when degree is 0
        if(deg==0){
            return 1;
        }else{
            int result = findNumDegree(num,deg-1) * num;
            return result;
        }
    }
}
