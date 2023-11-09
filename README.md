Morning session 

Threads

Exercise 1:
Create a thread that prints numbers from 1 to 10.

Exercise 2:
Create two threads where one thread prints even numbers and the other prints odd numbers from 1 to 20.

Exercise 3:
Simulate a clock by creating a thread that prints the current time every second.

Exercise 4:
Create a thread that mimics a countdown timer, printing numbers from 10 to 1.

Runnable

Exercise 1:
Implement a Runnable that prints the alphabet from A to Z.

Exercise 2:
Create two Runnable classes, one that prints "Cooking" and the other that prints "Eating". Run them concurrently to simulate a kitchen scenario.

Exercise 3:
Implement a Runnable that calculates the sum of an array of numbers.

Exercise 4:
Simulate a race by creating multiple Runnable classes that print "Running" with different thread names.

Daemon Threads

Exercise 1:
Create a daemon thread that prints "Background task running" every second.

Exercise 2:
Create a main thread that performs a task (e.g., printing "Main task") and a daemon thread that runs in the background.

Exercise 3:
Simulate a garbage collector by creating a daemon thread that periodically prints "Cleaning up resources".

Exercise 4:
Create a daemon thread that acts as a background music player, periodically printing "Playing background music".

InterruptedException

Exercise 1:
Create a thread that sleeps for 5 seconds and then prints "Awake". Handle InterruptedException.

Exercise 2:
Create two threads: one that performs a long task (e.g., counting to a large number) and another that interrupts the first thread after 2 seconds.

Exercise 3:
Simulate a scenario where a teacher is lecturing (thread sleeping) and a student asks a question (interrupts the thread).

Exercise 4:
Create a thread that simulates downloading a file. After 3 seconds, interrupt the thread to simulate a user canceling the download.


Evening session

Mini project

Concurrent Banking System

Description: Create a mini project that simulates a banking system

Objective: Deeply understand Java Threads through practical coding.

Task 1: Creating and Starting Threads

Sub-Task 1.1:

Create a Customer class that implements Runnable and simulates a
customer performing a deposit.

Sub-Task 1.2:

Instantiate and start multiple Customer threads using both the
Thread class and Runnable interface. Observe the concurrent
execution.

Task 2: Thread Synchronization

Sub-Task 2.1:

Implement a BankAccount class with deposit and withdraw methods.

Sub-Task 2.2:

Introduce a race condition by initiating concurrent deposits and
withdrawals. Observe and discuss inconsistencies.

Sub-Task 2.3:

Resolve the race condition using synchronized methods and blocks.

Task 3: Hands-on Project: Basic Banking System

Sub-Task 3.1:

Implement the Bank class, simulating a bank that manages multiple
BankAccount instances.

Sub-Task 3.2:

Ensure that the final account balance is consistent after all
transactions.