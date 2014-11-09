/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author jesus
 */
public class Student {
    
    private String nameStudent;
    private String gpaStudent;
    private String genderStudent;
    private String raceStudent;
    
    public Student (String a, String b, String c, String d)
    {
        this.nameStudent = a;
        this.gpaStudent = b;
        this.genderStudent = c;
        this.raceStudent = d;
        
    }

    /**
     * @return the nameStudent
     */
    public String getNameStudent() {
        return nameStudent;
    }

    /**
     * @param nameStudent the nameStudent to set
     */
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    /**
     * @return the gpaStudent
     */
    public String getGpaStudent() {
        return gpaStudent;
    }

    /**
     * @param gpaStudent the gpaStudent to set
     */
    public void setGpaStudent(String gpaStudent) {
        this.gpaStudent = gpaStudent;
    }

    /**
     * @return the genderStudent
     */
    public String getGenderStudent() {
        return genderStudent;
    }

    /**
     * @param genderStudent the genderStudent to set
     */
    public void setGenderStudent(String genderStudent) {
        this.genderStudent = genderStudent;
    }

    /**
     * @return the raceStudent
     */
    public String getRaceStudent() {
        return raceStudent;
    }

    /**
     * @param raceStudent the raceStudent to set
     */
    public void setRaceStudent(String raceStudent) {
        this.raceStudent = raceStudent;
    }
    
    
    
}
