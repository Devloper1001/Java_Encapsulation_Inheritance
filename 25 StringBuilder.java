class StringBuild{
    public static void main(String[] args) {

        String[] arr = {"My", "name", "is", "potter"};

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
