package _24BitManipulation;

public class Problems {
    public static void main(String[] args) {
//        Power of 2
//        given 'n' find 2^n in O(1)
        int n = 10;
        System.out.println(1<<n);

//        swap 2 numbers
        int a = 6, b = 7;
        a = a^b;
        b = a^b;
        a = a^b;

//        Bit masking
/*
        check if kth bit is set(1) or not
        mask = 1<<k
        create a mask with all zeros except kth bit 'and' mask with given number, if(mask&a==1) bit is set on
        or
        n>>k
        n&1

        turn on or set the kth bit
        mask = 1<<k
        a = a | mask

        turn off/clear the kth bit
        a&1 = a, a&0 = 0
        mask = ~(1<<k)
        a = a&mask

        toggle kth bit
        mask = 1<<k
        a = a^mask

        turn on the rightmost set bit
        b = a
        k = 0
        while(b%2==0){
            b>>1
            k++
        }
        a = a|(1<<k)
        TC = O(logn)

        to find n-1 for given n, turn rightmost bit 0 and flip all further 0s to 1
        m-2
        n&(n-1)
 */
    }
}
/*
    X and 0 are decimal numbers
    X^X = 0
    X^0 = X
    XOR is associative

    b = (a^b)^b = a^(b^b) = a^0 = a
 */

/*
    XOR pf numbers in a given range
    1=1
    2=3
    3=0
    4=4
    5=1
    6=7
    8=8
    9=1
    10=11
    12=12

    if n%4==0 n
       n%4==1 1
       n%4==2 n+1
       n%4==3 0

    XOR(a,b) = XOR(1,a-1)^X(1,b)
    3 to 6 = 1^2 ^ !^2^3^4^5^6

    or loop from a to b
*/