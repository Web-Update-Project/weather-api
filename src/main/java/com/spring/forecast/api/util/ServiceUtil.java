package com.spring.forecast.api.util;

import java.util.ArrayList;
import java.util.List;

import com.spring.forecast.api.dto.HeaderResponse;

public class ServiceUtil {
	public static List<HeaderResponse> getTableHeaders() {
		List<HeaderResponse> responses = new ArrayList<>();
		HeaderResponse response = new HeaderResponse("City", "State", "Country", "CCD", "Latitude", "Longitude",
				"Elevation", "TimeZone", "Weather", "Temprature", "Temp(F)", "Temp(C)", "Humidity", "Wind", "DewPoint",
				"Update Date", "Time", "View-Web", "/images/gr.jpg");
		responses.add(response);
		return responses;
	}
}
