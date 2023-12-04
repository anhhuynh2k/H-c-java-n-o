public class InTamGiacVuongNguoc {
    public static void main(String[] args) {
        System.out.println("In tam giác vuông ngược");
        for (int i=4; i>0; i--)
        {
            for (int j=0; j<4; j++)
            {
                if(j<i)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("In tam giác vuông ngược và rỗng");
        for (int i=4; i>0; i--)
        {
            for (int j=0; j<4; j++)
            {
                if(i==4 || j==0 || j==i-1)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("In tam giác vuông cạnh phải");
        for (int i=4; i>0; i--)
        {
            for (int j=1; j<=4; j++)
            {
                if (j>=i)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }

        System.out.println("In tam giác vuông cạnh phải rỗng");
        for (int i=4; i>0; i--)
        {
            for (int j=0; j<4; j++)
            {
                if (j==3 || i == 1 || j == i-1)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}
