package chainOfResponsibilty;

public abstract class Approver
{
    protected Approver NextApprover;

    public void setNextApprover(Approver supervisor)
    {
        this.NextApprover = supervisor;
    }

    abstract void processRequest(Approve approve);
}