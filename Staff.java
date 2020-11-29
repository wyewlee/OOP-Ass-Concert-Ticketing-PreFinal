
public class Staff extends Person {

    private int staffId;
    private String staffPosition;
    private static int staffCount = 0;

    public Staff() {
        staffCount++;
    }

    public Staff(String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        staffCount++;
    }

    public Staff(int staffId, String staffPosition,
            String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        this.staffId = staffId;
        this.staffPosition = staffPosition;
        staffCount++;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        Staff.staffCount = staffCount;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffId=" + staffId + ", staffPosition="
                + staffPosition + ", staffCount=" + staffCount + '}';
    }

}
