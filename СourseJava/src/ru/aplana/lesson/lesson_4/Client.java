package ru.aplana.lesson.lesson_4;

/**int
 * Created by user on 28.03.2017.
 */
public class Client {




    private String firstName;
        private String lastName;
        private int pasportNumber;
        private int pasportSeries;
        private int elementAccount; //расчетный
        private int runningAccount; //ткущий
        private String bank;

    public Client(String firstName, String lastName, int pasportNumber, int pasportSeries, int elementAccount, int runningAccount, String bank) {
        setFirstName(firstName);
        setLastName(lastName);
        setPasportNumber(pasportNumber);
        setPassportSeries(pasportSeries);
        setElementAccount(elementAccount);
        setRunningAccount(runningAccount);
        setBank(bank);
    }

public Client(String bank, String firstName, String lastName, int pasportNumber, int passportSeries, int elementAccount, int runningAccount){}



    public void setFirstName(String firstName) {
        this.firstName = getStringWithUpperCase(firstName);
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=getStringWithUpperCase(lastName);
    }

    public void setBank(String bank) {
        this.bank = getStringWithUpperCase(getBank());
    }


    private String getStringWithUpperCase(String s) {
        String firstSymbol = s.substring(0,1);
        return firstSymbol.toUpperCase() + s.substring(1, s.length());
    }

    public int getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(int pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public int getPassportSeries() {
        return pasportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.pasportSeries = passportSeries;
    }

    public int getElementAccount() {
        return elementAccount;
    }


    public void setElementAccount(int elementAccount) {
        this.elementAccount = elementAccount;
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




    @Override
    public String toString() {
        return "Клиент{" +
               "Банк='"+ bank+ '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Номер паспорта='" + pasportNumber + '\'' +
                ", Серия паспорта='" + pasportSeries + '\'' +
                ", Расчетный счет='" + elementAccount + '\'' +
                ", Текущий счет='" + runningAccount + '\'' +
                '}';



    }


}
