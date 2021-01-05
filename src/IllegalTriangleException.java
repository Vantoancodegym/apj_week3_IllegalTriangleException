import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter three side of triangle");
            int side1=scanner.nextInt();
            int side2=scanner.nextInt();
            int side3=scanner.nextInt();
            checkLegalTriangle(side1,side2,side3);
            System.out.println("three sides of triangle is "+side1+" , "+side2+" , "+side3);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void checkLegalTriangle(int side1, int side2,int side3) throws Exception{
        boolean isLegalTriangle=(side1+side2)>side3||(side1+side3)>side2||(side2+side3)>side1;
        if (!isLegalTriangle) throw new Exception("there is illegal triangle");
    }
}
