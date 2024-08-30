package Assignment_22_Queue;


import java.util.PriorityQueue;

class Jobs implements Comparable<Jobs>
{

    private final String processName;
    private final int processTime;
    private final int priority;
    private int waitingTime;
    private int turnAroundTime ;

    public Jobs(String processName, int processTime, int priority)
    {
        this.processName=processName;
        this.processTime=processTime;
        this.priority=priority;
        this.waitingTime=0;
        this.turnAroundTime=0;
    }

    public String getProcessName() {
        return processName;
    }

    public int getProcessTime() {
        return processTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int compareTo(Jobs job)
    {
        return Integer.compare(job.getPriority(),this.getPriority());
    }

    public String toString()
    {
        return  "Process Name    : "+processName+"\n"+
                "Processing Time : "+processTime+"\n"+
                "Priority        : "+priority+"\n"+
                "Waiting Time    : "+waitingTime+"\n"+
                "Turn Around Time: "+turnAroundTime;
    }

}


public class Problem_3 {
    public static void main(String[] args) {
        PriorityQueue<Jobs> queue = new PriorityQueue<>();

        queue.add(new Jobs("A",4,1));
        queue.add(new Jobs("B",3,3));
        queue.add(new Jobs("C",2,2));
        queue.add(new Jobs("D",1,5));

        int currentTime = 0;

        while(!queue.isEmpty())
        {
            Jobs currentJob = queue.poll();
            currentJob.setWaitingTime(currentTime);
            currentTime += currentJob.getProcessTime();
            currentJob.setTurnAroundTime(currentTime);

            System.out.println(currentJob);
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
