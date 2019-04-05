package io.mukesh.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =  Arrays.asList(
			new Topic("spring","Spring Framework","Spring Frameowrk Description"),
			new Topic("Java","Core Java","Core Java Description"),
			new Topic("HTML","Html css", "Html Description")
			);

	public List<Topic> getTopics() {
		return topics;
	}
	
	

	
}
