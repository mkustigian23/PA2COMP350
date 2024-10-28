
public class Job implements Comparable<Job> {

	private int jobNo;
	private int priority;
	private int entryTime;
	private int timeRemaining;
	private String exitType;
	private int runningTime=0;
	private int idleTime=0;
	private int cpuEntryCount=0;

	public Job(int jobNo, int priority, int entryTime, int timeRemaining) {
		this.jobNo = jobNo;
		this.priority = priority;
		this.entryTime = entryTime;
		this.timeRemaining = timeRemaining;
	}

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getEntryTime() {
		return entryTime;
	}

	public int getTimeRemaining() {
		return timeRemaining;
	}
	
	public String getExitType() {
		return exitType;
	}

	public void setExitType(String exitType) {
		this.exitType = exitType;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public int getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(int idleTime) {
		this.idleTime = idleTime;
	}

	public int getCpuEntryCount() {
		return cpuEntryCount;
	}

	public void setCpuEntryCount(int cpuEntryCount) {
		this.cpuEntryCount = cpuEntryCount;
	}
	
	public void incrementCpuEntryCount() {
		cpuEntryCount++;
	}
	
	public void incrementIdleTime() {
		idleTime++;
	}
	
	public void execute() {
		timeRemaining--;
		runningTime++;
	}
	
	public boolean equals(Object o) {
		Job other = (Job)o;
		return jobNo==other.getJobNo();
	}
	
	public int compareTo(Job other) {
		return (this.priority-other.getPriority());
	}
}
