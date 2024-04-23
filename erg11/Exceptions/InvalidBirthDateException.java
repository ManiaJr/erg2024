package erg11.Exceptions;

public class InvalidBirthDateException extends Exception {

    public InvalidBirthDateException(){
    }

    public InvalidBirthDateException(String s){
        super(s);
    }
}
