public class NewLocationHandler implements Handler{
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(String emailContent) {
        boolean isNewLocationMail = false;
        if(emailContent == "New Location Mail"){
            isNewLocationMail = true;
        }

        if (isNewLocationMail) {
            System.out.println("Handling new location mail");
        } else if (successor != null) {
            successor.handleRequest(emailContent);
        }
    }
}



