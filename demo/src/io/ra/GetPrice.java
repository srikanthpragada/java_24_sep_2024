package io.ra;

import java.io.RandomAccessFile;

public class GetPrice {

	public static void main(String[] args) throws Exception {
		int id = 20;

		try (RandomAccessFile rf = new RandomAccessFile("prices.dat", "r")) {
			int pos = (id - 1) * 8; // calculate byte position based on id
			rf.seek(pos); // move pointer to required location
			System.out.println(rf.readLong());
		}
	}

}
