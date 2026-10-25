class UseOfTwoStringPrintStudentDetail {
    String name;
    int age;
    int mobile;
    String gmail;

    public UseOfTwoStringPrintStudentDetail(String gmail, int mobile, int age, String name) {
        this.gmail = gmail;
        this.mobile = mobile;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UseOfTwoStringPrintStudentDetail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile=" + mobile +
                ", gmail='" + gmail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UseOfTwoStringPrintStudentDetail det =
                new UseOfTwoStringPrintStudentDetail("james@gmail.com",
                        2020,19,"james");
        System.out.println(det.toString());
    }
}
