public class ComplaintHandler implements Handler{
    private Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(String emailContent) {
        boolean isComplainMail = false;
        if(emailContent == "Complain Mail"){
            isComplainMail = true;
        }

        if (isComplainMail) {
            System.out.println("Handling fan mail");
        } else if (successor != null) {
            successor.handleRequest(emailContent);
        }
    }
}



