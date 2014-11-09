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
public class Courses {
    
    private String prefixCourse;
    private String numberCourse;
    private String nameCourse;
    private String hourCourse;
    private String descriptionCourse;
    private String prerequisitesCourse;
    
    
    public Courses(String a, String b, String c, String d, String e, String f)
    {
        this.prefixCourse = a;
        this.numberCourse = b;
        this.nameCourse = c;
        this.hourCourse = d;
        this.descriptionCourse = e;
        this.prerequisitesCourse = f;
        
    }

    /**
     * @return the prefixCourse
     */
    public String getPrefixCourse() {
        return prefixCourse;
    }

    /**
     * @param prefixCourse the prefixCourse to set
     */
    public void setPrefixCourse(String prefixCourse) {
        this.prefixCourse = prefixCourse;
    }

    /**
     * @return the numberCourse
     */
    public String getNumberCourse() {
        return numberCourse;
    }

    /**
     * @param numberCourse the numberCourse to set
     */
    public void setNumberCourse(String numberCourse) {
        this.numberCourse = numberCourse;
    }

    /**
     * @return the nameCourse
     */
    public String getNameCourse() {
        return nameCourse;
    }

    /**
     * @param nameCourse the nameCourse to set
     */
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /**
     * @return the hourCourse
     */
    public String getHourCourse() {
        return hourCourse;
    }

    /**
     * @param hourCourse the hourCourse to set
     */
    public void setHourCourse(String hourCourse) {
        this.hourCourse = hourCourse;
    }

    /**
     * @return the descriptionCourse
     */
    public String getDescriptionCourse() {
        return descriptionCourse;
    }

    /**
     * @param descriptionCourse the descriptionCourse to set
     */
    public void setDescriptionCourse(String descriptionCourse) {
        this.descriptionCourse = descriptionCourse;
    }

    /**
     * @return the prerequisitesCourse
     */
    public String getPrerequisitesCourse() {
        return prerequisitesCourse;
    }

    /**
     * @param prerequisitesCourse the prerequisitesCourse to set
     */
    public void setPrerequisitesCourse(String prerequisitesCourse) {
        this.prerequisitesCourse = prerequisitesCourse;
    }
    
    
    
}
