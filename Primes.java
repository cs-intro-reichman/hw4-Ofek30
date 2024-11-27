public class Primes 
{
    public static void main(String[] args) 
    {
        int cnt=0;
        int level=Integer.parseInt(args[0])+1;
        boolean [] arr=new boolean[level];
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
        level=level-1;
        double pre = (cnt / (double)level) * 100;
        pre=(int)pre;

        System.out.println("There are " + cnt + " primes between 2 and " + level + " (" + (int)Math.round(pre) + "% are primes)");
       
    }
}
