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
public class Program {
    
    private String nameProgram;
    private String degreesProgram;
    private String labsProgram;
    private String equipmentProgram;
    
    public Program(String a, String b, String c, String d)
    {
       this.nameProgram = a;
       this.degreesProgram = b;
       this.labsProgram = c;
       this.equipmentProgram = d;
        
    }

    /**
     * @return the nameProgram
     */
    public String getNameProgram() {
        return nameProgram;
    }

    /**
     * @param nameProgram the nameProgram to set
     */
    public void setNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
    }

    /**
     * @return the degreesProgram
     */
    public String getDegreesProgram() {
        return degreesProgram;
    }

    /**
     * @param degreesProgram the degreesProgram to set
     */
    public void setDegreesProgram(String degreesProgram) {
        this.degreesProgram = degreesProgram;
    }

    /**
     * @return the labsProgram
     */
    public String getLabsProgram() {
        return labsProgram;
    }

    /**
     * @param labsProgram the labsProgram to set
     */
    public void setLabsProgram(String labsProgram) {
        this.labsProgram = labsProgram;
    }

    /**
     * @return the equipmentProgram
     */
    public String getEquipmentProgram() {
        return equipmentProgram;
    }

    /**
     * @param equipmentProgram the equipmentProgram to set
     */
    public void setEquipmentProgram(String equipmentProgram) {
        this.equipmentProgram = equipmentProgram;
    }
    
    
    
}
