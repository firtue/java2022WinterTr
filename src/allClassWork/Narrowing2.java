package allClassWork;

public class Narrowing2 {
    public static void main(String[] args) {

        double s1=230.36;
        int s2= (int) s1;
        byte s3= (byte) s2;

        System.out.println("double="+s1);
        System.out.println("int="+s2);
        System.out.println("byte="+s3);
    }
}
