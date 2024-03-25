package net.demoapps.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import net.demoapps.springboot.entity.WikimediaData;
import net.demoapps.springboot.repository.WikiMediaDataRepository;


@Service
public class KafkaDatabaseConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
	
	private WikiMediaDataRepository dataRepository;
	
	
	
	
	public KafkaDatabaseConsumer(WikiMediaDataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}




	@KafkaListener(
			topics="wikimedia_recentchange",groupId = "myGroup"
			)
	public void consume(String eventMessage) {
		
		LOGGER.info(String.format("Event message received-->%s", eventMessage));
		
		WikimediaData wikimediaData = new WikimediaData();
		wikimediaData.setWikiEventData(eventMessage);
		dataRepository.save(wikimediaData);
		
		
		
	}

	
}
