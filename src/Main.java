import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi👋👋");
        String hi = scanner.nextLine();
        /** 1 */
        System.out.println("1. Give a complete description of AirPurifier class");
        System.out.println("what should be instance variables?\n * serialNO : String\n * Make : String\n * Model : String\n * PowerCons : double\n * Color : String\n * Dimension : double[]");
        System.out.println("what should be instance methods?\n * turnON() : void\n * turnOFF() : void\n * setSpeed(int) : void\n * setMode(String) : void\n * getPM() : int ");
        System.out.println("what should be class variables?\n *  modelCount: int ");
        System.out.println("what should be class methods?\n * mostPopularModel()\n\n");

        /** 2 */
        System.out.println("2. for each method proposed above, how do you plan to implement it?\n" + "give an overview of the computation\n" + " * what's needed as inputs?\n" + " * what's to be returned?");
        System.out.println("\n" + "turnON() : void\n" + "ไม่รับ input และทำการเปลี่ยนค่า power เป็น true และไม่ return ค่า ");
        System.out.println("\n" + "turnOFF() : void\n" + "ไม่รับ input และทำการเปลี่ยนค่า power เป็น false และไม่ return ค่า ");
        System.out.println("\n" + "setSpeed(int) : void\n" + "รับ input เป็น int เพื่อเปลี่ยนค่า fanSpeed ไม่มี return ค่า ");
        System.out.println("\n" + "setMode(String) : void\n" + "รับ input เป็น String เพื่อเปลี่ยนค่า mode อื่นๆ ไม่มี return ค่า ");
        System.out.println("\n" + "getPM() : int\n" + "ไม่รับ input และให้ค่า PM ณ ตอนนั้น ไม่มี return ค่า ");
        System.out.println("\n\n");

}
}
