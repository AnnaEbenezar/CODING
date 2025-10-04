public class FanHandler implements Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(String emailContent) {
        boolean isFanMail = false;
        if(emailContent == "Fan Mail"){
            isFanMail = true;
        }

        if (isFanMail) {
            System.out.println("Handling fan mail");
        } else if (successor != null) {
            successor.handleRequest(emailContent);
        }
    }
}



