import java.util.HashMap;
import java.util.Set;

public class WaitingQueue {
	
	private HashMap<Integer,Job> map = new HashMap<Integer,Job>();

	public WaitingQueue() {
	}
	
	public void add(Job job) {
		map.put(job.getJobNo(),job);
	}
	
	public Job remove(int jobNo) {
		return map.remove(jobNo);
	}
	
	public Set<Integer> getJobsList() {
		return map.keySet();
	}
}
