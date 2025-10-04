public class CatchAllHandler implements Handler{
    private Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = null;
    }

    public void handleRequest(String emailContent) {
        System.out.println("Catch All Handling");
    }

}



