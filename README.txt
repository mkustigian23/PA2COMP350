
Files included for PA2:

1. Job.java - This class stores all the job related information such as job number, priority, timeRemaining etc. and also maintains the running time, idle time, cpu entries etc.

2. CPU.java - This class holds the currently running job.

3. ReadyQueue.java - This class implements a Priority Ready Queue to hold jobs that are in ready state. It is implemented by using an ArrayList of LinkedList. The index of the ArrayList is (Priority-1). Each index represents a LinkedList for each priority. 

4. WaitingQueue.java - This class holds all the jobs that are waiting for I/O. 

5. ExternalEvent.java - This class stores an external event related information such as command, priority, time estimate, job number etc.

6. ExternalEvents.java - This loads all the external events from a file and stores them in a map. 

7. SchedSim.java - This is the main class that will simulate the priority based round robin scheduling algorithm. It is partially implementd. You will fill in the missing parts that are needed to implement the priority based round-robin algorithm.