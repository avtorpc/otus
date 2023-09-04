package ru.otus.example;


import static com.google.common.base.Strings.isNullOrEmpty;

public class OtusHello {

    private final String first_string;
    private final String second_string;

    public OtusHello ( String first_string, String second_string ) {
           this.first_string = first_string;
           this.second_string = second_string;
    }

    public void getHello(){
        if(isNullOrEmpty(this.first_string)) {
            System.out.println( "Хотя строки нет - все равно привет - " + this.second_string );
        } else {
            System.out.println( this.first_string + ' ' + this.second_string );
        }
    }
}
