import java.util.*;
class split
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,sum1=0,r1,r2,count=0,count1=0;
System.out.println("Enter size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter array elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
if(n%2==0)
r1=n/2;
else
r1=(n/2)+1;
for(int i=0;i<r1;i++)
{
sum=sum+a[i];
count++;
}
for(int j=r1;j<n;j++)
{
sum1=sum1+a[j];
count1++;
}
if((sum/count)==(sum1/count1))
{
System.out.println("possible");
}
else
{
System.out.println("Not possible");
}
}
}
