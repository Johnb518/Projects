import java.util.Random;
public class Student {  
	   public Character program; 
	   public static int numberStudents = 0;
	   public static int numberRegistered;
	   public final static int classCapacity = 10; 
	   
	   public void studentInfo() {
		   System.out.println("Mid Term Grade:"+this.getMidtermGrade());
	       System.out.println("Final grade:"+this.getFinalGrade());
	       System.out.println("Student Id:"+this.getId());
	       System.out.println("Total grades:"+this.getTotal(this.program));
	       System.out.println("Student Name:"+this.firstName+" "+this.lastName);
	  
	   }

	   Student() {
	       this.id = 999;
	       this.lastName = "Doe";
	       this.firstName = "Jane";
	       numberStudents ++;
	       numberRegistered =8;
	   }
	   private int id;
	   public String firstName;
	   public String lastName;
	   
	   Student(int studentID,String lName,String fName) {
	       this.id = studentID;
	       this.lastName = lName;
	       this.firstName = fName;
	       numberStudents ++;
	       numberRegistered =8;
	       
	   }
	   public int getId() {
	       return id;
	   }
	   
	   public void setId(int id) {
	       this.id = id;
	   }
	   
	   private double midtermGrade;
	   public double getMidtermGrade() {
	       return midtermGrade;
	   }
	   
	   public void setMidtermGrade(double midtermGrade) {
	       this.midtermGrade = midtermGrade;
	   }
	   private double finalGrade;
	   public double getFinalGrade() {
	       return finalGrade;
	   }
	   
	   public void setFinalGrade(double finalGrade) {
	       this.finalGrade = finalGrade;
	   }
	  
	   public void register() {
	       if(numberRegistered == classCapacity) {
	           System.out.println("Class is full student can't registar.");
	       } else {
	           numberRegistered++;
	           System.out.println(this.lastName+" sucessfully registered.");
	       }
	   }
	  
	   public void withdraw() {
	       System.out.println(this.lastName+" withdrew.");
	       numberRegistered--;
	   }
	
	   
	   public double getTotal(Character prog) {
	       if(prog == 'U') {
	           if(extraCredit()) {
	               return ((30*this.getMidtermGrade())/100) + ((70*this.getFinalGrade())/100) + 10;
	           } else {
	               return ((30*this.getMidtermGrade())/100) + ((70*this.getFinalGrade())/100);
	           }
	       } else {
	           if(extraCredit()) {
	               return ((30*this.getMidtermGrade())/100) + ((70*this.getFinalGrade())/100) + 10;
	           } else {
	               return ((45*this.getMidtermGrade())/100) + ((55*this.getFinalGrade())/100);
	           }
	       }
	   }
	   public boolean extraCredit() {
	       Random rand = new Random();
	       int r = rand.nextInt((10 - 0) + 1);
	       if(r<5) {
	           return false;
	       } else {
	           return true;
	       }
	   }
}
	 
	


	
	

	  