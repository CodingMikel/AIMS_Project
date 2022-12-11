package hust.soict.dsai.aims.cd;

import java.util.Iterator;

import hust.soict.dsai.aims.cdTrack.cdTrack;

public class CD {
	private int id;
	private String title;
	private String category;
	private String artist;
	private String director;
	private cdTrack[] trackList;
	private int cdLength = updateCdLength();
	private float price;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getArtist() {
		return artist;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return cdLength;
	}
	public int updateCdLength() {
		cdLength = 0;
		for (int i = 0; i < trackList.length; i++) {
			cdLength += trackList[i].getLength();
		}
		return cdLength;
	}
	public float getPrice() {
		return price;
	}
	public cdTrack[] getTrack() {
		return trackList;
	}
	public void playCD() {
		if (cdLength == 0) {
			System.out.println("CD cannot be played");
			return;
		}
		System.out.println("CD information");
		System.out.println(title + " " + cdLength);
		for (int i = 0; i < trackList.length; i++) {
			if (trackList[i].getLength() == 0) {
				System.out.println("Track cannot be played");
				continue;
			}
			System.out.println(trackList[i].getTitle() + " " + trackList[i].getLength());
		}
	}
	
}
