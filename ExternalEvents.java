import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class ExternalEvents {
	
	private TreeMap<Integer,ExternalEvent> map = new TreeMap<Integer,ExternalEvent>();

	public ExternalEvents(String file) throws IOException {
		String eventStr = null;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			while((eventStr=in.readLine())!=null) {
				int time = Integer.parseInt(eventStr.substring(0,2).trim());
				char command = eventStr.charAt(3);
				ExternalEvent event = new ExternalEvent(command);
				if(command=='J') {
					event.setPriority(Integer.parseInt(eventStr.substring(5,6)));
					event.setTimeEstimate(Integer.parseInt(eventStr.substring(7)));
				}
				else if(command=='T' || command=='R') {
					event.setJobNo(Integer.parseInt(eventStr.substring(5)));
				}
				map.put(time,event);
			}
		} finally {
			if(in!=null) in.close();
		}
	}
	
	public ExternalEvent getEvent(int time) {
		return map.get(time);
	}
	
	public int maxEventTime() {
		return map.lastKey();
	}
}
