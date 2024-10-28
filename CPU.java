
public class CPU {
	
	private Job job;

	public CPU() {
		
	}

	public Job getRunningJob() {
		return job;
	}

	public void setRunningJob(Job job) {
		this.job = job;
	}
	
	public void execute() {
		if(job!=null)
			job.execute();
	}
}
