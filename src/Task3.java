public class Task3 {
    public static int isPrime(int n,int divider,int counter){
        //As divider starts from 2 it checks for n=1 and n=2
        if(n==divider || n<divider){
            return counter;
        }else{
            if(n%divider==0){
                return counter+1;
            }else{
                //Checking with next divider by adding 1
                return isPrime(n,divider+1,counter);
            }
        }
    }

}
