public abstract class User{
    private String name;
    private String studentId;

    User(String name,  String studentId){
        setName(name);
        setStudentId(studentId);
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setStudentId(String studentId){
        this.studentId = studentId;
    }

    protected String getName(){
        return this.name;
    }

    protected String getStudentId(){
        return this.studentId;
    }

    public boolean login(){
        String name = getName();
        String studentId = getStudentId();

        return name.equals("User") && studentId.equals("202410370110031");
    }

    public void displayInfo(){
        String name = getName();
        String studentId = getStudentId();

        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}
