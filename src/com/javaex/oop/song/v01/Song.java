package com.javaex.oop.song.v01;
// v01 - 필드, Setter, Getter, 일반메서드

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	// Getter, Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track=track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d번 Track, %s작곡)\n", artist, title, album, year, title, composer);
	}
}
