import java.util.ArrayList;

public class MailInfo {
    private Client client;
    private int mailCode;
    private ArrayList<ExampleMail> mailReason = new  ArrayList<ExampleMail>();


    {
        mailReason.add(new ExampleMail("Dear ", true, " Happpy B-day!!!"));
        mailReason.add(new ExampleMail("GJC", false, " Happy Holidays."));

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

    public ExampleMail getHeader() throws Exception{
        if(getMailCode() < mailReason.size())
            return mailReason.get(getMailCode());
        throw new NullPointerException();
    }
}
