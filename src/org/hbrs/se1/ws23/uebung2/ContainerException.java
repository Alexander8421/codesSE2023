package org.hbrs.se1.ws23.uebung2;

public class ContainerException extends Exception{


    public ContainerException(String message) {
        super(message);
    }

    public ContainerException() {
        super("Das Member-Objekt mit der ID [hier die ID des Objekts] ist bereits vorhanden!");
    }
}
