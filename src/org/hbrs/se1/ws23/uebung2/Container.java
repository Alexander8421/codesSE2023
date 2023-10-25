package org.hbrs.se1.ws23.uebung2;

public class Container {


    java.util.ArrayList theContainer = new java.util.ArrayList<Member>();

    public void addMember(Member member) throws ContainerException{
        for(int i=0; i<theContainer.size();i++){
            Member current=(Member) theContainer.get(i);
            if (current.getID() == member.getID()){throw new ContainerException(("Das Member-Objekt mit der ID "+member.getID()+" ist bereits vorhanden!"));}
        }
        theContainer.add(member);

    }
    public String deleteMember(Integer id){
        //If
        int i;
        for(i=0; i<theContainer.size();i++){
            Member current = (Member)theContainer.get(i);
            if (current.getID() == id){break;}
        }

        theContainer.remove(theContainer.get(i));
        return "Member mit ID "+id+" nicht gefunden";
    }
    public void dumb(){
        for (int i=0; i<theContainer.size(); i++){System.out.println(theContainer.get(i).toString());}

    }

    public int size(){
        return theContainer.size();
    }

    public int findMember(int id){
        for(i=0; i<theContainer.size();i++) {
            Member current = (Member) theContainer.get(i);
            if (current.getID() == id) {
                return 1;
            }
        }
        return 0;
    }
}
