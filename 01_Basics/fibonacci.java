class fibonacci
{
    void main(int n)
    { int a=0,b=1,i,c,s=0;
        for(i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
          s=s+c; 
        }System.out.println(s);
    }
}
