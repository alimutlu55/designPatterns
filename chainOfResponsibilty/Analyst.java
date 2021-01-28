package chainOfResponsibilty;

public class Analyst extends Approver{

    @Override
    void processRequest(Approve approve) {
        if(approve.getProcessType()=="1") {
            System.out.println("İşlem "+ this.getClass().getSimpleName() + " tarafından onaylandı.");
            NextApprover.processRequest(approve);
        }else{
            NextApprover.processRequest(approve);
        }
    }
}
