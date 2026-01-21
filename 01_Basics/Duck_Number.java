import java.util.*;
void main()
    { int i,d,c=0,n;
     Scanner scnew Scanner(System.in);
     System.out.println("Input the no. to be checked");
     n=ob.nextInt();
        for(i=n;i!=0;i=i/10)
        {
            d=i%10;
            if(d==0)
            c++;
            
        }
        if(c!=0)
        System.out.print("It is a duck number");
        else 
        System.out.print("It is not a duck number");
    }
}
Here, d = to store the digits
  c= count of 0 present
  i= loop control variable
  n= no. to be checked
