package seniors;

public class Hello {

	void methodSix() {
		System.out.println("Static method six");
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.methodTwo();

		Outer.Regular rin = outer.new Regular();
		rin.methodOne();

		Outer.methodThree();
		Outer.StaticIN sin = new Outer.StaticIN();

		Static2 s2 = new Static2();

		// method local
		outer.methodFive();

		// Anonymous Inner class
		Hello h1 = new Hello();
		outer.methodSeven(h1);
		System.out.println(1);

		outer.methodSeven(new Hello());
		System.out.println(2);

		outer.methodSeven(new Hello() {

			int num1 = 7;
			int num2 = 6;

			int add() {
				return 5 + num1 + num2;
			}

			@Override
			void methodSix() {
				System.out.println("Static method six: " + add());
			}

		});

	}

	static class Static2 {
		int age = 8;

		void methodFour() {
		}
	}

}

// Inner Classes - Regular, static, method local, anonymous

class Outer {

	private static int num1 = 4;

	// Regular Inner class
	class Regular {
		int age = 8 + num1;

		void methodOne() {
		}
	}

	// static Inner class
	static class StaticIN {
		int age = 8 + num1;

		void methodFour() {
		}
	}

	void methodTwo() {
	}

	static void methodThree() {
	}

	// method local Inner class
	void methodFive() {
		class MethodLocal {
			void methodSix() {
			}
		}
		MethodLocal ml = new MethodLocal();
		ml.methodSix();
	}

	// Anonymous Inner class
	void methodSeven(Hello obj) {
		obj.methodSix();
	}

}

// Static Inner Class - for a static inner class you have to declare stATIC
//	you cannot access a static member in a non static
