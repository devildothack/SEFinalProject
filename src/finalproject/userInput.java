/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class userInput {
    
    public void userInputRun() {

        String prefix = null, number = null, name = null, hour = null, description = null, prerequisites = null;
        String nameUniv = null, missionUniv = null, visionUniv = null;
        String numberCollege = null, nameCollege = null, missionCollege = null, visionCollege = null;
        Image logo = null;
        int entries;

        ArrayList dataList = new ArrayList();
        ArrayList dataListUniv = new ArrayList();
        ArrayList dataListCollege = new ArrayList();

        Scanner inputScanner = new Scanner(System.in);

        University currentUniversity = new University(nameUniv, missionUniv, visionUniv, logo);
        Courses currentCourse = new Courses(prefix, number, name, hour, description, prerequisites);
        Colleges currentCollege = new Colleges(numberCollege, nameCollege, missionCollege, visionCollege);

        System.out.println("Enter the number of courses:");
        entries = inputScanner.nextInt();

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter course prefix:");
            currentCourse.setPrefix(inputScanner.next());
            System.out.println("enter course number");
            currentCourse.setNumber(inputScanner.next());
            System.out.println("enter course name");
            currentCourse.setName(inputScanner.next());
            System.out.println("enter course hour");
            currentCourse.setHour(inputScanner.next());
            System.out.println("enter course description");
            currentCourse.setDescription(inputScanner.next());
            System.out.println("Enter course prerequi");
            currentCourse.setPrerequisites(inputScanner.next());

            dataList.add(currentCourse.getPrefix());
            dataList.add(currentCourse.getNumber());
            dataList.add(currentCourse.getName());
            dataList.add(currentCourse.getHour());
            dataList.add(currentCourse.getDescription());
            dataList.add(currentCourse.getPrerequisites());
        }

        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(dataList.get(i).toString());

        }

        System.out.println("Enter the number of Universities:");
        entries = inputScanner.nextInt();

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter name");
            currentUniversity.setNameUniv(inputScanner.next());
            System.out.println("Enter mission:");
            currentUniversity.setMissionUniv(inputScanner.next());
            System.out.println("Enter vision:");
            currentUniversity.setVisionUniv(inputScanner.next());

            dataListUniv.add(currentUniversity.getNameUniv());
            dataListUniv.add(currentUniversity.getMissionUniv());
            dataListUniv.add(currentUniversity.getVisionUniv());

        }

        for (int i = 0; i < dataListUniv.size(); i++) {
            System.out.println(dataListUniv.get(i).toString());

        }

        System.out.println("Enter the number of colleges to be entered:");
        entries = inputScanner.nextInt();

        for (int i = 0; i < entries; i++) {

            System.out.println("college number:");
            currentCollege.setNumberCollege(inputScanner.next());
            System.out.println("college name");
            currentCollege.setNameCollege(inputScanner.next());
            System.out.println("college mission");
            currentCollege.setMissionCollege(inputScanner.next());
            System.out.println("college vision");
            currentCollege.setVisionCollege(inputScanner.next());

            dataListCollege.add(currentCollege.getNumberCollege());
            dataListCollege.add(currentCollege.getNameCollege());
            dataListCollege.add(currentCollege.getMissionCollege());
            dataListCollege.add(currentCollege.getVisionCollege());

        }

        for (int i = 0; i < dataListCollege.size(); i++) {
            System.out.println(dataListCollege.get(i).toString());

        }

    }
    
}
