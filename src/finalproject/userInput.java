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
        entries = Integer.valueOf(inputScanner.nextLine());

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter course prefix:");
            currentCourse.setPrefixCourse(inputScanner.nextLine());
            System.out.println("enter course number");
            currentCourse.setNumberCourse(inputScanner.nextLine());
            System.out.println("enter course name");
            currentCourse.setNameCourse(inputScanner.nextLine());
            System.out.println("enter course hour");
            currentCourse.setHourCourse(inputScanner.nextLine());
            System.out.println("enter course description");
            currentCourse.setDescriptionCourse(inputScanner.nextLine());
            System.out.println("Enter course prerequi");
            currentCourse.setPrerequisitesCourse(inputScanner.nextLine());

            dataListCourses.add(currentCourse.getPrefixCourse());
            dataListCourses.add(currentCourse.getNumberCourse());
            dataListCourses.add(currentCourse.getNameCourse());
            dataListCourses.add(currentCourse.getHourCourse());
            dataListCourses.add(currentCourse.getDescriptionCourse());
            dataListCourses.add(currentCourse.getPrerequisitesCourse());
        }

        System.out.println("------------------OUTPUT BELOW-----------------");
        for (Object dataListCourse : dataListCourses) {
            System.out.println(dataListCourse.toString());
        }

        System.out.println("Enter the number of Departments");
        entries = Integer.valueOf(inputScanner.nextLine());

        for (int i = 0; i < entries; i++) {

            System.out.println("Enter name");
            currentDepartment.setDepartmentName(inputScanner.nextLine());
            System.out.println("Enter mission:");
            currentDepartment.setDepartmentMission(inputScanner.nextLine());
            System.out.println("Enter vision:");
            currentDepartment.setDepartmentVision(inputScanner.nextLine());

            dataListUniv.add(currentDepartment.getDepartmentName());
            dataListUniv.add(currentDepartment.getDepartmentMission());
            dataListUniv.add(currentDepartment.getDepartmentVision());

        }

        for (Object dataListUniv1 : dataListUniv) {
            System.out.println(dataListUniv1.toString());
        }

        System.out.println("Enter the number of colleges to be entered:");
        entries = Integer.valueOf(inputScanner.nextLine());

        for (int i = 0; i < entries; i++) {

            System.out.println("college number:");
            currentCollege.setNumberCollege(inputScanner.nextLine());
            System.out.println("college name");
            currentCollege.setNameCollege(inputScanner.nextLine());
            System.out.println("college mission");
            currentCollege.setMissionCollege(inputScanner.nextLine());
            System.out.println("college vision");
            currentCollege.setVisionCollege(inputScanner.nextLine());

            dataListCollege.add(currentCollege.getNumberCollege());
            dataListCollege.add(currentCollege.getNameCollege());
            dataListCollege.add(currentCollege.getMissionCollege());
            dataListCollege.add(currentCollege.getVisionCollege());

        }

        for (Object dataListCollege1 : dataListCollege) {
            System.out.println(dataListCollege1.toString());
        }

    }
    
}
