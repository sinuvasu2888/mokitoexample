package com.in28minutes.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListsSizeMethod ()
    {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());

    }

    @Test
    public void letsMockListSize_ReturnMultipleValues()
    {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    public void letsMockListGet( )
    {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("in28Minutes");

        assertEquals("in28Minutes",listMock.get(0));
        assertEquals(null,listMock.get(1));



    }

    @Test(expected=RuntimeException.class)
    public void letsMocklist_throwAnException()
    {
        List listMock = mock(List.class);

        //Argument Matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));

        listMock.get(0);



    }



 }
