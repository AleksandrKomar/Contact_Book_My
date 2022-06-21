package myTask;

public class Main {

    public static void main(String[] args) {




        {

            Contact contact = new Contact("William the Conqueror");

            Contact.Email email1 = contact.addEmail("william", "normandy.fr");
            Contact.Email email2 = contact.addEmail("william", "england.travel");
            Contact.Email email3 = contact.addEmail("william", "gmail.com");
            Contact.Email email4 = contact.addEmail("william", "epam.com");


            ContactInfo[] info = contact.getInfo();

            System.out.println(toString(info[0]));//"Name: William the Conqueror"

            System.out.println(toString(info[1]));//"Email: william@normandy.fr"
            System.out.println(toString(info[2]));//"Email: william@england.travel"
            System.out.println(toString(info[3]));//"Email: william@gmail.com"

            System.out.println(info.length);//4
        }

        {


            Contact contact = new Contact("William the Conqueror");

            ContactInfo tel1 = contact.addPhoneNumber(33, "276-1066-555");
            ContactInfo tel2 = contact.addPhoneNumber(44, "20-1066-5555");
            ContactInfo tel3 = contact.addPhoneNumber(33, "55-1066-5555");


            ContactInfo[] info = contact.getInfo();

            System.out.println(toString(info[0]));//"Name: William the Conqueror"
            System.out.println(toString(info[1]));//"Tel: +33 276-1066-555"

            System.out.println(info.length);//2
        }
    }


    static String toString(ContactInfo info) {
        return info.getTitle() + ": " + info.getValue();
    }

}


