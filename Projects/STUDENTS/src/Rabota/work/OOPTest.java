package Rabota.work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OOPTest implements Comparable<OOPTest>,ReadFromFile {

    String facNum;
    String name;
    int points;

    public OOPTest(String name, String facNum, int points)
    {
        this.name = name;
        this.facNum = facNum;
        this.points = points;
    }
    public OOPTest()
    {

    }
String getName()
{
    return name;
}

    public String getFacNum() {
        return facNum;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFacNum(String facNum) {
        this.facNum = facNum;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "OOPTest{" +
                "facNum='" + facNum + '\'' +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }


    @Override
    public int compareTo(OOPTest o) {
        if(this.facNum.equalsIgnoreCase(o.facNum))
        {
            System.out.println("Objects are equal!");
            return 1;
        }
        System.out.println("Objects are not equal!");
        return 0;
    }

    @Override
    public List<String> getList(File file) throws IOException {
        List<String> students = new ArrayList<>();
        String line;
        BufferedReader in = new BufferedReader(new FileReader(file));
        while ((line  = in.readLine()) != null)
        {
            students.add(line);
        }
        return students;
    }
}
