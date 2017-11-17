import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<MailInfo>();
    private MailSender ms = new MailSender();
    private boolean b = true, check = true;

    public void addMailInfo(MailInfo mi){
        infos.add(mi);
    }

    public boolean sendAll(){
        try{
        for(MailInfo el: infos){
            b = ms.sendMail(el);
            if(!b) {
                check = false;
                break;
            }

        }
        if(check)
            return true;
        }
        catch (Error e){

        }
        System.out.println("Your mailinfos aren't ok.\n");
        return false;


    }
}
