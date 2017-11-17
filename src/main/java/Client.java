public class Client {
    private String name;
    private int age;
    private boolean woman;
    private boolean haveChildren;
    private String info;

    public boolean isHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(boolean haveChildren) {
        this.haveChildren = haveChildren;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Client(String name, int age, boolean is_woman, boolean have_ch, String info){
        setName(name);
        setInfo(info);
        setAge(age);
        setWoman(is_woman);
        setHaveChildren(have_ch);
    }


}
