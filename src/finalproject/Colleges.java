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
public class Colleges {
    
    private String numberCollege;
    private String nameCollege;
    private String missionCollege;
    private String visionCollege;
    
    public Colleges (String a, String b, String c, String d)
    {
        this.numberCollege = a;
        this.nameCollege = b;
        this.missionCollege = c;
        this.visionCollege = d;
        
    }

    /**
     * @return the numberCollege
     */
    public String getNumberCollege() {
        return numberCollege;
    }

    /**
     * @param numberCollege the numberCollege to set
     */
    public void setNumberCollege(String numberCollege) {
        this.numberCollege = numberCollege;
    }

    /**
     * @return the nameCollege
     */
    public String getNameCollege() {
        return nameCollege;
    }

    /**
     * @param nameCollege the nameCollege to set
     */
    public void setNameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
    }

    /**
     * @return the missionCollege
     */
    public String getMissionCollege() {
        return missionCollege;
    }

    /**
     * @param missionCollege the missionCollege to set
     */
    public void setMissionCollege(String missionCollege) {
        this.missionCollege = missionCollege;
    }

    /**
     * @return the visionCollege
     */
    public String getVisionCollege() {
        return visionCollege;
    }

    /**
     * @param visionCollege the visionCollege to set
     */
    public void setVisionCollege(String visionCollege) {
        this.visionCollege = visionCollege;
    }
    
}
