package _24BitManipulation;

public class Basic {
    public static void main(String[] args) {
        System.out.println(5|9);
        System.out.println(5&9);
        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" "+Long.MAX_VALUE);
        System.out.println(5+" "+~5);
        System.out.println(5&1);
        System.out.println(91>>2);

    }
}
/*
    10000...0 = 2^k
    11111...1 = 2^k-1
    0101 | 1001 = 1101
    0101 & 1001 = 0001

    X | 0 = X
    X & 0 = 0

    byte : -2^7 to 2^7-1
    short : -2^15 to 2^15-1
    int : -2^31 to 2^31-1
    long : -2^63 to 2^63-1

    1 bit can store 2 numbers 0 or 1
    1 byte = 8 bits = 2*2*2*2*2*2*2*2 = 256

    left most is for sign

    XOR ^
    1 for same bits
    0 for different bits
    even number of 1s : 0
    odd number of 1s : 1

    bitwise operators follow associativity rule

    1s compliment of binary number : flip all the bits
    1s compliment of X = ~X = -X -1

    2s compliment of X is -X = 1s compliment +1

    -ve number is stored as its 2s compliment

    | operator is used to turn on a bit
    a = 0,1
    a|0 = a
    a|1 = 1 turn on a bit
    a&1 = a
    a&0 = 0 turn off a bit
    ^ is used as toggle

    a^0 = a
    a^1 = flipped a

    operators
    >> right shift no. of bits shifted/removed from right and added to left
    << left shift no. of bits shifted/0 added from right
*/