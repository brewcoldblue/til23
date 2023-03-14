package com.ssafy.ws.step2.dto;

public class Movie {
	String title;
	String director;
	String genre;
	int runningTime;
	public Movie(String title, String director, String genre, int runningTime) {

		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
}
