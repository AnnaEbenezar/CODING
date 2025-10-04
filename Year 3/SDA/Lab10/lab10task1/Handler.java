public interface Handler {
    public void setSuccessor(Handler successor);
    public void handleRequest(String emailContent);
}






