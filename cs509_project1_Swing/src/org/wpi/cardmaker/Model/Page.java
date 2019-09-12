package org.wpi.cardmaker.Model;

import java.awt.*;

public class Page {
    public String text;
    public String name;
    public java.awt.Image image;
    public String textType;
    public String textSize;

    public Page() {
    }

    public Page(String text, String name, Image image, String textType) {
        this.text = text;
        this.name = name;
        this.image = image;
        this.textType = textType;
    }


    public String getTextType() {
        return textType;
    }

    public void setTextType(String textType) {
        this.textType = textType;
    }

    public String getTextSize() {
        return textSize;
    }

    public void setTextSize(String textSize) {
        this.textSize = textSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Page(String name){
        this.name = name;
    }


}