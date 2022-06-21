package myTask;

public class Contact implements ContactInfo{


    private String contactName;

    private int eMailNumber;
    private Email[] mymail;

    public Contact(String contactName) {
        this.contactName = contactName;
        this.eMailNumber = 0;
        this.mymail = new Email[3];
    }

    public void rename(String newName) {

        if (newName == null || newName.trim().length() == 0)
            return;


        setContactName(newName);
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void seteMailNumber() {
        this.eMailNumber++;
    }

    public int geteMailNumber() {
        return eMailNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public Email addEmail(String localPart, String domain) {

        if (geteMailNumber() >= 3) {
            return null;
        }


        Email m = new Email(localPart, domain);

        mymail[geteMailNumber()] = m;

        seteMailNumber();
        return m;
    }


    public Email addEpamEmail(String firstname, String lastname) {
        return null;
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        return null;
    }

    public Social addTwitter(String twitterId) {
        return null;
    }

    public Social addInstagram(String instagramId) {
        //Implement this method
        return null;
    }

    public Social addSocialMedia(String title, String id) {
        return null;
    }

    public ContactInfo[] getInfo() {
        //Implement this method
        ContactInfo[] infos = new ContactInfo[4];

        infos[0] = this; // new ContactInfo();
        infos[1] = (ContactInfo) mymail[0];
        infos[2] = (ContactInfo) mymail[1];
        infos[3] = (ContactInfo) mymail[2];



        return infos;
    }

    @Override
    public String getTitle() {

        return "Name";
    }

    @Override
    public String getValue() {
        return this.getContactName();
    }

    public class Social implements ContactInfo{

        private String instagramId;

        public String addInstagram(String instagramId) {
//            setInstagramId(String instagramId);
            return instagramId;
        }

        public void setInstagramId(String instagramId) {
            this.instagramId = instagramId;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public String getValue() {
            return null;
        }
    }

    public class Email implements ContactInfo{

        private String email;

        public Email(String email, String domain) {
            this.email = email + "@" + domain;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return this.getEmail();
        }
    }

}
