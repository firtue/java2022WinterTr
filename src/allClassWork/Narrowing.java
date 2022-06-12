package allClassWork;

public class Narrowing {
    public static void main(String[] args) {

        int s1=1656153;
        short s2= (short) s1;
        byte s3= (byte) s2;

        System.out.println("int="+s1+"   short="+s2+"   byte="+s3);

    }
}
