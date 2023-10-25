package org.hbrs.se1.ws23.uebung2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContainerTest {

    Member m1 = new ConcreteMember(1);
    ConcreteMember m2 = new ConcreteMember(2);

    Container c = new Container();

    @BeforeEach
    void setUp() {
        c = new Container();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addMember() throws ContainerException {
        c.addMember(m1);
        assertEquals(c.findMember(1),1);
        assertEquals(c.size(),1);
        c.addMember(m2);
        assertEquals(c.findMember(2),1);
        assertEquals(c.size(),1);


    }

    @Test
    void deleteMember() throws ContainerException {
        c.addMember(m1);
        assertEquals(c.findMember(1),1);
        assertEquals(c.size(),1);
        c.addMember(m2);
        assertEquals(c.findMember(2),1);
        assertEquals(c.size(),2);
        c.deleteMember(1);
        assertEquals(c.findMember(1),0);
        assertEquals(c.findMember(2),1);
        assertEquals(c.size(),1);

    }

    @Test
    void dumb() throws ContainerException {
        c.addMember(m1);
        c.addMember(m2);
        c.dumb();
    }

    @Test
    void size() throws ContainerException {
        assertEquals(c.size(), 0);
        c.addMember(m1);
        assertEquals(c.size(),1);
        c.addMember(m2);
        assertEquals(c.size(),2);
        c.deleteMember(1);
        assertEquals(c.size(),1);


    }
}