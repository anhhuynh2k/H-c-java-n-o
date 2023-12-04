public class ForLongNhau {
    public static void main(String[] args) {
/*        for(int i=1; i<5; i++)
        {
            for(int j = 1; j<5; j++)
            {
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }
        System.out.println("*************************");*/
        for(int i=1; i<5; i++)
        {
            for(int j = 1; j<5; j++)
            {
                if (j==1 || j==4 || i==1 || i==4)
                {
                    System.out.print(i+""+j+"\t");
                }
                else{
                    System.out.print(" "+"\t");
                }
            }

            System.out.println("");
        }

        System.out.println("************************************************");
        System.out.println("Hình tam giác vuông: ");
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (j<=i)
                {
                    System.out.print(i+""+j+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}
