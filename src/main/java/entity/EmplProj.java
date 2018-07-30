package entity;

public class EmplProj {
    private long employeeId;
    private long projectId;

    public EmplProj() {
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "EmplProj{" +
                "employeeId=" + employeeId +
                ", projectId=" + projectId +
                '}';
    }
}
