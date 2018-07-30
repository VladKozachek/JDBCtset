package entity;

public class ProjectBuild {
    private long id;
    private String title;

    ProjectBuild setId(int id){
        this.id=id;
        return this;
    }
    ProjectBuild setTitle(String title){
        this.title=title;
        return this;
    }

    Project build(){
        Project project=new Project();
        project.setId(id);
        project.setTitle(title);
        return project;
    }
}
