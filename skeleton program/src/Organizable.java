import java.io.File;
import java.util.Date;
import java.util.List;

public interface Organizable {

    //create a new raffle with the raffle name raffleName and number of winners numWinners,
    // return the autogenerated raffle id
    int createRaffle(String raffleName, int numWinners);

    //add rules to the raffle
    void addRaffleRules(int raffleID, File rulesDescriptionFile);

    //change the rules of the raffle
    void changeRaffleRules(int raffleID, File newRulesDescriptionFile);

    //change the end date of the raffle
    void changeRaffleEndDate(int raffleID, Date newEndDate);

    //declare the raffle prizes of the raffle
    void declarePrizes(int raffleID, String rafflePrizes);

    //change the number of winners of the raffle
    void changeNumWinners(int raffleID, int newNumWinners);

    //draws and return the winner(s) of a Raffle and notifies the winning participant objects
    User generateAndNotifyWinner(List<User> participantList);

    //maybe we need a task id for identifying each task?
    //future extension: different kind of tasks
    //add an Q&A task with a question and an answer
    void addTask(String question, String answer);

    //delete a Q&A task
    void deleteTask(String question);

    //add a task weight to a Q&A task
    void addTaskWeight(String question, int weight);

    //change task weight
    void changeTaskWeight(String questions, int newWeight);
}
