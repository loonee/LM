class Armstorng{
public static void main (String args[]){
int n=153, sum=0, rem, num;
num=n;
while(num!=0){
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==n)
System.out.println(n+ "is an Armstrong number");
else
System.out.println(n+ "is not an Armstrong number");
}
}
