package com.kobe.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String pin;

    /**
     * 
     */
    private String parentPin;

    /**
     * 
     */
    private Byte level;

    /**
     * user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return pin 
     */
    public String getPin() {
        return pin;
    }

    /**
     * 
     * @param pin 
     */
    public void setPin(String pin) {
        this.pin = pin == null ? null : pin.trim();
    }

    /**
     * 
     * @return parent_pin 
     */
    public String getParentPin() {
        return parentPin;
    }

    /**
     * 
     * @param parentPin 
     */
    public void setParentPin(String parentPin) {
        this.parentPin = parentPin == null ? null : parentPin.trim();
    }

    /**
     * 
     * @return level 
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 
     * @param level 
     */
    public void setLevel(Byte level) {
        this.level = level;
    }
}