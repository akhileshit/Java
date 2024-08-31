 
class Professor {
   public static void main(String[] args) {
      Main professor = new Main();
      professor.id = 1;
      professor.name = "Harish Pathak";
      professor.department = "Computer Science";
      professor.yearsOfExperience = 10;
      System.out.println("Professor ID: " + professor.id);
      System.out.println("Professor Name: " + professor.name);
      System.out.println("Department: " + professor.department);
      System.out.println("Years of Experience: " + professor.yearsOfExperience);
      professor.conductLecture();
      professor.provideFeedback();
   }
}