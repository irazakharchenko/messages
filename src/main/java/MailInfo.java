import java.util.ArrayList;

public class MailInfo {
    private Client client;
    private int mailCode;
    private ArrayList<String> mailReason = new ArrayList<String>();

    {
        mailReason.add(" Happy Birthday!");
        mailReason.add(" Happy Universary!");
        mailReason.add(" Welcome to Lviv!");
        mailReason.add(" Business");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMailCode() {
        return mailCode;
    }

    public void setMailCode(int mailCode) {
        this.mailCode = mailCode;
    }


    public MailInfo(Client cl, int n){
        setClient(cl);
        setMailCode(n);

    }

    public String getHeader(){
        if(getMailCode() < mailReason.size())
            return mailReason.get(getMailCode());
        return null;
    }
}
