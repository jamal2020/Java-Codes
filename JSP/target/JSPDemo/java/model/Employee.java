package model;

public class Employee {
   private String ename;
    private String role;
    private String loc;
    public Employee()
    {}
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    public String printDetails()
    {
        return ename+"  :  "+loc;
    }
}
