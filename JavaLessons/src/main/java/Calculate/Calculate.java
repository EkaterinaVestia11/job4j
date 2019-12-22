package Calculate;

import static java.lang.Integer.*;

public class Calculate{

    public static void main(String[] arg) {
        System.out.println ("Calculate...");
        int first=valueOf (arg[ 0 ]);
        int second=valueOf (arg[ 1 ]);
        int sum=first+second;
        System.out.println ("Sum : "+sum);
    }
}
