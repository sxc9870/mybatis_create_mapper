package area;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("d:\\area.txt");
        File f2 = new File("d:\\netloan.sql");
        BufferedReader ff = new BufferedReader(new FileReader(f));
        BufferedWriter wReader = new BufferedWriter(new FileWriter(f2));
        String one = "　";
        String two = "　　";
        String line = null;
        List<City> parent = new ArrayList<>();
        int index=-1,index2=-1;
        List<City>secound=new ArrayList<>();   List<City>s3=new ArrayList<>();
        int cc=0;
        while ((line = ff.readLine()) != null) {
            cc++;
            if (line.startsWith(one)&& !line.startsWith(two)) {
                City c = new City();
                c.code = line.split("         　")[0].replace("　", "");
                c.name = line.split("         　")[1].replace("　", "");
                c.parent = parent.get(index).code;
                c.level = "2";
                secound.add(c);
                index2++;
                wReader.write(c.toString());
            } else if (line.startsWith(two)) {
                City c = new City();
                c.code = line.split("     　　")[0].replace("　", "");
                c.name = line.split("     　　")[1].replace("　", "");
                c.parent = secound.get(index2).code;
                c.level = "3";
                s3.add(c);   wReader.write(c.toString());
            } else {
                City c = new City();
                c.code = line.split("     ")[0].trim();
                c.name = line.split("     ")[1].trim();
                c.parent = "1";
                c.level = "1";
                parent.add(c);   
                wReader.write(c.toString());
                index++;
            }
            
            
        }wReader.flush();
        System.out.println(cc);
    }

    public static class City {
        public String code, name, parent, level;
        @Override
        public String toString() {
    
            return         "Insert into sys_area values(null,'"+name + "'," + code + "," + parent + "," + level+",'');\r\n";
        }
    }

}
