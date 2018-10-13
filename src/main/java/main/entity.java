package main;

public class entity {
    String fund_account;
    String birthday;
    String age;
    public entity(String fund_account){
        this.fund_account = fund_account;
    }

    public void setFund_account(String fund_account) {
        this.fund_account = fund_account;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity{" +
                "fund_account='" + fund_account + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
