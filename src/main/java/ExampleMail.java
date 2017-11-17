public class ExampleMail {

    private String header, body;

    public boolean isWith_name() {
        return with_name;
    }

    public void setWith_name(boolean with_name) {
        this.with_name = with_name;
    }

    private boolean with_name;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ExampleMail(String header, boolean with_name, String body){
        setBody(body);
        setWith_name(with_name);
        setHeader(header);
    }
}
