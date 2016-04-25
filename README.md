# DVD-Store
A virtual DVD store in Java that implements a singly linked list.

OVERVIEW OF THE PROBLEM                  
For a family or an individual, a favorite place to go on weekends or holidays is to a DVD store to rent movies. 
A new DVD store in your neighborhood is about to open. However, it does not have a program to keep track of its DVDs and customers. The store managers want someone to write a program for their system so that the DVD store can function. The program should be able to perform the following operations:

1. Rent a DVD; that is, check out a DVD. 
2. Return, or check in, a DVD. 
3. Create a list of DVDs owned by the store. 
4. Show the details of a particular DVD. 
5. Print a list of all of the DVDs in the store.
6. Check whether a particular DVD is in the store. 
7. Maintain a customer database. 
8. Print a list of all of the DVDs rented by each customer.

The programming requirement tells us that the DVD store has two major components: DVDs and customers. We will describe these two components in detail. We also need to maintain the following lists:

 A list of all of the DVDs in the store. 
 A list of all of the store’s customers.
 Lists of the DVDs currently rented by the customers


SOLUTION TO THE PROBELM                     

I developed the program in two parts. 
In Part 1, I designed, implemented, and tested the DVD component. 
In Part 2, I designed and implemented the customer component, which is then added to the DVD component developed in Part 1. 
That is, after completing Parts 1 and 2, I performed all of the operations listed previously.

Part 1
This is the first stage, wherein we discuss the DVD component. 
The common things associated with a DVD are:
1. Name of the movie. 2. Names of the stars. 3. Name of the producer. 4. Name of the director 5. Name of the production company •  6. Number of copies in the store

From this list, we see that some of the operations to be performed on a DVD object are: 
1. Set the DVD information—that is, the title, stars, production company, and so on. 
2. Show the details of a particular DVD.
3. Check the number of copies in the store.
4. Check out (that is, rent) the DVD. In other words, if the number of copies is greater than
zero, decrement the number of copies by one.
5. Check in (that is, return) the DVD. To check in a DVD, first we must check whether the store owns such a DVD and, if it does, increment the number of copies by one.
6. Check whether a particular DVD is available—that is, check whether the number of copies currently in the store is greater than zero.

The deletion of a DVD from the DVD list requires that the list be searched for the DVD to be deleted. Thus, we need to check the title of a DVD to find out which DVD is to be deleted from the list. For simplicity, we assume that two DVDs are the same if they have the same title. Part 2
The customer object stores information about a customer, such as the first name, last name, account number, and a list of DVDs rented by the customer.

Recall that the basic operations on an object of type personType are: 
1. Print the name.  
2. Set the name. 
3. Show the first name.  
4. Show the last name. 

Similarly, the basic operations on an object of type customer Type are: 
1. Print the name, account number, and the list of rented DVDs. 
2. Set the name and the account number.
3. Rent a DVD; that is, add the rented DVD to the list.
4. Return a DVD; that is, delete the rented DVD from the list.
5. Show the account number.
