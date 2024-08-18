package Library.Member;

public class Members {
    private String name;
    private String memberId;

    public Members(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        return name;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println();
    }
}


