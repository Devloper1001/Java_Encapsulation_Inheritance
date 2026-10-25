
class Course {
    static int maxCapacity = 100;
    String courseName;
    String studentName;
    int enrolments;

    String[] enrolStudents = new String[maxCapacity];

    Course(String studentName,String nameOfTheCourse){
        courseName = nameOfTheCourse;
        this.studentName=studentName;
    }

    static void  setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        System.out.println(studentName+" "+"You are enrolled in "+courseName);
        enrolStudents[enrolments] = studentName;
        enrolments++;
    }

    public  String[] unenrollStudent(String studentName){
        String[] newArray = new String[maxCapacity];
        System.out.println(studentName+" "+"is unenroll successfully from "+courseName);
        //int i = 0 , j = 0;
       // while (i  <= enrolStudents.length){
        for (int i =0 ; i<= newArray.length; i++){
            int j = 0 ;
            if (enrolStudents[j] != studentName ){
                newArray[j] = enrolStudents[j];
                j++;
            } else if (enrolStudents[j] == studentName) {
                newArray[j] = enrolStudents[j++];
            }
        }
        return newArray;
    }

    public static void main(String[] arg){
        Course addStudent = new Course("Gagandeep","History");
        addStudent.enrollStudent("Gagandeep");
        addStudent.enrollStudent("James");

        Course deleteStudent = new Course("Gagandeep","English");
        deleteStudent.unenrollStudent("Gagandeep");
    }
}