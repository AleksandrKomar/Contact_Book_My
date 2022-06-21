package myTask;

import java.util.ArrayList;

public class Contact implements ContactInfo {


    private String contactName;

    private int eMailNumber;
    private int telCount;
    private Email[] mymail;

    private Tel[] myTel;

    public Contact(String contactName) {
        this.contactName = contactName;
        this.eMailNumber = 0;
        this.mymail = new Email[3];

        this.telCount = 0;
        this.myTel = new Tel[1];

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


    public void setTelCount() {
        this.telCount++;
    }

    public int getTelCount() {
        return telCount;
    }

    public ContactInfo addPhoneNumber(int code, String number) {

        if (getTelCount() >= 1) {
            return null;
        }

        Tel t = new Tel(code, number);
        myTel[getTelCount()] = t;

        setTelCount();
        return t;


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

        int count = 0;

        int sizeArray = 1;

        for (int i = 0; i < mymail.length; i++) {
            if (mymail[i] == null) {
                continue;
            }
            sizeArray++;
        }

        for (int i = 0; i < myTel.length; i++) {
            if (myTel[i] == null) {
                continue;
            }
            sizeArray++;
        }

        ContactInfo[] infos = new ContactInfo[sizeArray];

        infos[count] = this;

        for (int i = 0; i < mymail.length; i++) {

            if (mymail[i] == null) {
                continue;
            }

            count++;
            infos[count] = mymail[i];

        }

        for (int i = 0; i < myTel.length; i++) {

            if (myTel[i] == null) {
                continue;
            }

            count++;
            infos[count] = myTel[i];

        }

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

    public class Social implements ContactInfo {

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

    public class Email implements ContactInfo {

        private String email;

        private String title;

        public Email(String email, String domain) {
            this.email = email + "@" + domain;
            setTitle();
        }

        public void setTitle() {
            this.title = "Email";
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return this.getEmail();
        }
    }

    public class Tel implements ContactInfo {

        private String tel;

        private String title;

        public Tel(int code, String number) {
            this.tel = "+" + code + " " + number;
        }

        public void setTitle() {
            this.title = "Tel";
        }

        public String getTel() {
            return tel;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return this.getTel();
        }
    }

    private class NameContactInfo implements ContactInfo {


        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public String getValue() {
            return null;
        }
    }


}
