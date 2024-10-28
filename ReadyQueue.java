import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadyQueue {
	private List<LinkedList<Job>> priorityQueue = new ArrayList<LinkedList<Job>>();

	public ReadyQueue() {
		for (int i = 0; i < 4; i++) {
			priorityQueue.add(new LinkedList<Job>());
		}
	}

	public void add(Job job) {
		LinkedList<Job> l = priorityQueue.get(job.getPriority() - 1);
		l.add(job);
	}

	public Job peek() {
		for (LinkedList<Job> l : priorityQueue) {
			if (l.size() > 0) {
				return l.peek();
			}
		}
		return null;
	}

	public Job remove() {
		for (LinkedList<Job> l : priorityQueue) {
			if (l.size() > 0) {
				return l.poll();
			}
		}
		return null;
	}

	public void remove(Job job) {
		priorityQueue.get(job.getPriority() - 1).remove(job);
	}

	public Job remove(int JobNo) {
		for (LinkedList<Job> l : priorityQueue) {
			for (Job job : l) {
				if (job.getJobNo() == JobNo) {
					l.remove(job);
					return job;
				}
			}
		}
		return null;
	}

	public boolean isEmpty() {
		if (this.peek() == null)
			return true;
		else
			return false;
	}

	public void updateIdleTimes() {
		for (LinkedList<Job> l : priorityQueue) {
			for (Job job : l) {
				job.incrementIdleTime();
			}
		}
	}

}