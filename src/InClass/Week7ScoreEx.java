package InClass;

import java.io.*;
import java.util.Scanner;

public class Week7ScoreEx {
    public static void main(String[] args) {
        String str = "";
        int sco [][] = new int[20][6];
        int r = 0, c = 0;
        File fin = new File("C:\\Temp\\data\\scorein.txt");
        File fout = new File("C:\\Temp\\data\\scoreout.txt");
        try {
            Scanner scan = new Scanner(fin);

            FileWriter fileWriter = new FileWriter(fout);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while(scan.hasNextLine()) {
                str = scan.nextLine();
                String st[] = str.split(" ");
                r++;
                for(c=0; c<st.length; c++) {
                    sco[r][c] = Integer.parseInt(st[c]);
                }
            }
            for(int i=1; i<=r; i++){
                sco[i][4] = 0;
                for(int j=1; j<=3; j++){
                    sco[i][4] += sco[i][j];
                }
            }
            for(int i=1; i<=r; i++){
                sco[i][5] = 1;
                for(int j=1; j<=r; j++){
                    if(sco[i][4]<sco[j][4]){
                        sco[i][5]++;
                    }
                }
            }
            for(int i=1; i<=r; i++) {
                for(int j=0; j<sco[0].length; j++) {
                    System.out.printf("%4d",sco[i][j]);
                    printWriter.printf("%4d", sco[i][j]);
                }
                printWriter.print("\n");
                System.out.println();
            }
            printWriter.close();
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
