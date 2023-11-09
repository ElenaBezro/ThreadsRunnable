day 3
Evening

Mini project

Java Util Concurrent and Concurrent Collections.

Description: Create a mini project that simulates a banking system

Objective: Integrate advanced concurrency tools into the banking
system.

Task 1: Executor Framework

Sub-Task 1.1:

Replace manual thread management with ExecutorService to
execute Customer transactions.

Task 2: Concurrent Collections

Sub-Task 2.1:

Replace HashMap with ConcurrentHashMap to store BankAccount
instances.

Task 2: Concurrent Collections

Sub-Task 2.2:

Use CopyOnWriteArrayList to maintain a thread-safe transaction
history.

Task 3: Future for Asynchronous Computations

Sub-Task 3.1:

Modify the Bank class to return a Future object for each
transaction, enabling asynchronous processing.

Task 3: Future for Asynchronous Computations

Sub-Task 3.2:

Experiment with retrieving results using get() and handle potential
exceptions.

Task 4: Hands-on Project: Enhanced Banking System

Sub-Task 4.1:

Test the system under high concurrency and ensure thread safety
and data consistency.


day 4
Mini project

Mini project

SOLID Principles

Description: Create a mini project that simulates a banking system

Objective: Ensure the banking system is well-designed by adhering to
SOLID principles.

Task 1: Single Responsibility Principle (SRP) and
Open/Closed Principle (OCP)
Sub-Task 1.1:

Break down BankAccount class to separate concerns (SRP) - one
class for account details and another for transaction processing.

Task 1: Liskov Substitution Principle (LSP), Interface
Segregation Principle (ISP), and Dependency Inversion
Principle (DIP)

Sub-Task 1.2:

Implement additional transaction types without modifying existing
code (OCP).

Hint: Create a Transaction interface and derive Deposit and
Withdrawal classes to satisfy LSP.

Break 10 minutes

Task 2: Liskov Substitution Principle (LSP), Interface
Segregation Principle (ISP), and Dependency Inversion
Principle (DIP)

Sub-Task 2.1:

Refine interfaces to be specific (ISP) and ensure high-level modules
are not dependent on low-level ones (DIP).

Task 2: Hands-on Project: SOLID Banking System

Sub-Task 2.2:

Iteratively refactor classes, interfaces, and methods ensuring
alignment with SOLID principles.

Test the final system for functionality and extensibility.