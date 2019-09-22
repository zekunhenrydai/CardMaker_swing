package org.wpi.cardmaker.Controller;

import org.wpi.cardmaker.Model.Card;

import javax.swing.*;

public class CreatingCardController {
    Card card;
    public SerializationController serializationController;

    public CreatingCardController(){
        serializationController = new SerializationController();
    }


    public void setProperties(Card card, String name, String eventType, String recipient, String orientation){
        card.setName(name);
        card.setRecipient(recipient);
        card.setEventType(eventType);
        card.setOrientation(orientation);
        System.out.println(card.getName()+card.getRecipient()+card.getOrientation()+card.getEventType());
        serializationController.ObjectWriter(card);
    }

    public void setOrientation(Card card, JPanel panel){
        String orientation = card.getOrientation();
        if(orientation == null){
            panel.setSize(900,600);
        }
        if(orientation == "default"){
            panel.setSize(900,600);
        }
        if(orientation == "landscape"){
            panel.setSize(900,600);
        }
        if(orientation == "portrait"){
            panel.setSize(600,900);
        }
    }

    public void setWindowName(Card card, JFrame frame){
        String name = card.getName();
        String eventType = card.getEventType();
        String recipient = card.getRecipient();
        frame.setName(name+"-"+"A card for "+recipient+"'s "+eventType);
    }
}
