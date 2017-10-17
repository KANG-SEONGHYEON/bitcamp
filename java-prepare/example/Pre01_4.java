package bitcamp.java100;

public class Pre01_4 {
    public static void main(String[] args){
        char c;

        short s;
        s = -32768;
        s = 32767;

        c = 0;
        c = 65535;

        c = 44032;
        System.out.println(c);

        c = '가';
        System.out.println(c);
    
        int i1 = '\b';
        int i2 = '\t';
        int i3 = '\n';
        int i4 = '\f';
        int i5 = '\r';
        int i6 = '\'';
        int i7 = '\"';
        int i8 = '\\';
        System.out.printf("%x, %x, %x, %x, %x, %x, %x, %x", i1, i2, i3, i4, i5, i6, i7, i8);
    }   
}