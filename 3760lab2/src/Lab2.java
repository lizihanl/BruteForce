import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Find three separate numbers that add up to a multiple of 37 from a file.
public class Lab2 {

    static void doTheStuff(String s) throws FileNotFoundException {
        try {
            List<String> listOfStrings = new ArrayList<String>();
            List<Integer> nums = new ArrayList<Integer>();
            File f0 = new File(s);
            Scanner scan = new Scanner(f0);

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                listOfStrings.add(data);
            }

            for (String str : listOfStrings) {
                nums.add(Integer.parseInt(str));
            }

            for (int i = 0; i < nums.size(); i++) {
                for (int j = i + 1; j < nums.size(); j++) {
                    for (int k = j + 1; k < nums.size(); k++) {
                        for (int x = 0; x <= 10000; x++) {
                            if (nums.get(i) + nums.get(j) + nums.get(k) == 37*x) {
                                System.out.println(
                                        nums.get(i) + " " + nums.get(j) 
                                        + " " + nums.get(k) 
                                        + " is a multiple of 37");
                            }
                        }

                    }

                }

            }

            System.out.println(nums);

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        doTheStuff("data0.txt");
        doTheStuff("data1.txt");
        doTheStuff("data2.txt");
        doTheStuff("data3.txt");
        doTheStuff("data4.txt");
        doTheStuff("data5.txt");
        doTheStuff("data6.txt");
        doTheStuff("data7.txt");
        doTheStuff("data0.txt");
    }
}