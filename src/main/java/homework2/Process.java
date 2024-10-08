package homework2;

public class Process implements Comparable<Process> {
    // Implement the required attributes and constructor
    private String name;
    private int priority;
    private int burstTime;
    private int arrivalTime;


    public Process(String name, int priority, int burstTime, int arrivalTime) {
        this.name = name;
        this.priority = priority;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
    }
    public String getName() {return name;}
    public int getPriority() {return priority;}
    public int getBurstTime() {return burstTime;}
    public void setBurstTime(int burstTime) {this.burstTime = burstTime;}
    public int getArrivalTime() {return arrivalTime;}

    @Override
    public int compareTo(Process other) {
        // implement the correct logic
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }
        return Integer.compare(this.arrivalTime, other.arrivalTime);

    }
}
