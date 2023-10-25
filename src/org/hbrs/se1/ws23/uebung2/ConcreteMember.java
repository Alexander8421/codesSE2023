package org.hbrs.se1.ws23.uebung2;

public class ConcreteMember implements Member{

    Integer ID;
    public ConcreteMember(Integer pID) {
        ID = pID;

    }

    @Override
    public Integer getID() {
        return ID;
    }

    public String toString(){
        return "Member (ID = "+ID+")";
    }
}
