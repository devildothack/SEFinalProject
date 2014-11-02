/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;

/**
 *
 * @author jesus
 */
public class University {
    
    private String nameUniv;
    private String missionUniv;
    private String visionUniv;
    private Image logo;
    
    public University(String a, String b, String c, Image e)
    {
        this.nameUniv = a;
        this.missionUniv = b;
        this.visionUniv = c;
        this.logo = e;
        
    }

    /**
     * @return the nameUniv
     */
    public String getNameUniv() {
        return nameUniv;
    }

    /**
     * @param nameUniv the nameUniv to set
     */
    public void setNameUniv(String nameUniv) {
        this.nameUniv = nameUniv;
    }

    /**
     * @return the missionUniv
     */
    public String getMissionUniv() {
        return missionUniv;
    }

    /**
     * @param missionUniv the missionUniv to set
     */
    public void setMissionUniv(String missionUniv) {
        this.missionUniv = missionUniv;
    }

    /**
     * @return the visionUniv
     */
    public String getVisionUniv() {
        return visionUniv;
    }

    /**
     * @param visionUniv the visionUniv to set
     */
    public void setVisionUniv(String visionUniv) {
        this.visionUniv = visionUniv;
    }

    /**
     * @return the logo
     */
    public Image getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(Image logo) {
        this.logo = logo;
    }
    
}
