
	class Parent {
	    void displayParent() {
	        System.out.println("This is the Parent class.");
	    }
	}

	class Child extends Parent {
	    void displayChild() {
	        System.out.println("This is the Child class.");
	    }
	}

	public class SingleInheritanceExample {
	    public static void main(String[] args) {
	        Child child = new Child();
	        
	        child.displayParent(); // Accessing method from the Parent class
	        child.displayChild();  // Accessing method from the Child class
	    }
	
	
	}	

	


