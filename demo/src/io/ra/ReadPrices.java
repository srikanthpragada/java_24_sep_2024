package io.ra;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ReadPrices {

	public static void main(String[] args) throws Exception {

		try (RandomAccessFile rf = new RandomAccessFile("prices.dat", "r")) {
			long length = rf.length() / 8;
			
			for (int i = 1; i <= length; i++) {
				long price = rf.readLong();
				System.out.println(price);
			}
		}
	}

}
