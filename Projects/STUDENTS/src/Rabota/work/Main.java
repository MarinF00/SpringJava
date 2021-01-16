package Rabota.work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	    OOPTest student1 = new OOPTest("Marin", "1228222",5);
        OOPTest student2 = new OOPTest("Marin1", "122822",5);
        OOPTest student3 = new OOPTest("Marin2", "1228222",20);
        Group group = new Group();
        Group group1 = new Group();
        List<OOPTest> students = new ArrayList<>();
        List<OOPTest> students1 = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students1.add(student1);
        group1.setName("Hello");
        group.setName("Allo");
        group1.setTotalPoints(students);
        group.setTotalPoints(students);
        System.out.println(student1.compareTo(student2));
        System.out.println(group.getTotalPoints());
        System.out.println(group1.getTotalPoints());
        System.out.println(group.compareTo(group1));

        File file = new File("F:\\Work\\students.txt");
        File file1 = new File("F:\\Work\\groups.txt");

        if(!file1.exists())
        {
            file1.createNewFile();
        }
        if(!file.exists())
        {
            file.createNewFile();
        }

        System.out.println(student1.getList(file));
        System.out.println(group.getList(file1));
    }
}
