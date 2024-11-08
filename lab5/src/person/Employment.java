package person;

public class Employment {
    private String jobTitle;
    private String company;

    public Employment(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }
}
