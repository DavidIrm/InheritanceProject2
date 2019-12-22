package com.sda.fileReading;

import java.io.*;

public class MainFileReader {

    public static void main(String[] args)  {

    // tema: faceti un fisier de forma: nume;prenume;cnp;varsta
    // transformati fiecare linie in obiect Person(nume,prenume,cnp,varsta)
        File myFile = new File("C:\\Users\\Mihai\\Desktop\\fileToBeReaded.txt");

        try {
            FileReader myFileReade = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(myFileReade);
            bufferedReader.readLine();
            String fileLine;
            while((fileLine = bufferedReader.readLine())!=null) {
                System.out.println(fileLine);

                String[] personArray= fileLine.split(";");
               for(int i=0;i<personArray.length;i++){
                   System.out.println(personArray[i]);
               }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
