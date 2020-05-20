package vn.edu.ntu.doanquocnhan_59131665_recycleview;

public class product {
    private  String Name, Date, Phone;
    public product(String name, String date, String phone) {
        Name = name;
        Date = date;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
