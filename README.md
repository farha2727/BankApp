# BankApp

Create a Bank App in Java
OVERVIEW & PURPOSE
You will create a Bank App that includes some common functionality of a customer checking and savings account. 
ACTIVITY
Go onto GitHub and create a new repository named BankApp
Click "Create Repository"
Go to your root folder (BankApp) and copy the HTTPS URL from the "Code" button
Open your terminal (Git bash) and navigate to the appropriate location where you wish to save the folder to. 
Enter: git clone URL-you-Copied-goes-here
Open IntelliJ and click on new project
Select Java and make sure you have a Project SDK selected and then click next
Leave the box for create project from template unchecked and click next
Click on three dots ... next to project location. Change project location to the directory you just cloned to your machine. Click OK and then click Finish.
Click on the directory name (BankApp) and then right click on the src folder.
Click on New -> Package. Name package: com.example.bank_app
Right click on the package you just created and click on New -> Java Class. Name it BankApp. This will be the entry point for your application.
Open your BankApp Class and create a main method.
Right click on the package you just created and click on New -> Java Class. Name it BankAccount. This is where we will write all of our methods for dealing with our BankAccount.
*** Make all your instance fields private and all your classes and methods public 
Your BankAccount class should have an instance field of type double with the name checkingBalance. Set the value equal to 0.00.
Your BankAccount class should have an instance field of type double with the name savingsBalance. Set the value equal to 0.00.
Your BankAccount class should have an instance field of type double with the name checkingOpeningDeposit. Do not assign a value here. We will do so in the Constructor. This instance field should be declared as final.
Your BankAccount class should have an instance field of type double with the name savingsOpeningDeposit. Do not assign a value here. We will do so in the Constructor. This instance field should be declared as final.
Create a Constructor which takes in the following parameters (double checkingOpeningDeposit, double savingsOpeningDeposit) and assign the instance fields checkingOpeningDeposit and savingsOpeningDeposit to these values. (If you make the parameter name the same name as the instance field you will need to use the "this" keyword.
Within the Constructor, make the checkingBalance equal to the sum of checkingBalance + checkingInitialDeposit. Do the same for the savingsBalance.
Create methods which will print out the balance of the checkingAccount and the savingsAccount. Call these methods getCheckingBalance() and getSavingsBalance() respectively. The return type for these methods should be double and they shouldn't take in any parameters.
*** Test your methods. Over in your BankApp Class create an instance of your BankAccount Class and name it customerAcct. Pass in an amount for the checkingOpeningDeposit as well as for the savingsOpeningDeposit. Call your getCheckingBalance() and getSavingsBalance() methods and print the results using System.out.println(). You should see your balances printed out. 
Create a method for making withdrawals from both your checking and savings account. These methods should take in a parameter of type double which will be the withdrawal amount and should not return anything. Be sure this method adjusts the balances of your checking and savings accounts accordingly.
*** Test your methods. Over in your BankApp Class call your withdrawal methods on customerAcct and then use your getBalance() methods to see your new balance
Back in your withdrawal methods, add some logic that will make sure the balances don't go below 0.00. (Using some sort of if else statement could work here). The previous withdrawal methods you created should display a message to the user if they attempt to withdrawal an amount from their checking or savings account which is greater than that account's current balance. If the checkingBalance is not sufficient but the savingsBalance is or vice versa, display a message to the user letting them know that they need to make a balance transfer before completing the transaction. Do not allow the withdrawal if the balance is not sufficient.
*** Test your methods. Over in your BankApp Class call your withdrawal methods on customerAcct and pass in amounts greater than the current balance for each account. You should see a message displayed stating that the balance is not sufficient and your current balance should not change. Test these methods with various amounts entered.
In your BankAccount Class create methods for transferring money from your checking to your savings and from your savings to your checking. These methods should accept a parameter "transferAmount" of type double and make sure that sufficient funds are available before completing the balance transfer. Display a message to the user with the results of the balance transfer. The balance of each account should be displayed upon completing the balance transfer. If sufficient funds are not available display a message to the user telling them this and do not complete the transfer.
*** Test your methods. Over in your BankApp Class call your transferMethod()s and view the results.
In your BankAccount Class create methods for making deposits to both your checking and savings account. These methods should take in a parameter of type double and should not return anything. Be sure these methods adjust the balances of the appropriate accounts.
*** Test your methods. Over in your BankApp Class call your deposit methods on both the checking account and the savings account and view the results. 
Push your changes up to your repository. From your git bash terminal, enter the following commands:
git add .
git commit -m “First Commit”
git push -u origin main
Go to your GitHub repository. You should see your changes.
*** If you finish early, consider adding some additional functionality such as the following:
Keep track of the number of withdrawals made from the savings account. If more than 5 withdrawals occur, add a service charge to the account.
If the checking or savings account balance falls below a certain amount, add a service charge to the account.
Be original, add some of your own functionality to the application.
