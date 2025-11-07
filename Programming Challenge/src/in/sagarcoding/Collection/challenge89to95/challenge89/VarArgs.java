package in.sagarcoding.Collection.challenge89to95.challenge89;

class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Sagar"));

        System.out.println(concatenate("Sagar", "Kirtakar"));

        System.out.println(concatenate("Sagar", "Kisanrao", "Kirtakar"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }


}
