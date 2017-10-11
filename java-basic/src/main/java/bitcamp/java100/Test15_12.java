// ## 연산자 - 비트 이동 연산자 (>> >>> <<)
package bitcamp.java100;
    public class Test15_12 {
        public static void main(String[] args) {
            // >>
            
            int v = 87; // 0000_0000_0000_0000_0000_0000_0101_0111
            System.out.println(v >> 1); // v / 2**1 = x000_0000_0000_0000_0000_0000_0010_1011|1
            System.out.println(v >> 2); // v / 2**2 = xx00_0000_0000_0000_0000_0000_0001_0101|11
            System.out.println(v >> 3); // v / 2**3 = xxx0_0000_0000_0000_0000_0000_0000_1010|111
            System.out.println(v >> 4); // v / 2**4 = xxxx_0000_0000_0000_0000_0000_0000_0101|0111
            System.out.println();
            
            v = -87;
            System.out.println(v >> 1); 
            System.out.println(v >> 2);
            System.out.println(v >> 3);
            System.out.println(v >> 4);
            System.out.println();
            
            // >>>
            
            v = 87; // 0000_0000_0000_0000_0000_0000_0101_0111
            System.out.println(v >>> 1); // v / 2**1 = x000_0000_0000_0000_0000_0000_0010_1011|1
            System.out.println(v >>> 2); // v / 2**2 = xx00_0000_0000_0000_0000_0000_0001_0101|11
            System.out.println(v >>> 3); // v / 2**3 = xxx0_0000_0000_0000_0000_0000_0000_1010|111
            System.out.println(v >>> 4); // v / 2**4 = xxxx_0000_0000_0000_0000_0000_0000_0101|0111
            System.out.println();
            
            v = -87;
            System.out.println(v >>> 1); 
            System.out.println(v >>> 2);
            System.out.println(v >>> 3);
            System.out.println(v >>> 4);
            System.out.println();
            
            // <<
            
            v = 5; // 0000_0000_0000_0000_0000_0000_0000_0101
            System.out.println(v << 1); 
            System.out.println(v << 2); 
            System.out.println(v << 3);  
            System.out.println(v << 4); 
            System.out.println();
            
            v = -5;
            System.out.println(v << 1); 
            System.out.println(v << 2);
            System.out.println(v << 3);
            System.out.println(v << 4);
            System.out.println();
            
        }
    }