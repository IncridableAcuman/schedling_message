package com.scheduled.task;

import com.scheduled.task.scheduling.TaskScheduling;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
class TaskApplicationTests {
	@MockitoSpyBean
	TaskScheduling taskScheduling;

	@Test
	void contextLoads() {

	}

	@Test
	public void reportCurrentTime(){
		await().atMost(Duration.ofSeconds(10)).untilAsserted(()-> verify(taskScheduling,atLeast(2)).reportCurrentTime());
	}
}
