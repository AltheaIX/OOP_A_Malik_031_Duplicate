public class Students {
    String name;
    String studentID;

    Students(String name,String studentID){
        this.name=name;
        this.studentID=studentID;
    }

    private String getName(){
        return this.name;
    }

    private String getStudentID(){
        return this.studentID;
    }

    protected void displayInfo(){
        String name = getName();
        String studentID = getStudentID();

        System.out.println("=============================================");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }

    protected boolean Login(){
        return this.name.equals("Malik Zaky Zahroni") && this.studentID.equals("202410370110031");
    }
}
