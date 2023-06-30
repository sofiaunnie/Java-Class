package javatwo;   

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Inner classes
// Regex
// Collections Interface

class Outer {
	
	void outerMethod() {}

	// Regular Inner Class - A normal class that is inside another class
	class RegularInner {
		void regularInnerMethod() {}
	}

	// Static Inner Class
	static class StaticInner {
		void staticInnerMethod() {}
	}
	
	void method() {
		class MethodLocalInner {
			void methodLocalInnerMethod() {}
		}
		MethodLocalInner mlic = new MethodLocalInner();
		mlic.methodLocalInnerMethod();
	}
	
	void add (ActionListener al) {}
	
}

public class NewClass {

public static void main(String[] args) {
		// Outer class
		Outer outer = new Outer();
		outer.outerMethod();
		
		// Regular Inner Class
		Outer.RegularInner ric = outer.new RegularInner();
		ric.regularInnerMethod();

		// Static Inner Class n     
		Outer.StaticInner sic = new Outer.StaticInner();
		sic.staticInnerMethod();

		// Method Local Inner Class
		outer.method();
		
		// Anonymous inner class
		outer.add(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
