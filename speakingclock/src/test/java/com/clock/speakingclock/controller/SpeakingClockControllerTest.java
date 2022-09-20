package com.clock.speakingclock.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.clock.speakingclock.service.ClockService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SpeakingClockControllerTest {

	@InjectMocks
	SpeakingClockController speakingClockController;

	@Mock
	ClockService clockService;

	@Test
	public void getTimeTest() {
		String time = "It's twelve twenty one";

		when(clockService.getTime()).thenReturn(time);
		String currentTime = speakingClockController.getCurrentTime();
		assertThat(currentTime).isEqualTo(time);
	}
	
	
}
