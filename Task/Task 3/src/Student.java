public class Student extends User{
    Student(String name, String studentId) {
        super(name, studentId);
    }

    @Override
    public boolean login(){
        String name = getName();
        String studentId = getStudentId();

        return name.equals("Malik Zaky Zahroni") && studentId.equals("202410370110031");
    }

    @Override
    public void displayInfo(){
        String name = super.getName();
        String studentId = super.getStudentId();

        System.out.println("===========================");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}