class money
{
  public static void main(String args[])
  {
    int b=1,i;
    int count=0,abc=0;
    //int num=(int)(Math.random()*10000+1); // if you want to auto generate autonumber
    int num=12345; // for testing . . .
    System.out.println("the auto generated number is => "+num);
    int numm=num;
    // to know who many digits . . .
    while( numm>=10)
    {
      abc++;
      numm/=10;
    }
    // to assign how manu Zeros is needed for program
    for(i=1;i<=abc;i++)
    {
      b=b*10;
    }
    // main calulation . . .
    while(num>0)
    {
      do
      {
        num-=b;
        count++;
      }while(num>=b);
   System.out.println(b+" x " +count+"\n");
   
    b/=10;
    count=0;
    }
  }
}
