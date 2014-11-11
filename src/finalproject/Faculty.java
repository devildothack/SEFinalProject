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
public class Faculty {
    
    private String nameFaculty;
    private String departmentFaculty;
    private String addressFaculty;
    private String phoneFaculty;
    private String emailFaculty;
    
    public Faculty (String a, String b, String c, String d, String e)
    {
        this.nameFaculty = a;
        this.departmentFaculty = b;
        this.addressFaculty = c;
        this.phoneFaculty = d;
        this.emailFaculty = e;
    }

    /**
     * @return the nameFaculty
     */
    public String getNameFaculty() {
        return nameFaculty;
    }

    /**
     * @param nameFaculty the nameFaculty to set
     */
    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    /**
     * @return the departmentFaculty
     */
    public String getDepartmentFaculty() {
        return departmentFaculty;
    }

    /**
     * @param departmentFaculty the departmentFaculty to set
     */
    public void setDepartmentFaculty(String departmentFaculty) {
        this.departmentFaculty = departmentFaculty;
    }

    /**
     * @return the addressFaculty
     */
    public String getAddressFaculty() {
        return addressFaculty;
    }

    /**
     * @param addressFaculty the addressFaculty to set
     */
    public void setAddressFaculty(String addressFaculty) {
        this.addressFaculty = addressFaculty;
    }

    /**
     * @return the phoneFaculty
     */
    public String getPhoneFaculty() {
        return phoneFaculty;
    }

    /**
     * @param phoneFaculty the phoneFaculty to set
     */
    public void setPhoneFaculty(String phoneFaculty) {
        this.phoneFaculty = phoneFaculty;
    }

    /**
     * @return the emailFaculty
     */
    public String getEmailFaculty() {
        return emailFaculty;
    }

    /**
     * @param emailFaculty the emailFaculty to set
     */
    public void setEmailFaculty(String emailFaculty) {
        this.emailFaculty = emailFaculty;
    }
    
    
    
}
