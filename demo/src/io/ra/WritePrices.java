package io.ra;

import java.io.RandomAccessFile;

public class WritePrices {

	public static void main(String[] args) throws Exception {
		
		 try(RandomAccessFile rf = new RandomAccessFile("prices.dat", "rw"))
		 {
			 for(int i = 1; i <= 50 ; i ++)
			 {
				 long price = Math.round(Math.random() * 1000);
				 rf.writeLong(price);
			 }
		 }
	}

}
