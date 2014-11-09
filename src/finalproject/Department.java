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
public class Department {
    
    private String DepartmentNum;
    private String DepartmentName;
    private String DepartmentVision;
    private String DepartmentMission;
    
    public Department(String a, String b, String c, String d)
    {
        this.DepartmentNum = a;
        this.DepartmentName = b;
        this.DepartmentVision = c;
        this.DepartmentMission= d;
        
    }

    /**
     * @return the DepartmentNum
     */
    public String getDepartmentNum() {
        return DepartmentNum;
    }

    /**
     * @param DepartmentNum the DepartmentNum to set
     */
    public void setDepartmentNum(String DepartmentNum) {
        this.DepartmentNum = DepartmentNum;
    }

    /**
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return DepartmentName;
    }

    /**
     * @param DepartmentName the DepartmentName to set
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    /**
     * @return the DepartmentVision
     */
    public String getDepartmentVision() {
        return DepartmentVision;
    }

    /**
     * @param DepartmentVision the DepartmentVision to set
     */
    public void setDepartmentVision(String DepartmentVision) {
        this.DepartmentVision = DepartmentVision;
    }

    /**
     * @return the DepartmentMission
     */
    public String getDepartmentMission() {
        return DepartmentMission;
    }

    /**
     * @param DepartmentMission the DepartmentMission to set
     */
    public void setDepartmentMission(String DepartmentMission) {
        this.DepartmentMission = DepartmentMission;
    }
    
    
    
}