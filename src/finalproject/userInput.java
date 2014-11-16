/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class userInput {
    
    public void userInputRun() {

        String prefixCourse = null, numberCourse = null, nameCourse = null, hourCourse = null, descriptionCourse = null, prerequisitesCourse = null;
        String DepartmentNum = null, DepartmentName = null, DepartmentVision= null, DepartmentMission = null;
        String numberCollege = null, nameCollege = null, missionCollege = null, visionCollege = null;
        int entries;

        ArrayList dataListCourses = new ArrayList();
        ArrayList dataListUniv = new ArrayList();
        ArrayList dataListCollege = new ArrayList();

        Scanner inputScanner = new Scanner(System.in);

        Department currentDepartment = new Department(DepartmentNum, DepartmentName, DepartmentVision, DepartmentMission);
        Courses currentCourse = new Courses(prefixCourse, numberCourse, nameCourse, hourCourse, descriptionCourse, prerequisitesCourse);
        Colleges currentCollege = new Colleges(numberCollege, nameCollege, missionCollege, visionCollege);

        System.out.println("Enter the number of courses:");
        entries = inputScanner.nextInt();

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter course prefix:");
            currentCourse.setPrefixCourse(inputScanner.next());
            System.out.println("enter course number");
            currentCourse.setNumberCourse(inputScanner.next());
            System.out.println("enter course name");
            currentCourse.setNameCourse(inputScanner.next());
            System.out.println("enter course hour");
            currentCourse.setHourCourse(inputScanner.next());
            System.out.println("enter course description");
            currentCourse.setDescriptionCourse(inputScanner.next());
            System.out.println("Enter course prerequi");
            currentCourse.setPrerequisitesCourse(inputScanner.next());

            dataListCourses.add(currentCourse.getPrefixCourse());
            dataListCourses.add(currentCourse.getNumberCourse());
            dataListCourses.add(currentCourse.getNameCourse());
            dataListCourses.add(currentCourse.getHourCourse());
            dataListCourses.add(currentCourse.getDescriptionCourse());
            dataListCourses.add(currentCourse.getPrerequisitesCourse());
        }

        for (int i = 0; i < dataListCourses.size(); i++) {
            System.out.println(dataListCourses.get(i).toString());

        }

        System.out.println("Enter the number of Departments");
        entries = inputScanner.nextInt();

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter name");
            currentDepartment.setDepartmentName(inputScanner.next());
            System.out.println("Enter mission:");
            currentDepartment.setDepartmentMission(inputScanner.next());
            System.out.println("Enter vision:");
            currentDepartment.setDepartmentVision(inputScanner.next());

            dataListUniv.add(currentDepartment.getDepartmentName());
            dataListUniv.add(currentDepartment.getDepartmentMission());
            dataListUniv.add(currentDepartment.getDepartmentVision());

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
