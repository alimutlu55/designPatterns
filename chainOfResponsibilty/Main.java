package chainOfResponsibilty;

public class Main {

    public static void main(String[] args) {
        Approver analyst= new Analyst();
        Approver teamLeader = new TeamLeader();
        Approver manager = new Manager();

        analyst.setNextApprover(teamLeader);
        teamLeader.setNextApprover(manager);

        Approve approve = new Approve();
        approve.setProcessType("1");


        analyst.processRequest(approve);


    }
}
