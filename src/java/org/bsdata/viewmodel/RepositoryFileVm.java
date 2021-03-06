
package org.bsdata.viewmodel;


public class RepositoryFileVm extends ResponseVm {
    
    private String name;
    private String type;
    private String gitHubUrl;
    private String dataFileUrl;
    private String issueUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getDataFileUrl() {
        return dataFileUrl;
    }

    public void setDataFileUrl(String dataFileUrl) {
        this.dataFileUrl = dataFileUrl;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
