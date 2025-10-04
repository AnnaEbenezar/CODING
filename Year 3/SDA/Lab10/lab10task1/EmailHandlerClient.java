public class EmailHandlerClient {
    public static void main(String[] args) {
        // Create handler instances
        Handler fanHandler = new FanHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler newLocationHandler = new NewLocationHandler();
        Handler spamHandler = new SpamHandler();
        Handler catchAllHandler = new CatchAllHandler();

        // Set up the chain of responsibility
        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(complaintHandler);
        complaintHandler.setSuccessor(newLocationHandler);
        newLocationHandler.setSuccessor(catchAllHandler);

        String email1 = "Fan Mail"; 
        fanHandler.handleRequest(email1);

        String email2 = "New Location Mail";
        fanHandler.handleRequest(email2);
    }
}


