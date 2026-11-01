// 5. Create a class named Account with following members
// I. Data Members
// a. accNo
// b. Name
// c. accType
// d. accBalance
// II. Function members
// a. Constructor to accept all values
// b. deposit(int amt) accepting amount and add with the accBalance
// c. withdraw(int amt) accepting amount to subtract from the accBalance
// d. checkBalance() to return the present accBalance
// Inherit classes such as SavingsAccount and PrivilegedAccount from the class
// Account. The rules of these account types are as follows:-
// I. SavingsAccount
// a. Deposit – can deposit upto a maximum of 50000 only in one transaction.
// b. Withdraw – a minimum balance of 1000 should be there at any time.
// II. PrivilegedAccount
// a. Deposit – can deposit any amount
// b. Withdraw – can take an overdraft of maximum 5000.ie, account balance
// go upto - 5000.
// Write a main() function. Create objects of SavingsAccount and PrivilegedAccount,
// assign values to instance variables using constructor and invoke the methods.

class Account {
    long accNo;
    String name, accType;
    double accBalance;

    Account(long accNo, String name, String accType, double accBalance) {
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    void depositeAmount(int amount) {
        accBalance = accBalance + amount;
    }

    void withdrawAmount(int amount) {
        if (amount > 0 && amount <= accBalance) {
            accBalance -= amount;
        } else {
            System.out.println("Not sufficient balance to withdraw");
        }
    }

    public double checkBalance() {
        return accBalance;
    }
}

class SavingAccount extends Account {

    SavingAccount(long accNo, String name, String accType, double accBalance) {
        super(accNo, name, accType, accBalance);
    }

    void depositeAmountInSaving(int amount) {
        if (amount > 0 && amount <= 50000) {
            accBalance += amount;
        } else {
            System.out.println("Maximum deposit limit is 50000");
        }
    }

    void withdrawAmountFromSavings(int amount) {
        if (amount > 0 && accBalance - amount >= 1000) {
            accBalance -= amount;
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 1000 is needed!");
        }
    }
}

class PrivilegedAccount extends Account {

    PrivilegedAccount(long accNo, String name, String accType, double accBalance) {
        super(accNo, name, accType, accBalance);
    }

    void depositeAmountInPrivilegedAccount(int amount) {
        if (amount > 0) {
            accBalance = accBalance + amount;
            return;
        }
    }

    void withdrawAmountfrom(int amount) {
        if (amount > 0 && accBalance - amount >= -5000) {
            accBalance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

class Question05 {
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount(
                101, "Thomas", "Savings", 10000);

        PrivilegedAccount p = new PrivilegedAccount(
                102, "Jeeva", "Privileged", 2000);

        s.depositeAmountInSaving(50000);
        System.out.println("Balance after deposit: " + s.checkBalance());

        s.withdrawAmountFromSavings(2000);
        System.out.println("Balance after withdrawal: " + s.checkBalance());

        p.depositeAmountInPrivilegedAccount(5000);
        System.out.println("Privileged balance after deposite: " + p.checkBalance());

        p.withdrawAmountfrom(10000);
        System.out.println("Privileged balance after withdrawal: " + p.checkBalance());

        System.out.println("Savings Account Balance: " + s.checkBalance());
        System.out.println("Privileged Account Balance: " + p.checkBalance());
    }
}
