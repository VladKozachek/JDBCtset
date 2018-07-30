package entity;

public class EmplProjBuild {
    private long employeeId;
    private long projectId;

    EmplProjBuild setemployeeId(long employeeId){
        this.employeeId=employeeId;
        return this;
    }
    EmplProjBuild setProjectId(long projectId){
        this.projectId=projectId;
        return this;
    }

    EmplProj build(){
        EmplProj emplProj=new EmplProj();
        emplProj.setEmployeeId(employeeId);
        emplProj.setProjectId(projectId);
        return emplProj;
    }
}
