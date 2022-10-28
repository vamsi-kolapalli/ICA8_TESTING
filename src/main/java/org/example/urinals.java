package org.example;

import java.io.*;
import java.util.Scanner;

/**
 * @author vamsi kolapalli
 */
public class urinals {
    public String[] openFile() throws IOException {
        File file = new File("/Users/vamsikolapalli/Downloads/urinal.dat");
        Scanner sc = new Scanner(file);
        File file_1 = new File("/Users/vamsikolapalli/Downloads/urinal.dat");
        int count = 0;
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(file_1))) {

            while (lnr.readLine() != null) {
            }

            count = lnr.getLineNumber();

        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        String[] fileArray = new String[count];
        while (sc.hasNextLine()) {
            fileArray[i] = sc.nextLine();
            i++;
        }
        return fileArray;
    }

    public void getString() throws IOException {
        String[] strArray = openFile();
        for (int i = 0; i < strArray.length; i++) {
            int result=countUrinals(strArray[i]);
            System.out.println(result);
        }
    }

    public int countUrinals(String str) {
        int count = 0;
        if (validString(str)) {
            int length = str.length();
            for (int i = 0; i < length - 1; i++) {
                if (str.charAt(i) == '0') {
                    if (i == 0 && str.charAt(i + 1) == '0') {
                        count++;
                        str = str.substring(0, i) + '1'
                                + str.substring(i + 1);

                    } else if (i > 0) {
                        if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                            count++;
                            str = str.substring(0, i) + '1'
                                    + str.substring(i + 1);

                        }

                    }
                }
            }
            if (str.charAt(length - 1) == '0' && str.charAt(length - 2) == '0') {
                count++;
                str = str.substring(0, length - 1) + '1'
                        + str.substring(length);
            }
        } else {
            count = -1;
        }
        return count;
    }

    public boolean validString(String str) {

        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length - 1; i++) {

                if (i == 0) {
                    if (str.charAt(0) == '1' && str.charAt(1) == '1') {
                        return false;
                    }
                } else {
                    if (str.charAt(i) == '1') {
                        if (str.charAt(i - 1) == '1' || str.charAt(i + 1) == '1') {
                            return false;
                        }

                    }
                }

            }
            return str.charAt(length - 1) != '1' || str.charAt(length - 2) != '1';
        }
        return true;
    }

    public static void main(String[] args) throws NullPointerException, IOException {
        urinals urinal = new urinals();
        urinal.getString();
    }
}