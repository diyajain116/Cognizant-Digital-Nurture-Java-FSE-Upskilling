package com.greetings;

import com.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String message = "hello from the java module system!";
        String capitalizedMessage = StringUtils.capitalize(message);
        
        System.out.println(capitalizedMessage);
    }
}
