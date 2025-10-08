package in.sagarcoding.challenge75;

class ArrayToString {

    public static void main(String[] args) {
        String [] arr = new String[] {"This", "is" , "the", "best" , "and", "most", "deatiled", "course", "on", "java", "on", "the", "internet"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            stringBuilder.append(str).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
