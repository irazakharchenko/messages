public class MailSender {
    private String  message;
    public boolean sendMail(MailInfo mi){
        try{

            message += "Dear";
            if(mi.getClient().isWoman()){
                message += " Ms";
            }
            else{
                message += " Mr";
            }
            message += mi.getClient().getName() + " \n";
            if(mi.getHeader() != null)
                message += mi.getHeader() + "\n";
            else {
                System.out.println("Don't have such message.\n");
                return false;
            }
            System.out.println(message);
            return true;
        }
        catch (Error e){
            System.out.println("Something went wrong.\n");
            return false;
        }

    }
}
