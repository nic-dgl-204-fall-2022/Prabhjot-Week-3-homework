# Prabhjot-week-3-homework

- Implemented ```acceptPayment``` method which had a parameter called ```fundsProvided``` which is the available  cash. The goal of this method is to print the payment of the gas-filled. To do so, I printed the string template by referencing ```fundsProvides``` as ```println("Please accept the payment of $fundsProvided")```.

-  Added a new variable in ```Vehicle Class``` named ```paymentInCredit``` with boolean data type and initialized it as true.

    - Implemented a method in the ```Payable Interface``` with the name ```paymentMethod(isCredit: boolean)```.

    - We will get another overridden method in ```ShellStation``` class as it is implementing the ```payable``` interface. The new overridden method is ```paymentMethod``` with ```isCredit``` parameter in it.

     - Now in the ```paymentMethod``` we will print if the payment is credited or not. And I achieved this using an if-else statement. 

## Reflection

The complete process of doing changes in the toy-example code was challenging for me, though I enjoyed doing it. I'll say it is challenging because at first it forced me to read the code written by someone else and I always feel difficulties in understanding the code I had not written. But most beginners feel the same way and the only solution I found to this problem is to read or understand at least one coding repo or project snip daily, which should be written by other people.

Moreover, I enjoyed making changes in the acceptPayment method by which we wanted to display a message to a user to accept the payment. Also, I got good insights while adding my interface's function for checking what kind of payment method the user uses to pay the bill. 

I generally didn’t read any additional articles or blogs while doing this homework as last week’s assignment, work and content helped me to understand the code. 

To improve this toy example code we must add comments when implementing functions and interfaces. It is always a good practice as it makes the code more readable.
