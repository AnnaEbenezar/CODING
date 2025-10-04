public class SpamHandler implements Handler{
    private Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(String emailContent) {
        boolean isSpamMail = false;
        if(emailContent == "Spam Mail"){
            isSpamMail = true;
        }

        if (isSpamMail) {
            System.out.println("Handling spam mail");
        } else if (successor != null) {
            successor.handleRequest(emailContent);
        }
    }
}




