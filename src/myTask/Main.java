package myTask;

public class Main {

    public static void main(String[] args) {

        {


            Contact contact = new Contact("William the Conqueror");

            ContactInfo tel1 = contact.addPhoneNumber(33, "276-1066-555");
            ContactInfo tel2 = contact.addPhoneNumber(44, "20-1066-5555");
            ContactInfo tel3 = contact.addPhoneNumber(33, "55-1066-5555");



            ContactInfo[] info = contact.getInfo();

            System.out.println(info[0].toString());//"Name: William the Conqueror"
            System.out.println(info[1].toString());//"Tel: +33 276-1066-555"

            System.out.println(info.length);//2

        }

        {

            Contact contact = new Contact("William the Conqueror");

            Contact.Email email1 = contact.addEmail("william", "normandy.fr");
            Contact.Email email2 = contact.addEmail("william", "england.travel");
            Contact.Email email3 = contact.addEmail("william", "gmail.com");
            Contact.Email email4 = contact.addEmail("william", "epam.com");


            ContactInfo[] info = contact.getInfo();

            System.out.println(info[0].toString());//"Name: William the Conqueror"

            System.out.println(info[1].toString());//"Email: william@normandy.fr"
            System.out.println(info[2].toString());//"Email: william@england.travel"
            System.out.println(info[3].toString());//"Email: william@gmail.com"

            System.out.println(info.length);//4
        }

        }

    }


