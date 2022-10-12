package email.model;

public class EmailForm {
    private String subject;
    private String to;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "EmailForm{" +
                "subject='" + subject + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
