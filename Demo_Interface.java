package Assignment;


	
	public interface Demo_Interface {
		void registerAccount();
		void requestBook();

	}

	class StudentUsers implements Demo_Interface {
		int age;
		String bookType;
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		
		public void registerAccount() {
			if(age<12)
				System.out.println("You have successfuly registered under a Student Account");
			else
				System.out.println("Sorry, Age must be less than 12years to register as a student");
		}
		
		public void requestBook() {
			if(bookType == "Students" )
				System.out.println("Book delivered successfully, please return the book within 10 days");
			else
				System.out.println("you are allowed to take only Student book");
		}
	}

	class SeniorUsers implements Demo_Interface {
		int age;
		String bookType;
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		
		public void registerAccount() {
			if(age>12)
				System.out.println("You been registered as an Senior Account");
			else
				System.out.println("Sorry, your Age must be greater than 12years register as a Senior");
		}
		
		public void requestBook() {
			if(bookType == "Science" )
				System.out.println("Book delivered successfully, please return the book within 7 days");
			else
				System.out.println("you are allowed to take only Senior Science book");
		}
	}

