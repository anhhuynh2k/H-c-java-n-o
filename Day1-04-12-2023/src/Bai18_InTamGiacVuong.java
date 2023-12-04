public class Bai18_InTamGiacVuong {
    public static void main(String[] args) {
        System.out.println("In hình vuông");
        for (int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
        System.out.println("In hình vuông rỗng");
        for (int i=1; i<=4; i++)
        {
            for(int j=1; j<=4; j++)
            {
                if(j==1 || j==4 || i==1 || i==4)
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
