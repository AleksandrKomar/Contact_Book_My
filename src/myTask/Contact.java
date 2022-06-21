package myTask;

public class Contact implements ContactInfo {

    private String telNumber;
    private String contactName;

    private int eMailNumber;
    private int sosialNumber;
    private int telCount;
    private Email[] mymail;

    private Social[] mysosial;

    private NameContactInfo[] myTel;

    public Contact(String contactName) {
        this.contactName = contactName;
        this.eMailNumber = 0;
        this.mymail = new Email[3];

        this.telCount = 0;
        this.myTel = new NameContactInfo[1];

        this.sosialNumber = 0;
        this.mysosial = new Social[5];

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

        if (geteMailNumber() >= 3) {
            return null;
        }


        Email contactInfo = new Email() {


            private String email = firstname + "_" + lastname + "@epam.com";

            public String getEmail() {
                return email;
            }

            @Override
            public String getTitle() {
                return "Epam Email";
            }

            @Override
            public String getValue() {
                return this.getEmail();
            }

        };

        mymail[geteMailNumber()] =  contactInfo;

        seteMailNumber();
        return contactInfo;

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

        NameContactInfo t = new NameContactInfo(code, number);
        myTel[getTelCount()] = t;

        setTelCount();
        return t;
    }

    public Social addTwitter(String twitterId) {

        if (twitterId == null)
            return null;

        if (getSosialNumber() >= 5) {
            return null;
        }

        Social sTw = new Social("Twitter", twitterId);
        mysosial[getSosialNumber()] = sTw;

        setSosialNumber();
        return sTw;

    }

    public int getSosialNumber() {
        return sosialNumber;
    }

    public void setSosialNumber() {
        this.sosialNumber++;
    }

    public Social addInstagram(String instagramId) {
        if (instagramId == null)
            return null;

        if (getSosialNumber() >= 5) {
            return null;
        }

        Social sTw = new Social("Instagram", instagramId);
        mysosial[getSosialNumber()] = sTw;

        setSosialNumber();
        return sTw;
    }

    public Social addSocialMedia(String title, String id) {
        if (id == null)
            return null;

        if (getSosialNumber() >= 5) {
            return null;
        }

        Social sTw = new Social(title, id);
        mysosial[getSosialNumber()] = sTw;

        setSosialNumber();
        return sTw;
    }

    public ContactInfo[] getInfo() {
        //Implement this method
        int count = 0;

        int sizeArray = 1;
        for (int i = 0; i < myTel.length; i++) {
            if (myTel[i] == null) {
                continue;
            }
            sizeArray++;
        }

        for (int i = 0; i < mymail.length; i++) {
            if (mymail[i] == null) {
                continue;
            }
            sizeArray++;
        }

        for (int i = 0; i < mysosial.length; i++) {
            if (mysosial[i] == null) {
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
        for (int i = 0; i < mysosial.length; i++) {

            if (mysosial[i] == null) {
                continue;
            }

            count++;
            infos[count] = mysosial[i];

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

    public static class Social implements ContactInfo {


        private String title;
        private String sosialName;


        private String instagramId;

        public Social(String titl, String mName) {
            this.title = titl;
            this.sosialName = mName;
        }

        public String addInstagram(String instagramId) {
//            setInstagramId(String instagramId);
            return instagramId;
        }

        public String getSosialName() {
            return sosialName;
        }

        public void setInstagramId(String instagramId) {
            this.instagramId = instagramId;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return this.getSosialName();
        }
    }

    public static class Email implements ContactInfo {

        private String email;

        public Email(String email, String domain) {
            this.email = email + "@" + domain;
        }

        public Email() {

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


    private class NameContactInfo implements ContactInfo {

        public NameContactInfo(int code, String number) {
            Contact.this.telNumber = "+" + code + " " + number;
            setTitle();
        }

        public void setTitle() {
        }

        public String getTel() {
            return Contact.this.telNumber;
        }


        @Override
        public String getTitle() {
            return "Tel";
        }

        @Override
        public String getValue() {
            return this.getTel();
        }
    }


}
