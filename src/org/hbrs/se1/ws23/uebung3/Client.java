package org.hbrs.se1.ws23.uebung3;



public class Client {
    ConcreteMember[] m = new ConcreteMember[10];
    Container c = new Container();
    java.util.ArrayList<Member> l =  new java.util.ArrayList<Member>();

    public Client() throws Exception {
    }


    public void main() throws ContainerException {
        for(int i=0; i<10;i++){
            m[i]=new ConcreteMember(i);
            c.addMember(m[i]);
            l = c.getCurrentList();
            MemberView.dumb(l);


        }

    }
}

