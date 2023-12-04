public class InHinhTamGiac {
    public static void main(String[] args) {
        System.out.println("In tam giác vuông");
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                if(j==0 || j<=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("In tam giác vuông rỗng");
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                if(j==0 || i==j || i==3)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}
