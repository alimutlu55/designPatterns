package chainOfResponsibilty;

public class Manager extends Approver{
    @Override
    void processRequest(Approve approve) {
        if(approve.getProcessType()=="1" || approve.getProcessType()=="3" || approve.getProcessType()=="5"  || approve.getProcessType()=="8") {
            System.out.println("İşlem "+ this.getClass().getSimpleName() + " tarafından onaylandı.");
        }else{
            System.out.println("İşlem uygun değil.");
        }
    }
}
