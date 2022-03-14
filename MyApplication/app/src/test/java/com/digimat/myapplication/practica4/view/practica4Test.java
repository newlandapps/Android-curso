package com.digimat.myapplication.practica4.view;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class practica4Test extends TestCase {
    @Test
    void notnullmenuView()
    {
        practica4 notnutsetvaiew= new practica4();
        assertEquals( 4,notnutsetvaiew.testsuma(2,2));
    }
}