package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";

        Integer counter = 0;
        while (counter < personArray.length) {
        String firstName = personArray[counter].getFirstName();
        String lastName = personArray[counter].getLastName();
        result += "\nMy first name is "+firstName+"\n"+"My last name is "+lastName;
        counter++;
        }    // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int i = 0; i< personArray.length; i++){
            String firstName = personArray[i].getFirstName();
            String lastName = personArray[i].getLastName();
            result += "\nMy first name is "+firstName+"\n"+"My last name is "+lastName;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person x :personArray){
            String firstName = x.getFirstName();
            String lastName = x.getLastName();
            result += "\nMy first name is "+firstName+"\n"+"My last name is "+lastName;
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
