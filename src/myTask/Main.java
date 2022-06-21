package myTask;

public class Main {

    public static void main(String[] args) {


//        {
//            Contact contact = new Contact("William the Legitimate Heir");
//            ContactInfo nameInfo = contact.getInfo()[0];
//
//            System.out.println(toString(nameInfo));//"Name: William the Legitimate Heir"
//
//            contact.rename(null);
//            System.out.println(toString(nameInfo));//"Name: William the Legitimate Heir"
//
//            contact.rename("");
//            System.out.println(toString(nameInfo));//"Name: William the Legitimate Heir"
//
//            contact.rename("William the Conqueror");
//            System.out.println(toString(nameInfo));//"Name: William the Conqueror"
//
//            System.out.println(contact.getInfo().length);//1
//        }
////
////
////
//        {
//
//            Contact contact = new Contact("William the Conqueror");
//
//            Contact.Email email1 = contact.addEmail("william", "normandy.fr");
//            Contact.Email email2 = contact.addEmail("william", "england.travel");
//            Contact.Email email3 = contact.addEmail("william", "gmail.com");
//            Contact.Email email4 = contact.addEmail("william", "epam.com");
//
//
//            ContactInfo[] info = contact.getInfo();
//
//            System.out.println(toString(info[0]));//"Name: William the Conqueror"
//
//            System.out.println(toString(info[1]));//"Email: william@normandy.fr"
//            System.out.println(toString(info[2]));//"Email: william@england.travel"
//            System.out.println(toString(info[3]));//"Email: william@gmail.com"
//
//            System.out.println(info.length);//4
//        }
//
//        {
//
//
//            Contact contact = new Contact("William the Conqueror");
//
//            ContactInfo tel1 = contact.addPhoneNumber(33, "276-1066-555");
//            ContactInfo tel2 = contact.addPhoneNumber(44, "20-1066-5555");
//            ContactInfo tel3 = contact.addPhoneNumber(33, "55-1066-5555");
//
//
//            ContactInfo[] info = contact.getInfo();
//
//            System.out.println(toString(info[0]));//"Name: William the Conqueror"
//            System.out.println(toString(info[1]));//"Tel: +33 276-1066-555"
//
//            System.out.println(info.length);//2
//        }

//        {
//            Contact contact = new Contact("William the Conqueror");
//
//            Contact.Social social1 = contact.addTwitter("@william1066");
//            Contact.Social social2 = contact.addInstagram("@bayeux_tapestry");
//            Contact.Social social3 = contact.addSocialMedia("Facebook", "la_manche_tours");
//            Contact.Social social4 = contact.addSocialMedia("Facebook", "doomsday_book");
//            Contact.Social social5 = contact.addSocialMedia("Reddit", "r/cavalry_aesthetics");
//            Contact.Social social6 = contact.addSocialMedia("Facebook", "british cuisine");
//            Contact.Social social7 = contact.addSocialMedia("Facebook", "la_manche_tours");
//            Contact.Social social8 = contact.addTwitter("@william1028");
//            Contact.Social social9 = contact.addInstagram("@penny_coins_art");
//
////            assertNotNull(social1);
////            assertNotNull(social2);
////            assertNotNull(social3);
////            assertNotNull(social4);
////            assertNotNull(social5);
////            assertNull(social6);
////            assertNull(social7);
////            assertNull(social8);
////            assertNull(social9);
//
//            ContactInfo[] info = contact.getInfo();
//
//            System.out.println(toString(info[0]));//Name: William the Conqueror
//            System.out.println(toString(info[1]));//Twitter: @william1066
//            System.out.println(toString(info[2]));//Instagram: @bayeux_tapestry
//            System.out.println(toString(info[3]));//Facebook: la_manche_tours
//            System.out.println(toString(info[4]));//Facebook: doomsday_book
//            System.out.println(toString(info[5]));//Reddit: r/cavalry_aesthetics
//
//            System.out.println(contact.getInfo().length);//6
//        }

        {

            Contact contact = new Contact("William the Conqueror");

            contact.addEmail("william", "normandy.fr");
            contact.addEmail("william", "england.travel");

            contact.addEpamEmail("william", "conqueror");

            ContactInfo[] info = contact.getInfo();

            System.out.println(toString(info[0]));//Name: William the Conqueror

            System.out.println(toString(info[1]));//Email: william@normandy.fr
            System.out.println(toString(info[2]));//Email: william@england.travel
            System.out.println(toString(info[3]));//Epam Email: william_conqueror@epam.com

            System.out.println(info.length);//4;
        }

    }


    static String toString(ContactInfo info) {
        return info.getTitle() + ": " + info.getValue();
    }

}


