package email.model;

public class EmailForm {
    private String fio;
    private String contacts;
    private String number;
    private String criteria;
    private String col;
    private String date1;
    private String date2;


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return "EmailForm{" +
                "subject='" + fio + '\'' +
                ", to='" + contacts + '\'' +
                "number='" + number + '\'' +
                "criteria='" + criteria + '\'' +
                "col='" + col + '\'' +
                "date1='" + date1 + '\'' +
                "date2='" + date2 + '\'' +
                '}';
    }
}
