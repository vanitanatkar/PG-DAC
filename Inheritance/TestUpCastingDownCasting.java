package Study.Inheritance;

public class TestUpCastingDownCasting {

	public static void main(String[] args) {
	
		//A obj =new A(); 
		 //A obj= new B();// if RHS isa LHS then equation is valid 
		//showA(new A());
		//showA(new B());
		//showB(new C());
		//showA(new D());
		//showA(new E());
		//showA(new F());

		//showB(new B());
		//showB(new C());
		//showB(new E());
		//showB(new F());

		//showC(new C());
		//showC(new F());

		//showE(new E());

		//showC(new F());

		//showD(new D());
		
		//Non-static Polymorephism/runtime polymorephism
		//A obj =new B();
        //obj.f1(); //in f1 of class B
        //A obj = new D();
        //obj.f1();  //D ne f1 overide nahi kiya so A ka F1 call hoga
        //B obj=new E();
        //obj.f1();     //run time class override method is called ie E class
		//B obj=new C();
	    //obj.f1();      
		
	}

	public static void showA(A obj) {
		obj.fa();

		if(obj instanceof B) {
			((B)obj).fb();}

		if(obj instanceof C) {
			((C)obj).fc();
		}
		if(obj instanceof F ) {
			((F)obj).ff();
		}
		if(obj instanceof E ) {
			((E)obj).fe();
		}
		if(obj instanceof D ) {
			((D)obj).fd();
		}
	}

	public static void showB(B obj) {
		obj.fa();
		obj.fb();

		if(obj instanceof C) {
			((C)obj).fc();
		}
		if(obj instanceof E ) {
			((E)obj).fe();
		}
		if(obj instanceof F) {
			((F)obj).ff();  
		}
	}
	public static void showC(C obj) {
		obj.fa();
		obj.fb();
		obj.fc();
		if(obj instanceof F) {
			((F)obj).ff();  
		}
	}
	public static void showF(F obj) {
		obj.fa();
		obj.fb();
		obj.fc();
		obj.ff();
	}
	public static void showE(E obj) {
		obj.fa();
		obj.fb();
		obj.fe();
	}
	public static void showD(D obj) {
		obj.fa();
		obj.fd();
	}


}//end class
//here her class one dot file create here (7)
class A{
	void fa() {
		System.out.println(" in fa");}
	void f1() 
	{System.out.println("in f1 of class A");}
}

class B extends A{
	void fb() {
		System.out.println(" in fb");}
	void f1() 
	{System.out.println("in f1 of class B");}
}

class  C extends B{
	void fc() {
		System.out.println(" in fc");}
}

class D extends A{
	void fd() {
		System.out.println(" in fd");}
		
}
class E extends B {
	void fe() {
		System.out.println(" in fe");}
	
	void f1() {
		System.out.println("In f1 of class E");
	}
}

class F extends C{
	void ff() {
		System.out.println(" in ff");}
}
