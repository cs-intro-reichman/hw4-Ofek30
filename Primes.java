public class Primes 
{
    public static void main(String[] args) 
    {
        int cnt=0;
        int level=Integer.parseInt(args[0]);
        boolean [] arr=new boolean[level+1];
        arr[0]=false; arr[1]=false;
        for(int i=2;i<level;i++)
        {
            arr[i]=true;
        }
        
       for(int k=2;k<level;k++)
        {
            int z=k;
            while(z<level)
            {
                if(z==k)
                {

                }
                else if(arr[z]==true)
                arr[z]=false;
                
                z=z+k;
            }
         
        }

        for(int r=2;r<level;r++)
        {
            if(arr[r])
            {
            System.out.println(r);
            cnt++;
            }
           
           
        }
        
        double d=(double)cnt/level;
        d=d*100;
        int pre=(int) d;
        System.out.println("There are "+ cnt+ "primes between 2 and "+level+" ("+pre+"% are primes)");
       
    }
}
