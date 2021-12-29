public class Format {
    public static void main(String[] args){
        String c = "telugu sravani";
        int t = 43;
        float g = 23;
        System.out.println(String.format("%s", c));
        System.out.println(String.format("%x", t));
        System.out.println(String.format("%f", g));
    }
}
