package chainOfResponsibilty;

public class TeamLeader extends Approver {
    @Override
    void processRequest(Approve approve) {
        if(approve.getProcessType()=="1" || approve.getProcessType()=="3" || approve.getProcessType()=="5") {
            System.out.println("İşlem "+ this.getClass().getSimpleName() + " tarafından onaylandı.");
            NextApprover.processRequest(approve);
        }else{
            NextApprover.processRequest(approve);
        }
    }
}
