package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

    //Problems with Stub
    //1 Dynamic Condition
    //2 Difficult to maintain code when we require to test different conditions logic will increase



   public  List<String> retrieveTodos(String user)
   {

       return Arrays.asList("Learn Spring MVC","Learn Spring",
               "Learn to Dance");
   }

}
