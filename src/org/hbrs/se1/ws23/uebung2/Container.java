package org.hbrs.se1.ws23.uebung2;
import javax.swing.*;
import java.util;
import java.util.ArrayList;

public class Container {


    java.util.ArrayList theContainer = new java.util.ArrayList<Member>();

    public void addMember(Member member) throws ContainerException{
        for(i=0; i<theContainer.size();i++){
            if (theContainer[i].getID() = member.getID()){throw new ContainerException(("Das Member-Objekt mit der ID "+member.getID()+" ist bereits vorhanden!"));}
        }
        theContainer.add(member);

    }
    public String deleteMember(Integer id){
        //If
        for(i=0; i<theContainer.size();i++){
            if (theContainer[i].getID() = id){break;}
        }

        theContainer.remove(theContainer[i]);
        return "Member mit ID "+id+" nicht gefunden";
    }
    public void dumb(){
        for (i=0; i<theContainer.size(); i++){}
        System.out.println(theContainer[i].toArray());
    }

    public int size(){
        return theContainer.size();
    }
}
