package Rabota.work;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Group implements Comparable<Group>, ReadFromFile {
    String name;
    List<OOPTest> students = new ArrayList<>();
    int totalPoints;

    public Group(String name, File file)
    {
        this.name = name;
    }
    public Group()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
    public List<OOPTest> getStudents()
    {
        return this.students;
    }
    public int getTotalPoints()
    {
        int sum = 0;
        for (int i = 0; i < students.size(); i++) {

            sum += students.get(i).getPoints();
        }
        return sum;
    }

    public void setTotalPoints(List<OOPTest> students)
    {
        for (int i = 0; i < students.size(); i++) {
            this.students = students;
        }
    }

    @Override
    public int compareTo(Group o) {
        if(this == o) return 0;
        if(getTotalPoints() == (o.getTotalPoints())){
            System.out.println("Objects` points are equal!");
            return 1;
        }
        else
            System.out.println("Objects` points are not equal!");
            return 0;
    }

    @Override
    public List<String> getList(File file) throws IOException {
        List<String> groups = new ArrayList<>();
        String line;
        BufferedReader in = new BufferedReader(new FileReader(file));
        while ((line  = in.readLine()) != null)
        {
            groups.add(line);
        }
        return groups;
    }
}
