class Factorial{
int a;
int fact;
int b;
Factorial(int a){
this.a=a;
}
public void calculate(){
	int fact=1;
	for(int i=1;i<=a;i++){

	fact= fact*i;
	b=fact;
}
}
public void display(){
	System.out.println("Factorial of given number is "+b);
}
public static void main(String[] args){
	Factorial f= new Factorial(5);
	f.calculate();
	f.display();
}
}
