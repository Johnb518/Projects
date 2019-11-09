
public class TestStudent {
	   public static void main(String[] args) {
	       Student stX = new Student();
	       Student stY = new Student(1, "Benavides", "John");
	       Student stZ = new Student(21, "Mendoza", "Sasha");
	      
	       System.out.println("Created Students:"+Student.numberStudents);
	       System.out.println("Registered Students:"+Student.numberRegistered);
	       stY.register();
	       stZ.register();
	       stX.register();
	       System.out.println();
	       System.out.println("Created Students:"+Student.numberStudents);
	       System.out.println("Registered Students:"+Student.numberRegistered);
	       stY.withdraw();
	       stX.register();
	      
	       System.out.println();
	       System.out.println(" Created Students:"+Student.numberStudents);
	       System.out.println("Registared Students:"+Student.numberRegistered);
	       stZ.program = 'U';
	       stX.program = 'G';
	      
	       stZ.setMidtermGrade(70);
	       stZ.setFinalGrade(97.5);
	       stX.setMidtermGrade(85);
	       stX.setFinalGrade(25.6);
	      
	       System.out.println();
	       System.out.println("Student Info:");
	       stX.studentInfo();
	       System.out.println();

	       System.out.println();
	       stZ.studentInfo();
	       System.out.println();
	      
	   }
	}

