package game;

public interface IUserInteraction {
    // This method uses for sending information string to user from application class
    void sendInfo(String info);

    // This method gets user command for application class
    String getUserCommand(String userCommand);
}
