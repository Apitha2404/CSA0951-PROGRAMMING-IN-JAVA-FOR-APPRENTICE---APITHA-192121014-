public class PrimeorComposite {
    public static void main(String[] args){
        int com = 0, pri = 0;
        int a[] = {4,54,29,71,7,59,98,23};
        for(int i = 0; i<a.length;i++){
            int c=0;
            for(int j= 1; j<a[i];j++){
                if(a[i]%j==0)
                    c++;
                }
            if(c>1)
                com++;
            else
                 pri++;
            }
        System.out.println("the composite numbers are: " + com);
        System.out.println("The prime numbers are :" + pri);
        }
    }

