package Question1;

public class LibraryManagement implements Comparable<LibraryManagement> {

    private String memberId;
    private String memberName;
    private String memberShipEndDate;

    public LibraryManagement() {

    }

    public LibraryManagement(String memberId, String memberName, String memberShipEndDate) {
        super();
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberShipEndDate = memberShipEndDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberShipEndDate() {
        return memberShipEndDate;
    }

    public void setMemberShipEndDate(String memberShipEndDate) {
        this.memberShipEndDate = memberShipEndDate;
    }

    @Override
    public int compareTo(LibraryManagement o) {
        LibraryManagement a1 = this;
        LibraryManagement a2 = (LibraryManagement) o;
        if (a2.memberId.equalsIgnoreCase(memberId)) {
            return 0;
        }
        return a2.getMemberShipEndDate().compareTo(a1.memberShipEndDate);
    }

}
