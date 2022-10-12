package email.model;

public class EmailForm {
    private String fio;
    private String contacts;

    public String getSubject() {
        return fio;
    }

    public void setSubject(String subject) {
        this.fio = subject;
    }

    public String getTo() {
        return contacts;
    }

    public void setTo(String to) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "EmailForm{" +
                "subject='" + fio + '\'' +
                ", to='" + contacts + '\'' +
                '}';
    }
}
