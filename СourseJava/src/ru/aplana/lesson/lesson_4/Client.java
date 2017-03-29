package ru.aplana.lesson.lesson_4;

/**int
 * Created by user on 28.03.2017.
 */
public class Client {


    private String firstName;
        private String lastName;
        private int pasportNumber;
        private int passportSeries;
        private int setElementAccount; //расчетный
        private int runningAccount; //ткущий
        private String bank;

    public Client(String firstName, String lastName, int pasportNumber, int passportSeries, int settlementAccount, int runningAccount, String bank) {
        setFirstName(firstName);
        setLastName(lastName);
        setPasportNumber(pasportNumber);
        setPassportSeries(passportSeries);
        setElementAccount = setElementAccount;
        this.runningAccount = runningAccount;
        this.bank = bank;
    }

public Client(String bank, String firstName, String lastName, int pasportNumber, int passportSeries, int elementAccount, int runningAccount){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(int pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getSetElementAccount() {
        return setElementAccount;
    }

    public void setSetElementAccount(int setElementAccount) {
        this.setElementAccount = setElementAccount;
    }

    public int getRunningAccount() {
        return runningAccount;
    }

    public void setRunningAccount(int runningAccount) {
        this.runningAccount = runningAccount;
    }


    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }


}
